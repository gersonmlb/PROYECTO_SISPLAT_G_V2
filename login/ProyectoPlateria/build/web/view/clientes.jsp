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
       <h2>Clientes</h2>
        <ol class="breadcrumb">
         <li class="active"><i class="fa fa-users"></i> Clientes</li>
        </ol>
       </div>
      </div>
     </div>
                <div class="input-group stylish-input-group">
                    <input type="text" class="form-control" id="SearchTerm" onkeyup="doSearch()" placeholder="Ingresar dni o ruc" >
                    <span class="input-group-addon">
                        <button type="submit">
                            <span class="glyphicon glyphicon-search"></span>
                        </button>  
                    </span>
                </div>


<table class="table table-hover" id="t">
       <thead>
        <tr>
            <th>#</th>
            <th>Nombres</th>
            <th>Apellidos</th>
            <th>DNI</th>
        </tr>
    </thead>
    <tbody>
       
    </tbody>
</table>
      
<table class="table table-hover" id="ts">
       <thead>
        <tr>
            <th>#</th>
            <th>Nombres</th>
            <th>Apellidos</th>
            <th>DNI</th>
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
