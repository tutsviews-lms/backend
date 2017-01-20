<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>







<spring:url value="/images/save" var="urlImageForm"></spring:url>
			
			<form:form cssClass="form-horizontal" action="${urlImageForm}"
				method="Post" modelAttribute="image">

			<form:input type="hidden" id="id-image" path="id" />

			<div class="form-group">
				<label for="name-image" class="control-label col-md-3">Nom</label>
				<div class="col-md-7">
					<form:input path="nameImage" id="name-image"
						cssClass="form-control" />
					<form:errors path="nameImage" />
				</div>
			</div>


			<div class="form-group">
				<label for="url-iamge" class="control-label col-md-3">Url de
					l'image</label>
				<div class="col-md-7">
					<form:input path="urlImage" id="url-image" cssClass="form-control" />
					<form:errors path="urlImage" />
				</div>
			</div>


			<div class="form-group">
				<label for="uri-image" class="control-label col-md-3">Uri de
					l'image</label>
				<div class="col-md-7" >
					<form:input path="uriImage" id="uri-image" cssClass="form-control" />
					<form:errors path="uriImage" />
				</div>
			</div>


			<div class="form-group">
				<label for="height-image" class="control-label col-md-3">Longeur
					de l'image</label>
				<div class="col-md-7">
					<form:input path="heightImage" id="height-image"
						cssClass="form-control" />
				</div>
			</div>


			<div class="form-group">
				<label for="width-image" class="control-label col-md-3">Largeur
					de l'image</label>
				<div class="col-md-7">
					<form:input path="widthImage" id="width-image"
						cssClass="form-control" />
				</div>
			</div>



			<div class="form-group">
				<input type="submit" class="btn btn-primary" value="Enregistrer">
			</div>
			
			
			</form:form>