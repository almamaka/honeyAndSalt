<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
<h1>All Orders</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Type</th>
            <th>Price</th>
            <th>Status</th>
            <th>Műveletek</th>
        </tr>
        <c:forEach var="car" items="${cars}">
        <tr>
            <td>${car.id }</td>
            <td>${car.type }</td>
            <td>${car.price }</td>
            <td>${car.status }</td>
<!--             <td> -->
<%--             <c:forEach var="ingridient" items ="${recipe.ingridients }> --%>
<%--             ${ingridient.name }<br> --%>
<%--             </c:forEach> --%>
<%--             </td> --%>
            <td>
                <a href="/edit/${car.id }">Edit</a> | <a href="/del/${car.id }">Delete</a>
            </td>
        </tr>
        </c:forEach>
    </table>
    <br>
     	<a href="/new">New order</a> 
    
</body>
</html>
