<%-- 
    Document   : main
    Created on : 3-giu-2018, 18.57.08
    Author     : CRIRI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8"> 
	<meta name="viewport" content="width=device-width, initial-scale=1">
        <%@include file="WEB-INF/template/headerMain.jspf" %>
        <title>Menu Principal</title>
</head>
<body>
    <% 
        HttpSession sesion = request.getSession();
        if(sesion.getAttribute("rol").equals("ADMINISTRADOR")){
        }
        else{
            response.sendRedirect("login.jsp");
        }
        %>      
   <%@include file="WEB-INF/template/navMain.jspf" %>
   <%@include file="WEB-INF/template/headerMainBody.jspf" %>
   <%@include file="WEB-INF/template/footer.jspf" %>
   <%@include file="WEB-INF/template/footerMain.jspf" %>
</body>
</html>