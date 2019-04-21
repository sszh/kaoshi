<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	请输入产品ID：<br/>
	<form action="search.html" method="post">
		<input type="text" name="id"><input type="submit" value="查询" />
	</form><br>
	产品名称: ${pdt.name} <br>
	产品单价: ${pdt.price} 
</body>
</html>