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
      <div class="alert alert-success alertNotificacion"id="alertNotificacion" role="alert"></div> 
       <h2>Gestion Productos</h2>
        <ol class="breadcrumb">
         <li class="active"><i class="fa fa-tasks"></i> Productos</li>
        </ol>
       </div>
      </div>
     </div>
      <button id="button" class="btn btn-primary" data-toggle="modal" data-target="#ModalAdd"><i class="fa fa-plus"></i> Agregar Producto</button>
      

                <div class="input-group stylish-input-group">
                    <input type="text" class="form-control" id="SearchTerm" onkeyup="doSearch()" placeholder="Ingresar codigo" >
                    <span class="input-group-addon">
                        <button type="submit">
                            <span class="glyphicon glyphicon-search"></span>
                        </button>  
                    </span>
                </div>
<!-- Modal Usuario-->
<div class="modal fade" id="ModalAdd" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form>
                  <div class="form-group">
                    <label for="exampleInputEmail1">Nombre</label>
                    <input type="text" class="form-control"  id="nombre" placeholder="Nombre">
                  </div>
                  <div class="form-group">
                    <label for="exampleInputPassword1">Precio</label>
                    <input type="text" class="form-control" id="precio" placeholder="Precio" onkeypress="return valida(event)">
                  </div>
                  <div class="form-group">
                    <label for="exampleInputPassword1">Stock</label>
                    <input type="number" class="form-control" id="stock" placeholder="Stock" onkeypress="return valida(event)">
                  </div>
                    <div class="form-group">
                      <label for="sel1">Tipo</label>
                      <select class="form-control" id="tipo">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                      </select>
                    </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                <input type="button" class="btn btn-primary" id="agregar" value="agregar">
               
            </div>
        </div>
        </form>
    </div>
</div>

<!-- Modal Modificar Usuario-->
<div class="modal fade" id="ModalEdit" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form>
                  <div class="form-group">
                    <label for="exampleInputEmail1">Nombre</label>
                    <input type="text" class="form-control"  id="nombre2" placeholder="Nombre">
                  </div>
                  <div class="form-group">
                    <label for="exampleInputPassword1">Precio</label>
                    <input type="text" class="form-control" id="precio2" placeholder="Precio" onkeypress="return valida(event)">
                  </div>
                  <div class="form-group">
                    <label for="exampleInputPassword1">Stock</label>
                    <input type="number" class="form-control" id="stock2" placeholder="Stock" onkeypress="return valida(event)">
                  </div>
                    <div class="form-group">
                      <label for="sel1">Tipo</label>
                      <select class="form-control" id="tipo2">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                      </select>
                    </div>
                    <div class="form-group">
                    <label for="exampleInputPassword1">Codigo</label>
                    <input type="text" class="form-control" id="codigo" placeholder="Stock" disabled>
                  </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                <input type="button" class="btn btn-primary" id="Modificar" value="Modificar">
               
            </div>
        </div>
        </form>
    </div>
</div>
<table class="table table-hover" id="table">
       <thead>
        <tr>
            <th>#</th>
            <th>Nombres</th>
            <th>Precio</th>
            <th>Stock</th>
            <th>Tipo</th>
            <th>Codigo</th>   
            <th>Accion</th>
        </tr>
    </thead>
    <tbody>
       
    </tbody>
</table>
</div>
</div>  
   <%@include file="../WEB-INF/template/footer.jspf" %>
   <%@include file="../WEB-INF/template/footerView.jspf" %>
   <script src="../js/producto.js"></script>
</body>
</html>
<style>
    @media screen and (max-width: 500px) {
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
    width: 200px;
    float: right;
}
.stylish-input-group button{
    border:0;
    background:transparent;
}
table {
        margin-top: 15px;
       }
.alertNotificacion{
    text-align:center;
    position: fixed;
    width: 100%;
}
</style>