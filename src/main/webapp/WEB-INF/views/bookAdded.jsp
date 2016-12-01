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
	<script>addBookToLibrary</script>
<body>
	<h1>New Book Added To Library</h1>
	<h2>You have added a new book</h2>
	<p> ${book.title}<br> 
	Author: ${author} 
	</p>

</body>
</html>