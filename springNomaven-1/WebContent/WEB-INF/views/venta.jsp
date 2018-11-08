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
	<div class="col-sm-12" style="background-color: white;">
		<div class="form-group row" style="margin-top: 2%;">
			<div class="col-lg-3">
				<label>N° de venta</label> <input class="form-control" type="text"
					placeholder="001" disabled="disabled" style="">
			</div>
			<div class="col-lg-3">
				<label>Serie</label> <input class="form-control" type="text"
					placeholder="001" disabled="disabled" style="">
			</div>
			<div class="col-lg-3">
				<label for="exampleFormControlSelect1">Tipo de pago</label> <select
					class="form-control" id="exampleFormControlSelect1">
					<option>Seleccione</option>
					<option value="Contado" id="Contado">Contado</option>
					<option>Tarjeta</option>
				</select>
			</div>
			<div class="col-lg-3">
				<label for="exampleFormControlSelect1">Tipo de documento</label> <select
					class="form-control" id="exampleFormControlSelect1">
					<option>Seleccione</option>
					<option>Boleta</option>
					<option>Factura</option>
				</select>
			</div>
		</div>
		<label>Cliente</label>
		<div class="input-group mb-3">
			<input type="text" class="form-control" placeholder="DNI o RUC"
				aria-label="Recipient's username" aria-describedby="basic-addon2">
			<div class="input-group-append">
				<button class="btn btn-outline-secondary" type="button">
					<i class="fa fa-search"></i>
				</button>
			</div>
		</div>
		<div class="form-group row" style="margin-top: 2%; width: 30%;">
			<div class="col-lg-12">
				<input class="form-control" type="text"
					placeholder="Yaritza Casildo" disabled="disabled" style="">
			</div>

		</div>
		<label>Producto</label>
		<div class="input-group mb-3">
			<input type="text" class="form-control" placeholder="Código"
				aria-label="Recipient's username" aria-describedby="basic-addon2">
			<div class="input-group-append">
				<button class="btn btn-outline-secondary" type="button" onclick="prueba()">
					<i class="fa fa-search"></i>
				</button>
			</div>
		</div>
		<div class="form-group row" style="margin-top: 2%;">
			<div class="col-lg-3">
				<label>Nombre</label> <input class="form-control" type="text"
					placeholder="Collar" disabled="disabled" style="">
			</div>
			<div class="col-lg-3">
				<label>Precio</label> <input class="form-control" type="text"
					placeholder="500" disabled="disabled" style="">
			</div>
			<div class="col-lg-3">
				<label>Stock</label> <input class="form-control" type="text"
					placeholder="5" disabled="disabled" style="">
			</div>
			<div class="col-lg-3">
				<label>Codigo</label> <input class="form-control" type="text"
					placeholder="12" disabled="disabled" style="">

			</div>
		</div>
		<div class="form-group row" style="margin-top: 2%;">
			<div class="col-lg-3">
				<button class="btn btn-primary"><i class="fa fa-shopping-cart"></i>Agregar al carrito</button>
			</div>

		</div>

	</div>



	<div class="table-responsive" style="background-color: white;">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Firstname</th>
					<th>Lastname</th>
					<th>DNI</th>
					<th>Cellphone</th>
					<th>State</th>
					<th colspan="2">Action</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>John</td>
					<td>Doe</td>
					<td>john@example.com</td>
					<td>Doe</td>
					<td>john@example.com</td>
				</tr>
				<tr>
					<td>Mary</td>
					<td>Moe</td>
					<td>mary@example.com</td>
					<td>Doe</td>
					<td>john@example.com</td>
				</tr>
				<tr>
					<td>July</td>
					<td>Dooley</td>
					<td>july@example.com</td>
					<td>Doe</td>
					<td>john@example.com</td>
				</tr>
			</tbody>
		</table>
	</div>

	<div class="col-sm-12" style="background-color: white;">
		<div class="form-group row" style="margin-top: 2%;">
			<div class="col-lg-2"></div>
			<div class="col-lg-2">
				<label>Sub total</label>
				<div class="input-group-prepend">
					<span class="input-group-text" style="border: 2px solid #F1948A; background-color: #FADBD8;">S/</span>
					<input class="form-control" type="text" placeholder="00.00"
						disabled="disabled" style="border: 2px solid #F1948A;">
				</div>
			</div>
			<div class="col-lg-1"></div>
			<div class="col-lg-2">
				<label>IGV %</label>
				<div class="input-group-prepend">
					<span class="input-group-text" style="border: 2px solid #F1948A; background-color: #FADBD8;">S/</span>
					<input class="form-control" type="text" placeholder="00.00"
						disabled="disabled" style="border: 2px solid #F1948A;">
				</div>
			</div>
			<div class="col-lg-1"></div>
			<div class="col-lg-2">
				<label>Total</label>
				<div class="input-group-prepend">
					<span class="input-group-text" style="border: 2px solid #F1948A; background-color: #FADBD8;">S/</span>
					<input class="form-control" type="text" placeholder="00.00"
						disabled="disabled" style="border: 2px solid #F1948A;">
				</div>
			</div>
			<div class="col-lg-2"></div>
		</div>
	</div>
	<div class="col-sm-12" style="background-color: white; width: 100%;">
		<div class="form-group row" style="margin-top: 2%;">
			<div class="col-lg-4">
				<button type="button" class="btn btn-primary" id="prueba1">Generar Venta</button>
				<button type="button" class="btn btn-secondary">Cancelar</button>
			</div>
			<div class="col-lg-8"></div>

		</div>
	</div>

	</main>
	<!-- Essential	 javascripts for application to work-->
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="${urlrecursos}/sweetalert/sweetalert2.min.js"></script>
	<script src="${urlrecursos}/js/main.js"></script>
	<script src="${urlrecursos}/javascript/venta.js"></script>
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