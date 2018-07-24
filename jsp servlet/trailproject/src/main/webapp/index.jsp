<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<body>
<h2>Hello World!</h2>

	<c:forEach var = "i" begin="0" end="5">
		Item <c:out value="${i}"></c:out> <br>
	</c:forEach>
</body>
</html>
