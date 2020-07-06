<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2020/4/19
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%-- 发起增删改查请求--%>
  <a href="book">查询图书</a><br>
  <form action="book" method="post">
    <input type="submit" value="添加1号图书">
  </form>
  <a href="book/1">删除图书</a><br>
  <a href="book/1">更新图书</a><br>
  </body>
</html>
