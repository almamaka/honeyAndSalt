<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html lang="en">
  <head>
	<!-- Required meta tags -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<!-- Bootstrap CSS -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css">
    <link rel="stylesheet" type="text/css" href="/css/indexstyle.css">
	<title>Salt And Honey - A hűtőtől a receptkönyvig</title>
</head>
  <body>
  
      <nav class="navbar navbar-expand-lg navbar-dark bg-light fixed-top" id="navbar">
        <a class="navbar-brand ml-4" href="mainpage">Honey And Salt</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item mr-4">
              <a class="nav-link" href="mainpage">Főoldal</a>
            </li>
            <li class="nav-item mr-4">
              <a class="nav-link" href="mainpage#search">Receptböngésző</a>
            </li>
            <li class="nav-item mr-4">
              <a class="nav-link" href="favourites">Kedvenc receptek</a>
            </li>
            <li class="nav-item dropdown mr-4">
		       <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		         Felhasználói fiók
		        </a>
		        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
		        <form class="form-group text-center py-2" id="logoutForm" method="POST" action="${contextPath}/logout">
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                  </form>
		          <a class="dropdown-item" href="userdata">Adatok</a>
		          <div class="dropdown-divider"></div>
		          <button class="dropdown-item btn btn-light btn-lg" onclick="document.forms['logoutForm'].submit()" integrity="">Kijelentkezés</button>
		       </div>
		    </li>
          </ul>
        </div>
      </nav>
	
	<br/>
		<div class="container-fluid my-4 mx-3">
				<div class="row justify-content-center border rounded" id="box">
                    <c:if test="${pageContext.request.userPrincipal.name != null}">
                    <form class="form-group text-center py-2" id="logoutForm" method="POST" action="${contextPath}/logout">
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        
                    </form>
                     
                    <h2>Üdvözöllek ${pageContext.request.userPrincipal.name}</h2>
                    <button class="btn btn-light btn-lg" onclick="document.forms['logoutForm'].submit()" integrity="">Kijelentkezés</button>
                    <br>
                    <a href="mainpage" id="welcome_go" class="next" integrity="">Tovább a receptböngészőbe!</a>
                    </c:if>
                </div>
                
		</div>
		
	

	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.1/umd/popper.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="/js/main.js" type="text/javascript"></script>
  </body>
</html>