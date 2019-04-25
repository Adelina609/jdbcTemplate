<%@ page contentType="description/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<html>
<head>
    <title>SignUp</title>
    <meta http-equiv="Content-Type" content="description/html; charset=UTF-8">
    <%--<link rel="stylesheet" href="<c:url value="/vendor/css/form_css.css"/>">--%>
</head>
<body class="align">

<div class="grid">

    <div id="login">

        <a href='${s:mvcUrl("RC#change").arg(0, "ru_RU").build()}'>Рус</a> <a href='${s:mvcUrl("RC#change").arg(0, "en_US").build()}'>Eng</a>

        <h2><span style="font-size: medium; color: #bd2130"></span><s:message code="registration"/></h2>

        <h2>${message}</h2>
        <form:form method="POST" modelAttribute="user">
            <%--<fieldset>--%>
            <form:label path="name"><s:message code="name"/></form:label>
            <form:input path="name"/>
            <form:errors path="name" /><br>

            <form:label path="email"><s:message code="email"/></form:label>
            <form:input id="email" path="email"/>
            <form:errors path="email" /><br>

            <form:label path="password"><s:message code="password"/></form:label>
            <form:input id="password"  path="password"/>
            <form:errors path="password" /><br>

            <%--<form:label path="country"><s:message code="country"/></form:label>--%>
            <%--<form:select path="country">--%>
                <%--<form:option value="Russia"><s:message code="russia"/></form:option>--%>
                <%--<form:option value="USSR"><s:message code="ussr"/></form:option>--%>
            <%--</form:select>--%>
            <%--<form:errors path="country" /><br>--%>

            <%--<form:label path="gender"><s:message code="gender"/></form:label>--%>
            <%--<form:radiobutton path="gender" value="male"/><s:message code="male"/>--%>
            <%--<form:radiobutton path="gender" value="female"/><s:message code="female"/>--%>
            <%--<form:errors path="gender" /><br>--%>

            <%--<form:label path="subscribe"><s:message code="subscribe"/></form:label>--%>
            <%--<form:checkbox path="subscribe"/>--%>
            <%--<form:errors path="subscribe" /><br>--%>

            <input type="submit" value="Submit" />

            <%--</fieldset>--%>
        </form:form>

        <%--<a href='${s:mvcUrl("RC#change").arg(0, "ru_RU").build()}'>Рус</a> <a href='${s:mvcUrl("RC#change").arg(0, "en_US").build()}'>Eng</a>--%>
        <%--<h3><s:message code="test"/></h3>--%>
        <%--<h3><s:message code="param.message" arguments="3.14 2.71" argumentSeparator=" "/></h3>--%>
        <%--<h3>${message0}</h3>--%>
        <%--<h3>${message1}</h3>--%>

    </div>
</div>
</body>
</html>
