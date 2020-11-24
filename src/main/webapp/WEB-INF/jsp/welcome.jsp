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