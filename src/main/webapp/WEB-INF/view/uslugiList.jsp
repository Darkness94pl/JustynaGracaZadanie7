<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
</head>
<body>
 
<h2>Uslugi Management Screen </h2>
 
<form:form method="post" action="add" commandName="uslugi">
 
    <table>
    <tr>
        <td><form:label path="nazwa"><spring:message code="label.firstname"/></form:label></td>
        <td><form:input path="nazwa" /></td>
    </tr>
    <tr>
        <td><form:label path="koszt"><spring:message code="label.lastname"/></form:label></td>
        <td><form:input path="koszt" /></td>
    </tr>
    <tr>
        <td><form:label path="rodzaj"><spring:message code="label.email"/></form:label></td>
        <td><form:input path="rodzaj" /></td>
    </tr>
    <tr>
        <td><form:label path="opis"><spring:message code="label.telephone"/></form:label></td>
        <td><form:input path="opis" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.add"/>"/>
        </td>
    </tr>
</table> 
</form:form>
 
     
<h3>Uslugi</h3>
<c:if  test="${!empty uslugiList}">
<table class="data">
<tr>
    <th>Nazwa</th>
    <th>Koszt</th>
    <th>Rodzaj</th>
    <th>Opis</th>
    <th>&nbsp;</th>
</tr>
<c:forEach items="${uslugiList}" var="emp">
    <tr>
        <td>${emp.nazwa}</td>
        <td>${emp.koszt}</td>
        <td>${emp.rodzaj}</td>
        <td>${emp.opis}</td>
        <td><a href="delete/${emp.id}">delete</a></td>
    </tr>
</c:forEach>
</table>
</c:if>
 
</body>
</html>