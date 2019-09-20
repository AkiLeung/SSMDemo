<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>SystemName</title>
    <jsp:include page="../include/common.jsp" flush="true"/>
</head>
<body id="layOut" class="easyui-layout">
<div id="layOutNorth" data-options="iconCls:'icon-man',region:'north',split:false,title:'',border:false,collapsed:false"
     style="height: 52px; background-color: #CEDEF2;">
    欢迎您，<shiro:principal property="userName"/> ！<shiro:principal property="salt"/> ！<shiro:principal property="password"/> ！
</div>
<div data-options="region:'west',iconCls:'icon-more',split:true,title:'Navigation'"
     style="width: 240px; padding: 0px;">
    <div id="Tabs" class="easyui-tabs"
         data-options="fit:true,border:false,plain:true"
         style="background-color: #CEDEF2">
        <div id="tab01" title="tab01" data-options="title:'Menu List',tools:'#menu-tools01'"
             style="padding: 1px;cursor:pointer">
            <div class="easyui-accordion" data-options="fit:true,border:false">
                <iframe id="ifrSysLeft01" name="ifrSysLeft01"
                        src="<%=basePath %>sysFrame/leftMenu.action" width="100%" height="100%"
                        frameborder="0"></iframe>
            </div>
        </div>
        <div id="tab02" title="tab02" data-options="title:'Current Option',tools:'#menu-tools02'"
             style="padding: 1px;cursor:pointer">
            <div class="easyui-accordion" data-options="fit:true,border:false">
                <iframe id="ifrSysLeft02" name="ifrSysLeft02"
                        src="<%=basePath %>sysFrame/leftMenu.action" width="100%" height="100%"
                        frameborder="0"></iframe>
            </div>
        </div>
    </div>
    <div id="menu-tools01">
        <a href="javascript:void(0)" class="icon-mini-refresh"
           onclick="javascript:ifrSysLeft01.window.location.reload();"></a>
    </div>
    <div id="menu-tools02">
        <a href="javascript:void(0)" class="icon-mini-refresh"
           onclick="javascript:ifrSysLeft02.window.location.reload();"></a>
    </div>
</div>
<div data-options="region:'center',iconCls:'icon-tip',title:''">
    <div id="workbench" name="workbench" class="easyui-tabs" data-options="tools:'#tab-tools'"
         style="width: 100%;height: 100%">
        <div id="mainShow" name="myDesk" title="main Show">
            <iframe id="ifrSysMain" name="ifrSysMain"
                    src="<%=basePath %>sysFrame/mainShow.action" width="100%" height="100%" frameborder="0"></iframe>
        </div>
    </div>
    <div id="tab-tools">
        <a href="javascript:void(0)" title="關閉所有頁簽.." class="easyui-linkbutton"
           data-options="plain:true,iconCls:'icon-tab_close'"
           onclick="closeAllTabs()"></a>
    </div>
</div>
<div data-options="region:'south',border:false"
     style="height: 22px; padding: 1px; text-align: center; vertical-align: middle;">Copy Right @ 2015~2019
</div>
</body>
</html>
<script type="text/javascript">
    //关闭所有的tab
    function closeAllTabs() {
        var list = new Array();
        var tabs = $('#workbench').tabs('tabs');
        var len = tabs.length;
        if (len > 0) {
            for (var j = 0; j < len; j++) {
                var tabId = tabs[j].panel('options').id;
                list.push(tabId);
            }
            for (var i = 0; i < list.length; i++) {
                $('#workbench').tabs('close', list[i]);
            }
        }
    }
</script>

