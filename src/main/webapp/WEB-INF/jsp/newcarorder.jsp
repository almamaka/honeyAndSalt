<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New order</title>
</head>
<body>
    <form action="" method="post">
        <span>Type: </span> <select name="type"><option value="Hatchback">Hatchback</option>
 							<option value="SUV">SUV</option>
  							<option value="Sedan">Sedan</option></select><br>
        <span>Price: </span> <input name="price" type="number" value="${car.price }"/><br>
<%--         <span>Status: </span> <input name="status" type="text" value="${car.status }"/><br> --%>

        <button type="submit">Save</button>
    </form>
</body>
</html>