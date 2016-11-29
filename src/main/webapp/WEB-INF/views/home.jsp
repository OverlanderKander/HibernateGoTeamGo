<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Book Added</title>
</head>
<body>
<h1>
	You added a book! 
</h1>

<P>  The book you have added is ${bookTitle}, by ${ bookAuthor} genre: ${bookGenre} which sold ${bookSales } copies published in ${bookYearPublished } by ${bookImprint} a division of ${ bookPublisher}.<br>
The status is ${bookStatus} and current borrower is ${bookBorrower}.







 </P>

</body>
</html>
