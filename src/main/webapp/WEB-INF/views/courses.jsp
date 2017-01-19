<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>TutsViews Manager</title>

<link rel="stylesheet"
	href="<spring:url value="/css/bootstrap.min.css"/>" type="text/css">
<link rel="stylesheet" href="<spring:url value="/css/style.css"/>"
	type="text/css">

</head>

<body>

	<jsp:include page="../views/components/header.jsp"></jsp:include>

	<c:choose>
		<c:when test="${mode == 'MODE_COURSES' }">

			<div class="container text-center " id="coursesDiv">

				<h3>TutsViews : Nos cours</h3>
				<hr>
				<div class="table-responsive">

					<table class="table table-striped table-bordered text-left">
						<thead>
							<tr>
								<th>Id</th>
								<th>Titre</th>
								<th>Nom</th>
								<th>Description</th>
								<th>Difficultée</th>
								<th>Gratuit</th>
								<th>
								<th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="course" items="${courses}">
								<tr>
									<td>${course.id}</td>
									<td>${course.titleCourse}</td>
									<td>${course.nameCourse}</td>
									<td>${course.description}</td>
									<td>${course.difficulty}</td>
									<td>${course.free}</td>
									<td><a href="/courses/update?id=${course.id}"><span
											class="glyphicon glyphicon-pencil"></span></a></td>
									<td><a href="/courses/delete?id=${course.id}"><span
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
			test="${mode == 'MODE_NEW_COURSE' || mode == 'MODE_UPDATE_COURSE' }">

			<div class="container text-center " id="newCourseDiv">
				<h3>Gestion D'un cours</h3>
				<hr>


				<jsp:include page="../views/components/add_course.jsp" />
			</div>

		</c:when>
	</c:choose>
</body>


</html>