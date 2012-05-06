<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<!--tr><td colspan="3"><c:out value="${country.name}" /></td></tr-->
	<c:forEach var="price" items="${country.prices}" varStatus="loop">
	<tr class="${loop.index % 2 == 0 ? 'even' : 'odd'}"><td><c:out value="${price.name}" /></td><td>${price.price}</td><td>${price.priceVat}</td></tr>
	</c:forEach>
