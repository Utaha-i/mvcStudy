<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2021/8/10
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Utaha</title>
</head>
<body>
    <form action=${pageContext.request.contextPath}/user/t3 method="post">
        <input type="text" name="name">
        <input type="submit">
    </form>
    在form的路径上加上${pageContext.request.contextPath}
</body>
</html>
