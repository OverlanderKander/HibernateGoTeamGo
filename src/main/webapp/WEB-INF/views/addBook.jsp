<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.kander.hibernatebegins.Book"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book List</title>
</head>

<body>
	<h1>Add A Book!</h1>

	<form name="bookForm" action="../addBook"
		onsubmit="return addUserBook();" method="post">
		Book Title:<input type="text" name="title" /> <br> Author (Last
		name, First name):<input type="text" name="author"> <br>
		Sales:<input type="text" name="sales"> <br>
		<!--Imprint:<input type="text" name="imprint"> <br> -->
		Publisher:<input type="text" name="publisher"> <br>
		<!--  Year Published:<input type="int" name="yearPublished"><br>
		Genre:<input type="text" name="genre" ><br>
		Status:<input type="int" name="status"> <br> 
		Borrower: <input type="int" name= "borrower"> -->
		<br> <br /> <input type="submit" value="Submit!">
	</form>

</body>
</html>