<%@ page import="java.time.LocalDate" %><%--
  Created by IntelliJ IDEA.
  User: Xie Zhixuan
  Date: 2021/10/23
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>欢迎来到牛马之家</title>
  </head>
  <body>
  <%=LocalDate.now()%>
  <br>
  <a href="/course/allCourse">点击进入课程表</a>
  </body>
</html>
