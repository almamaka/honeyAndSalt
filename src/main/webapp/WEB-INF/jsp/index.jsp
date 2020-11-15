<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
  <head>
	<!-- Required meta tags -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<!-- Bootstrap CSS -->
	<!--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">-->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css">
	<link rel="stylesheet" type="text/css" href="/css/indexstyle.css">
	<title>Salt And Honey - A hűtőtől a receptkönyvig</title>
</head>
  <body>
	
	<br/>
		<div class="container-fluid my-4 mx-3">
				<div class="row justify-content-center border rounded" id="box">
					<div class="col-12">
					<br>
					<h3 class="p2">Kedves receptböngésző! Kérlek, jelentkezz be!</h3>
					<form action="/" method="post" class="form-group text-center py-2 rounded ${error != null ? 'has-error' : ''}" id="login">
							<span>${ message}</span>
							<label for="">Felhasználónév</label>
							<input type="text" id="username" class="form-control pt-3 pb-3 mx-2"/>
						
							<label for="">Jelszó</label>
							<input type="password" id="pwd" class="form-control pt-3 pb-3 mx-2"/>
							<span>${ error}</span>
							<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
						
						<button type="submit" class="btn btn-dark" id="btn" integrity="">Bejelentkezés</button>
					</form>
					</div>
				</div>
			
				<a href="registration" class="next" integrity="">Regisztrálj!<br></a>
				<a href="listrecipes" class="next" integrity="">Összes recept<br></a>
				<a href="mainpage" class="next" integrity="">Vagy lépj tovább a receptböngészőbe...</a>  
		</div>
		
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.1/umd/popper.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<script src="/js/main.js" type="text/javascript"></script>
  </body>
</html>