<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>合同流水号生成管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/cont_num/tContractNum/">合同流水号生成列表</a></li>
		<shiro:hasPermission name="cont_num:tContractNum:edit"><li><a href="${ctx}/cont_num/tContractNum/form">合同流水号生成添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="tContractNum" action="${ctx}/cont_num/tContractNum/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>更新日期</th>
				<th>备注</th>
				<shiro:hasPermission name="cont_num:tContractNum:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="tContractNum">
			<tr>
				<td><a href="${ctx}/cont_num/tContractNum/form?id=${tContractNum.id}">
					<fmt:formatDate value="${tContractNum.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</a></td>
				<td>
					${tContractNum.remarks}
				</td>
				<shiro:hasPermission name="cont_num:tContractNum:edit"><td>
    				<a href="${ctx}/cont_num/tContractNum/form?id=${tContractNum.id}">修改</a>
					<a href="${ctx}/cont_num/tContractNum/delete?id=${tContractNum.id}" onclick="return confirmx('确认要删除该合同流水号生成吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>