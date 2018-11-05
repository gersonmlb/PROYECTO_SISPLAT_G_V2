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
<style type="text/css">
.letra {
	font-family: Century Gothic;
}
</style>
</head>
<body class="app sidebar-mini rtl">
	<!-- Navbar-->
	<jsp:include page="template/header.jsp"></jsp:include>
	<main class="app-content">
	<div class="app-title">
		<div>
			<h1>
				<i class="fa fa-user fa-lg"></i> ORDEN DE TRABAJO
			</h1>
		</div>
		<ul class="app-breadcrumb breadcrumb">
			<li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
			<li class="breadcrumb-item"><a href="#">Blank Page</a></li>
		</ul>
	</div>
	<center>
		<div class="col-sm-12">
			<div class="col-sm-4"></div>
			<div class="col-sm-4">
				<div class="form-group row">
					<label class="col-lg-6 col-form-label form-control-label">ESCRIBA
						EL CODIGO</label> <br>
					<div class="col-lg-4">
						<input class="form-control"  type="text" placeholder="">
					</div>
					<div class="col-lg-2">
						<button class="btn btn-primary">Buscar</button>
					</div>
				</div>
			</div>

			<div class="col-sm-4"></div>
		</div>
	</center>



	<div>
		<div class="col-sm-3"
			style="background-color: green; float: left; height: 100%;">
			<div class="form-group row">
				<label class="col-lg-4 col-form-label form-control-label">CLIENTE</label>
				<br>
				<div class="col-lg-8">
					<input class="form-control" type="text" disabled="true" placeholder="">
				</div>
			</div>
		</div>
		<div class="col-sm-3"
			style="background-color: blue; float: left; height: 100%;">
			<div class="form-group row">
				<label class="col-lg-5 col-form-label form-control-label">COD.PEDIDO</label>
				<br>
				<div class="col-lg-7">
					<input class="form-control" type="text" disabled="true" placeholder="">
				</div>
			</div>
		</div>
		<div class="col-sm-3"
			style="background-color: yellow; float: left; height: 100%;">
			<div class="form-group row">
				<label class="col-lg-5 col-form-label form-control-label">FEC.EMITIDA
				</label> <br>

				<div class="col-lg-7">
					<input class="form-control" type="text" disabled="true" placeholder="">
				</div>
			</div>
		</div>
		<div class="col-sm-3"
			style="background-color: purple; float: left; height: 100%;">
			<div class="form-group row">
				<label class="col-lg-5 col-form-label form-control-label">PRODUCTO</label>
				<br>
				<div class="col-lg-7">
					<input class="form-control" type="text" disabled="true" placeholder="">
				</div>
			</div>
		</div>
	</div>
	<div class="table-responsive">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>#</th>
					<th>Codigo </th>
					<th>Last Name</th>
					<th>Dni</th>
					<th>Type</th>
					<th>User Name</th>
					<th>Password</th>
					<th colspan="2">Action</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>John</td>
					<td>Doe</td>
					<td>john@example.com</td>
					<td>John</td>
					<td>Doe</td>
					<td>john@example.com</td>
					<td>john@example.com</td>
				</tr>
			</tbody>
		</table>
	</div>
	<br>
	<center>
		<div class="col-sm-12">
			<div class="form-group row">
				<div class="col-lg-6" style="margin: auto">
					<button type="button" class="btn btn-primary">Anterior</button>
				</div>

				<div class="col-lg-6" style="margin: auto">
					<button type="button" class="btn btn-primary">Realizar</button>
				</div>
			</div>
		</div>
	</center>


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