<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>合同管理</title>
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
		<li class="active"><a href="${ctx}/cont/contract/${contract.self?'self':''}">合同列表</a></li>
		<c:if test="${!contract.self}"><shiro:hasPermission name="cont:contract:edit"><li><a href="${ctx}/cont/contract/form">合同起草</a></li></shiro:hasPermission></c:if>
	</ul>
	<form:form id="searchForm" modelAttribute="contract" action="${ctx}/cont/contract/${contract.self?'self':''}" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>合同编号：</label>
				<form:input path="contractNum" htmlEscape="false" maxlength="200" class="input-medium"/>
			</li>
			<li><label>合同名称：</label>
				<form:input path="contractName" htmlEscape="false" maxlength="300" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>合同编号</th>
				<th>合同名称</th>
				<th>合同类型</th>
				<th>状态</th>
				<th>更新时间</th>
				<c:if test="${!contract.self}"><shiro:hasPermission name="cont:contract:edit"><th>操作</th></shiro:hasPermission></c:if>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="contract">
			<tr>
				<td><a href="${ctx}/cont/contract/${requestScope.contract.self?'view':'form'}?id=${contract.id}">
					${fns:abbr(contract.contractNum,50)}
				</a></td>
				<td><a href="${ctx}/cont/contract/${requestScope.contract.self?'view':'form'}?id=${contract.id}">
					${fns:abbr(contract.contractName,50)}
				</a></td>
				<td>
					${fns:getDictLabel(contract.type, 'cont_contract_type', '')}
				</td>
				<td>
					${fns:getDictLabel(contract.status, 'cont_contract_status', '')}
				</td>
				<td>
					<fmt:formatDate value="${contract.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<c:if test="${!requestScope.contract.self}"><shiro:hasPermission name="cont:contract:edit"><td>
    				<a href="${ctx}/cont/contract/form?id=${contract.id}">修改</a>
					<a href="${ctx}/cont/contract/delete?id=${contract.id}" onclick="return confirmx('确认要删除该合同吗？', this.href)">删除</a>
				</td></shiro:hasPermission></c:if>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>