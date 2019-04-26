<%--
  Created by IntelliJ IDEA.
  User: Аделя
  Date: 27.11.2018
  Time: 1:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="main" tagdir="/WEB-INF/tags/layouts" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Navigation -->
<main:main>
<head>
    <link rel="stylesheet" href="<c:url value="/css/modal_window.css"/>">
    <script>
        $(".open-all").click(
            function () {
                alert("func")
                $(this).next(".more").slideToggle("fast");
                //$(this).slideToggle("fast");
                $(this).style.display = "none"
            });

        $(".close").click(
            function () {
                $(this).parent().slideToggle("fast");
                //$(".open-all-block").slideToggle("fast");
                $(this).parent().prev(".open-all").style.display = "inline-block"
                //$(".open-all").css("display", "block");
            });
    </script>
    <style>
        .opisanie {
            width: 400px;
            margin: auto;
        }
        .more {
            display:none
        }
        .open-all, .cllose {
            display: inline-block;
            border: 1px grey solid;
            border-radius: 20px;
            padding: 0.5em 1em;
        }
    </style>
</head>
<!-- Page Header -->
<header class="masthead" style="background-image: url('/vendor/img/img_brain.jpg')">
    <div class="overlay"></div>
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-md-10 mx-auto">
                <div class="site-heading">
                    <h1>Scitopus</h1>
                    <span class="subheading">Кем бы ты ни был – будь лучше. ©Авраам Линкольн</span>
                </div>
            </div>
        </div>
    </div>
</header>

<!-- Main Content -->
<div class="container">
    <div class="row">
        <div class="col-lg-8 col-md-10 mx-auto">
            <c:forEach items="${episodes}" var="episode">
            <div class="post-preview">
                <h2 class="post-title">
                    ${episode.getName()}
                </h2>
                <p class="post-subtitle">
                    ${episode.getEpisode()}
                </p>
                <h4>Characters:</h4>
                <p class="post-subtitle">
                    <a href="${episode.getUrl()}">${episode.getUrl()}</a>
                </p>
                <p class="post-subtitle">
                    ${episode.getAirDate()}
                </p>
                <p class="post-subtitle">
                    ${episode.getCreated()}
                </p>
            </div>
            </c:forEach>
            </div>
        </div>
    </div>
</div>
</main:main>

</html>

