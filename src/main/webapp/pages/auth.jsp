<%--
  Created by IntelliJ IDEA.
  User: Наташа
  Date: 03.04.2023
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Auth</title>
</head>
<body>
<form action="/auth" method="post">
  <input type="text" placeholder="Username" name="username">
  <input type="text" placeholder="Password" name="password">
  <button>Submit</button>
</form>
<p>${message}</p>
</body>
</html>
