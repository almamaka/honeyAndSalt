<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Car order edit</title>
</head>
<body>
    <form action="/edit" method="post">
    	<input type="hidden" value="${car.id }" name = "id">
        <span>Type: </span> <input name="type" type="text" value="${car.type }" /><br>
        <span>Price: </span> <input name="price" type="number" value="${car.price }"/><br>
        <span>Status: </span> <input name="status" type="text" value="${car.status }"/><br>
        
        
       
        <button type="submit">Save</button>
    </form>
</body>
</html>