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
<title>Salt And Honey - Recept hozzáadása</title>
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
				<li class="nav-item mr-4"><a class="nav-link" href="/mainpage">Főoldal</a>
				</li>
				<li class="nav-item mr-4"><a class="nav-link" href="/search">Receptböngésző</a></li>
				<li class="nav-item mr-4"><a class="nav-link"
					href="/favourites">Kedvenc receptek</a></li>
				<li id="dropdownli" class="nav-item dropdown mr-4"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Felhasználói fiók </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">

						<a class="dropdown-item" href="userdata">Adatok</a>
						<div class="dropdown-divider"></div>
						<form class="form-group text-center py-2" id="logoutForm"
							method="POST" action="${contextPath}/logout">
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
						</form>
						<button class="dropdown-item btn btn-light btn-lg"
							onclick="document.forms['logoutForm'].submit()" integrity="">Kijelentkezés</button>


					</div></li>
			</ul>
		</div>
	</nav>


	<section class="mt-5">
		<div class="container-fluid my-4 mx-3" id="bigbox">
			<br>
			<h2>Recept hozzáadása</h2>
			<hr>
			<div class="row justify-content-center">
				<div class="col-12 mt-1">
					<form id="newform" class="form-group text-center py-2 rounded"
						action="/newrecipe" method="post">
						<input class="form-control pt-3 pb-3 mx-2" type="hidden"
							value="${recipe.id }" name="id" /> <span>Recept neve: </span> <input
							name="name" type="text" /><br> <span>Előkészítési
							idő: </span> <input name="prepTime" type="number"
							 /><br> <span>Főzési/sütési idő: </span> <input name="cookTime" type="number"
							 /><br> <span>Elkészítés:
						</span>
						<textarea name="instructions" rows="10" cols="40"></textarea>
						<br>
						<span>Recept képének neve (pl. "img/kepnev.jpg"): </span> <input
							name="img" type="text" /><br>
						
						<button class="btn btn-dark" type="submit">Új recept felvétele</button>
						
						<input class="form-control pt-3 pb-3 mx-2" type="hidden"
							name="${_csrf.parameterName}" value="${_csrf.token}" />
							
					</form>
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