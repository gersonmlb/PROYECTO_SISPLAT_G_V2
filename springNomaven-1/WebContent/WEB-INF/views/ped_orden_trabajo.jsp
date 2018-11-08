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


	<div class="col-sm-12" style="background-color: white; width: 100%;">
		<label>Codigo de Pedido</label>
		<div class="input-group">
			<input type="text" class="form-control"
				placeholder="Escriba el codigo del Pedido " aria-label="Username"
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
				<label>Codigo</label> <input class="form-control" type="text"
					placeholder="1212" disabled="disabled" style="">
			</div>
			<div class="col-lg-3">
				<label>Nombre Producto</label> <input class="form-control"
					type="text" placeholder="Joya de Oro" disabled="disabled" style="">

			</div>
			<div class="col-lg-3">
				<label>Cantidad</label> <input class="form-control" type="text"
					placeholder="3" disabled="disabled" style="">

			</div>
		</div>

		<label>Materia Prima</label>
		<div class="input-group">
			<input type="text" class="form-control"
				placeholder="Escriba el nombre de la materia prima a utilizar"
				aria-label="Username" aria-describedby="basic-addon1">
			<div class="input-group-prepend">
				<button class="btn btn-primary" id="basic-addon1">
					<i class="fa fa-search"></i>
				</button>
			</div>
		</div>
		<div class="form-group row" style="margin-top: 2%;">
			<div class="col-lg-5">
				<label>Nombre</label> <input class="form-control" type="text"
					placeholder="Guzman Gonzales" disabled="disabled" style="">
				<button class="btn btn-primary">Agregar</button>
			</div>
			<div class="col-lg-7" style="margin-top: 2%;">
				<div class="table-responsive" style="background-color: white;">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>#</th>
								<th>Nombre Producto</th>
								<th>Action</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1</td>
								<td>Joya de Oro</td>
								<td>X</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<div class="col-sm-12" style="background-color: white; width: 100%;">
		<div class="form-group row" style="margin-top: 2%;">
			<div class="col-lg-4">
				<button type="button" class="btn btn-success">Realizar</button>
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