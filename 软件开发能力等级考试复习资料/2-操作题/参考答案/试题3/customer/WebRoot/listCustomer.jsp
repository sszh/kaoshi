<%@ page language="java" import="java.util.*" import="com.customer.*" pageEncoding="gbk"%>

<html>
  <body>
    <table border="1">
    	<thead>
    		<th>�ͻ����</th>
    		<th>�ͻ�����</th>
    		<th>��ϵ�绰</th>
    		<th>��������</th>
    		<th>����ʱ��</th>
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
