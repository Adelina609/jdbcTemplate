<%--
  Created by IntelliJ IDEA.
  User: Аделя
  Date: 19.04.2019
  Time: 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="description/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form method="POST" modelAttribute="product">
    <form:label path="name">Name</form:label>
    <form:input path="name"/>
    <form:errors path="name" /><br>

    <form:label path="price">Price</form:label>
    <form:input id="price" path="price"/>
    <form:errors path="price" /><br>

    <form:label path="price">Type</form:label>
    <form:select path="type">
        <c:forEach items="${types}" var="type">
            <option value ="${type}">${type}</option>
        </c:forEach>
        <%--<form:options items="${types}" itemLabel="type" itemValue="value" />--%>
    </form:select>

    <form:label path="price">Sale</form:label>
    <form:checkbox path="sale"/>

    <form:label path="manufacturer">Manufacturer</form:label>
    <form:input id="manufacturer"  path="manufacturer"/>
    <form:errors path="manufacturer" /><br>

    <input type="submit" value="Save" />
</form:form>

</body>
</html>
