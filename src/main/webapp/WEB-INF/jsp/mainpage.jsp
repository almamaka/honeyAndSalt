<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<meta name="Description" content="Ez egy receptböngésző, személyre szabva"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css">
<link rel="stylesheet" type="text/css"  href="/css/mainstyle.css">
<title>Salt And Honey - Főoldal</title>
</head>
<body id="body">

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

      <section class="bg justify-content-center">
        <div class="container p-4 rounded border" id="leadbox">
            <div class="text">
                <h1 class="display-3">Salt And Honey - A hűtőtől a receptkönyvig</h1>
                <p class="lead" id="lead">Keress alapanyagokra! Keress diétád szerint! Mentsd el kedvenced!</p>
                <button id="#search" class="btn btn-light btn-lg">Indulás!</button>
            </div>
        </div>
    </section>

    <section class="mt-5">
      <div name="#search" class="container" id="bigbox">
          <h2 class="text-left display-5 mx-1">Receptböngésző</h2>
          <hr>
          <div class="row justify-content-center">
            <div class="col-12 mt-1">

              <div class="p-3 md-form mt-0">
              <form action="/search" method="post" class="form-group text-center py-2 rounded" id="search">
              <p>Keress receptekre a nevük alapján, vagy az elkészítési leírás szövegében! Egyszerre csak egy szóra keress!</p>
                <p>Ha diétád alapján keresnél, keress rá az adott alapanyag mentességre! Például: gluténmentes, laktózmentes, stb.</p>
                <input class="form-control" type="text" name="searchText" placeholder="Böngéssz elkészítési leírás vagy a recept neve alapján..." aria-label="Search">
                <br>
                <button type="submit" name="search" class="btn btn-light" id="btn" integrity="">Keresés</button>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                </form>
              </div>
              <div class="p-3 md-form mt-0">
              <form action="/searchingredients" method="post" class="form-group text-center py-2 rounded" id="searchIngredients">
                <p>Keress receptekre az összetevőik alapján! Egyszerre csak egy alapanyagra tudsz keresni.</p>
                <input class="form-control" type="text" name="searchText" placeholder="Böngéssz összetevők szerint..." aria-label="Search">
                <br>
                <button type="submit" name="search" class="btn btn-light" id="btn" integrity="">Keresés</button>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                </form>
                <a href="listrecipes" class="next" integrity="">Nézd meg az összes receptet!<br></a>
              </div>


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
                  <li>Telefonszám: +36309999999</li>
                  <li>E-mail: info@honeyandsalt.hu</li>
              </ul>
              <br>
          </div>
      </div>
  </section>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.1/umd/popper.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="/js/main.js" type="text/javascript"></script>
</body>
</html>