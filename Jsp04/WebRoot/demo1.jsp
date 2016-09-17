<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html>
	<head>
		<meta charset="utf-8"/>
		<title>demo</title>
	</head>
	<body>

		<h1>JSTL</h1>
		<!-- 
			1.if 
				test属性中通过EL写一个条件；
				==在EL底层实现时是用equals实现的。
		-->
		<p>
			<c:if test="${user.sex=='male'}">男</c:if>
			<c:if test="${user.sex=='female'}">女</c:if>
		</p>
		<!-- 
			2.choose
		-->
		<p>
			<c:choose>
				<c:when test="${user.sex=='male'}">
					男
				</c:when>
				<c:otherwise>女</c:otherwise>
			</c:choose>
		</p> 
		<!-- 
			3.forEach
				items属性中声明要遍历的数据；
				var属性用来声明每次循环对应数据的名称；
				标签内通过EL来输出数据；
				varStatus属性用来获取一个变量，该
				变量可以获取到循环的次数等信息。
		-->
		<p>
			<c:forEach items="${user.loves}" 
				var="v" varStatus="s">
				${v }, ${s.index } <br/>
			</c:forEach>
		</p>
		
		<hr/>
	
		<h1>EL</h1>
		<!-- 
			1.EL可以直接使用。
			2.request已经绑定了要访问的数据(user)。
			3.EL访问的是该对象的Bean属性。
		-->
		<!-- 
			1.获取Bean属性 
				name是Bean的属性，不是对象的属性。
		-->
		<p>${user.name }</p>
		<p>${user["password"] }</p>
		<p>${user.course.name }</p>
		<!-- 
			2.获取到Bean属性后，可以直接做运算
		-->
		<p>${user.course.days+10 }</p>
		<p>${user.course.days>10 && user.course.days<50 }</p>
		<!-- 可以判断数据是否为null -->
		<p>${empty user }</p>
		<p>${user==null }</p>
		<!-- 
			EL默认会按照顺序，依次从4个隐含对象中取值：
			  1）page
			 *2）request
			 *3）session
			  4）application
			也可以指定取值的范围：
			  xxxScope，如sessionScope.user.name
		-->
		<p>${requestScope.user.name }</p>
		<!-- 
			3.获取请求参数
			  param.salary == 
			  	request.getParameter("salary")
		-->
		<p>${param.salary }</p>
	</body>
</html>







