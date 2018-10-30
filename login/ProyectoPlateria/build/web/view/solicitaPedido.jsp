<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8"> 
	<meta name="viewport" content="width=device-width, initial-scale=1">
        <%@include file="../WEB-INF/template/headerView.jspf" %>
        <title>Menu Principal</title>
</head>
<body>
   <%@include file="../WEB-INF/template/navMainView.jspf" %>
  <div class="container-2">
  <div id="page-wrapper">
      <div class="row">
     <div class="col-md-12">
      <div class="page-title">
       <h2>Gestion Productos</h2>
        <ol class="breadcrumb">
         <li class="active"><i class="fa fa-truck"></i> Solicitar pedido</li>
        </ol>
       </div>
      </div>
     </div>
    <div class="container">
	<div class="row form-group">
        <div class="col-xs-12">
            <ul class="nav nav-pills nav-justified thumbnail setup-panel">
                <li class="active"><a href="#step-1">
                    <h4 class="list-group-item-heading">Cliente</h4>
                    <p class="list-group-item-text">Registrar datos del cliente</p>
                </a></li>
                <li class="disabled"><a href="#step-2">
                    <h4 class="list-group-item-heading">Producto</h4>
                    <p class="list-group-item-text">Registrar producto</p>
                </a></li>
                <li class="disabled"><a href="#step-3">
                    <h4 class="list-group-item-heading">Descripcion</h4>
                    <p class="list-group-item-text">Describir el producto </p>
                </a></li>
                <li class="disabled"><a href="#step-4">
                    <h4 class="list-group-item-heading">Confirmar</h4>
                    <p class="list-group-item-text">Ingresar adelanto y confirmar datos </p>
                </a></li>
            </ul>
        </div>
	</div>
    <div class="row setup-content" id="step-1">
        <div class="col-xs-12">
            <div class="col well">
                <div class="row">
     <div class="col-sm-offset-3 col-sm-6 ">
               
                <div class="form-group">     
                    <center><form class="radio" id="radio">
                  <label style="font-weight:bold"><input id="CN" type="radio" name="optradio">Cliente Natural</label>
                  <label style="font-weight:bold"><input id="CE" type="radio" name="optradio">Cliente Empresarial</label>
                </form></center>    
                   
            </div>
         <div class="form-group" id="inRuc">
        			<label for="validate-email">Ruc</label>
					<div class="input-group" data-validate="email">
						<span class="input-group-addon"><span class="fa fa-building"></span></span>
						<input type="text" class="form-control" name="validate-email" id="validate-email" placeholder="Ruc" required>
					</div>
                                </div>
         <div class="form-group" id="inRaZ">
        			<label for="validate-email">Razon Social</label>
					<div class="input-group" data-validate="email">
						<span class="input-group-addon"><span class="fa fa-file-text"></span></span>
						<input type="text" class="form-control" name="validate-email" id="validate-email" placeholder="Razon Social" required>
					</div>
                                 </div>
                                <div class="form-group" id="inNombre">
        			<label for="validate-text">Nombres</label>
					<div class="input-group">
					    <span class="input-group-addon"><span class="fa fa-user-circle"></span></span>
						<input type="text" class="form-control" name="validate-text" id="validate-text" placeholder="Nombres" required>
					</div>
				</div>
				<div class="form-group" id="inApellido">
        			<label for="validate-optional">Apellidos</label>
					<div class="input-group">
						<span class="input-group-addon"><span class="fa fa-user-circle"></span></span>
						<input type="text" class="form-control" name="validate-optional" id="validate-optional" placeholder="Apellidos">
					</div>
				</div>
         <div class="form-group" id="inDNI">
        			<label for="validate-optional">DNI</label>
    				<div class="input-group">
						<span class="input-group-addon"><span class="fa fa-id-card"></span></span>
						<input type="text" class="form-control" name="validate-text" id="validate-text" placeholder="DNI" required>
					</div>
				</div>
         <div class="form-group" id="inDir">
        			<label for="validate-email">Direccion</label>
					<div class="input-group" data-validate="email">
						<span class="input-group-addon"><span class="fa fa-location-arrow"></span></span>
						<input type="text" class="form-control" name="validate-email" id="validate-email" placeholder="Direccion" required>
					</div>
				</div>
         <div class="form-group" id="inCelular">
        			<label for="validate-email">Celular</label>
					<div class="input-group" data-validate="email">
						<span class="input-group-addon"><span class="fa fa-phone"></span></span>
						<input type="text" class="form-control" name="validate-email" id="validate-email" placeholder="Celular" required>
					</div>
				</div>
         <center><button id="activate:step-2" class="btn btn-primary">Siguiente</button></center>
        </div>
                    
    </div>
            </div>
        </div>
    </div>
    <div class="row setup-content" id="step-2">
        <div class="col-xs-12">
            <div class="col-md-12 well">
                <div class="col-sm-offset-3 col-sm-6 ">
               
                <div class="form-group">     
                      
            </div>
         <div class="form-group" id="inRuc">
        			<label for="validate-email">Nombre</label>
					<div class="input-group" data-validate="email">
						<span class="input-group-addon"><span class="fa fa-info"></span></span>
						<input type="text" class="form-control" name="validate-email" id="validate-email" placeholder="Nombre" required>
					</div>
                                </div>
         <div class="form-group" id="inRaZ">
        			<label for="validate-email">Precio</label>
					<div class="input-group" data-validate="email">
						<span class="input-group-addon"><span class="fa fa-money"></span></span>
						<input type="text" class="form-control" name="validate-email" id="validate-email" placeholder="Precio" required>
					</div>
                                 </div>
                                <div class="form-group" id="inNombre">
        			<label for="validate-text">Stock</label>
					<div class="input-group">
					    <span class="input-group-addon"><span class="fa fa-tasks"></span></span>
						<input type="text" class="form-control" name="validate-text" id="validate-text" placeholder="Stock" required>
					</div>
				</div>
				<div class="form-group" id="inApellido">
        			<label for="validate-optional">Tipo</label>
					<div class="input-group">
						<span class="input-group-addon"><span class="fa fa-circle"></span></span>
                                                <input type="text" class="form-control" name="validate-optional" id="validate-optional" readonly="readonly" value="Producto especial" disabled>
					</div>
				</div>
        
        
         
                    <center><button id="activate:step-1" class="btn btn-primary " >Atras</button>
                <button id="activate:step-3" class="btn btn-primary">Siguiente</button></center>
        </div>
            </div>
        </div>
    </div>
    <div class="row setup-content" id="step-3">
        <div class="col-xs-12">
            <div class="col-md-12 well text-center">
               
                <div class="form-group">
                  <label for="comment">Descripcion</label>
                  <textarea class="form-control" rows="5" id="comment"></textarea>
                </div>
                <button id="activate:step-2" class="btn btn-primary btn-lg">Atras</button>
                <button id="activate:step-4" class="btn btn-primary btn-lg">Siguiente</button>
            </div>
        </div>
    </div> <div class="row setup-content" id="step-4">
        <div class="col-xs-12">
            <div class="col-md-12 well text-center">
                
                <button id="activate:step-3" class="btn btn-primary btn-lg">Atras</button>
                <button id="activate:step-2" class="btn btn-primary btn-lg">Finalizar</button>
            </div>
        </div>
    </div>
</div>  
</div>
</div>  
   <%@include file="../WEB-INF/template/footer.jspf" %>
   <%@include file="../WEB-INF/template/footerView.jspf" %>
   <script>
       $(document).ready(function() {
    
    var navListItems = $('ul.setup-panel li a'),
        allWells = $('.setup-content');

    allWells.hide();

    navListItems.click(function(e)
    {
        e.preventDefault();
        var $target = $($(this).attr('href')),
            $item = $(this).closest('li');
        
        if (!$item.hasClass('disabled')) {
            navListItems.closest('li').removeClass('active');
            $item.addClass('active');
            allWells.hide();
            $target.show();
        }
    });
    
    $('ul.setup-panel li.active a').trigger('click');
    
    // DEMO ONLY //
    $('#activate-step-1').on('click', function(e) {
        $("#info").text($(this).attr('id'));
        //$('ul.setup-panel li:eq(1)').removeClass('disabled');
        $('ul.setup-panel li a[href="#step-1"]').trigger('click');
        //f$(this).remove();
    }) ;
    
    $('#activate-step-2').on('click', function(e) {
        $("#info").text($(this).attr('id'));
        //$('ul.setup-panel li:eq(1)').removeClass('disabled');
        $('ul.setup-panel li a[href="#step-2"]').trigger('click');
        //$(this).remove();
    })  ; 
    $('#activate-step-3').on('click', function(e) {
        $("#info").text($(this).attr('id'));
        //$('ul.setup-panel li:eq(2)').removeClass('disabled');
        $('ul.setup-panel li a[href="#step-3"]').trigger('click');
        //$(this).remove();
    }) ;
    $('#activate-step-4').on('click', function(e) {
        $("#info").text($(this).attr('id'));
        //$('ul.setup-panel li:eq(3)').removeClass('disabled');
        $('ul.setup-panel li a[href="#step-4"]').trigger('click');
        //$(this).remove();
    }) ;
    $('button').on('click', function(e) {
       $("#info2").text($(this).attr('id')) 
       var target = $(this).attr('id').split(':')[1];
       var temp = target.split("-")[1] - 1;
       $('ul.setup-panel li:eq(' + temp + ')').removeClass('disabled');
       $('ul.setup-panel li a[href="#' + target + '"]').trigger('click');
    });
    $("#CN").prop('checked',true);
$("#inRuc").css({'display':'none'});
$("#inRaZ").css({'display':'none'});
$("#CN").click(function(){
    if($("#CN").is(':checked')) {  
           $("#inRuc").css({'display':'none'});
           $("#inRaZ").css({'display':'none'});
           $("#inNombre").css({'display':'block'});
           $("#inApellido").css({'display':'block'});
           $("#inDNI").css({'display':'block'});
           
        };      
});
$("#CE").click(function(){
    if($("#CE").is(':checked')) {  
           $("#inRuc").css({'display':'block'});
           $("#inRaZ").css({'display':'block'});
           $("#inNombre").css({'display':'none'});
           $("#inApellido").css({'display':'none'});
           $("#inDNI").css({'display':'none'});
  
        } ;      
});

     
});
function Validate(title)
{
    var $button = $(this).closest('input-group-addon');
    
    $( "#test").text(" validate: " + title.value);
    
    var $group = $(title).closest('.input-group'),
		$addon = $group.find('.input-group-addon'),
		$icon = $addon.find('span');
    
    if(title.value !== "") {
				$addon.addClass('success');
				$icon.attr('class', 'glyphicon glyphicon-ok');
		}else{
				$addon.addClass('danger');
				$icon.attr('class', 'glyphicon glyphicon-remove');
		} 
}
   </script>
</body>
</html>
<style>
    .input-group-addon.primary {
    color: rgb(255, 255, 255);
    background-color: rgb(50, 118, 177);
    border-color: rgb(40, 94, 142);
}
.input-group-addon.success {
    color: rgb(255, 255, 255);
    background-color: rgb(92, 184, 92);
    border-color: rgb(76, 174, 76);
}
.input-group-addon.info {
    color: rgb(255, 255, 255);
    background-color: rgb(57, 179, 215);
    border-color: rgb(38, 154, 188);
}
.input-group-addon.warning {
    color: rgb(255, 255, 255);
    background-color: rgb(240, 173, 78);
    border-color: rgb(238, 162, 54);
}
.input-group-addon.danger {
    color: rgb(255, 255, 255);
    background-color: rgb(217, 83, 79);
    border-color: rgb(212, 63, 58);
}
</style>

