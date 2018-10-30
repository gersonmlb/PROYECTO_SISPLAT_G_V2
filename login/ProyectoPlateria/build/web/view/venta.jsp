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
                <h2>Ventas</h2>
                <ol class="breadcrumb">
                    <li class="active"><i class="fa fa-shopping-cart"></i> Venta</li>
                </ol>
                </div>
                <div class="alert alert-success" role="alert" id="Alert" align="center"></div>
            </div>
        </div>
        <div class="col-lg-2 left">
        <div class="col-lg-2 divider">               
           <div class="input-group stylish-input-group" style="width:auto;">
               
               <input type="text" class="form-control" id="codPro"  placeholder="Ingresar codigo del producto" >
                <span class="input-group-addon">
                    <button type="submit">
                        <span class="glyphicon glyphicon-search"></span>
                    </button>  
                </span>
            </div>    
        </div>
            <br>
        <div class="col-lg-2 divider">               
<table id="tabla" class="table" >
</div>
     <thead>
        <tr class="row-name">
         
           <th style="width:450px">Nombre</th>
           <th>Precio</th>
           <th>Cantidad</th>
           <th>Total</th>
           <th> </th>
        </tr>
     </thead>   
     <tbody>
       
     </tbody>
   </table>   
    
        </div>
    </div>
<div class="col-lg-2 right">
    <div class="col-lg-2 divider">           
        <i class="fa fa-user"></i> <label>Cliente</label>
        <div class="entry input-group col-xs-3" style="width:auto;margin-top: 5px">
            
            
                        <input class="form-control" id="codCli" type="text" placeholder="Ingrese DNI o Ruc" />
                        
                        
                    	<span class="input-group-btn">
                            <button class="btn btn-success btn-add" style="background:#e38d13" data-target="#ModalClient" data-toggle="modal" type="button">
                                <span class="glyphicon glyphicon-plus"></span>
                            </button>
                        </span>
         <!-- The Modal -->
<div class="modal" id="ModalClient">
  <div class="modal-dialog">
    <div class="modal-content">
      <!-- Modal Header -->
      <div class="modal-header">
        <h4 class="modal-title">Agregar cliente</h4>
        <button type="button" class="close" data-dismiss="modal">&times;</button>
      </div>
      <!-- Modal body -->
      <div class="modal-body">
       <div class="form-group">
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
						<input type="text" class="form-control" name="validate-email" id="CERuc" placeholder="Ruc" required>
					</div>
                                </div>
         <div class="form-group" id="inRaZ">
        			<label for="validate-email">Razon Social</label>
					<div class="input-group" data-validate="email">
						<span class="input-group-addon"><span class="fa fa-file-text"></span></span>
						<input type="text" class="form-control" name="validate-email" id="CERazSo" placeholder="Razon Social" required>
					</div>
                                 </div>
                                <div class="form-group" id="inNombre">
        			<label for="validate-text">Nombres</label>
					<div class="input-group">
					    <span class="input-group-addon"><span class="fa fa-user-circle"></span></span>
						<input type="text" class="form-control" name="validate-text" id="CNNombre" placeholder="Nombres" required>
					</div>
				</div>
				<div class="form-group" id="inApellido">
        			<label for="validate-optional">Apellidos</label>
					<div class="input-group">
						<span class="input-group-addon"><span class="fa fa-user-circle"></span></span>
						<input type="text" class="form-control" name="validate-optional" id="CNApellido" placeholder="Apellidos">
					</div>
				</div>
         <div class="form-group" id="inDNI">
        			<label for="validate-optional">DNI</label>
    				<div class="input-group">
						<span class="input-group-addon"><span class="fa fa-id-card"></span></span>
						<input type="text" class="form-control" name="validate-text" id="CNDNI" placeholder="DNI" required>
					</div>
				</div>
         <div class="form-group" id="inDir">
        			<label for="validate-email">Direccion</label>
					<div class="input-group" data-validate="email">
						<span class="input-group-addon"><span class="fa fa-location-arrow"></span></span>
						<input type="text" class="form-control" name="validate-email" id="CEDireccion" placeholder="Direccion" required>
					</div>
				</div>
         <div class="form-group" id="inCelular">
        			<label for="validate-email">Celular</label>
					<div class="input-group" data-validate="email">
						<span class="input-group-addon"><span class="fa fa-phone"></span></span>
						<input type="text" class="form-control" name="validate-email" id="CETelefono" placeholder="Celular" required>
					</div>
				</div>
    		
    	</div>
      </div>

      <!-- Modal footer -->
      <div class="modal-footer">
        <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-success" id="AddClient">Agregar</button>
      </div>

    </div>
  </div>
</div>     
      <!-- Termina Modal -->   
    </div>
</div>
    
    
            <br>
        <div class="col-lg-2 divider">
            <i class="fa fa-shopping-cart"></i> <label>Detalle de venta</label><br><br>
            <div style="width:100%;height: 70px;float:left; background: #e38d13;border-radius: 5px">
                <center><h3 id="totalS"><span id="Soles">S/.</span>00,00</h3></center>
        </div>
            <div style="width:100%;height: auto;float:left; padding: 5px">
                <div style="width:50%;height: auto;float: left; padding: 5px;">
                    <label>DOCUMENTO</label><br>
                    <select class="col-xs-10 input-sm" id="documento">
                        <option>BOLETA</option>
                        <option>FACTURA</option>
                    </select>
                </div>
                <div style="width:50%;height: auto;float: left;padding: 5px;">
                    <label>TIPO PAGO</label><br>
                    <select class="col-xs-10 input-sm" id="tipoPago">
                        <option>EFECTIVO</option>
                        <option>VISA</option>
                    </select>
                </div>
                <div style="width:50%;height: auto;float: left;padding: 5px;">
                    <label>SEDE</label><br>
                    <select class="col-xs-10 input-sm">
                        <option>TIENDA1</option>
                        <option>TIENDA2</option>
                    </select>
                </div>
                <div style="width:50%;height: auto;float: left;padding: 5px;">
                    <label>FECHA</label><br>
                    <input class="col-xs-10 input-sm" style="border:solid lightgray 1px" type="date">
                </div>
            </div>
            <p>N de articulos</p><label>5</label>
        <p>Subtotal</p>
        
        <button class="button" id="AddVenta"><span>Completar venta </span></button>
        </div>
    </div>
</div> 
</div>
   <%@include file="../WEB-INF/template/footer.jspf" %>
   <%@include file="../WEB-INF/template/footerView.jspf" %>
   <script src="../js/venta.js"></script>
</body>
</html>
<style>
    @media screen and (max-width: 600px) {
       table {
           width:100%;
           margin-top: 15px;
       }
       thead {
           display: none;
       }
       tr:nth-of-type(2n) {
           background-color: inherit;
       }
       tr td:first-child {
           background: #f0f0f0;
           font-weight:bold;
           font-size:1.3em;
       }
       tbody td {
           display: block;
           text-align:center;
       }
       tbody td:before {
           content: attr(data-th);
           display: block;
           text-align:center;
       } 

}
.stylish-input-group .input-group-addon{
    background: white !important; 
}
.stylish-input-group .form-control{
	border-right:0; 
	box-shadow:0 0 0; 
	border-color:#ccc;
}
.stylish-input-group{
    width: 500px;
   
}
.stylish-input-group button{
    border:0;
    background:transparent;
}
table{
    width: auto;
    
}
thead{
  background:lightgray;  
}
th{
    text-align: center;
}
td{
    text-align: center;
    
}
tbody td input{
 
}
.divider{
  padding: 5px;
  width: auto; 
  box-shadow: 0 15px 10px -10px rgba(0,0,0,.5), 0 1px 4px rgba(0,0,0,.3), 0 0 40px rgba(0,0,0,.1) inset;  
  margin-top: 10px; 
  width: 100%;
  height: auto; 
  padding: 10px;
  background: white;
}
.left{
    width: 65%;
}
.right{
    width: 35%;
}
.button {
  border-radius: 4px;
  background-color: #e38d13;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 17px;
  padding: 7px;
  width: 180px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
  float: right;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '\00bb';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}
</style>
