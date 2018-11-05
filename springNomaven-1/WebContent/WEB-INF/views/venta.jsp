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
<spring:url value="/recursos" var="urlrecursos"></spring:url>
<link href="${urlrecursos}/css/template.css" rel="stylesheet">
<link href="${urlrecursos}/sweetalert/sweetalert2.min.css" rel="stylesheet">
<style type="text/css">
* {
	box-sizing: border-box;
}

section {
	width: 100%;
	display: table;
	padding: 1em 0 0;
}

div {
	display: table-cell;
	width: 100%;
}

input {
	width: 100%;
	padding: .5em 1em;
}

button {
	color: black;
	padding: .5em 1em;
	white-space: nowrap;
	margin: 0 0 0 1em;
}
</style>
</head>
<body class="app sidebar-mini rtl">
	<!-- Navbar-->
	<jsp:include page="template/header.jsp"></jsp:include>
	<main class="app-content">

	<div class="col-sm-12">
		<div class="col-sm-8"
			style="background-color: green; float: left; height: 80%;">
			<h1>Short Word</h1>
			<section>
				<div>
					<input type="text" placeholder="Search..." />
				</div>
				<div>
					<button onclick="prueba()">Search</button>
				</div>
			</section>


			<h1>Long Word</h1>
			<section>
				<div>
					<input type="text" placeholder="Search..." />
				</div>
				<div>
					<button>Super Long Word For Search Button</button>
				</div>
			</section>

		</div>

		<div class="col-sm-4"
			style="background-color: blue; float: left; height: 80px;">
			<label style="margin-top: 10px;">CODIGO PEDIDO</label>
		</div>
	</div>


	</main>
	<!-- Essential javascripts for application to work-->
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="${urlrecursos}/js/main.js"></script>
	<script src="${urlrecursos}/javascript/venta.js"></script>
	<!-- The javascript plugin to display page loading on top-->
	<script src="${urlrecursos}/js/plugins/pace.min.js"></script>
	<script src="${urlrecursos}/sweetalert/sweetalert2.min.js"></script>
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