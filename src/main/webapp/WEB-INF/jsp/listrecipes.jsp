<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<title>Salt And Honey - Recept listázó</title>
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
		<div class="container" id="bigbox">
			<br>
			<div class="row justify-content-center">
				<div class="col-12 mt-1">

					<h1>Recept Listázó</h1>


					<c:forEach var="recipe" items="${recipes}">

						<p>Recept sorszáma: ${recipe.id }</p>
						<p id="recipe_title">${recipe.name }</p>
						<p>${recipe.instructions }</p>
						<br>
						<p>
							<strong id="result_name">Elkészítési idő: </strong>${recipe.prepTime }</p>
						<p>
							<strong id="result_name">Sütési/főzési idő: </strong>${recipe.cookTime }</p>
						<br>
						<p>
							<img id="list_img" src="${recipe.img}" alt="${recipe.name}">
						</p>
						<p>
							<strong id="result_name">Összetevők listája:</strong>
						<p>
							<c:forEach var="ingredients" items="${recipe.ingredients}">
					${ingredients.name }, </c:forEach>
						</p>
						<p>
							<strong id="result_name">Kedvencnek jelölte:</strong>
							<c:forEach var="user" items="${recipe.users}">
					${user.username } <br>
							</c:forEach>
						</p>
						<p>
							<a class="btn btn-dark" href="/edit/${recipe.id }">Módosítás</a>
							<a class="btn btn-dark" href="/delete/${recipe.id }">Törlés</a>
							<c:if test="${not fn:containsIgnoreCase(recipe.users, user)}">
								<a class="btn btn-dark" href="/like/${recipe.id }">Kedvenc!</a>
							</c:if>
							<c:if test="${fn:containsIgnoreCase(recipe.users, user)}">
								<a class="btn btn-dark" href="/unlike/${recipe.id }">Kivétel
									a kedvencek közül</a>
							</c:if>
						</p>
						<hr>
					</c:forEach>

					<br> <a class="btn btn-dark" href="/newrecipe">Új recept
						rögzítése</a>

				</div>
			</div>
		</div>
	</section>

	<hr>
	<section id="contact">
		<div class="container justify-content-center">
			<div class="text-center">
				<br>
				<h3>Elérhetőségem:</h3>
				<ul>
					<li>Telefonszám: +3640444333</li>
					<li>E-mail: acforthelife@kukac.hu</li>
				</ul>
				<br>
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