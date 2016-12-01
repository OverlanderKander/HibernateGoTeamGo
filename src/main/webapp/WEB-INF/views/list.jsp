<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.kander.hibernatebegins.Book"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Library Collection</title>
</head>

<body>
	<center>
		<h1>Book List</h1>
	</center>

	<table border="1">
		<tr>
			<th>Rank</th>
			<th>Author</th>
			<th>Title</th>
			<th>Publisher/Imprint</th>
			<th>Sales</th>
		</tr>

		<c:forEach items="${bookList}" var="book">
			<tr>
				<td>${book.rank}</td>
				<td>${book.author}</td>
				<td>${book.title}</td>
				<td>${book.publisher}:${book.imprint }</td>
				<td>${book.sales}</td>
				<td><a Href="delete?rank=${book.rank}"> Delete</a></td>
			</tr>
		</c:forEach>

	</table>

	<div style="text-align: center">
		<a href="home">Home</a> | <a href="addBook">Add A Book</a>
	</div>

</body>
</html>