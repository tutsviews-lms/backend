<!DOCTYPE html >

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">

<title>TutsViews Manager</title>

<!-- CSS and Boostrap -->
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

	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">TutsViews</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="new-task">Manage Courses</a></li>
					<li><a href="all-tasks">Manage Authors</a></li>
					<li><a href="new-task">Manage Resources</a></li>
				</ul>
			</div>
		</div>







	</div>


	<div class="container invisible-at-first" id="homeDiv">
		<div class="jumbotron text-center">
			<h1>Welcome to TutsViews Manager</h1>
		</div>
	</div>


	<div class="container text-center" id="authorsDiv">
		<h3>Mes courses</h3>
		<hr>
		<div class="table-responsive">
			<table class="table table-striped table-bordered">
				<thead>
					<tr>
						<th>Id</th>
						<th>Nom</th>
						<th>Prénom</th>
						<th>Tel</th>
						<th>Email</th>
						<th>Mot de passe</th>
					</tr>
				</thead>
				<tbody></tbody>
			</table>
		</div>
	</div>





	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>

</body>
</html>