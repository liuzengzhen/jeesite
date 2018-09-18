<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>增删改管理</title>
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
		<li class="active"><a href="${ctx}/contract1/tContractItemRecord/">增删改列表</a></li>
		<shiro:hasPermission name="contract1:tContractItemRecord:edit"><li><a href="${ctx}/contract1/tContractItemRecord/form">增删改添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="tContractItemRecord" action="${ctx}/contract1/tContractItemRecord/" method="post" class="breadcrumb form-search">
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
				<shiro:hasPermission name="contract1:tContractItemRecord:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="tContractItemRecord">
			<tr>
				<td><a href="${ctx}/contract1/tContractItemRecord/form?id=${tContractItemRecord.id}">
					<fmt:formatDate value="${tContractItemRecord.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</a></td>
				<td>
					${tContractItemRecord.remarks}
				</td>
				<shiro:hasPermission name="contract1:tContractItemRecord:edit"><td>
    				<a href="${ctx}/contract1/tContractItemRecord/form?id=${tContractItemRecord.id}">修改</a>
					<a href="${ctx}/contract1/tContractItemRecord/delete?id=${tContractItemRecord.id}" onclick="return confirmx('确认要删除该增删改吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>