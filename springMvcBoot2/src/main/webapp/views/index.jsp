<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 	Welcome to Telusko
 	
 	<form action="addAlien" method="post">
 		Enter your id : <input type="text" name="aid"><br>
 		Enter your name : <input type="text" name="aname"><br>
 		<input type="submit">
 	</form>
 	<hr>
 	<form action="getAlien" method ="get">
 		Enter your id: <input type="text" name="aid">
 		<input type="submit">
 	</form>
 	
 	<hr>
 	-- Using JPA feature
 	  
 	<form action="getAlienByName" method ="get">
 		Enter your name: <input type="text" name="aname">
 		<input type="submit">
 	</form>
 	
 	<hr>
 	-- Using JPA Query Feature
 	  
 	<form action="getAlienByNameFind" method ="get">
 		Enter your name: <input type="text" name="aname">
 		<input type="submit">
 	</form>
 	
 	
</body>
</html>