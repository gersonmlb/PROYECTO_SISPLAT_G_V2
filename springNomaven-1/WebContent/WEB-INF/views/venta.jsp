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
<link rel="stylesheet"
	href="${urlrecursos}/sweetalert/sweetalert2.min.css">
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
				<i class="fa fa-user fa-lg"></i> Venta
			</h1>
		</div>
	</div>

	<div>
		<div class="col-sm-4"
			style="background-color: green; float: left; height: 100%;">
			<div class="form-group row">
				<div class="col-lg-12">
					<div class="input-group" style="width: 100%;">
						<input type="text" class="form-control"
							placeholder="DNI o RUC del cliente">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fa fa-search"
								aria-hidden="true"></i></span>
						</div>
					</div>
				</div>
			</div>
			<div class="form-group row">
				<div class="col-lg-12">
					<label>Nombre del cliente</label> <input type="text"
						class="form-control" placeholder="Yaritza Casildo Chanducas">
				</div>
			</div>
			<br>
			<div class="form-group row">
				<div class="col-lg-12">
					<div class="input-group" style="width: 100%;">
						<input type="text" class="form-control"
							placeholder="Código del producto">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fa fa-search"
								aria-hidden="true" onclick="prueba()"></i></span>
						</div>
					</div>

				</div>
			</div>
		</div>
		<div class="col-sm-4"
			style="background-color: yellow; float: left; height: 100%;">
			<div class="form-group row">
				<div class="col-lg-12">
					<label>Nombre del producto</label> <input type="text"
						class="form-control" placeholder="Collar de oro">
				</div>
				<br>
				<div class="col-lg-12">
					<label>Precio x Unidad</label> <input type="text"
						class="form-control" placeholder="S/. 1000">
				</div>
				<br>
				<div class="col-lg-12">
					<label>Stock</label> <input type="text" class="form-control"
						placeholder="5">
				</div>
				<div class="col-lg-12"><input id="GuardarEmpleado" type="button"
						class="btn btn-primary" value="Agregar al carrito">
				</div>

			</div>
		</div>
		<div class="col-sm-4"
			style="background-color: white; float: left; height: 100%;">
			<div class="form-group row" style="margin-top: 10%;">
				<div class="col-lg-6">
					<label>Serie</label> <input type="text" class="form-control"
						placeholder="5">

				</div>
				<div class="col-lg-6">
					<label>N° comprobante</label> <input type="text" class="form-control"
						placeholder="5">

				</div>
			</div>
			<div class="form-group row">
				<div class="col-lg-6">
					<label for="sel1">Tipo pago:</label> <select class="form-control"
						id="sel1">
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
					</select>

				</div>
				<div class="col-lg-6">
					<label for="sel1">Tipo documento:</label> <select class="form-control"
						id="sel1">
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
					</select>

				</div>
			</div>
			<div class="form-group row">
				<div class="col-lg-3"></div>
				<div class="col-lg-6">
					<label>TOTAL A PAGAR</label> <input type="text"
						class="form-control" placeholder="Collar de oro">
				</div>
				<div class="col-lg-3"></div>
			</div>
		</div>
	</div>
	<div class="table-responsive"
		style="background-color: white; margin-top: 25%;">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>#</th>
					<th>First Name</th>
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
	<nav aria-label="...">
		<ul class="pagination">
			<li class="page-item disabled"><a class="page-link" href="#"
				tabindex="-1">Previous</a></li>
			<li class="page-item"><a class="page-link" href="#">1</a></li>
			<li class="page-item active"><a class="page-link" href="#">2
					<span class="sr-only">(current)</span>
			</a></li>
			<li class="page-item"><a class="page-link" href="#">3</a></li>
			<li class="page-item"><a class="page-link" href="#">Next</a></li>
		</ul>
	</nav>



	</main>
	<!-- Essential	 javascripts for application to work-->
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="${urlrecursos}/sweetalert/sweetalert2.min.js"></script>
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

		function prueba() {
			swal('Good job!', 'You clicked the button!', 'success')
		}
	</script>
</body>
</html>