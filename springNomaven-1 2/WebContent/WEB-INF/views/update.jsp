<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
<body>
<h1>
asasas

</h1>
	<form action="user3" method="POST">
		<c:forEach items="${lista}" var="u">
			<div class="form-group">
				<label>User</label> <input name="user1" value="${u.nomuser}"
					type="text" class="form-control">
			</div>
			<div class="form-group">
				<label>Clave</label> <input name="pass1" value="${u.clave}"
					class="form-control">
			</div>
			<div class="form-group">
				<button type="button" class="btn btn-primary" data-dismiss="modal">Update</button>
			</div>
		</c:forEach>
	</form>



</body>
</html>





