<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Book JDBC Example</title>
    </head>
    <body>
        <h2>${message}</h2>
    <form:form method="POST" modelAttribute="userCrud">

        <form:label path="email">Email</form:label>
        <form:input id="email" path="email"/>
        <form:errors path="email" /><br>

    <button type="submit" name="del">Удалить</button>
    </form:form>
    </body>
</html>