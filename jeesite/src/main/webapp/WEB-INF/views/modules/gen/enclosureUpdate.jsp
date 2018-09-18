<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>附件更新</title>
	<meta name="decorator" content="default"/>
	<script type='text/javascript' src="js/jquery/jquery-1.11.0.min.js"></script>
	<script type='text/javascript' src="js/jquery/jquery-migrate-1.2.1.min.js"></script>
	<script type="text/javascript" src="js/jquery/jquery.cookie.js"></script>
	<script language="javascript">
		$(document).ready(function (){
			$("#save").click(function (){
				var v = $('#uploadFile').val();
				$("#upfi").attr("value",v);
				$("#inputForm").submit();
			});
		});
		function getFileName(o){
		    var pos=o.lastIndexOf("\\");
		    return o.substring(pos+1);  
		}
		function getFileHz(o){
			 var p = o.lastIndexOf(".");
			 return o.substring(p+1); 
		}
		function doUpdateUpload(){
			var file = $("#uploadFile").val();
			var fileName = getFileName(file);
			$("#fileName").val(fileName);
			var hz = getFileHz(fileName);
			if("PDF" == hz || "pdf" == hz){
				$("#crossDomainFormupdate").submit();
			}else{
				alert("上传文件必须为pdf格式");
			}
		}
		function getCallBackResult(resultCode,message,docId){
			$("#cid").attr("value",docId);
			var code = document.getElementById("crtContractId").value;
			$.ajax({
				url:"${ctx}/gen/enclosure/upsc",
				type:"post",
				data:{"code":code, "id":docId},
				success:function(data){
					if(null!=data){
						var sessionId = data.sessionId;
						console.log(sessionId);
						$("#sessionId").val(sessionId);
						var nameImage = data.nameImage;
						$("#nameImage").attr("value",nameImage);
					}else{
						alert("上传失败!");
					}
				}
			});
		}
		function getUpdateCallBackResult(resultCode,message,docId){
			//alert(resultCode+":"+message);
			alert(docId);
			$("#cid").attr("value",docId);
			/* var code = document.getElementById("crtContractId").value;
			$.ajax({
				url:"${ctx}/gen/enclosure/upsc",
				type:"post",
				data:{"code":code, "id":docId},
				success:function(data){
					if(null!=data){
						var sessionId = data.sessionId;
						console.log(sessionId);
						$("#sessionId").val(sessionId);
						var nameImage = data.nameImage;
						$("#nameImage").attr("value",nameImage);
					}else{
						alert("上传失败!");
					}
				}
			}); */
		}
	</script>
</head>
<body>
	<table>
		<tr>
			<td><input type="button" value="上传附件更新" onclick="doUpdateUpload()" class="btn btn-primary"></td>
			<td><input id="save" type="button" value="附件更新" class="btn btn-primary"></td>
		</tr>
	</table><br>
	<form:form id="inputForm" modelAttribute="user" action="${ctx}/gen/enclosure/update" method="post" class="form-horizontal">
	<sys:message content="${message}"/>
		<table>
			<tr>
				<td>关联合同编号</td>
				<td colspan="3"><input type="text" name="crtContractId" id="crtContractId" value="${crtContractId}" readonly="true"></td>
				<td><input type="hidden" name="cid" id="cid" value="${fileAuthor}"></td>
				<td><input type="hidden" name="id" id="id" value="${id}"></td>
			</tr>
			<tr>
				<td>所述附件分类</td>
				<td>
					<select id="fileSort" name="fileSort" style="width:120px" onchange="setSecond(this)">
						<option value="${fileSort}">${fileSort}</option>
						<option value="签署依据类">签署依据类</option>
						<option value="正文类">正文类</option>
						<option value="关键页"  disabled="disabled">关键页</option>
						<option value="履约类文件" disabled="disabled">履约类文件</option>
						<option value="其他">其他</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>附件名称</td>
				<td colspan="3"><input type="text" name="name" id="name" value="${name}" readonly="true"></td>
			</tr>
			<tr>
				<td>选择件文</td>
				<td colspan="3"><input type="text" id="nameImage" name="nameImage" value="${nameImage}" readonly="true"></td>
				<td><input type="hidden" id="upfi" name="upfi" ></td>
				<td><input type="hidden" id="fileName" name="fileName" value="${fileName}"></td>
				<%-- <td colspan="2">
					<form:hidden path="photo" htmlEscape="false" maxlength="455" value=""/>
					<sys:ckfinder input="nameImage" type="files" uploadPath="/enclosure" selectMultiple="false" maxWidth="100" maxHeight="100"/>
				</td> --%>
			</tr>
			<tr>
				<td>附件说明</td>
				<td colspan="2"><textarea class="input-xlarge" rows="1" cols="30" id="fileNote" name="fileNote" value="${fileNote}">${fileNote}</textarea></td>
				<!-- <td><input id="save" type="button" value="附件更新"></td> -->
			</tr>
		</table>
	</form:form>
	<form id="crossDomainFormupdate" action="http://10.50.8.1:7001/SGECM/ce/uniteDataManage!updateFormFile" method="POST" enctype="multipart/form-data" target="upload" >  
		<input type="file" name="uploadFile" id="uploadFile"/> 
		<input style="width:500px;" type="hidden" id="sessionId" name="sessionId" value="${sessionId}"/> </br>
		<input style="width:500px;" type="hidden" name="docId" value="${fileAuthor}"/> </br>
        <!-- <input style="width:500px;" type="hidden" name="requestPath" value="http://10.50.8.1:7001/SGECM_Client/execCallBack.html"/> </br> -->
       	<input style="width:500px;" type="hidden" name="requestPath" value="http://localhost:8080${ctxStatic}/fjsc/execCallBack.html"/> </br>
        <input style="width:500px;" type="hidden" name="callBackMethod" value="getUpdateCallBackResult"/> </br>
	</form> 
	<iframe id="uploadFrame" name="upload" style="display:none"></iframe> 
</body>
</html>