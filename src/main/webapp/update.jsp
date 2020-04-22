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
	<form action="update" method="post">
		ID:<input type="text" name = "hid" value = "${param.hid}" readonly="readonly"><br>
		英雄:<input type="text" name = "hname" readonly="readonly"><br>
		价格:<input type="text" name = "price" readonly="readonly"><br>
		阵营:<select name = "cid" id = "cid">
			
			</select><br>
		状态:<select name = "status">
				
				<option value="0">未拥有</option>
				<option value="1">已拥有</option>
			</select><br>
			<input type="submit" value="提交">
	</form>
	
	<script type="text/javascript">
		//查询所有的阵营
		$.post("queryCamp",function(num){
			for(var i in num) {
				$("#cid").append("<option value = '"+num[i].cid+"'>"+num[i].cname+"</option>")
			}
		},"json")
		
		//回显数据
		var hid = ${param.hid};
		$.post("queryOne",{"hid":hid},function(num){
			$("[name=hname]").val(num.hname);
			$("[name=price]").val(num.price);
			
			$("[name=status]").val(num.status);
		},"json")
	</script>
</body>
</html>