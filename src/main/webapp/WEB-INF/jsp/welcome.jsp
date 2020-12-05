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
	
	<br/>
		<div class="container-fluid my-4 mx-3">
			<div class="row justify-content-center border rounded" id="box">
				<div class="col-12">
                    <c:if test="${pageContext.request.userPrincipal.name != null}">
                    <form class="form-group text-center py-2" id="logoutForm" method="POST" action="${contextPath}/logout">
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        
                    </form>
                     
                    <h3>Üdvözöllek ${pageContext.request.userPrincipal.name}!</h3>
                    
                    <br>
                    <div class="col-12 justify-content-center">
                    <h4><a href="mainpage" id="welcome_go" integrity="">Tovább a Salt and Honey - Receptböngészőbe!</a></h4>
                    
                    <p><br><strong>Kedves Felhasználók!</strong></p>
                    <p>Szeretnélek tájékoztatni titeket, hogy a webalkalmazásban jelenleg megtalálható receptek nem saját receptek,
                    különböző receptkönyvekből és honlapokról lettek lemásolva. A másolt receptek egy-két helyen eltérhetnek az eredetitől.
                     Minden étel elkészítésének leírása mellett megtalálható, hogy az adott recept honnan került betöltésre. Megértéseteket köszönöm! - a fejlesztő</p>
                    </div>
                    <button class="btn btn-dark btn-lg" id="welcome_logout" onclick="document.forms['logoutForm'].submit()" integrity="">Kijelentkezés</button>
                    </c:if>
                </div>
           </div>
                
		</div>
		
	

	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.1/umd/popper.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="/js/main.js" type="text/javascript"></script>
  </body>
</html>