<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>��¼ҳ��</title>
	<meta name="website" content="http://blog.longjiazuo.com/" />
</head>
<body>
<h2>��¼ҳ��</h2>
<%
if(request.getAttribute("tip") != null)
{
	out.println("<font color='red'>" 
		+ request.getAttribute("tip")
		+ "</font>");
}
%>
<form method="post" action="proLogin.jsp">
�û���:<input type="text" name="name"/><br/>
<input type="submit" value="��¼"/>
</form>
</body>
</html>