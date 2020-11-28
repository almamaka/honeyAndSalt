<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <meta name="Description" content="Ez egy receptböngésző, személyre szabva"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.3/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css">
        <link rel="stylesheet" type="text/css" href="/css/indexstyle.css">
        <title>Salt And Honey - Regisztráció</title>

  </head>

  <body>

    <div class="container-fluid my-4 mx-3">
        <div class="row justify-content-center border rounded" id="box">
            <div class="col-12" id="registrationbox">
            <br>
                <h3 class="p2">Hozd létre a felhasználód!</h3>
                <form:form method="POST" modelAttribute="userForm" class="form-group text-center py-2 rounded">
                    
                        <spring:bind path="username">
                            <div class="form-group ${status.error ? 'has-error' : ''}" id="usernamereg">                         
                            <br>
                                <label for="">Felhasználónév</label>
                              	<br>
                                <form:input type="text" path="username" class="form-control pt-3 pb-3 mx-2" placeholder="Felhasználónév"
                                            autofocus="true"></form:input>
                                            <br>
                                <form:errors class="justify-content-center text-light bg-danger" path="username"></form:errors>
                                
                            </div>
                        </spring:bind>
                    
                        <spring:bind path="email">
                            <div class="form-group ${status.error ? 'has-error' : ''}" id="emailreg">
                            <br>
                                <label for="">E-mail cím</label>
                           		<br>
                                <form:input type="email" path="email" class="form-control"
                                            placeholder="E-mail cím"></form:input>
                                            <br>
                                <form:errors class="justify-content-center text-light bg-danger" path="email"></form:errors>
                            </div>
                        </spring:bind>
                    
                        <spring:bind path="password">
                            <div class="form-group ${status.error ? 'has-error' : ''}" id="passwordreg">
                            <br>
                                <label for="">Jelszó</label>
                    			<br>
                                <form:input type="password" path="password" class="form-control pt-3 pb-3 mx-2" placeholder="Jelszó"></form:input>
                                <br>
                            <form:errors class="justify-content-center text-light bg-danger" path="password"></form:errors>
                            </div>
                        </spring:bind>
                   
                        <spring:bind path="passwordConfirm">
                            <div class="form-group ${status.error ? 'has-error' : ''}" id="passwordregok">
                                <br>
                                <label for="">Jelszó megerősítése</label>
                         		<br>
                                <form:input type="password" path="passwordConfirm" class="form-control pt-3 pb-3 mx-2"
                                            placeholder="Jelszó megerősítése"></form:input>
                                            <br> 
                            <form:errors class="justify-content-center text-light bg-danger" path="passwordConfirm"></form:errors>
                                
                            </div>
                        </spring:bind>
                  
                    <button class="btn btn-dark" id="btn" type="submit" >Regisztráció</button>
                </form:form>
            </div>
        </div>
    </div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.1/umd/popper.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="/js/main.js" type="text/javascript"></script>
  </body>
</html>