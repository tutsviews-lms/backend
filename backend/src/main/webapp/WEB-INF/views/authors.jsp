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

</head>



<body>

	<jsp:include page="../views/components/header.jsp"></jsp:include>

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
								<th>Description</th>
								<th>Tel</th>
								<th>Email</th>
								<th>Mot de passe</th>
								<th>Adresse</th>
								<th>Code Postal</th>
								<th>Ville</th>
								<th>Pays</th>
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
									<td>${author.description}</td>
									<td>${author.tel}</td>
									<td>${author.email}</td>
									<td>${author.password}</td>
									<td>${author.address.street}</td>
									<td>${author.address.zipCode}</td>
									<td>${author.address.city}</td>
									<td>${author.address.state}</td>
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
				
					<jsp:include page="../views/components/add_author.jsp"></jsp:include>
					
				
					
			</div>
		</c:when>
	</c:choose>









	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script
		src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>

</body>
</html>