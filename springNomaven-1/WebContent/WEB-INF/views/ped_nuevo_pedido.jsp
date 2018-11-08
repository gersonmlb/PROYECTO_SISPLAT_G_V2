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
</head>
<body class="app sidebar-mini rtl">
	<!-- Navbar-->
	<jsp:include page="template/header.jsp"></jsp:include>
	<main class="app-content">
	<div class="app-title">
		<div>
			<h1>
				<i class="fa fa-user fa-lg"></i>   Registrar pedido
			</h1>
		</div>
	</div>
	<div class="col-sm-12">
		<div class="form-group row">
			<div class="col-lg-3"></div>
			<div class="col-lg-6" style="background-color: white;">
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
				<div class="form-group row" style="margin-top: 2%;">
					<div class="col-lg-12">
						<input class="form-control" type="text"
							placeholder="Guzman Gonzales" disabled="disabled"  style="">
					</div>
				</div>
			</div>
			<div class="col-lg-3"></div>
		</div>
	</div>
	<div class="col-sm-12">
		<div class="form-group row">
			<div class="col-lg-3"></div>
			<div class="col-lg-6" style="background-color: white;">
				<label>Nombre</label>
				<div class="form-group row">
					<div class="col-lg-12">
						<input class="form-control" type="text"
							placeholder="Guzman Gonzales" required="required" style="">
					</div>
				</div>
				<label>Cantidad</label>
				<div class="form-group row">
					<div class="col-lg-12">
						<input class="form-control" type="number"
						min="1"	placeholder="0" style="" id="numero">
					</div>
				</div>
				<label>Precio</label>
				<div class="form-group row">
					<div class="col-lg-12">
						<input class="form-control" type="text"
							placeholder="Guzman Gonzales"style="">
					</div>
				</div>
				<label>Dimension</label>
				<div class="form-group row">
					<div class="col-lg-12">
						<input class="form-control" type="text"
							placeholder="Guzman Gonzales"style="">
					</div>
				</div>
				<label>Especificacion</label>
				<div class="form-group row">
					<div class="col-lg-12">
						<textarea style="max-height: 110px;" class="form-control" rows="5" id="comment"></textarea>
					</div>
				</div>
				<label>Observacion</label>
				<div class="form-group row">
					<div class="col-lg-12">
						<textarea style="max-height: 110px;" class="form-control" rows="5" id="comment"></textarea>
					</div>
				</div>
				<div class="form-group row">
					<div class="col-lg-12">
						<button type="button" class="btn btn-primary" id="prueba">Generar Pedido</button>
				<button type="button" class="btn btn-secondary" onclick="prueba()">Cancelar</button>
					</div>
				</div>
			</div>
			<div class="col-lg-3"></div>
		</div>
	</div>
	</main>
	<!-- Essential javascripts for application to work-->
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
		$("#prueba").click(function(){
			var num = $("#numero").val();
			alert(num);
			
		})
		function prueba() {
			swal({
				  position: 'top-end',
				  type: 'success',
				  title: 'Your work has been saved',
				  showConfirmButton: false,
				  timer: 1500
				})
}
		
	</script>
</body>
</html>