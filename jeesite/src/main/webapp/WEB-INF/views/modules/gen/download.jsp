<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<title>下载</title>
	<meta name="decorator" content="default"/>
	<script type='text/javascript' src="js/jquery/jquery-1.11.0.min.js"></script>
	<script type='text/javascript' src="js/jquery/jquery-migrate-1.2.1.min.js"></script>
	<script type="text/javascript" src="js/jquery/jquery.cookie.js"></script>
	<script language="javascript">
		function doDownload(){
			$("#downloadForm").submit();
		}
	</script>
</head>
<body>
	<table>
		<tr>
			<td><input type="button" value="开始下载" onclick="doDownload()" class="btn btn-primary"></td>
		</tr>
	</table><br>
	<form:form id="downloadForm" action="http://10.50.8.1:7001/SGECM/ce/uniteDataManage!crossDomainDownload" method="POST" 
	enctype="multipart/form-data" target="upload" >  
		docId:<input type="text" name="docId" id="docId" size="50" value="${cid}" style="width:500px;"/> <br/>
		<input type="text" name="sessionId" value="${sid}" style="width:500px;"/> <br/>
        <!-- <input type="button" value="开始下载" onclick="doDownload()"/> -->
	</form:form>
	<iframe id="uploadFrame" name="upload" style="display:none"></iframe>  
</body>
</html>