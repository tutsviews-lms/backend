<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

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

				<!-- 				.. -->

				<spring:url value="/courses/save" var="courseFormUrl"></spring:url>
				<form:form action="${courseFormUrl}" method="POST"
					cssClass="form-horizontal" modelAttribute="course">

					<form:input type="hidden" id="course-id" path="id" />

					<div class="form-group">
						<label for="course-title" class="control-label col-md-3">Titre</label>
						<div class="col-md-7">
							<form:input path="titleCourse" cssClass="form-control"
								id="course-title" />
							<form:errors path="titleCourse" />
						</div>
					</div>

					<div class="form-group">
						<label for="course-name" class="control-label col-md-3">Nom</label>
						<div class="col-md-7">
							<form:input path="nameCourse" cssClass="form-control"
								id="course-name" />
							<form:errors path="nameCourse" />
						</div>
					</div>

					<div class="form-group">
						<label for="course-description" class="control-label col-md-3">Description</label>
						<div class="col-md-7">
							<form:textarea path="description" cssClass="form-control"
								id="course-description" rows="3" />
								<form:errors path="description"/>
						</div>
					</div>

					<div class="form-group">
						<label for="difficulty-name" class="control-label col-md-3">Difficulté</label>
						<div class="col-md-7">
							<form:select items="${difficultyOptions}" path="difficulty"
								cssClass="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label for="course-is-free" class="control-label col-md-3">Accès
							au cours</label>

						<div class="col-md-1">
							<form:radiobutton path="free" id="course-is-free" value="true"
								label="Gratuit" />
						</div>
							<div class="col-md-1">
							<form:radiobutton path="free" id="course-is-free" value="false"
								label="Payant" />
						</div>
					</div>



					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Enregistrer">
					</div>

				</form:form>

				<!-- 				.. -->

				<%-- 				<jsp:include --%>
				<%-- 					page="<spring:url value="//views/components/add_course.jsp"></spring:url>"></jsp:include> --%>
			</div>

		</c:when>
	</c:choose>
</body>


</html>