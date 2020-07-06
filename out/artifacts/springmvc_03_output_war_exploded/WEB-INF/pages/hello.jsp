<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2020/4/23
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
HELLO
pageContext:${pageScope.msg}<br>
request:${requestScope.msg}<br>
session:${sessionScope.msg}<br>
application:${applicationScope.msg}<br>
</body>
</html>
