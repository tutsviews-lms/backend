<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>



<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="<spring:url value="/"/>">TutsViews</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      
        <li class="active"><a href="<spring:url value="/"/>">Accueil <span class="sr-only">(current)</span></a></li>
      
        <li class="disabled" ><a href="#">Présentation</a></li>
      
      
      
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Auteurs <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="<spring:url value="/authors/add"/>">Ajouter</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="<spring:url value="/authors"/>">Tout afficher</a></li>
          </ul>
        </li>
        
          <li class="dropdown">
          <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Cours <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="<spring:url value="/courses/add"/>">Ajouter</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="<spring:url value="/courses"/>">Tout afficher</a></li>
            <li role="separator" class="divider"></li>
            <li class="disabled"><a href="<spring:url value="/courses"/>">Gestion des contenus</a></li>
          </ul>
        </li>
        
        
                  <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Ressources <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="/images/add">Images</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Audios</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Vidéos</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Textes</a></li>
          </ul>
        </li>
      </ul>
      
      
      
      
      
      
      <form class="navbar-form navbar-left" action="/hello">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Chercher un cours">
        </div>
        <button type="submit" class="btn btn-default">Chercher</button>
      </form>
      
      
      
      
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Lien</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Profil <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Voir mon  profil</a></li>
            <li><a href="#">Paramétres</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Se déconnecter</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

