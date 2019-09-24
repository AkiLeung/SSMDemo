<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="../include/include.jsp" flush="true"/>
</head>
<body>
默认显示页:
<spring:message code="sys.main.show"></spring:message>
</body>
</html>
