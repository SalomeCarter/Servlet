<%@ page import="by.tms.authentication.User" %><%--
  Created by IntelliJ IDEA.
  User: Наташа
  Date: 03.04.2023
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Home</title>
</head>
<body>
<%
  User user = (User) session.getAttribute("user");

  if (user == null) {
    out.print("<h1>Hello Guest!</h1>");
  }

  if (user != null) {
    out.print("<h1>Hello " + user.getName() + "!</h1>");
  }

%>

<%

  if (user == null) {
    out.print("<a href=\"/reg\">Registration</a>\n" +
            "<a href=\"/auth\">Authentication</a>");
  }

  if (user != null) {
    out.print("<a href=\"/calc\">Calculator</a>\n" +
            "<a href=\"/logout\">Logout</a>");
  }

%>
</body>
</html>
