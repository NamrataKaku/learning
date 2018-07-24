<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<body>
	<h2>Hello to Book Keeping World!</h2>
	<a href="display.jsp">Display Books</a>
	
	<c:forEach var = "i" begin="0" end="5">
		Item <c:out value="${i}"></c:out> <br>
	</c:forEach>
</body>
</html>
