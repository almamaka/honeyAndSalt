<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<meta name="Description"
	content="Ez egy receptböngésző, személyre szabva" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css">
<link rel="stylesheet" type="text/css" href="/css/mainstyle.css">
<title>Salt And Honey - Felhasználói adatok</title>
</head>
<body id="body">

	<nav class="navbar navbar-expand-lg navbar-dark bg-light fixed-top"
		id="navbar">
		<a class="navbar-brand ml-4" id="logobutton" href="mainpage">Honey
			And Salt</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item mr-4"><a class="nav-link" id="mainpage"
					href="mainpage">Főoldal</a></li>
				<li class="nav-item mr-4"><a class="nav-link" id="searchpage"
					href="search">Receptböngésző</a></li>
				<li class="nav-item mr-4"><a class="nav-link"
					id="favouritespage" href="favourites">Kedvenc receptek</a></li>
				<li id="dropdownli" class="nav-item dropdown mr-4"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Felhasználói fiók </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">

						<a id="userdatapage" class="dropdown-item" href="userdata">Adatok</a>
						<div class="dropdown-divider"></div>
						<form class="form-group text-center py-2" id="logoutForm"
							method="POST" action="${contextPath}/logout">
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
						</form>
						<button id="lougoutbutton"
							class="dropdown-item btn btn-light btn-lg"
							onclick="document.forms['logoutForm'].submit()" integrity="">Kijelentkezés</button>


					</div></li>
			</ul>
		</div>
	</nav>
	<section class="mt-5">
		<div class="container" id="bigbox">
			<br>
			<div class="row justify-content-center">
				<div class="col-12 mt-1">

					<h2 class="text-left display-5 mx-1">Felhasználói adatok</h2>
					<hr>

					<p>
						<strong>Felhasználónév: </strong>${user.username }</p>
					<p>
						<strong>E-mail cím: </strong>${user.email }</p>
				</div>
			</div>
		</div>
	</section>

</body>
</html>