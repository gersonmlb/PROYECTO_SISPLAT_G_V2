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
				<i class="fa fa-dashboard"></i> Nuevo pedidoasasas
			</h1>
		</div>
		<ul class="app-breadcrumb breadcrumb">
			<li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
			<li class="breadcrumb-item"><a href="#">Blank Page</a></li>
		</ul>
	</div>
	<div class="">
		<div class="content-wrapper">
			<div class="content-header row"></div>
			<div class="content-body">
				<!-- stats -->
				<div class="row">
					<div class="col-xl-3 col-lg-6 col-xs-12">
						<div class="card">
							<div class="card-body">
								<div class="card-block">
									<div class="media">
										<div class="media-body text-xs-left">
											<h3 class="pink">10</h3>
											<span><a style="color: black"
												href="/SISPLAT-G/ped_lista_nuevo_pedido">Nuevo Pedido </a></span>
										</div>
										<div class="media-right media-middle">
											<i class="icon-bag2 pink font-large-2 float-xs-right"></i>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-xl-3 col-lg-6 col-xs-12">
						<div class="card">
							<div class="card-body">
								<div class="card-block">
									<div class="media">
										<div class="media-body text-xs-left">
											<h3 class="deep-orange">10</h3>
											<span><a style="color: black"
												href="/SISPLAT-G/ped_lista_hoja_contrato"> Hoja Contrato
											</a></span>
										</div>
										<div class="media-right media-middle">
											<i
												class="icon-diagram deep-orange font-large-2 float-xs-right"></i>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-xl-3 col-lg-6 col-xs-12">
						<div class="card">
							<div class="card-body">
								<div class="card-block">
									<div class="media">
										<div class="media-body text-xs-left">
											<h3 class="teal">10</h3>
											<span><a style="color: black"
												href="/SISPLAT-G/ped_lista_orden_trabajo"> Orden Trabajo
											</a></span>
										</div>
										<div class="media-right media-middle">
											<i class="icon-user1 teal font-large-2 float-xs-right"></i>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-xl-3 col-lg-6 col-xs-12">
						<div class="card">
							<a href="/springNomaven/ped_comprobante_pedido"></a>
							<div class="card-body">
								<div class="card-block">
									<div class="media">
										<div class="media-body text-xs-left">
											<h3 class="deep-orange">10</h3>
											<span><a style="color: black"
												href="/SISPLAT-G/ped_comprobante_pedido">Venta Pedido </a></span>
										</div>
										<div class="media-right media-middle">
											<i
												class="icon-diagram deep-orange font-large-2 float-xs-right"></i>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--/ stats -->
			</div>
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