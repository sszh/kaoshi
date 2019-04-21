<%@ page language="java" import="java.util.*" import="com.customer.*" pageEncoding="gbk"%>

<html>
  <body>
    <table border="1">
    	<thead>
    		<th>客户编号</th>
    		<th>客户名称</th>
    		<th>联系电话</th>
    		<th>电子邮箱</th>
    		<th>创建时间</th>
    	</thead>
    	<% List<Customer> list=(List)session.getAttribute("list");
    	   for (Customer c : list) {
    	%>   
    	<tr>
    	<td><%=c.getId() %></td>
    	<td><%=c.getName() %></td>
    	<td><%=c.getTelephone() %></td>
    	<td><%=c.getEmail() %></td>
    	<td><%=c.getCdate() %></td>
    	</tr>
    	<% } %>
    </table>
  </body>
</html>
