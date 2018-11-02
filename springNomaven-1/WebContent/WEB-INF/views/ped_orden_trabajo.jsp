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
				<i class="fa fa-user fa-lg"></i> Orden Trabajo
			</h1>
			<p>Start a beautiful journey here</p>
		</div>
	</div>

	<div>
		<div class="col-sm-3"
			style="background-color: green; float: left; height: 80px;">
			<label style="margin-top: 10px; font-family: Century Gothic;">
				NOMBRE CLIENTE </label> <input style="">

		</div>
		<div class="col-sm-3"
			style="background-color: blue; float: left; height: 80px;">
			<label style="margin-top: 10px;">CODIGO PEDIDO</label> <input
				style="">
		</div>
		<div class="col-sm-3"
			style="background-color: yellow; float: left; height: 80px;">
			<label style="margin-top: 10px;">FECHA EMITIDA</label> <input
				style="">
		</div>
		<div class="col-sm-3"
			style="background-color: purple; float: left; height: 80px;">
			<label style="margin-top: 10px;">PRODUCTO</label> <br> <input
				style="">
		</div>
	</div>
	<div class="table-responsive"
		style="background-color: white; margin-top: 20%;">
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
				<tr>
					<td>Mary</td>
					<td>Moe</td>
					<td>mary@example.com</td>
					<td>John</td>
					<td>Doe</td>
					<td>john@example.com</td>
					<td>Doe</td>
					<td>john@example.com</td>
				</tr>
				<tr>
					<td>July</td>
					<td>Dooley</td>
					<td>july@example.com</td>
					<td>John</td>
					<td>Doe</td>
					<td>john@example.com</td>
					<td>Doe</td>
					<td>john@example.com</td>
				</tr>
			</tbody>
		</table>
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