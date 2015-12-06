<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BJUG</title>
</head>
<body>
<div style="color: red">${messagesBean.message}</div>
Submit session proposal:
<form action="submit" method="post">
    <label for="title">Title:</label><input type="text" id="title" name="title"><br>
    <label for="description">Description:</label><textarea id="description" name="description"></textarea><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
