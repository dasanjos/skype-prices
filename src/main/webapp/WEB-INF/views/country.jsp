<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>

<tags:template>
<jsp:attribute name="breadcrumb"><a href="${pageContext.request.contextPath}">Home</a> / ${country.name}</jsp:attribute>
<jsp:body>

<%@include file="countrySelect.jsp" %>

<table border="1">
	<%@include file="countryHeader.jsp" %>
	<%@include file="countryRow.jsp" %>
</table>

</jsp:body>	
</tags:template>
