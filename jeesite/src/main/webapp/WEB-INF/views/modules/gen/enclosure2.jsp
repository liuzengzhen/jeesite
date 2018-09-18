<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<title>事件记录单</title>
<meta name="decorator" content="default" />
<script type="text/javascript">
	$(document).ready(
					function() {
						//通过 提交日期锁 编辑 
						var commitDate = $("#commitDate").val();
						if (commitDate != null || commitDate.length != 0) {
							$("#recordName").attr("readonly", "readonly");
							$("#recordExplain").attr("readonly", "readonly");
						}
						if (commitDate == null || commitDate.length == 0) {
							$("#recordName").removeAttr("readonly");
							$("#recordExplain").removeAttr("readonly");
						}

						$("#save").click(function() {
							//通过提交日期判断 是否已提交 
							var commitDate = $("#commitDate").val();
							if (commitDate == null || commitDate.length == 0) {
								$("#inputForm").submit();

							} else {
								console.log("已经提交，无法修改！");
								return;
							}
						});
						$("#update").click(function() {
							var commitDate = $("#commitDate").val();							  
							 var recordName=$("#recordName").val();
							 var recordExplain=$("#recordExplain").val();
							//判断是否保存，如不保存 请先提交
								var recordNum = $("#recordNum").val();
								if (recordNum == null|| recordNum.length == 0) {
									console.log("请先保存后修改 ！");
									return;

								}
							if (commitDate == null || commitDate.length == 0) {
								var ContractNum = $("#contractNum").val();
document.location.href = "${ctx}/contract1/tContractItemRecord/update?ContractNum="+ ContractNum+"&recordName="+recordName+"&recordExplain="+recordExplain;
										
										
								

							}
							
						   else {
								console.log("已经提交事件单，无法修改！");
								return;
							}
						});
						$("#submit").click(
										function() {
											//判断是否保存，如不保存 请先提交
											var recordNum = $("#recordNum").val();
											if (recordNum == null|| recordNum.length == 0) {
												console.log("请先保存后提交 ！");
												return;

											}
											//判断是否已经提交过
											 var commitDate= $("#commitDate").val();
											if(commitDate.length!=0){
												console.log("已经提交 ，请勿重复提交  ！");
												return;
											}
										   
											
											
											
											var ContractNum = $("#contractNum").val();
											document.location.href = "${ctx}/contract1/tContractItemRecord/submit?ContractNum="+ ContractNum;
										});
						$("#delete").click(
										function() {
											var ContractNum = $("#contractNum")
													.val();
											document.location.href = "${ctx}/contract1/tContractItemRecord/delete?ContractNum="
													+ ContractNum;
										});

					});
</script>
</head>
<body>
	<table>
		<tr>
			<td><input id="save" type="button" value="保存"
				class="btn btn-primary"></td>
			<td><input type="button" value="修改" class="btn btn-primary"
				id="update"></td>
			<td><input type="button" value="提交" id="submit"
				class="btn btn-primary"></td>
			<td><input type="button" value="上传附件" class="btn btn-primary">
			</td>
			<td><input type="button" value="删除" class="btn btn-primary"
				id="delete"></td>

		</tr>
	</table>
	<br>
	<form:form id="inputForm"
		action="${ctx}/contract1/tContractItemRecord/save"
		modelAttribute="TContractItemRecord" method="post"
		class="breadcrumb form-search">
		<sys:message content="${message}" />
		<table>
			<tr>
				<td>
					<table>
						<tr>
							<td>
								<table>
									<tr>
										<td>制单日期</td>
										<td><input type="text"										
											value="<fmt:formatDate value='${TContractItemRecord.makeDate}' type='date' pattern="yyyy-MM-dd"/>" name="makeDate"
											id="makeDate" readonly="makeDate"></td>

										<td>提交日期</td>
										<td><input type="text"
	                 value="<fmt:formatDate value='${TContractItemRecord.commitDate}' type='date' pattern="yyyy-MM-dd"/>" 
	                                      									
											readonly="readonly"
											name="commitDate" id="commitDate"></td>
										<td>合同编号</td>
										<td><input type="text"
											value="${contractBasic.contractNum}" name="contractNum"
											id="contractNum" readonly="readonly"></td>
									</tr>
									<tr>
										<td>记录单编号</td>
										<td><input type="text"
											value="${TContractItemRecord.recordNum}" name="recordNum"
											id="recordNum" readonly="readonly"></td>
										<td>记录单名称</td>
										<td colspan="3"><c:if
												test="${not empty TContractItemRecord.recordName}">
												<input type="text" value="${TContractItemRecord.recordName}"
													name="recordName" id="recordName">
											</c:if> <c:if test="${ empty TContractItemRecord.recordName}">
												<input type="text" value="${recordName}" id="recordName">
											</c:if></td>


									</tr>
									<tr>
										<td>自定义编号</td>
										<td><input type="text"
											value="${contractBasic.contractCusNum}" name="contractCusNum"
											id="contractCusNum" readonly="readonly"></td>
										<td>合同名称</td>
										<td colspan="3"><input type="text"
											value="${contractBasic.contractName}" name="contractName"
											readonly="readonly"></td>

									</tr>
									<tr>
										<td>执行人</td>
										<td><input type="text"
											value="${contractOperator.operatorName}" name="operatorName"
											id="operatorName" readonly="readonly"></td>
										<td>执行人联系电话</td>
										<td><input type="text"
											value="${contractOperator.operatorPhone}"
											name="operatorPhone" readonly="readonly"></td>
										<td>执行部门</td>
										<td><input type="text"
											value="${contractOperator.operateDept}" name="operateDept"
											id="operateDept" readonly="readonly"></td>
									</tr>
									<tr>
										<td>制单人</td>
										<td><input type="text" value="${user.name}"
											name="recordPName" id="recordPName" readonly="readonly"></td>
										<td>制单部门</td>
										<td><input type="text" value="${user.office}"
											readonly="readonly" name="recordPDept"></td>
										<td>记录单状态</td>
										<td><select style="width: 100px;" id="status"
											name="status">
												<c:if test="${TContractItemRecord.status==0}">
													<option value="0">${recordState}</option>
												</c:if>


												<c:choose>
													<c:when test="${TContractItemRecord.status==1}">
														<option value="1">已提交</option>
													</c:when>
													<c:otherwise>
														<option value="0">${recordState}</option>
													</c:otherwise>
												</c:choose>


										</select></td>
									</tr>
									<tr>
										<td>事项说明</td>
										<td colspan="4"><textarea name="recordExplain"
												id="recordExplain" style="width: 524px; height: 207px;">${TContractItemRecord.recordExplain}</textarea></td>

									</tr>

								</table>
							</td>
						</tr>
						<!-- 					<tr> -->
						<!-- 						<td> -->
						<!-- 							<table> -->
						<!-- 								<tr> -->
						<!-- 									<td>项目编号</td> -->
						<%-- 									<td><input type="text" value="${projectName}" name="projectName" id="projectName"></td> --%>
						<!-- 									<td>合同分类</td> -->
						<!-- 									<td> -->
						<!-- 										<select style="width:100px;" id="contractType" name="contractType"> -->
						<%-- 											<option value="${contractType}">${contractType}</option> --%>
						<!-- 											<option value="采购类">采购类</option> -->
						<!-- 											<option value="销售类">销售类</option> -->
						<!-- 											<option value="融资类">融资类</option> -->
						<!-- 											<option value="待审阅">待审阅</option> -->
						<!-- 										</select> -->
						<!-- 									</td> -->
						<!-- 									<td>合同类型</td> -->
						<!-- 									<td> -->
						<!-- 										<select style="width:100px;" id="contractSort" name="contractSort"> -->
						<%-- 											<option value="${contractSort}">${contractSort}</option> --%>
						<!-- 											<option value="普通合同">普通合同</option> -->
						<!-- 											<option value="框架合同">框架合同</option> -->
						<!-- 											<option value="PCR">PCR</option> -->
						<!-- 										</select> -->
						<!-- 									</td> -->
						<!-- 									<td>合同状态</td> -->
						<!-- 									<td> -->
						<!-- 										<select style="width:100px;" id="contractLevel" name="contractLevel"> -->
						<%-- 											<option value="${contractLevel}">${contractLevel}</option> --%>
						<!-- 											<option value="新建">新建</option> -->
						<!-- 											<option value="草稿">草稿</option> -->
						<!-- 											<option value="待审阅">待审阅</option> -->
						<!-- 											<option value="待修正">待修正</option> -->
						<!-- 											<option value="已批准">已批准</option> -->
						<!-- 											<option value="已盖章">已盖章</option> -->
						<!-- 											<option value="已受理">已受理</option> -->
						<!-- 											<option value="生效">生效</option> -->
						<!-- 											<option value="暂停">暂停</option> -->
						<!-- 											<option value="终止">终止</option> -->
						<!-- 											<option value="完成">完成</option> -->
						<!-- 											<option value="归档">归档</option> -->
						<!-- 										</select> -->
						<!-- 									</td> -->
						<!-- 								</tr> -->
						<!-- 							</table> -->
						<!-- 						</td> -->
						<!-- 					</tr> -->
						<!-- 					<tr> -->
						<!-- 						<td> -->
						<!-- 							<table> -->
						<!-- 								<tr> -->
						<!-- 									<td>来源方式</td> -->
						<!-- 									<td> -->
						<!-- 										<select style="width:120px;" id="contractSource" name="contractSource" > -->
						<%-- 											<option value="${contractSource}">${contractSource}</option> --%>
						<!-- 											<option value="公开投招标">公开投招标</option> -->
						<!-- 											<option value="邀请招标">邀请招标</option> -->
						<!-- 											<option value="竞争性谈判">竞争性谈判</option> -->
						<!-- 											<option value="单一来源采购">单一来源采购</option> -->
						<!-- 											<option value="其他">其他</option> -->
						<!-- 										</select> -->
						<!-- 									</td>		 -->
						<!-- 								</tr> -->
						<!-- 							</table> -->
						<!-- 						</td> -->
						<!-- 					</tr> -->
					</table>
				</td>
			</tr>
		</table>
		<br>
		<br>
		<br>
		<table>
			<tr>
				<td><br>
					<table class="table table-striped table-bordered table-condensed">
						<tr>
							<td>
						<thead>
							<tr>
								<td height="30px" align="center"><input type="checkbox"
									id="selectAll" /></td>
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
									<td><input type="checkbox" value="${list.id}" name="id"
										id="id"></td>
									<td>${list.fileSort}</td>
									<td>${list.name}</td>
									<td>${list.crtContractId}</td>
									<td>${list.uploadDate}</td>
									<td><input type="text" value="${list.fileName}"
										name="filename" id="filename" readonly="true"></td>
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
					</table></td>
			</tr>
		</table>
	</form:form>
	<form:form id="downloadForm"
		action="http://10.50.8.1:7001/SGECM/ce/uniteDataManage!crossDomainDownload"
		method="POST" enctype="multipart/form-data" target="upload">
		<input type="hidden" name="docId" id="docId" size="50"
			style="width: 500px;" />
		<br />
		<input type="hidden" name="sessionId" id="sessionId"
			style="width: 500px;" />
		<br />
		<!-- <input type="button" value="开始下载" onclick="doDownload()"/> -->
	</form:form>
	<iframe id="uploadFrame" name="upload" style="display: none"></iframe>
</body>
</html>