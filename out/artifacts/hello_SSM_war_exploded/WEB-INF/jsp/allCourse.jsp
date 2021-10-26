<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>课程表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>课程列表 —— 显示所有课程</small>
                </h1>
            </div>
        </div>
    </div>


    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/course/toAddCourse">新增</a>
        </div>


        <div class="col-md-4 column pull-right" >
<%--            应使用restful风格,但尚未明晓action中拼接变量的方法--%>
            <form action="/course/search" method="post">
                <input type="text" value="请输出查询的课程名" name="Name" id="cN">
                <input type="submit" value="搜索">
            </form>
        </div>
    </div>


    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>课程编号</th>
                    <th>课程名字</th>
                    <th>课程时长</th>
                    <th>课程描述</th>
                    <th>课程大纲</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="course" items="${requestScope.get('list')}">
                    <tr>
                        <td>${course.getId()}</td>
                        <td>${course.getName()}</td>
                        <td>${course.getHours()}</td>
                        <td>${course.getDescription()}</td>
                        <td>${course.getSyllabus()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/course/toUpdateCourse/${course.getId()}">更改</a> |
                            <a href="${pageContext.request.contextPath}/course/del/${course.getId()}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>