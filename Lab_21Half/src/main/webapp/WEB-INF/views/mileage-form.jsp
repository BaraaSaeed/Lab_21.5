<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mileage Form</title>
<link rel="stylesheet" href="/style.css" />
</head>
<body>
<h1>Enter Data</h1>
<form action="/mileage-result">
		<p>Mileage (MPG): <input type="number"  name="mpg"/> </p>
		<p>Gallons in tank: <input type="number" name="gallons"/> </p>
		<p><button type="submit">Calculate Remaining Miles</button></p>
	</form>
</body>
</html>