<%--
  Created by IntelliJ IDEA.
  User: Аделя
  Date: 27.11.2018
  Time: 1:12
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <link href="/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>

        <!-- Custom styles for this template -->
        <link href="/css/clean-blog.min.css" rel="stylesheet">
        <link href="/css/registration.css" type="text/css" rel="stylesheet">
    </head>
        <body>
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