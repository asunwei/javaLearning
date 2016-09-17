<%@page pageEncoding="utf-8"%>
<%-- JSP声明：不建议使用，最好将方法声明
	在某类中，然后在此页面中调用，以最大限度
	的减少JSP中的Java代码，便于维护。 --%>
<%!public int dbl(int n) {
		return 2 * n;
	}%>
<%-- HTML/CSS/JS可以直接写 --%>
<!doctype html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>JSP的使用</title>
	</head>
	<body>
		<ul>
			<%-- 循环输出10个li，其内容为1-10 --%>
			<%-- JSP小脚本 --%>
			<%
				for (int i = 1; i <= 10; i++) {
			%>

			<%-- JSP表达式 --%>
			<li><%=dbl(i)%></li>

			<%-- JSP小脚本 --%>
			<%
				}
			%>
		</ul>
	</body>
</html>




