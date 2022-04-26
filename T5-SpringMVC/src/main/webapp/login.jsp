<%--
  Created by IntelliJ IDEA.
  User: 94358
  Date: 2022/5/6
  Time: 9:09
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
<h1>用户登录</h1>
<form action="getAccPwd" method="post">
    账号：
    <input type="text" name="account"><br><br>
    密码：
    <input type="password" name="pwd"><br><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
