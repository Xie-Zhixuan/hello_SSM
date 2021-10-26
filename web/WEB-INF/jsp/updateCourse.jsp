<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改课程信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改课程信息</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/course/updateCourse" method="post">
        <input type="hidden" name="id" value="${course.getId()}"/>
        课程名称：<input type="text" name="name" value="${course.getName()}"/>
        课程时长：<input type="text" name="hours" value="${course.getHours()}"/>
        课程描述：<input type="text" name="description" value="${course.getDescription() }"/>
        课程大纲：<input type="text" name="syllabus" value="${course.getSyllabus() }"/>
        <input type="submit" value="提交"/>
    </form>
</div>