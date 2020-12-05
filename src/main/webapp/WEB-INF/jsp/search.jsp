<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
<title>Salt And Honey - Keresés és Találat</title>
</head>
<body id="body">

	<nav class="navbar navbar-expand-lg navbar-dark bg-light fixed-top"
		id="navbar">
		<a class="navbar-brand ml-4" href="mainpage">Honey And Salt</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item mr-4"><a class="nav-link" href="mainpage">Főoldal</a>
				</li>
				<li class="nav-item mr-4"><a class="nav-link"
					href="mainpage#search">Receptböngésző</a></li>
				<li class="nav-item mr-4"><a class="nav-link" href="favourites">Kedvenc
						receptek</a></li>
				<li class="nav-item dropdown mr-4"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Felhasználói fiók </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<form class="form-group text-center py-2" id="logoutForm"
							method="POST" action="${contextPath}/logout">
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
						</form>
						<a class="dropdown-item" href="userdata">Adatok</a>
						<div class="dropdown-divider"></div>
						<button class="dropdown-item btn btn-light btn-lg"
							onclick="document.forms['logoutForm'].submit()" integrity="">Kijelentkezés</button>
					</div></li>
			</ul>
		</div>
	</nav>
	<section class="mt-5">
		<div class="container" id="resultbox">
			<h2 class="text-left display-5 mx-1">Keresés eredménye</h2>
			<c:forEach var="searchResults" items="${search}">
				<div class="card col-4">
					<img class="card-img-top" src="${searchResults.img}" alt="${searchResults.name}">
					<div class="card-body">
						<h5 class="card-title">${searchResults.name}</h5>
						<p class="card-text">A részletekért kattints a gombra...</p>
						<a href="/list/${searchResults.name }">Megnézem!</a>
					</div>
				</div>
				<hr>
				<a href="/list/${searchResults.name }">${searchResults.name}</a>
				<p id="result_name">${searchResults.name}</p>
				<p>${searchResults.instructions}</p>
				<img src="${searchResults.img}" alt="${searchResults.name}">
				<p>
					<strong>Elkészítési idő: </strong>${searchResults.prepTime}</p>
				<p>
					<strong>Sütési/főzési idő: </strong>${searchResults.cookTime}</p>
				<c:forEach var="ingredients" items="${searchResult.ingredients}">
					<ul>
						<li>${ingredients.name }</li>
					</ul>
				</c:forEach>

			</c:forEach>


		</div>
	</section>
	<section class="mt-5">
		<div class="container" id="bigbox">
			<a href="listrecipes" class="next" integrity="">Összes recept<br></a>
			<a name="search"></a> <br> <br>
			<h2 class="text-left display-5 mx-1">Receptböngésző</h2>
			<hr>
			<div class="row justify-content-center">
				<div class="col-12 mt-1">

					<div class="p-3 md-form mt-0">
						<form action="/search" method="post"
							class="form-group text-center py-2 rounded" id="search">
							<input class="form-control" type="text" name="searchText"
								placeholder="Böngéssz elkészítési leírás vagy a recept neve alapján..."
								aria-label="Search">
							<button type="submit" name="search" class="btn btn-dark" id="btn"
								integrity="">Keresés</button>
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
						</form>
					</div>
					<div class="p-3 md-form mt-0">
						<form action="/searchingredients" method="post"
							class="form-group text-center py-2 rounded"
							id="searchIngredients">
							<input class="form-control" type="text" name="searchText"
								placeholder="Böngéssz összetevők szerint..." aria-label="Search">
							<button type="submit" name="search" class="btn btn-dark" id="btn"
								integrity="">Keresés</button>
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />

						</form>
						<a class="next" href="search">Találatok ürítése</a>
					</div>

				</div>
			</div>
		</div>
	</section>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.1/umd/popper.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<script src="/js/main.js" type="text/javascript"></script>
</body>
</html>