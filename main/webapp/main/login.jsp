<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/16
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/loginUser">
    名字<input type="text" name="name">
    密码<input type="text" name="password">
    提交<input type="submit">
</form>

</body>
</html>
