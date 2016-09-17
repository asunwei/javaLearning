<%@page pageEncoding="utf-8"%>
<%@page import="java.util.*,entity.*,dao.*"%>	
<!doctype html>
<html>
<head>
<metal charset="utf-8">
<title>员工列表</title>
</head>
<body>
<table border="1px" width="40%" cellspacing="0">
<tr>
<th>编号</th>
<th>姓名</th>
<th>工资</th>
<th>职位</th>
</tr>
<%
  EmpDao dao =new EmpDaoImpl();
  List<Emp> list = dao.findAll();
  for(Emp e:list){
 %>
  <tr>
  <td><%=e.getId()%></td>
  <td><%=e.getName()%></td>
  <td><%=e.getSalary()%></td>
  <td><%=e.getJob()%></td>
  </tr>
<% 
}
%>
</table>
</body>
</html>