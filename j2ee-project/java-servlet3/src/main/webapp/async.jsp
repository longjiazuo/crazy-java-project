<%@ page contentType="text/html; charset=GBK" language="java"
	session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<ul>
	<c:forEach items="${books}" var="book">
		<li>${book}</li>
	</c:forEach>
</ul>
<%
	out.println("ҵ����ý�����ʱ�䣺" + new java.util.Date());
	//����첽����
	//request.getAsyncContext().complete();
%>
