<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<meta name="Description" content="Ez egy receptböngésző, személyre szabva"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css">
<link rel="stylesheet" href="/css/mainstyle.css">
<title>Salt And Honey - Főoldal</title>
</head>
<body id="body">

    <nav class="navbar navbar-expand-lg navbar-dark bg-light fixed-top" id="navbar">
        <a class="navbar-brand ml-4" href="#">Honey And Salt</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item mr-4">
              <a class="nav-link" href="#">Főoldal</a>
            </li>
            <li class="nav-item mr-4">
              <a class="nav-link" href="#search">Receptböngésző</a>
            </li>
            <li class="nav-item mr-4">
              <a class="nav-link" href="#favourite">Kedvenc receptek</a>
            </li>
            <li class="nav-item mr-4">
                <a class="nav-link" href="#account">Felhasználói fiók</a>
              </li>
          </ul>
        </div>
      </nav>

      <section class="bg justify-content-center">
        <div class="container p-4 rounded border" id="leadbox">
            <div class="text">
                <h1 class="display-3">Salt And Honey - A hűtőtől a receptkönyvig</h1>
                <p class="lead" id="lead">Keress alapanyagokra! Keress diétád szerint! Mentsd el kedvenced!</p>
                <button id="go" class="btn btn-light btn-lg">Indulás!</button>
            </div>
        </div>
    </section>

    <section class="mt-5">
      <div class="container" id="bigbox">
        <a name="search"></a>
        <br>
        <br>
          <h2 class="text-left display-5 mx-1">Receptböngésző</h2>
          <hr>
          <div class="row justify-content-center">
            <div class="col-12 mt-1">
              
              <div class="p-3 md-form mt-0">
                <input class="form-control" type="text" placeholder="Böngéssz..." aria-label="Search">
              </div>
              <div class="col-2 form-check">
                <input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
                <label class="form-check-label" for="defaultCheck1">
                  Gluténmentes
                </label>
              </div>
              <div class="col-2 form-check">
                <input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
                <label class="form-check-label" for="defaultCheck1">
                  Cukormentes
                </label>
              </div>
              <div class="col-2 form-check">
                <input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
                <label class="form-check-label" for="defaultCheck1">
                  Tejmentes
                </label>
              </div>
              <div class="col-2 form-check">
                <input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
                <label class="form-check-label" for="defaultCheck1">
                  Laktózmentes
                </label>
              </div>
              <div class="col-2 form-check">
                <input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
                <label class="form-check-label" for="defaultCheck1">
                  Alkoholmentes
                </label>
              </div>

              <div class="col-12 mt-4">
                  <a name="favourite"></a>
                  <h3 id="title2">Kedvenc receptjeim</h3>
                  <hr>
                  <div id="helyszinek_leiras">
                      <div class="row">
                          
                      </div>
                  </div>
              </div>

              <div class="col-12  mt-4">
                  <a name="account"></a>
                  <h3 id="title3">lol</h3>
                  <hr>
                  <div id="fegyver_leiras">
                      <div class="row">
                          
                      </div>
                  </div>
              </div>
          </div>
      </div>
  </section>

  <hr>
  <section id="contact">
      <container class="justify-content-center">
          <div class="text-center">
              <br>
              <h3>Elérhetőségem:</h4>
              <ul>
                  <li>Telefonszám: +3640444333</li>
                  <li>E-mail: acforthelife@kukac.hu</li>
              </ul>
              <br>
          </div>
      </container>
  </section>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.1/umd/popper.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="/js/main.js" type="text/javascript"></script>
</body>
</html>