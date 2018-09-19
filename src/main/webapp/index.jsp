<%--
  Created by IntelliJ IDEA.
  User: TW
  Date: 2018/8/20
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<div id="editor">
    <img class="size-medium wp-image-96 aligncenter" src="http://host805107773.s495.pppf.com.cn/wp-content/uploads/2018/07/wallhaven-657118-300x188.jpg" alt="" width="300" height="188" />
    <p style="text-align: center;">欢迎光临。</p>
</div>
<button onclick="exportWord()" id="buttonExport">导出word</button>

<script src="js/jquery.min.js" type="text/javascript"></script>
<script src="js/fileSaver.js" type="text/javascript" ></script>
<script src="js/jquery.wordexport.js" type="text/javascript"></script>
<script type="text/javascript">
    // 导出doc
    function exportWord() {
        console.info("导出文件开始");
        $("#buttonExport").hide();
        $("#editor").wordExport();
        $("#buttonExport").show();
        console.info("导出完成");
    }

</script>
</body>
</html>