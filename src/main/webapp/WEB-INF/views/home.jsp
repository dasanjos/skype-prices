<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ page session="false"%>
<tags:template>
<jsp:attribute name="breadcrumb">Home</jsp:attribute>
<jsp:body>
<h2>Enter a country to check out our great low rates</h2>
<%@include file="countrySelect.jsp" %>
<div id="tableWrapper">
<table>
	<%@include file="countryHeader.jsp" %>
	<c:forEach var="country" items="${countries}">
		<%@include file="countryRow.jsp" %> 
	</c:forEach>
</table>
</div>
</jsp:body>
</tags:template>
