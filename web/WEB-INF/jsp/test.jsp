<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: Xie Zhixuan
  Date: 2021/10/23
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试视图</title>
</head>
<body>
${arg}
<br>
<%=LocalDateTime.now()%>
</body>
</html>
