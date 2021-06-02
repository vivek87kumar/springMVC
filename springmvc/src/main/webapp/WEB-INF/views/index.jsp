<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INDEX</title>
</head>
<body>
	<h1>This is INDEX Page!! ka web page</h1>
	<h1>My name is: ${name }</h1>
	<h1>And my ID is: ${id }</h1>
	
	<c:forEach var="item" items="fr">
		${item }
	</c:forEach>
	<c:out value="${fr }"></c:out>
</body>
</html>