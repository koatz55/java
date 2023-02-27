<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
    <meta charset="UTF-8">
    <title>NewDojo</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   <body>
    <div class="container">
        <div class="row">
            <form:form action="/dojo" method="post"  modelAttribute="dojo" class="forem p-3 col-4 mx-lg-5 my-5 bg-secondary text-light">
                <h1 class="text-center text-primary">Create Dojo</h1>
                <div class="flot-left">
                    <form:label path="name">Name:</form:label>
                    <form:input type="text" path="name" id="name" class="form-control"/>
                </div>
                <input type="submit" value="create dojo" class="btn btn-primary btn-outline-dark">
            </form:form>
        </div>
              <div class="card p-3 col-4 mx-lg-3 my-5 bg-secondary text-light">
                <h2 class="text-center text-primary ">Dojo list</h2>
                <c:forEach var="dojo" items="${dojos}">
                <p>
                    <a href="/dojo/<c:out value= "${dojo.id}"/>" target="_blank" class="text-light"><c:out value = "${dojo.name}"></c:out></a>
                    <a href="/edit/<c:out value= "${dojo.id}"/>" target="_blank" class="text-light">edit</a>
                    <a href="/delete/dojo/<c:out value= "${dojo.id}"/>" target="_blank" class="text-light">delete</a>
                </p>
                </c:forEach>
            </div>
        <div class="btn-group-sm mx-lg-5">
            <a href="/newNinja" class="btn btn-secondary" role="button" >Become a ninja!</a>
        </div>
    </div>
</body>
</html>
