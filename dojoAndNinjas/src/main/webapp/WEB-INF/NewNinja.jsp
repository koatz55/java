<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <a href="/ninjas">See all ninjas</a>
    <form:form action="/createNinja" method="post" modelAttribute="ninja" class="p-3 col-4 mx-auto my-5 bg-dark text-light">
        <h2 class="text-center text-primary">Create ninja:</h2>
    
        <div class="form-group">
            <form:label path="firstName">First Name:</form:label>
            <form:input type="text" path="firstName" id="name" class="form-control"/>
        </div>
        <div class="form-group">
            <form:label path="lastName">Last Name:</form:label>
            <form:input type="text" path="lastName" id="bun" class="form-control"/>
        </div>
        <div class="form-group">
            <form:label path="age">age:</form:label>
            <form:input type="text" path="age" id="meat" class="form-control"/>
        </div>
        <div class="form-group">
            <form:label path="dojo">dojo_id:</form:label>
            <form:select path="dojo" >
            
            <c:forEach var="dojo" items= "${allDojos}">
                <form:option value="${dojo.id}"><c:out value="${dojo.name}" ></c:out></form:option>
        	</c:forEach>
            </form:select>
        </div>
            <br>
        <input type="submit" value="sign up" class="btn btn-primary btn-outline-dark">
    </form:form>
</body>
</html>