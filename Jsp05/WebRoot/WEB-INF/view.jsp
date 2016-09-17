<%@page pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8"/>
<title>View</title>
</head>
<body>
<!-- 
EL中内置的cookie，用来读取cookie的工具
cookie.user是利用工具获取名为user的cookie
cookie.user.value获取该cookie对象的值
 -->
<p>用户：${cookie.user.value }</p>
<p>城市：${cookie.city.value }</p>
<p>公司：${cookie.company.value }</p>
</body>
</html>