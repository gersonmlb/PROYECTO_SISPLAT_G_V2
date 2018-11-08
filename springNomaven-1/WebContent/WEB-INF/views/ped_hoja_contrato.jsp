<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es">
<head>
<title>SisPlat-G</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<spring:url value="/recursos" var="urlrecursos"></spring:url>
<link href="${urlrecursos}/css/template.css" rel="stylesheet">
</head>
<body class="app sidebar-mini rtl">
	<!-- Navbar-->
	<jsp:include page="template/header.jsp"></jsp:include>
	<main class="app-content">
	<div class="app-title">
		<div>
			<h1>
				<i class="fa fa-user fa-lg"></i> HOJA CONTRATO
			</h1>
		</div>
	</div>

	<div class="col-sm-12" style="background-color: white; width: 100%;">
		<label>Codigo Pedido</label>

		<div class="input-group">
			<input type="text" class="form-control"
				placeholder="Escriba el codigo del pedido" aria-label="Username"
				aria-describedby="basic-addon1">
			<div class="input-group-prepend">
				<button class="btn btn-primary" id="basic-addon1">
					<i class="fa fa-search"></i>
				</button>
			</div>
		</div>

		<div class="form-group row" style="margin-top: 2%;">
			<div class="col-lg-3">
				<label>Cliente</label> <input class="form-control" type="text"
					placeholder="Guzman Gonzales" disabled="disabled" style="">
			</div>
			<div class="col-lg-3">
				<label>Codigo del Pedido</label> <input class="form-control"
					type="text" placeholder="121212" disabled="disabled" style="">
			</div>
			<div class="col-lg-3">
				<label>Tipo de pago</label> 
				<input class="form-control"
					type="text" placeholder="Contado" disabled="disabled" style="">
			</div>
			<div class="col-lg-3">
				<label> Fecha Emitida </label> <input class="form-control"
					type="text" placeholder="2018-10-17" disabled="disabled" style="">
			</div>
		</div>
	</div>

	<div class="table-responsive" style="background-color: white;">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>#</th>
					<th>Nombre Producto</th>
					<th>Cantidad</th>
					<th>Precio Unitario</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>Joya de Oro</td>
					<td>1</td>
					<td>100</td>
				</tr>
			</tbody>
		</table>
	</div>

	<div class="col-sm-12" style="background-color: white; width: 100%;">
		<div class="form-group row" style="margin-top: 2%;">
			<div class="col-lg-2">
				<label>S/. Importe Total</label> <input class="form-control"
					type="text" placeholder="2000.00" disabled="disabled" style="">
			</div>
			<div class="col-lg-1"></div>
			<div class="col-lg-2">
				<label>S/. Adelanto</label> <input class="form-control" type="text"
					placeholder="1200.00" style="">
			</div>
			<div class="col-lg-1"></div>
			<div class="col-lg-2">
				<label>S/. A cuenta</label> <input class="form-control" type="text"
					placeholder="800.00" disabled="disabled" style="">
			</div>
			<div class="col-lg-1"></div>
			<div class="col-lg-2">
				<label>50% Total</label> <input class="form-control" type="text"
					placeholder="1000.00" disabled="disabled" style="">
			</div>
			<div class="col-lg-1"></div>
		</div>
	</div>
	<div class="col-sm-12" style="background-color: white; width: 100%;">
		<div class="form-group row" style="margin-top: 2%;">
			<div class="col-lg-4">
				<button type="button" class="btn btn-success">Generar</button>
				<button type="button" class="btn btn-info">Cancelar</button>
			</div>
			<div class="col-lg-8"></div>
		</div>
	</div>







	</main>
	<!-- Essential javascripts for application to work-->
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="${urlrecursos}/js/main.js"></script>
	<!-- The javascript plugin to display page loading on top-->
	<script src="${urlrecursos}/js/plugins/pace.min.js"></script>
	<!-- Page specific javascripts-->
	<!-- Google analytics script-->
	<script type="text/javascript">
		if (document.location.hostname == 'pratikborsadiya.in') {
			(function(i, s, o, g, r, a, m) {
				i['GoogleAnalyticsObject'] = r;
				i[r] = i[r] || function() {
					(i[r].q = i[r].q || []).push(arguments)
				}, i[r].l = 1 * new Date();
				a = s.createElement(o), m = s.getElementsByTagName(o)[0];
				a.async = 1;
				a.src = g;
				m.parentNode.insertBefore(a, m)
			})(window, document, 'script',
					'//www.google-analytics.com/analytics.js', 'ga');
			ga('create', 'UA-72504830-1', 'auto');
			ga('send', 'pageview');
		}
	</script>
</body>
</html>