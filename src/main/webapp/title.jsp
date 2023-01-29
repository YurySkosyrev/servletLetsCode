<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<%
  String pageNameParam = request.getParameter("pageName");
  request.setAttribute("pageNameVar", pageNameParam);
%>
<h1>Main page</h1>

<h3>This is subpart of <i>${pageNameVar}</i></h3>
</body>
</html>
