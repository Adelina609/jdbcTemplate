<%--
  Created by IntelliJ IDEA.
  User: Аделя
  Date: 27.11.2018
  Time: 1:12
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!Doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Clean Blog - Start Bootstrap Theme</title>
    <!-- Bootstrap core CSS -->
    <link href="/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="description/css">
    <link href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='description/css'>
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='description/css'>

    <!-- Custom styles for this template -->
    <link href="/css/clean-blog.min.css" rel="stylesheet">
    <link href="/css/registration.css" type="description/css" rel="stylesheet">
</head>
<body>
<%--<form class="form-container" action="/scitopus/registration" method="post">--%>
<div class="form-title">
    <h2>Регистрация</h2>
</div>

<form:form method="POST" modelAttribute="user">
    <form:label path="name">Name</form:label>
    <form:input path="name"/>
    <form:errors path="name" /><br>

    <form:label path="email">Email</form:label>
    <form:input id="email" path="email"/>
    <form:errors path="email" /><br>

    <form:label path="password">Password</form:label>
    <form:password path="password" id="password"/>
    <form:errors path="password" /><br>

    <input type="submit" value="Submit" />
</form:form>

<%--<div class="form-title">Email</div>--%>
<%--<input class="form-field"--%>
<%--type="description"--%>
<%--name="email" required--%>
<%--<c:if test="${not empty emailValue}">--%>
<%--value=${emailValue}--%>
<%--</c:if>>--%>
<%--<c:if test="${not empty email_error}">--%>
<%--<small>${email_error}</small>--%>
<%--</c:if><br />--%>
<%--<div class="form-title">Имя пользователя</div>--%>
<%--<input class="form-field"--%>
<%--type="description"--%>
<%--name="link" required--%>
<%--<c:if test="${not empty nameValue}">--%>
<%--value=${nameValue}--%>
<%--</c:if>>--%>
<%--<div class="form-title">Пароль</div>--%>
<%--<input class="form-field"--%>
<%--type="password"--%>
<%--name="password1" required--%>
<%--<c:if test="${not empty pass_error}">--%>
<%--<small>${pass_error}</small>--%>
<%--</c:if><br />--%>
<%--<div class="form-title">Подтвердите пароль</div>--%>
<%--<input class="form-field"--%>
<%--type="password"--%>
<%--name="password2" required >--%>
<%--<c:if test="${not empty equals_error}">--%>
<%--<small>${equals_error}</small>--%>
<%--</c:if>--%>
<%--<div class="submit-container">--%>
<%--<input class="submit-button" type="submit" value="Зарегистрироваться" />--%>
<%--</div>--%>
<%--</form>--%>
<!-- Footer -->
<footer>
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-md-10 mx-auto">
                <ul class="list-inline description-center">
                    <li class="list-inline-item">
                        <a href="#">
                      <span class="fa-stack fa-lg">
                        <i class="fas fa-circle fa-stack-2x"></i>
                        <i class="fab fa-twitter fa-stack-1x fa-inverse"></i>
                      </span>
                        </a>
                    </li>
                    <li class="list-inline-item">
                        <a href="#">
                      <span class="fa-stack fa-lg">
                        <i class="fas fa-circle fa-stack-2x"></i>
                        <i class="fab fa-facebook-f fa-stack-1x fa-inverse"></i>
                      </span>
                        </a>
                    </li>
                    <li class="list-inline-item">
                        <a href="#">
                      <span class="fa-stack fa-lg">
                        <i class="fas fa-circle fa-stack-2x"></i>
                        <i class="fab fa-github fa-stack-1x fa-inverse"></i>
                      </span>
                        </a>
                    </li>
                </ul>
                <p class="copyright description-muted">Copyright &copy; Your Website 2018</p>
            </div>
        </div>
    </div>
</footer>

<!-- Bootstrap core JavaScript -->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Contact Form JavaScript -->
<script src="js/jqBootstrapValidation.js"></script>
<script src="js/contact_me.js"></script>

<!-- Custom scripts for this template -->
<script src="js/clean-blog.min.js"></script>

</body>
</html>



<%--&lt;%&ndash;--%>
  <%--Created by IntelliJ IDEA.--%>
  <%--User: Аделя--%>
  <%--Date: 27.11.2018--%>
  <%--Time: 1:13--%>
  <%--To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="description/html;charset=UTF-8" language="java" %>--%>
<%--<%@taglib prefix="main" tagdir="/WEB-INF/tags/layouts" %>--%>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>--%>
<%--<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>--%>
<%--<!-- Navigation -->--%>
<%--&lt;%&ndash;<main:main>&ndash;%&gt;--%>
<%--<head>--%>
    <%--<link rel="stylesheet" href="<c:url value="/css/modal_window.css"/>"/>--%>
    <%--<script>--%>
        <%--$(".open-all").click(--%>
            <%--function () {--%>
                <%--alert("func")--%>
                <%--$(this).next(".more").slideToggle("fast");--%>
                <%--//$(this).slideToggle("fast");--%>
                <%--$(this).style.display = "none"--%>
            <%--});--%>

        <%--$(".close").click(--%>
            <%--function () {--%>
                <%--$(this).parent().slideToggle("fast");--%>
                <%--//$(".open-all-block").slideToggle("fast");--%>
                <%--$(this).parent().prev(".open-all").style.display = "inline-block"--%>
                <%--//$(".open-all").css("display", "block");--%>
            <%--});--%>
    <%--</script>--%>
    <%--<style>--%>
        <%--.opisanie {--%>
            <%--width: 400px;--%>
            <%--margin: auto;--%>
        <%--}--%>
        <%--.more {--%>
            <%--display:none--%>
        <%--}--%>
        <%--.open-all, .cllose {--%>
            <%--display: inline-block;--%>
            <%--border: 1px grey solid;--%>
            <%--border-radius: 20px;--%>
            <%--padding: 0.5em 1em;--%>
        <%--}--%>
    <%--</style>--%>
<%--</head>--%>
<%--<!-- Page Header -->--%>
        <%--&lt;%&ndash;<header class="masthead" style="background-image: url('/img/img_brain.jpg')">&ndash;%&gt;--%>
    <%--&lt;%&ndash;<div class="overlay"></div>&ndash;%&gt;--%>
    <%--&lt;%&ndash;<div class="container">&ndash;%&gt;--%>
        <%--&lt;%&ndash;<div class="row">&ndash;%&gt;--%>
            <%--&lt;%&ndash;<div class="col-lg-8 col-md-10 mx-auto">&ndash;%&gt;--%>
                <%--&lt;%&ndash;<div class="site-heading">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<h1>Scitopus</h1>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<span class="subheading">Кем бы ты ни был – будь лучше. ©Авраам Линкольн</span>&ndash;%&gt;--%>
                <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
            <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
        <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
    <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
        <%--&lt;%&ndash;</header>&ndash;%&gt;--%>

<%--&lt;%&ndash;<!-- Main Content -->&ndash;%&gt;--%>
<%--<div class="container">--%>
    <%--<div class="row">--%>
        <%--<div>--%>
            <%--<h2>${viewVariable}</h2>--%>
        <%--</div>--%>
        <%--&lt;%&ndash;<div class="col-lg-8 col-md-10 mx-auto">&ndash;%&gt;--%>
            <%--&lt;%&ndash;<c:forEach items="${articles}" var="article">&ndash;%&gt;--%>
            <%--&lt;%&ndash;<div class="post-preview">&ndash;%&gt;--%>
                <%--&lt;%&ndash;<h2 class="post-title">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;${article.getTitle()}&ndash;%&gt;--%>
                <%--&lt;%&ndash;</h2>&ndash;%&gt;--%>
                <%--&lt;%&ndash;<p class="post-subtitle">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;${article.getText()}&ndash;%&gt;--%>
                <%--&lt;%&ndash;</p>&ndash;%&gt;--%>
                <%--&lt;%&ndash;<span class="open-all">показать полностью</span>&ndash;%&gt;--%>
                <%--&lt;%&ndash;<div class="more" style="display: none">дополнительный текст<br>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<span class="close">скрыть</span>&ndash;%&gt;--%>
                <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
                <%--&lt;%&ndash;<p class="post-meta">Posted by&ndash;%&gt;--%>
                    <%--&lt;%&ndash;${article.getUsername()}</p>&ndash;%&gt;--%>
            <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
            <%--&lt;%&ndash;</c:forEach>&ndash;%&gt;--%>

                <%--<div class="opisanie">--%>
                    <%--<h2>Краткое описание</h2>--%>
                    <%--<p>При установке ксенонового оборудования на современные автомобили, оснащенные бортовым компьютером, часто можно столкнуться с тем, что компьютер выдает ошибку в работе системы освещения (загорается соответствующая лампочка на панели приборов). На целом ряде автомобилей это приводит к автоматическому отключению подачи питания на фары. </p>--%>
                    <%--<button class="open-all" id="open-all" style="display: block">показать полностью</button>--%>
                    <%--<div class="more" id="more">дополнительный текст<br>--%>
                        <%--<button class="close" id="close">скрыть</button>--%>
                    <%--</div>--%>
                <%--</div>--%>

            <%--<!-- Pager -->--%>
            <%--&lt;%&ndash;<div class="clearfix">&ndash;%&gt;--%>
                <%--&lt;%&ndash;<a class="btn btn-primary float-right" href="#">Older Posts &rarr;</a>&ndash;%&gt;--%>
            <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>
<%--&lt;%&ndash;</main:main>&ndash;%&gt;--%>

<%--</html>--%>

