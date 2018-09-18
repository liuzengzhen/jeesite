<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>附件上传</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function (){
			$("#save").click(function (){
				$("#inputForm").submit();
			});
		});
		
		function recordSkip(){
	
			//var  contractnum=document.getElementById("contractnum").value;
		
 			var  contractnum=$("#contractnum").val();
			document.location.href="${ctx}/contract1/tContractItemRecord/skipRecord?contractnum="+contractnum;
			//document.location.href="${ctx}/gen/enclosure/getEnclosure?
		}
		
		function upload(val){
			if(val=="a"){
				var code = document.getElementById("code").value;
				document.location.href = "${ctx}/gen/enclosure/get?code="+code;
			}else if(val=="b"){
				var id = document.getElementsByName("id");
				for(var i=0; i<id.length; i++){
					if(id[i].checked==true){
						var s = id[i].value;
						if(s != ""){
							document.location.href="${ctx}/gen/enclosure/getEnclosure?s="+s;
						}else{
							alert("请选择修改资料");
						}
					}
				}
			}else if(val=="c"){
				/* s1 = $("input:checkbox[name='id']:checked").map(function(index,elem) {
		            return $(elem).val();
		        }).get().join(',');
		        alert("选中的checkbox的值为："+s1);
		        document.location.href="${ctx}/gen/enclosure/download?s1="+s1; */
				var id = document.getElementsByName("id");
				for(var i=0; i<id.length; i++){
					if(id[i].checked==true){
						var s = id[i].value;
						if(null == s || "" == s){
							alert("请选择下载文件");
						}else{
							$.ajax({
								url:"${ctx}/gen/enclosure/download",
								type:"post",
								data:{"s":s},
								success:function(data){
									if(null!=data){
										var sessionId = data.sessionId;
										//console.log(sessionId);
										var cid = data.cid;
										$("#sessionId").val(sessionId);
										$("#docId").val(cid);
										$("#downloadForm").submit();
									}else{
										alert("下传失败!");
									}
								}
							});
						}
					}
				} 
			}else if(val=="d"){
				var id = document.getElementsByName("id");
				for(var i=0; i<id.length; i++){
					if(id[i].checked==true){
						var s = id[i].value;
						if(s != ""){
							document.location.href="${ctx}/gen/enclosure/delete?s="+s;
						}else{
							alert("请选择需要删除的资料");
						}
					}
				}
			}
		}
		
		$(function(){
		    $("#selectAll").click(function(){
			    if($("#selectAll").attr("checked") == "checked"){
			        $("input[name='id']").attr("checked","checked");
			    }else{
			        $("input[name='id']").removeAttr("checked","checked");
			    }
			});
		});
	</script>
</head>
<body>
	<table>
		<tr>
			<td>
				<input id="save" type="button" value="保存" class="btn btn-primary">
			</td>
			<td>
				<input type="button" value="修改" class="btn btn-primary">
			</td>
			<td>
				<input type="button" onclick="show();" value="提交" class="btn btn-primary">
			</td>
			<td>
				<input type="button" value="一般变更" class="btn btn-primary">
			</td>
				<td>
				<input type="button" value="合同中止" class="btn btn-primary">
			</td>	
			<td>
				<input type="button" value="合同恢复" class="btn btn-primary">
			</td>	
			<td>
				<input type="button" value="合同终止" class="btn btn-primary">
			</td>
			<td>
				<input type="button" value="事项记录" class="btn btn-primary" onclick="recordSkip();">
			</td>
			<td>
				 <sys:treeselect1 id="sc" name="sc.id" value="sc" labelName="sv.name" labelValue=""
					title="附件上传" url="/gen/enclosure/get" cssClass="required" />
			</td>
			<td>
				<sys:treeselect2 id="ss" name="ss.id" value="ss" labelName="sb.name" labelValue=""
					title="附件更新" url="/gen/enclosure/getEnclosure" cssClass="required" />
			</td>
			<td>
				<input type="button" onclick="upload('c');" value="附件下载" class="btn btn-primary">
			</td>
			<td>
				<input type="button" onclick="upload('d');" value="附件删除" class="btn btn-primary">
			</td>
			<td>
				<input type="button" value="刷新" class="btn btn-primary">
			</td>
			<td>
				<input type="button" value="打印" class="btn btn-primary">
			</td>
		</tr>
	</table><br>
	<form:form id="inputForm" action="${ctx}/gen/enclosure/save"  method="post" class="breadcrumb form-search">
	<sys:message content="${message}"/>
	<table>
		<tr>
			<td>
				<table>
					<tr>
						<td>
							<table>
								<tr>
									<td>合同编号</td>
									<td><input type="text" value="CM_22_2017_000124" name="code" id="contractnum"></td>
									<td>自定义编号</td>
									<td><input type="text" value=""></td>
									<td>合同名称</td>
									<td><input type="text" value="${contractName}" name="contractName" id="contractName"></td>
								</tr>
							</table>	
						</td>
					</tr>
					<tr>
						<td>
							<table>
								<tr>
									<td>项目编号</td>
									<td><input type="text" value="${projectName}" name="projectName" id="projectName"></td>
									<td>合同分类</td>
									<td>
										<select style="width:100px;" id="contractType" name="contractType">
											<option value="${contractType}">${contractType}</option>
											<option value="采购类">采购类</option>
											<option value="销售类">销售类</option>
											<option value="融资类">融资类</option>
											<option value="待审阅">待审阅</option>
										</select>
									</td>
									<td>合同类型</td>
									<td>
										<select style="width:100px;" id="contractSort" name="contractSort">
											<option value="${contractSort}">${contractSort}</option>
											<option value="普通合同">普通合同</option>
											<option value="框架合同">框架合同</option>
											<option value="PCR">PCR</option>
										</select>
									</td>
									<td>合同状态</td>
									<td>
										<select style="width:100px;" id="contractLevel" name="contractLevel">
											<option value="${contractLevel}">${contractLevel}</option>
											<option value="新建">新建</option>
											<option value="草稿">草稿</option>
											<option value="待审阅">待审阅</option>
											<option value="待修正">待修正</option>
											<option value="已批准">已批准</option>
											<option value="已盖章">已盖章</option>
											<option value="已受理">已受理</option>
											<option value="生效">生效</option>
											<option value="暂停">暂停</option>
											<option value="终止">终止</option>
											<option value="完成">完成</option>
											<option value="归档">归档</option>
										</select>
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td>
							<table>
								<tr>
									<td>来源方式</td>
									<td>
										<select style="width:120px;" id="contractSource" name="contractSource" >
											<option value="${contractSource}">${contractSource}</option>
											<option value="公开投招标">公开投招标</option>
											<option value="邀请招标">邀请招标</option>
											<option value="竞争性谈判">竞争性谈判</option>
											<option value="单一来源采购">单一来源采购</option>
											<option value="其他">其他</option>
										</select>
									</td>		
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<br><br><br>
	<table>
		<tr>
			<td>
				<br>
				<table class="table table-striped table-bordered table-condensed">
					<tr>
						<td>
							<thead>
								<tr>
									<td height="30px" align="center">
										<input type="checkbox" id="selectAll" />
									</td>
									<td height="30px">附件分类</td>
									<td height="30px">附件名称</td>
									<td height="30px">关联合同编号</td>
									<td height="30px">上传时间</td>
									<td height="30px">附件文件名</td>
									<td height="30px">附件说明</td>
									<td height="30px">版本信息</td>
								</tr>
							</thead>
							<tbody>
									<c:forEach items="${list}" var="list">
									<tr>
										<td><input type="checkbox" value="${list.id}" name="id" id="id"></td>
										<td>${list.fileSort}</td>
										<td>${list.name}</td>
										<td>${list.crtContractId}</td>
										<td>${list.uploadDate}</td>
										<td><input type="text" value="${list.fileName}" name="filename" id="filename" readonly="true"></td>
										<td>${list.fileNote}</td>
										<td>${list.fileVersion}</td>
									</tr>
									</c:forEach>
									<tr>
										<td><input type="checkbox" value="" name="id"></td>
										<td width="130px"></td>
										<td width="130px"></td>
										<td width="130px"></td>
										<td width="130px"></td>
										<td width="130px"></td>
										<td width="130px"></td>
										<td width="130px"></td>
									</tr>
							</tbody>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	</form:form>
	<form:form id="downloadForm" action="http://10.50.8.1:7001/SGECM/ce/uniteDataManage!crossDomainDownload" method="POST" 
	enctype="multipart/form-data" target="upload" >  
		<input type="hidden" name="docId" id="docId" size="50" style="width:500px;"/> <br/>
		<input type="hidden" name="sessionId" id="sessionId" style="width:500px;"/> <br/>
        <!-- <input type="button" value="开始下载" onclick="doDownload()"/> -->
	</form:form>
	<iframe id="uploadFrame" name="upload" style="display:none"></iframe>  
</body>
</html>