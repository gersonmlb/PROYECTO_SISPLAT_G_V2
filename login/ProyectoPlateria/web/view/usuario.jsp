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
       <h2>Gestion Usuarios</h2>
        <ol class="breadcrumb">
         <li class="active"><i class="fa fa-user"></i> Usuarios</li>
        </ol>
       </div>
      </div>
     </div>
      <button id="OpenModal" type="button" class="btn btn-primary" data-toggle="modal" data-target="#ModalUser"><i class="fa fa-user-plus"></i> Agregar Usuario</button>
<!-- Modal Usuario-->
<div class="modal fade" id="ModalUser" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                    <input type="text" class="form-control" id="nombresUser" placeholder="Nombre">
                  </div>
                  <div class="form-group">
                    <label for="exampleInputPassword1">Apellidos</label>
                    <input type="text" class="form-control" id="apellidosUser" placeholder="Apellidos">
                  </div>
                  <div class="form-group">
                    <label for="exampleInputPassword1">DNI</label>
                    <input type="text" class="form-control" id="DNIUser" placeholder="ex. 78628612">
                  </div>
                    <div class="form-group">
                    <label for="exampleInputPassword1">Direccion</label>
                    <input type="text" class="form-control" id="direccionUser" placeholder="ex. La alameda, Mz.I Lt.1 - Ñaña">
                  </div>
                    <div class="form-group">
                      <label for="sel1">Rol</label>
                      <select class="form-control" id="rolUser">
                        <option>1</option>
                        <option>2</option>
                        
                      </select>
                    </div>
                    <div class="form-group">
                    <label for="exampleInputPassword1">Usuario</label>
                    <input type="text" class="form-control" id="UsuarioUser" placeholder="ex.CarlosLoayza123">
                  </div>
                    <div class="form-group">
                    <label for="exampleInputPassword1">Email</label>
                    <input type="email" class="form-control" id="emailUser" aria-describedby="emailHelp" placeholder="Email">
                  </div>
                    <div class="form-group">
                    <label for="exampleInputPassword1">Contraseña</label>
                    <input type="password" class="form-control" id="passUser" placeholder="Contraseña">
                  </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                <button type="button" id="AddUser" class="btn btn-primary">Agregar</button>
            </div>
        </div>
    </div>
</div>
<!-- Modal Editar-Usuario-->
<div class="modal fade" id="ModalEditUser" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
                    <input type="text" class="form-control" id="edit_nombresUser" placeholder="Nombre">
                  </div>
                  <div class="form-group">
                    <label for="exampleInputPassword1">Apellidos</label>
                    <input type="text" class="form-control" id="edit_apellidosUser" placeholder="Apellidos">
                  </div>
                  <div class="form-group">
                    <label for="exampleInputPassword1">DNI</label>
                    <input type="text" class="form-control" id="edit_DNIUser" placeholder="ex. 78628612" disabled>
                  </div>
                    <div class="form-group">
                    <label for="exampleInputPassword1">Direccion</label>
                    <input type="text" class="form-control" id="edit_direccionUser" placeholder="ex. La alameda, Mz.I Lt.1 - Ñaña">
                  </div>
                    <div class="form-group">
                      <label for="sel1">Rol</label>
                      <select class="form-control" id="edit_rolUser" disabled>
                        <option>Administrador</option>
                        <option>Vendendor</option>
                        
                      </select>
                    </div>
                    <div class="form-group">
                    <label for="exampleInputPassword1">Usuario</label>
                    <input type="text" class="form-control" id="edit_UsuarioUser" placeholder="ex.CarlosLoayza123">
                  </div>
                    <div class="form-group">
                    <label for="exampleInputPassword1">Email</label>
                    <input type="email" class="form-control" id="edit_emailUser" aria-describedby="emailHelp" placeholder="Email">
                  </div>
                    <div class="form-group">
                    <label for="exampleInputPassword1">Contraseña</label>
                    <input type="password" class="form-control" id="edit_passUser" placeholder="Contraseña">
                  </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                <button type="button" id="edit_User" class="btn btn-primary">Modificar</button>
            </div>
        </div>
    </div>
</div>



<div></div>
<table  id="table" class="table table-hover">
       <thead>
        <tr>
            <th>#</th>
            <th>Nombres</th>
            <th>Apellidos</th>
            <th>DNI</th>
            <th>Direccion</th>
            <th>Usuario</th>
            <th>Email</th>
            <th>Contraseña</th>
            <th>Rol</th>    
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
   <script src="../js/persona.js"></script>
</body>
</html>
<style>
    @media screen and (max-width: 950px) {
       table {
           width:100%;
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
</style>
