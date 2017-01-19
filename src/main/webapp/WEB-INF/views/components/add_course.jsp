<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>





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