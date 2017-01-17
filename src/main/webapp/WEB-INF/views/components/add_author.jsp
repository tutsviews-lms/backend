<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>






<spring:url value="/authors/save" var="formUrl" />

<form:form action="${formUrl}" method="POST" modelAttribute="author"
	cssClass="form-horizontal">


	<form:input type="hidden" id="author-id" path="id" />

	<div class="form-group">
		<label for="author-last-name" class="control-label col-md-3">Non
			de famille</label>
		<div class="col-md-7">
			<form:input path="lastName" cssClass="form-control"
				id="author-last-name" />
			<form:errors path="lastName" />
		</div>
	</div>


	<div class="form-group">
		<label for="author-first-name" class="control-label col-md-3">Prénom</label>
		<div class="col-md-7">
			<form:input path="firstName" cssClass="form-control"
				id="author-first-name" />
			<form:errors path="firstName" />

		</div>
	</div>

	<div class="form-group">
		<label for="author-description" class="control-label col-md-3">Description</label>
		<div class="col-md-7">
			<form:textarea path="description" cssClass="form-control"
				id="author-description" rows="2" />
		</div>
	</div>


	<div class="form-group">
		<label for="author-tel" class="control-label col-md-3">Téléphone</label>
		<div class="col-md-7">
			<form:input path="tel" cssClass="form-control" id="author-tel" />
		</div>
	</div>

	<div class="form-group">
		<label for="author-email" class="control-label col-md-3">Adresse
			email</label>
		<div class="col-md-7">
			<form:input path="email" type="email" cssClass="form-control"
				id="author-email" />
			<small id="emailHelp" class="form-text text-muted">Nous ne
				partagerons jamais votre email avec personne.</small>
		</div>
	</div>

	<div class="form-group">
		<label for="author-password" class="control-label col-md-3">Mot
			de passe</label>
		<div class="col-md-7">
			<form:input path="password" type="password" cssClass="form-control"
				id="author-password" />
			<form:errors path="password" />
		</div>
	</div>


	<div class="form-group">
		<label for="author-address-street" class="control-label col-md-3">Adresse</label>
		<div class="col-md-7">
			<form:input path="address.street" type="text" cssClass="form-control"
				id="author-address-street" />
		</div>
	</div>


	<div class="form-group">
		<label for="author-address-zip" class="control-label col-md-3">Code
			Postal</label>
		<div class="col-md-7">
			<form:input path="address.zipCode" type="text"
				cssClass="form-control" id="author-address-zip" />
		</div>
	</div>


	<div class="form-group">
		<label for="author-address-city" class="control-label col-md-3">Ville</label>
		<div class="col-md-7">
			<form:input path="address.city" type="text" cssClass="form-control"
				id="author-address-city" />
		</div>
	</div>

	<div class="form-group">
		<label for="author-address-state" class="control-label col-md-3">Pays</label>
		<div class="col-md-7">
			<form:input path="address.state" type="text" cssClass="form-control"
				id="author-address-state" />
		</div>
	</div>

	<div class="form-group">
		<input type="submit" class="btn btn-primary" value="Enregistrer">
	</div>
</form:form>

<br>
<hr>
<br>

<spring:url value="/resource/upload" var="uploadUrl" />
<form method="POST" enctype="multipart/form-data" action="${uploadUrl}" class="form-horizontal">
Fichier à télécharger: 
<div class="form-group">
<input type="file" name="file"><br>
</div>
<div class="form-group">
<input type="submit" value="Télécharger"> Appuiyez ici pour télécharger le fichier.
</div>
</form>
