<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TutsViewsManager</title>


<link rel="stylesheet"
	href="<spring:url value="/css/bootstrap.min.css"/>" type="text/css">
<link rel="stylesheet" href="<spring:url value="/css/style.css"/>"
	type="text/css">

</head>
<body>

	<jsp:include page="../views/components/header.jsp"></jsp:include>

	<c:choose>
		<c:when test="${mode == 'MODE_IMAGES' }">
			<div class="container text-center " id="imagesDiv">

				<h3>TutsViews : Nos images</h3>
				<hr>

				<div class="table-responsive">
					<table class="table table-striped table-bordered text-left">

						<thead>
							<tr>
								<th>Nom</th>
								<th>Url</th>
								<th>Uri</th>
								<th>Longeur</th>
								<th>Largeur</th>
								<th></th>
								<th></th>
								
							</tr>

						</thead>
						<tbody>
							<c:forEach items="${images}" var="image">
								<tr>
									<td>${image.nameImage}</td>
									<td>${image.urlImage}</td>
									<td>${image.uriImage}</td>
									<td>${image.heightImage}</td>
									<td>${image.widthImage}</td>
									<td><a href="/images/update?id=${image.id}"><span
											class="glyphicon glyphicon-pencil"></span></a></td>
									<td><a href="/images/delete?id=${image.id}"><span
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
			test="${mode =='MODE_NEW_IMAGE' || mode == 'MODE_UPDATE_IMAGE'}">
			
			
				<div class="container text-center">
				<h3>Gestion des images</h3>
				<hr>

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
			
			</div>

		</c:when>
	</c:choose>


</body>
</html>