<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form id="suggesticator" method="GET" action="${pageContext.request.contextPath}/country">
	<select id="country" name="country" onchange="this.form.submit()">
		<option selected="selected" value="--">Select Country</option>
		<c:forEach var="country" items="${countries}">
		<option value="${country.code}">${country.name}</option>
		</c:forEach>
	</select>

	<select id="currency" name="currency" onchange="this.form.submit()">
		<option selected="selected" value="EUR">Euro</option>
		<option value="USD">United States, Dollars</option>
		<option value="GBP">United Kingdom, Pounds</option>
		<option value="PLN">Poland, Zloty</option>
		<option value="JPY">Japan, Yen</option>
		<option value="TWD">Taiwan, Dollars</option>
		<option value="AUD">Australia, Dollars</option>
		<option value="BRL">Brazil, Reais</option>
		<option value="BGN">Bulgaria, Lev</option>
		<option value="CAD">Canada, Dollars</option>
		<option value="CZK">Czech Republic, Koruna</option>
		<option value="DKK">Denmark, Kroner</option>
		<option value="HKD">Hong Kong, Dollar</option>
		<option value="HUF">Hungary, Forint</option>
		<option value="ISK">Iceland, Krona</option>
		<option value="LVL">Latvia, Lat</option>
		<option value="CHF">Liechtenstein &amp; Switzerland, Franc</option>
		<option value="LTL">Lithuania, Litas</option>
		<option value="NZD">New Zealand, Dollars</option>
		<option value="NOK">Norway, Kroner</option>
		<option value="SGD">Singapore, Dollar</option>
		<option value="ZAR">South Africa, Rand</option>
		<option value="KRW">South Korea, Won</option>
		<option value="SEK">Sweden, kronor</option>
		<option value="TRY">Turkey, Lira</option>
	</select>
</form>
