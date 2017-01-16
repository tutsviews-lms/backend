<!DOCTYPE html >

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">

<title>TutsViews Manager</title>


<link rel="stylesheet"
	href="<spring:url value="/css/bootstrap.min.css"/>" type="text/css" />
<link rel="stylesheet" href="<spring:url value="/css/style.css"/>"
	type="text/css" />

<!--[if lt IE 9]>
		<script src="static/js/html5shiv.min.js"></script>
		<script src="static/js/respond.min.js"></script>
	<![endif]-->

</head>



<body>


	<jsp:include page="../views/fragments/header.jsp"></jsp:include>

	<c:choose>
		<c:when test="${mode == 'MODE_HOME'}">

			<!-- 			<div class="container" id="homeDiv"> -->
			<!-- 				<div class="jumbotron text-center"> -->
			<!-- 					<h1>Welcome to TutsViews Manager</h1> -->
			<!-- 				</div> -->
			<!-- 			</div> -->

		</c:when>
	</c:choose>

	<c:choose>
		<c:when test="${mode == 'MODE_AUTHORS'}">

			<div class="container text-center " id="authorsDiv">
				<h3>Tustsviews : Tous nos auteurs</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered text-left">
						<thead>
							<tr>
								<th>Id</th>
								<th>Nom</th>
								<th>Prénom</th>
								<th>Tel</th>
								<th>Email</th>
								<th>Mot de passe</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="author" items="${authors}">
								<tr>
									<td>${author.id}</td>
									<td>${author.lastName}</td>
									<td>${author.firstName}</td>
									<td>${author.tel}</td>
									<td>${author.email}</td>
									<td>${author.password}</td>
									<td><a href="/authors/update?id=${author.id}"><span
											class="glyphicon glyphicon-pencil"></span></a></td>
									<td><a href="/authors/delete?id=${author.id}"><span
											class="glyphicon glyphicon-trash"></span></a></td>

								</tr>

							</c:forEach>

						</tbody>
					</table>
				</div>
			</div>
		</c:when>
	</c:choose>

	<c:choose>
		<c:when
			test="${mode == 'MODE_NEW_AUTHOR' || mode == 'MODE_UPDATE_AUTHOR'}">

			<div class="container text-center">
				<h3>Gestion d'un auteur</h3>
				<hr>
				
					<jsp:include page="../views/fragments/add_author.jsp"></jsp:include>
					
				
					
			</div>
		</c:when>
	</c:choose>









	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script
		src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>

	<!-- 	<script src="static/js/jquery-1.11.1.min.js"></script> -->
	<!-- 	<script src="static/js/bootstrap.min.js"></script> -->

</body>
</html>