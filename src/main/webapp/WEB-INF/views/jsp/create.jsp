<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="main" tagdir="/WEB-INF/tags/layouts" %>
<%@taglib prefix="main" tagdir="/WEB-INF/tags/layouts" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib prefix="main" tagdir="/WEB-INF/tags/layouts" %>

<main:main>
<!-- Page Header -->
<header class="masthead" style="background-image: url('/vendor/img/write.jpg')">
    <div class="overlay"></div>
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-md-10 mx-auto">
                <div class="page-heading">
                    <span class="subheading">Есть что сказать? Добро пожаловать!</span>
                </div>
            </div>
        </div>
    </div>
</header>

<!-- Main Content -->
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-md-10 mx-auto">
                <p>Указывайте источники и будьте критичны к своему мышлению.</p>
                <form:form method="POST" modelAttribute="article">
                    <div class="control-group">
                        <div class="form-group floating-label-form-group controls">
                            <form:label path="title">Заголовок</form:label>
                            <form:input path="title"/>
                            <form:errors path="title" /><br>
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="form-group floating-label-form-group controls">
                            <form:label path="text">Текст</form:label>
                            <form:input id="text" path="text"/>
                            <form:errors path="text" /><br>
                        </div>
                    </div>
                    <div id="success"></div>
                    <div class="form-group">
                        <input type="submit" value="Submit" />
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</main:main>
