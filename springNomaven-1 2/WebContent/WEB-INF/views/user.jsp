<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<link href="${urlrecursos}/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<h2>Lista de Usuarios</h2>
	<br>
	<br>
	<button type="button" class="btn btn-primary" data-toggle="modal"
		data-target="#agregar">Add</button>
	<br>
	<br>
	<form action="user1" method="POST">
		<div class="modal" id="agregar">
			<div class="modal-dialog">
				<div class="modal-content">
					<!-- Modal Header -->
					<div class="modal-header">
						<h4 class="modal-title">ADD USER</h4>
						<button type="button" class="close" data-dismiss="modal">&times;</button>
					</div>
					<div class="modal-body">
						<div class="form-group">
							<label>Usuario</label> <input name="user" type="text"
								class="form-control">
						</div>
						<div class="form-group">
							<label>Password</label> <input name="pass" class="form-control">
						</div>
					</div>
					<div class="modal-footer">
						<button class="btn btn-danger" data-dismiss="modal">Close</button>
						<input type="submit" class="btn btn-primary" value="Agregar" />
					</div>
				</div>
			</div>
		</div>
	</form>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Usuario</th>
				<th scope="col">Clave</th>
				<th scope="col">Estado</th>
				<th scope="col">Accion</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${lista!=null}">
				<c:forEach items="${lista}" var="user">
					<tr>
						<td>${user.iduser}</td>
						<td>${user.nomuser}</td>
						<td>${user.clave}</td>
						<td>${user.estado}</td>
						<td>
							<form action="user3" method="POST">
								<button type="submit" class="btn btn-primary"
									data-toggle="modal" name="editar"
									value="${user.iduser}">Update</button>
							</form>
							<form action="user5" method="POST">
								<input type="submit" class="btn btn-primary" name="eliminar"
									value="${user.iduser}" />
							</form>
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
</body>
</html>