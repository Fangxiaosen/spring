<%--
  Created by IntelliJ IDEA.
  User: 94358
  Date: 2022/5/6
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--启用el表达式--%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
<h1>学生信息新增</h1>
<form action="test" method="post">
    学号：
    <input type="text" name="id"><br><br>
    姓名：
    <input type="text" name="name"><br><br>
    性别：
    <input type="text" name="sex"><br><br>
    年龄：
    <input type="text" name="age"><br><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
