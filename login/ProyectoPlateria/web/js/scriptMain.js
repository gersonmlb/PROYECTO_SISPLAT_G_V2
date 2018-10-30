$(document).ready(function(){
        NroProd();
        GrafProd();
        NroVentas();
        NroUser();
$(".sidebar-toggle").click(function(){
    $(this).hide();

   $("#user-profil").show();

   $("#hide-btn").show();

   $(".container-2").css("width", "85%");

});
        
$("#hide-btn").click(function(){
    $(this).hide();

   $("#user-profil").hide();

   $(".sidebar-toggle").show();

   $(".container-2").css("width", "100%");


});
    
new Morris.Line({
  // ID of the element in which to draw the chart.
  element: 'GraficosVenta',
  // Chart data records -- each entry in this array corresponds to a point on
  // the chart.
  data: [
    { year: '2008', value: 20 },
    { year: '2009', value: 10 },
    { year: '2010', value: 5 },
    { year: '2011', value: 5 },
    { year: '2012', value: 20 }
  ],
  // The name of the data record attribute that contains x-values.
  xkey: 'year',
  // A list of names of data record attributes that contain y-values.
  ykeys: ['value'],
  // Labels for the ykeys -- will be displayed when you hover over the
  // chart.
  labels: ['Value']
});

    });
function NroProd(){
    $.get("agregar",{"opc":6},function (data) {
       var x = JSON.parse(data);
        $("#NroProd").text(x.NroProd);
  
    });
}
function NroVentas(){
    $.get("venta",{"opc":5},function (data) {
       var x = JSON.parse(data);
        $("#NroVentas").text(x.RepNroVenta);
  
    });
}
function NroUser(){
    $.get("persona",{"opc":8},function (data) {
       var x = JSON.parse(data);
        $("#NroUser").text(x.NroUser);
  
    });
}
function GrafProd(){
  $.get("rp",{"opc":1},function (data) {
    var x = JSON.parse(data);
Morris.Bar({
  element: 'GraficosProd',
  data: [
    { y: x[0].nombre, a: x[0].cantidad},
    { y: x[1].nombre, a: x[1].cantidad},
    { y: x[2].nombre, a: x[2].cantidad},
    { y: x[3].nombre, a: x[3].cantidad},
    { y: x[4].nombre, a: x[4].cantidad},
    { y: x[5].nombre, a: x[5].cantidad}
  ],
  xkey: 'y',
  ykeys: ['a'],
  labels: ['Cantidad vendida']
    });
});   
}



