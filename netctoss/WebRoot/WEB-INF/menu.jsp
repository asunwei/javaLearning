<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!-- 
set标签可以将某数据声明为变量，并存入
page/request/session/application中
 -->
<c:set value="${pageContext.request.contextPath}" var="ctx" scope="request"></c:set>
<c:set value="${pageContext.request.servletPath}" var="path" scope="request"></c:set>
<ul id="menu">
<!-- 
  request.getContextPath()返回项目部署名：
  EL可以获取pageContext
-->

	  <li><a href="${pageContext.request.contextPath}/toIndex.do" class="index_${fn:contains(pageContext.request.servletPath, 'index')?'on':'off'}"></a></li>
	  <li><a href="role/role_list.html" class="role_off"></a></li>
	  <li><a href="admin/admin_list.html" class="admin_off"></a></li>
	  <li><a href="${pageContext.request.contextPath}/findCost.do" class="fee_${fn:contains(pageContext.request.servletPath, 'cost')?'on':'off'}"></a></li>
	  <li><a href="account/account_list.html" class="account_off"></a></li>
	  <li><a href="service/service_list.html" class="service_off"></a></li>
	  <li><a href="bill/bill_list.html" class="bill_off"></a></li>
	  <li><a href="report/report_list.html" class="report_off"></a></li>
	  <li><a href="user/user_info.html" class="information_off"></a></li>
	  <li><a href="user/user_modi_pwd.html" class="password_off"></a></li>
</ul>