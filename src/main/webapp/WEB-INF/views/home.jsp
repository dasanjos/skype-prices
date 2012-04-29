<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ page session="false"%>
<tags:template>
	<jsp:attribute name="breadcrumb">Home</jsp:attribute>
	<jsp:body>
<h1>Skype - calling rates</h1>

<%@include file="countrySelect.jsp" %>

<table border="1">
	<%@include file="countryHeader.jsp" %>
	<c:forEach var="country" items="${countries}">
		<%@include file="countryRow.jsp" %> 
	</c:forEach>
</table>

</jsp:body>
</tags:template>
