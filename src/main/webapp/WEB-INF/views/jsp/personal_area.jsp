<%--
  Created by IntelliJ IDEA.
  User: Аделя
  Date: 30.11.2018
  Time: 2:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="main" tagdir="/WEB-INF/tags/layouts" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!-- Navigation -->
<main:main>
    <head>
        <link rel="stylesheet" href="<c:url value="/vendor/css/modal_window.css"/>">
    </head>
    <!-- Page Header -->
    <header class="masthead" style="background-image: url('/vendor/img/img_brain.jpg')">
        <div class="overlay"></div>
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-md-10 mx-auto">
                    <div class="site-heading">
                        <h1>Личный кабинет</h1>
                        <span class="subheading"></span>
                    </div>
                </div>
            </div>
        </div>
    </header>



    <h3>Изменить информацию</h3>
    <form:form method="POST" modelAttribute="user">
        <div class="form-title">
        <form:label path="name">Name</form:label>
        <form:input path="name"/>
        <form:errors path="name" /><br>
        </div>
        <div class="form-title">
        <form:label path="password">Password</form:label>
        <form:password path="password" id="password"/>
        <form:errors path="password" /><br>
        </div>

        <input type="submit" value="Submit" />
    </form:form>


    <!-- Main Content -->
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-md-10 mx-auto">
                <c:forEach items="${articles}" var="article">
                    <div class="post-preview">
                        <h2 class="post-title">
                                ${article.getName()}
                        </h2>
                        <p class="post-subtitle">
                                ${article.getDescription()}
                        </p>

                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
    </div>

    <a class="nav-link" href="/scitopus/main">Удалить</a>

</main:main>

</html>

