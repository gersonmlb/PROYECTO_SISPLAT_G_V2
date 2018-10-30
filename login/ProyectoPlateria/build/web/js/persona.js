$(document).ready(function (){
    ListarUser();
});
$("#AddUser").click(function (){    
    var nombre = $("#nombresUser").val();
    var apellido = $("#apellidosUser").val();
    var DNI = $("#DNIUser").val();
    var direccion = $("#direccionUser").val();
    var rol = $("#rolUser").val();
    var user = $("#UsuarioUser").val();
    var email = $("#emailUser").val();
    var pass= $("#passUser").val();
    $.post("../persona",{"nombres":nombre,"apellidos":apellido,"dni":DNI,"user":user,"contra":pass,"rol":rol,"direccion":direccion,"email":email,"opc":3},function () {
    });
   ListarUser();
   $("#ModalUser").modal('hide'); 

    
});

function ListarUser(){
    $.get("../persona",{"opc":4},function (data) {
        var x = JSON.parse(data);
          $("#table tbody tr").remove(); 
        for(var i = 0;i<x.length;i++){
            $("#table").append("<tr><td>"+(i+1)+"</td><td>"+x[i].nombre+"</td><td>"+x[i].apellido+"</td><td>"+x[i].DNI+"</td><td>"+x[i].direccion+"</td><td>"+x[i].user+"</td><td>"+x[i].email+"</td><td>"+x[i].pass+"</td><td>"+x[i].rol+"</td><td><a href='#' onclick='ListarEditUser("+x[i].DNI+")' class='btn btn-success' style='margin-right:20px'><i class='fa fa-pencil-square-o'></i></a> <a href='#' class='btn btn-danger edit' aria-label='Settings' onclick='DeleteUser("+x[i].DNI+")'><i class='fa fa-trash' aria-hidden='true'></i></td></tr>");
        
        }
    });
}

function ListarEditUser(x){
    $("#ModalEditUser").modal('show'); 
    $.get("../persona",{"DNI":x,"opc":2},function (data) {
       alert(data);
       var x = JSON.parse(data);
        $("#edit_nombresUser").val(x.nombre);
        $("#edit_apellidosUser").val(x.apellido);
        $("#edit_DNIUser").val(x.DNI);
        $("#edit_direccionUser").val(x.direccion);
        if(x.rol===1){
            $("#edit_rolUser").val("Administrador");
        }
        if(x.rol===2){
            $("#edit_rolUser").val("Vendedor");
        }
        $("#edit_UsuarioUser").val(x.user);
        $("#edit_emailUser").val(x.email);
        $("#edit_passUser").val(x.pass);
    });
}
$("#edit_User").click(function (){
   
    var nombre = $("#edit_nombresUser").val();
    var apellido = $("#edit_apellidosUser").val();
    var DNI = $("#edit_DNIUser").val();
    var direccion = $("#edit_direccionUser").val();
    var user = $("#edit_UsuarioUser").val();
    var email = $("#edit_emailUser").val();
    var pass= $("#edit_passUser").val();
    $.post("../persona",{"nom":nombre,"ape":apellido,"dni":DNI,"use":user,"pass":pass,"dire":direccion,"ema":email,"opc":5}, function () {
    });
    $("#ModalEditUser").modal('hide');    
    ListarUser();
});
function DeleteUser(x){
    $.get("../persona",{"dni":x,"opc":6},function () { 
        ListarUser();
    });
}
