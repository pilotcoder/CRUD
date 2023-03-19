<%--
  Created by IntelliJ IDEA.
  User: marcin
  Date: 2023. 03. 18.
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>TEST</title>
</head>
<body>
aaa
<table>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.email}</td>
            <td>${user.email}</td>

        </tr>
    </c:forEach>
</table>

</body>
</html>
