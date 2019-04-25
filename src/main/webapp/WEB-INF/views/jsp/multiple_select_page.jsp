<%--
  Created by IntelliJ IDEA.
  User: Аделя
  Date: 10.04.2019
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="description/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<html>
<head>
    <title>Favorite episodes</title>
</head>
<body>

<form:form name="about" method="post" modelAttribute="person">
    <form:label path="name">Name</form:label>
    <form:input path="name"/>
    <form:select path="episodes" multiple="true"
                 items="${episodesList}" itemLabel="name" itemValue="name">
    </form:select>
    <input type="submit" value="Submit" />
</form:form>

</body>
</html>
