<%--
  Created by IntelliJ IDEA.
  Project name(项目名称)：Mybatis_integrate_ssm
  File name(文件名): save
  Author(作者）: mao
  Author QQ：1296193245
  GitHub：https://github.com/maomao124/
  Date(创建日期)： 2022/3/17
  Time(创建时间)： 21:30
  Description(描述)： 无
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加账户信息</title>
</head>
<body>
<h1>添加账户信息表单</h1>
<form name="accountForm" action="${pageContext.request.contextPath}/save" method="post">
    <label>
        账户名称:
        <input type="text" name="name">
    </label><br>
    <label>
        账户金额:
        <input type="text" name="money">
    </label><br>
    <input type="submit" value="保存"><br>
</form>
</body>
</html>
