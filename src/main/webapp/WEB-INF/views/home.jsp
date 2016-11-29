<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Book Added</title>
</head>
<body>
	<h1>You added a book!</h1>

	<p>
		The book you have added is ${bookTitle}, by ${bookAuthor} 
		which sold ${bookSales} copies published 
		 by ${bookPublisher}.<br>
		
	</p>


</body>
</html>
