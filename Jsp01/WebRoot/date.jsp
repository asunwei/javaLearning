<%-- 1.先写指令 --%>
<%--
	1)pageEncoding
		设置当前JSP的编码。
	2)contentType
		设置它所生成的HTML的格式，默认为HTML。
	3)import
		引入包
--%>
<%@page pageEncoding="utf-8"
	contentType="text/html;charset=utf-8"
	import="java.util.*,java.text.*"%>
<%-- 2.再写HTML --%>
<div style="border:1px solid red;width:150px;font-size:30px;">
	<%
		//创建系统时间
		Date now = new Date();
		//格式化该时间
		SimpleDateFormat fmt = 
			new SimpleDateFormat("yyyy/MM/dd");
		String date = fmt.format(now);
	%>
	<%=date %>
</div>
	
	
	
	
	
	


	