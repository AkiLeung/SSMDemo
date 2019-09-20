<%
    String headerPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
    String themeName = "cupertino";//session.getAttribute("themeName").toString();
%>
<link rel="stylesheet" href="<%=headerPath%>static/easyui/themes/<%=themeName%>/easyui.css" type="text/css"/>
<link rel="stylesheet" href="<%=headerPath%>static/easyui/themes/icon.css" type="text/css"/>
<script type="text/javascript" src="<%=headerPath%>static/easyui/jquery.min.js"></script>
<script type="text/javascript" src="<%=headerPath%>static/easyui/jquery.easyui.min.js"></script>
<link rel="stylesheet" href="<%=headerPath%>static/css/basesheet.css" type="text/css"/>
<script type="text/javascript" src="<%=headerPath%>static/javascript/common.js"></script>