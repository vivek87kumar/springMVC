<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HELP</title>
</head>
<body>
	<h1>This is HELP WEB PAGE</h1>
	<c:forEach var="itemList" items="li">
		${itemList }
	</c:forEach>

</body>
</html>