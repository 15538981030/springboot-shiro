<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<body>
<shiro:authenticated>
    欢迎您<shiro:principal></shiro:principal><a href="${pageContext.request.contextPath}/user/userLogout">登出</a>
</shiro:authenticated>

<shiro:notAuthenticated>
    <a href="${pageContext.request.contextPath}/main/login.jsp">您现在未登陆登陆之后可以收看更多精彩内容！！！！！</a>
</shiro:notAuthenticated>


<shiro:hasAnyRoles name="normal,super">
    <a>轮播图</a>
       <ul>
           <shiro:hasPermission name="banner:update">
           <li>修</li>
           </shiro:hasPermission>
           <shiro:hasPermission name="banner:add">
           <li>增</li>
           </shiro:hasPermission>
           <shiro:hasPermission name="banner:delete">
           <li>删</li>
           </shiro:hasPermission>
           <shiro:hasPermission name="banner:query">
           <li>查</li>
           </shiro:hasPermission>

       </ul>
</shiro:hasAnyRoles>
<shiro:hasRole name="super">
    <a>用户</a>
    <ul>
        <li>修</li>
        <li>增</li>
        <li>删</li>
        <li>差</li>
    </ul>
    <a>日志</a>
    <ul>
        <li>修</li>
        <li>增</li>
        <li>删</li>
        <li>差</li>
    </ul>
</shiro:hasRole>


</body>
</html>
