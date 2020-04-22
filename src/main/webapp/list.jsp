<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<table border="1">
		<tr>
			<td colspan="10">
				<form action="list" method="post">
					<select name = "cid" id = "cid">
						<option>请选择</option>
					</select>
					<select name = "status">
						<option value="">请选择</option>
						<option value="1">已拥有</option>
						<option value="0">未拥有</option>
					</select>
					
					价格区间:<input type="text" name = "beginPrice">
							<input type="text" name = "endPrice">
							<input type="submit" value="查询">	
				</form>
				<a href="add.jsp"><button>新增</button></a>
			</td>
		</tr>
		<tr>
			<th>ID</th>
			<th>英雄</th>
			<th>价格</th>
			<th>上线时间</th>
			<th>转态</th>
			<th>阵营</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${plist.list}" var = "h">
			<tr>
				<td>${h.hid }</td>
				<td>${h.hname }</td>
				<td>${h.price }</td>
				<td>${h.uptime }</td>
				<td>${h.status==0?"未拥有":"已拥有" }</td>
				<td>${h.cname }</td>
				<td>
					<a href="update.jsp?hid=${h.hid}">购买</a>
					<a href="one?hid=${h.hid}">详情</a>
				</td>
			</tr>
		</c:forEach>
		
		<tr>
			<td colspan="10">
				<a href="list?pageNum=${plist.firstPage}">首页</a>
				<a href="list?pageNum=${plist.prePage}">上一页</a>
				<a href="list?pageNum=${plist.nextPage}">下一页</a>
				<a href="list?pageNum=${plist.lastPage}">末页</a>
				
				当前为${plist.pageNum}/${plist.pages}页
			</td>
		</tr>
	</table>
	
	<script type="text/javascript">
		//查询所有的阵营
		$.post("queryCamp",function(num){
			for(var i in num) {
				$("#cid").append("<option value = '"+num[i].cid+"'>"+num[i].cname+"</option>")
			}
		},"json")
	</script>
</body>
</html>