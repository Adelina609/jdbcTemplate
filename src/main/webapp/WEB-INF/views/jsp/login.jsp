<%--
  Created by IntelliJ IDEA.
  User: Аделя
  Date: 26.04.2019
  Time: 5:12
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="main" tagdir="/WEB-INF/tags/layouts" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<main:main>
    <div id="openModal1">
        <div>
            <form:form method="POST" modelAttribute="login">
            <div class="form-container">
                <div class="form-title">
                    <h2>Войти</h2>
                </div>
                <div class="form-title">
                    <form:label path="email">Email</form:label>
                    <form:input path="email"/>
                    <form:errors path="email" /><br>
                </div>
                <div class="form-title">
                    <form:label path="password">Password</form:label>
                    <form:password path="password"/>
                    <form:errors path="password" /><br>
                </div>
                <div class="submit-container">
                    <input class="submit-button" type="submit" value="OK" />
                </div>
                <div align="center">
                    <a style="font-size: medium;" href="/scitopus/registration">Регистрация</a>
                </div>
            </div>
            </form:form>
        </div>
    </div>
</div>
</main:main>