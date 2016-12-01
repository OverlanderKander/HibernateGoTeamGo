<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.kander.hibernatebegins.Book"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book Added</title>
</head>

<center>
	<h1>You added a book!</h1>
	<h2>Book successfully added:</h2>
	<p>
		${bookTitle} <br> by ${bookAuthor} <br>
	</p>
</center>

<div style="text-align: center">
	<a href="home">Home</a> | <a href="list">View Library</a> | 
	<a href="addBook">Add A Book</a>
</div>

</body>
</html>
