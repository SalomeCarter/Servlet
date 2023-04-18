<%--
  Created by IntelliJ IDEA.
  User: Наташа
  Date: 03.04.2023
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/calc" method="post">
    <input type="text" placeholder="Num 1" name="num1">
    <input type="text" placeholder="Num 2" name="num2">
    <input type="text" placeholder="Type" name="type">
    <button>Submit</button>
</form>
<p>Result = ${result.result}</p>
<form action="/history">
    <button>History</button>
</form>
</body>
</html>
