<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %><%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %><%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="ISO-8859-1">
<title>Dojo and Ninjas</title>
</head>
<body>
 <h1><c:out value = "${dojo.name}"></c:out></h1>
 
 	<div class="col-md-5 p-lg-4" >
	<table class="table table-dark table-hover table-md">
		<thead>
			<tr>
				<th class="text-center">First Name</th>
				<th class="text-center">Last Name</th>
				<th class="text-center">Age</th>
			</tr>
		<thead>
		<tbody> 
			<c:forEach var="ninja" items="${dojo.ninjas}">
				<tr>
					<td class="text-center"><c:out value="${ninja.firstName}"></c:out></td>
					<td class="text-center"><c:out value="${ninja.lastName}"></c:out></td>
					<td class="text-center">$<c:out value="${ninja.age}"/></td>
				</tr>	
			</c:forEach>
		</tbody>
	</table>
	</div>
 
</body>
</html>