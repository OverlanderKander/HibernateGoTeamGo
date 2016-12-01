<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Book Added</title>
</head>
<body>
	<h1>You added a book!</h1>
	<h2>Book successfully added:</h2>
	<p>
		${bookTitle} <br>
		by ${bookAuthor} <br> 
		which sold ${bookSales} copies <br>
		published by ${bookPublisher}.<br>		
	</p>


<!--	<p> You deleted ${bookTitle}
	<script>
	int r = 101;
	DAO.deleteBookFromLibrary(r);
	</script>
	</p> -->


</body>
</html>
