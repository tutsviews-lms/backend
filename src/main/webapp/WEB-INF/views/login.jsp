<!DOCTYPE html >

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">

    <title>TutsViews Manager</title>

    <link rel="stylesheet"
          href="<spring:url value="/css/bootstrap.min.css"/>" type="text/css"/>
    <link rel="stylesheet" href="<spring:url value="static/css/style.css"/>"
          type="text/css"/>


</head>


<body>


<jsp:include page="../views/components/header.jsp"></jsp:include>


<div class="container">

    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="well">
                <div class="text-center">

                    <h1>Veuillez vous connectez</h1>
                    <p class="lead"> Connectez vous à Tutsviews LMS</p>

                    <form:form id="loginForm" class="text-left" action="/login" method="post">

                        <div class="form-group">
                            <label for="username">Pseudo : </label>
                            <input id="username" type="email" class="form-control" name="username">
                        </div>


                        <div class="form-group">
                            <label for="password">Pseudo : </label>
                            <input id="password" type="password" class="form-control" name="password">
                        </div>

                        <input type="hidden" name="_csrf.parameterName" value="_csrf.token"/>

                        <div class="form-group">
                            <input id="button" type="submit" class="btn btn-primary" name="Se connecter">
                        </div>

                    </form:form>

                </div>
            </div>
        </div>
    </div>

</div>


<script
        src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script
        src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>


</body>
</html>