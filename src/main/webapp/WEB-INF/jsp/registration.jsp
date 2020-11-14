<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>-->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!--<c:set var="contextPath" value="${pageContext.request.contextPath}"/>-->
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <meta name="Description" content="Ez egy receptböngésző, személyre szabva"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css">
        <link rel="stylesheet" href="/css/style.css">
        <title>Salt And Honey - Regisztráció</title>

  </head>

  <body>

    <div class="container-fluid my-4 mx-3">
        <div class="row justify-content-center border rounded" id="box">
            <div class="col-md-12">
                <h3 class="p2">Hozd létre a felhasználód!</h2>
                <form:form method="POST" modelAttribute="userForm" class="form-group text-center py-2 rounded">
                    
                        <spring:bind path="username">
                            <div class="form-group ${status.error ? 'has-error' : ''}">
                                <label for="">Felhasználónév</label>
                                <form:input type="text" path="username" class="form-control pt-3 pb-3 mx-2" placeholder="Felhasználónév"
                                            autofocus="true"></form:input>
                                <form:errors path="username"></form:errors>
                            </div>
                        </spring:bind>
                    
                        <spring:bind path="email">
                            <div class="form-group ${status.error ? 'has-error' : ''}">
                                <label for="">E-mail cím</label>
                                <form:input type="email" path="email" class="form-control"
                                            placeholder="E-mail cím"></form:input>
                                <form:errors path="email"></form:errors>
                            </div>
                        </spring:bind>
                    
                        <spring:bind path="password">
                            <div class="form-group ${status.error ? 'has-error' : ''}">
                                <label for="">Jelszó</label>
                                <form:input type="password" path="password" class="form-control pt-3 pb-3 mx-2" placeholder="Jelszó"></form:input>
                                <form:errors path="password"></form:errors>
                            </div>
                        </spring:bind>
                   
                        <spring:bind path="passwordConfirm">
                            <div class="form-group ${status.error ? 'has-error' : ''}">
                                <label for="">Jelszó megerősítése</label>
                                <form:input type="password" path="passwordConfirm" class="form-control pt-3 pb-3 mx-2"
                                            placeholder="Jelszó megerősítése"></form:input>
                                <form:errors path="passwordConfirm"></form:errors>
                            </div>
                        </spring:bind>
                  
                    <button class="btn btn-dark" id="btn" type="submit">Regisztráció</button>
                </form:form>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

  </body>
</html>