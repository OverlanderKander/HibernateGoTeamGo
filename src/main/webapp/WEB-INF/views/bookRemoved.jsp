<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.kander.hibernatebegins.Book"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book Removed</title>
</head>
	<h1>You deleted a book!</h1>
	<h2>Book successfully removed:</h2>
	<p> "${title}" by ${author} has been deleted from the library.<br> 
	</p>
</body>
</html>
