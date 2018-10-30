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
       <h2>Reportes</h2>
        <ol class="breadcrumb">
         <li class="active"><i class="fa fa-tasks"></i> Resportes de ventas</li>
        </ol>
       </div>
      </div>
     </div>
     <div class="row">
        <div class="panel panel-primary filterable">
            <div class="panel-heading">
                <h3 class="panel-title">Ventas</h3>
                <div class="pull-right">
                    <button class="btn btn-default btn-xs btn-filter"><span class="glyphicon glyphicon-filter"></span> Filtrar</button>
                </div>
            </div>
            <table class="table">
                <thead>
                    <tr class="filters">
                        <th><input type="text" class="form-control" placeholder="N. de venta" disabled></th>
                        <th><input type="text" class="form-control" placeholder="Fecha de venta" disabled></th>
                        <th><input type="text" class="form-control" placeholder="Cliente" disabled></th>
                        <th><input type="text" class="form-control" placeholder="Vendedor" disabled></th>
                        <th><input type="text" class="form-control" placeholder="Productos" disabled></th>
                        <th><input type="text" class="form-control" placeholder="N. articulos" disabled></th>
                        <th><input type="text" class="form-control" placeholder="IGV" disabled></th>
                        <th><input type="text" class="form-control" placeholder="Total" disabled></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>001</td>
                        <td>14/03/2018</td>
                        <td>Jose</td>
                        <td>Arisaca</td>
                        <td>Reloj x3<br>Olla x4</td>
                        <td>7</td>
                        <td>S/.120</td>
                        <td>S/.700</td>
                    </tr>
                    <tr>
                        <td>002</td>
                        <td>15/03/2018</td>
                        <td>Jose</td>
                        <td>Arisaca</td>
                        <td>Olla x4</td>
                        <td>4</td>
                        <td>S/.50</td>
                        <td>S/.400</td>
                    </tr>
                    <tr>
                        <td>003</td>
                        <td>14/03/1997</td>
                        <td>Jose</td>
                        <td>Arisaca</td>
                        <td>Reloj x3<br>Olla x4</td>
                        <td>7</td>
                        <td>S/.120</td>
                        <td>S/.700</td>
                    </tr>
                    
                </tbody>
            </table>
        </div>
    </div>
</div>
</div>  
   <%@include file="../WEB-INF/template/footer.jspf" %>
   <%@include file="../WEB-INF/template/footerView.jspf" %>
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
.filterable {
    margin-top: 15px;
}
.filterable .panel-heading .pull-right {
    margin-top: -20px;
}
.filterable .filters input[disabled] {
    background-color: transparent;
    border: none;
    cursor: auto;
    box-shadow: none;
    padding: 0;
    height: auto;
}
.filterable .filters input[disabled]::-webkit-input-placeholder {
    color: #333;
}
.filterable .filters input[disabled]::-moz-placeholder {
    color: #333;
}
.filterable .filters input[disabled]:-ms-input-placeholder {
    color: #333;
}
</style>
