<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>登录页</title>
    <link href="<%=basePath%>static/loginTheme/styleBlue/css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<form action="<%=basePath%>welcome.action" method="post">
    <div class="main">
        <div class="mainDiv1">
            <h1></h1>
            &nbsp;<a href="<%=basePath%>zh.action"><spring:message code="sys.language.zh"/></a> &nbsp;|
            &nbsp;<a href="<%=basePath%>en.action"><spring:message code="sys.language.en"/></a>
            <div class="mainDiv2">
                <ul>
                    <li><span><spring:message code="sys.login.username"/>：</span>
                        <input type="text"
                               name="username"
                               id="username"
                               placeholder="用户....."
                               class="SearchKeyword1"
                               value="admin">
                    </li>
                    <li><span><spring:message code="sys.login.password"/>：</span>
                        <input type="text"
                               name="password"
                               id="password"
                               placeholder="密码...."
                               class="SearchKeyword2"
                               value="123456">
                    </li>
                    <li>
                        <button id="submit" name="submit" class="submit">
                            <spring:message code="sys.login.login"/>
                        </button>
                    </li>
                </ul>
            </div>
            <div class="footPage"><span style="font-family:arial;">Copyright</span></div>
        </div>
    </div>
</form>
</body>
</html>
<script>
    //提示用戶/密碼錯誤
    var login = "${login}";
    if (login.trim() == "false") {
        alert("登录失败，请检查账号或密码是否正确！");
    }
    //开发用
    //document.getElementById("submit").click();
</script>