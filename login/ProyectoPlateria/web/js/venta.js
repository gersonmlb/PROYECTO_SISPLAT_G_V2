$(document).ready(function (){   
   $("#Alert").hide();
   $("#CN").prop('checked',true);
   $("#inRuc").css({'display':'none'});
   $("#inRaZ").css({'display':'none'});
   $("#inDir").css({'display':'none'});
   $("#inCelular").css({'display':'none'});
   $("#CN").click(function(){
    if($("#CN").is(':checked')) {  
           $("#inRuc").css({'display':'none'});
           $("#inRaZ").css({'display':'none'});
           $("#inNombre").css({'display':'block'});
           $("#inApellido").css({'display':'block'});
           $("#inDNI").css({'display':'block'});
           $("#inDir").css({'display':'none'});
           $("#inCelular").css({'display':'none'});           
        };      
});
$("#CE").click(function(){
    if($("#CE").is(':checked')) {  
           $("#inRuc").css({'display':'block'});
           $("#inRaZ").css({'display':'block'});
           $("#inNombre").css({'display':'none'});
           $("#inApellido").css({'display':'none'});
           $("#inDNI").css({'display':'none'});
           $("#inDir").css({'display':'block'});
           $("#inCelular").css({'display':'block'}); 
        } ;      
});
});
$("#codPro").keyup(function (){
    var codigo = $("#codPro").val();
    if(codigo.length>4){
    $.get("../venta",{"opc":2,"cod":codigo},function(data) {
        var x = JSON.parse(data);
        if(x.id===0){
            $("#codPro").val("No existe el producto!");
        }else{
            
            if(x.stock >0){            
                $("#tabla").append("<tr class='row-content'><td>" + x.nombre+ "</td><td>" + x.precio.toFixed(2) + "</td><td><center><input style='width:30%' type='text' value=1 id='cantt' onchange='ActualizarTot()' onkeyup='Tot("+x.precio+",this.value)' class='form-control'></center></td><td id='total'>" + x.precio+ "</td><td>" +
                        "<a class='btn btn-danger edit' onclick='EliminarProdCarrito()'  href='#' aria-label='Settings'><i class='fa fa-trash' aria-hidden='true'></i></a></td></tr>");
                $("#codPro").val('');
                ActualizarTot();
            }
            else{
                alert('Atencion el stock de este producto es 0 y no puede se vendido');
            }
        }       
    });
    }
});
function Tot(x,y){
    $('table tr td').keyup(function(){
       var fila = $(this).parent('tr').index();
       //inner text ingresar texto
       document.getElementById("tabla").rows[fila+1].cells[3].innerText=(x*y).toFixed(2);
       ActualizarTot();
     //  var NroFilas = $("#tabla tr").length-1; 
    });
}

function ActualizarTot(){
    var totales = [];
       $('#tabla tbody tr').each(function () {   
           //html recibe valor 
        var tot = $(this).find("td").eq(3).html();
        totales.push(tot);
    });
         var total = eval(totales.join("+"));
         $('#totalS').html(total.toFixed(2));
}

function EliminarProdCarrito(){
    $('table tr td').click(function(){
        var fila = ($(this).parent('tr').index()+1);
        alert(fila);
        $("table tr"+fila).remove();
    });
}


$("#codCli").keyup(function (){
    var codigo = $("#codCli").val();
    if(codigo.length===8){
    $.get("../persona",{"opc":9,"DR":codigo},function(data) {
        var x = JSON.parse(data);
        if(x.id===0){
            $("#Alert").addClass('alert alert-danger');
            $("#Alert").html("El cliente no existe");
            $("#Alert").show(200);
            $("#Alert").delay(1500).hide(300);
        }else{
            $("#codCli").val(x.nombres);        
        }      
    });
    }
        //$('#tablaVentas tbody tr').remove();
 
});


$("#AddClient").click(function (){
    if($("#CN").is(':checked')) {
        var nombre = $("#CNNombre").val();
    var apellido = $("#CNApellido").val();
    var DNI = $("#CNDNI").val();
    $.post("../persona",{"nombres":nombre,"apellidos":apellido,"dni":DNI,"opc":1},function () {
    });
   $("#ModalClient").modal('hide'); 
   $("#Alert").html("Cliente agregado correctamente");
      $("#Alert").addClass('alert alert-success');
      $("#Alert").show(200);
      $("#Alert").delay(3000).hide(600);
    };
    if($("#CE").is(':checked')) {
        var ruc = $("#CERuc").val();
    var razonsocial = $("#CERazSo").val();
    var direccion = $("#CEDireccion").val();
    var telefono = $("#CETelefono").val();
    $.post("../persona",{"ruc":ruc,"razonso":razonsocial,"direccion":direccion,"telefono":telefono,"opc":7},function () {
    });
   $("#ModalClient").modal('hide'); 
    };  
});

$("#AddVenta").click(function (){
    var cli = $("#codCli").val();
    var docu = $("#documento").val();
    var user = $("#nomUser").text();
    var tipPago = $("#tipoPago").val();
    var sed = $("#sede").html();
    var tot = $("#totalS").html();
    var codCli = $("#codCli").val();
    if(codCli==="" || ($("#tabla tr").length-1)===0){
      $("#Alert").html("Ingresar un producto y un cliente!");
      $("#Alert").addClass('alert alert-danger');
      $("#Alert").show(200);
      $("#Alert").delay(3000).hide(600);
    }
    else{
        $.post("../venta",{"cliente":cli,"documento":docu,"usuario":user,"sede":sed,"total":tot,"opc":1},function () {
        $.post("../venta",{"imp":tot,"tip":tipPago,"sed":sed,"opc":4},function () {
        
      });
    });
    $('#tabla tbody tr').each(function () {    
        var precio = $(this).find("td").eq(1).html();
        var cant = $(this).find("td").eq(2).find("input").val();
        var prod = $(this).find("td").eq(0).text();
        $.post("../venta",{"precio":precio,"cant":cant,"prod":prod,"opc":3},function () {     
      }); 
      });
    $("#codCli").val("");
    $('#tabla tbody tr').remove();
    $('#totalS').html("S/.00.00");
    $("#Alert").removeClass();
    $("#Alert").addClass('alert alert-success');
    $("#Alert").html("Venta exitosa");
    $("#Alert").show(200);
    $("#Alert").delay(3000).hide(600);
    
    }
  
    if($("#CE").is(':checked')) {
        var ruc = $("#CERuc").val();
    var razonsocial = $("#CERazSo").val();
    var direccion = $("#CEDireccion").val();
    var telefono = $("#CETelefono").val();
    $.post("../persona",{"ruc":ruc,"razonso":razonsocial,"direccion":direccion,"telefono":telefono,"opc":7},function () {
    });
  
   $("#ModalClient").modal('hide'); 
    };  
});



