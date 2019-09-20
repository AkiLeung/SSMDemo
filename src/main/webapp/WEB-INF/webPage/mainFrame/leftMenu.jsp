<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Title</title>
    <jsp:include page="../include/common.jsp" flush="true"/>
    <script type="text/javascript" src="<%=basePath%>static/ztree/js/jquery-1.4.4.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>static/ztree/js/jquery.ztree.core.js"></script>
    <link rel="stylesheet" href="<%=basePath%>static/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <script type="text/javascript">
        <!--
        //默認設置
        var setting = {
            data: {
                simpleData: {
                    enable: true
                }
            },
            view: {
                showIcon: true
            },
            callback: {
                onClick: openTabToUrl,
            }
        };

        //樹數據
        var zNodes = [
            {id: "root-00", pId: "-1", name: "功能菜單", open: true},

            {id: "node-01", pId: "root-00", name: "基礎功能", isParent: true, open: true},
            {
                id: "node-11",
                pId: "node-01",
                name: "功能操作01",
                isParent: false,
                ifrName: "TestDataList",
                mainPath: "<%=basePath %>sysTest/test01.action"
            },
            {
                id: "node-13",
                pId: "node-01",
                name: "功能操作02",
                isParent: false,
                ifrName: "testFileUpload",
                mainPath: "<%=basePath %>sysTest/test02.action"
            },
            {
                id: "node-14",
                pId: "node-01",
                name: "功能操作03",
                isParent: false,
                ifrName: "TestTheme",
                mainPath: "<%=basePath %>sysTest/test03.action"
            },
            {
                id: "node-15",
                pId: "node-01",
                name: "功能操作04",
                isParent: false,
                ifrName: "testZTree",
                mainPath: "<%=basePath %>sysTest/test04.action"
            },
            {
                id: "node-16",
                pId: "node-01",
                name: "功能操作05",
                isParent: false,
                ifrName: "testSetMQ",
                mainPath: "<%=basePath %>sysTest/test05.action"
            },
            {
                id: "node-17",
                pId: "node-01",
                name: "功能操作06",
                isParent: false,
                ifrName: "testGetMQ",
                mainPath: "<%=basePath %>sysTest/test06.action"
            },
            {
                id: "node-18",
                pId: "node-01",
                name: "功能操作07",
                isParent: false,
                ifrName: "testShiro",
                mainPath: "<%=basePath %>sysTest/test07.action"
            },
            {
                id: "node-19",
                pId: "node-01",
                name: "功能操作08",
                isParent: false,
                ifrName: "testI18n",
                mainPath: "<%=basePath %>sysTest/test08.action"
            },
            {id: "node-02", pId: "root-00", name: "系统管理", isParent: true, open: true},
            {
                id: "node-21",
                pId: "node-02",
                name: "组织架构",
                isParent: false,
                ifrName: "testI18n",
                mainPath: "<%=basePath %>sysConfig/test08.action"
            },
        ];

        //页面切换
        function openTabToUrl(event, treeId, TreeNode, clickFlag) {
            var treeObj = $.fn.zTree.getZTreeObj(treeId);
            if (!TreeNode.isParent) {
                if (TreeNode.mainPath != "" && TreeNode.mainPath != "null") {
                    var url = TreeNode.mainPath;
                    if (url != "") {
                        var tabName = TreeNode.name;
                        var ifrName = TreeNode.ifrName;
                        //判断选项卡是否重复打开
                        if (window.top.$('#workbench').tabs('exists', tabName)) {
                            window.top.$('#workbench').tabs('select', tabName);
                        } else {
                            window.top.$('#workbench').tabs('add', {
                                id: tabName,
                                title: tabName,
                                content: '<iframe id="' + ifrName + '" name="' + ifrName + '" scrolling="no" frameborder="0"  src="' + url + '" style="width:100%;height:100%;"></iframe>',
                                closable: true
                            });
                        }
                    }
                }
            } else {
                treeObj.expandNode(TreeNode);
            }
        }

        //加載配置樹
        $(document).ready(function () {
            $.fn.zTree.init($("#configTree"), setting, zNodes);
        });
        //-->
    </script>
</head>
<body id="bg">
<div class="zTreeDemoBackground left">
    <ul id="configTree" class="ztree"></ul>
</div>
</body>
</html>
