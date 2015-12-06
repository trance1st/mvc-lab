<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>BJUG</title>
</head>
<body>
    <table>
        <tr>
            <th>Title</th>
            <th>Abstract</th>
            <th>Speaker</th>
        </tr>

        <c:forEach items="${submissions}" var="submission">
            <tr>
                <td><c:out value="${submission.title}"/></td>
                <td><c:out value="${submission.description}"/></td>
                <td><c:out value="${submission.byUser.firstName}"/>
                    <c:out value="${submission.byUser.lastName}"/></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
