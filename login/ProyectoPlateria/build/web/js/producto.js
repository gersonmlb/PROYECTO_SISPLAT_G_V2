$(document).ready(function (){
    listarProducto();
    $("#alertNotificacion").hide();
});
$("#agregar").click(function (){    
    var nombre = $("#nombre").val();
    var precio = $("#precio").val();
    var stock = $("#stock").val();
    var tipo = $("#tipo").val();
    $.post("../agregar",{"nombre":nombre,"precio":precio,"stock":stock,"tipo":tipo,"opc":1},function () {
    listarProducto();
    $("#alertNotificacion").html("Producto agregado corectamente");
    $("#alertNotificacion").show(200);
    $("#alertNotificacion").delay(3000).hide(600);
    });
    $("#ModalAdd").modal('hide'); 
    
});
function listarProducto(){
    $.get("../agregar",{"opc":2},function (data) {
        var x = JSON.parse(data);
          $("#table tbody tr").remove(); 
        for(var i = 0;i<x.length;i++){
            $("#table").append("<tr><td>"+(i+1)+"</td><td>"+x[i].nombre+"</td><td>"+x[i].precio.toFixed(2)+"</td><td>"+x[i].stock+"</td><td>"+x[i].tipo+"</td><td>"+x[i].codigo+"</td><td><a href='#' data-toggle='modal' data-target='#ModalEdit' onclick='editar("+x[i].id+")' class='btn btn-success' style='margin-right:20px'><i class='fa fa-pencil-square-o'></i></a> <a href='#' class='btn btn-danger edit' aria-label='Settings' onclick='eliminar("+x[i].id+")'><i class='fa fa-trash' aria-hidden='true'></i></td></tr>");
        
        }
    });
}
function eliminar(x){
    $.get("../agregar",{"id":x,"opc":3},function () {
        listarProducto();
    });
}
function editar(y){
    $.get("../agregar",{"id":y,"opc":4},function (data) {

       var x = JSON.parse(data);
        $("#nombre2").val(x.nombre);
        $("#precio2").val(x.precio.toFixed(2));
        $("#stock2").val(x.stock);
        $("#tipo2").val(x.tipo);
        $("#codigo").val(x.codigo);
    });
}
$("#Modificar").click(function (){
   
    var codigo = $("#codigo").val();
    var nombre= $("#nombre2").val();
    var precio = $("#precio2").val();
    var stock = $("#stock2").val();
     var tipo = $("#tipo2").val();
    $.post("../agregar",{"codigo":codigo,"nombre":nombre,"precio":precio,"stock":stock,"tipo":tipo,"opc":5}, function () {
        listarProducto();
    });
    $("#ModalEdit").modal('hide');
    $("#alertNotificacion").html("Producto modificado corectamente");
    $("#alertNotificacion").show(200);
    $("#alertNotificacion").delay(3000).hide(600);
    
});

function valida(e){
    tecla = (document.all) ? e.keyCode : e.which;

    //Tecla de retroceso para borrar, siempre la permite
    if (tecla==8){
        return true;
    }
        
    // Patron de entrada, en este caso solo acepta numeros
    patron =/[0-9,.]/;
    tecla_final = String.fromCharCode(tecla);
    return patron.test(tecla_final);
}


