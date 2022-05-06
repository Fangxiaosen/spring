<%--
  Created by IntelliJ IDEA.
  User: 94358
  Date: 2022/5/6
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--启用el表达式--%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fieldset>
    <h1>社区人员登记系统</h1>
    <table border="1" cellspacing="0" width="1200px">
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${list}" var="l">
            <tr class="chage">
                <td>${l.id}</td>
                <td>${l.name}</td>
                <td>${l.sex}</td>
                <td>${l.age}</td>
                <td>
                    <a href="javascript:void(0)">修改</a>
                    <a href="Delete?pid=${p.id }"
                       onclick="if(window.confirm('您确认删除该信息？')==false){return false;}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div class="insert">
        共${count }条记录
        <a href="insert.jsp">新人员录入</a>
    </div>
</fieldset>

</body>
</html>
