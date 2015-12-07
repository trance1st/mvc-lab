<%--
  Created by IntelliJ IDEA.
  User: sapo
  Date: 12/6/2015
  Time: 5:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <form action="login" method="post">
        <input type="text" id="userName" name="userName"><br>
        <input type="password" id="password" name="password"><br>
        <input type="hidden" name="${mvc.csrf.name}" value="${mvc.csrf.token}"/>
        <input type="submit" value="Log in">
    </form>
</head>
<body>

</body>
</html>
