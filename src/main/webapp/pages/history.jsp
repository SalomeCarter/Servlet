<%--
  Created by IntelliJ IDEA.
  User: Наташа
  Date: 17.04.2023
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>History</title>
</head>
<body>
<form action="/calc">
    <button>calculator</button>
</form>

<core:forEach items="${operationList}" var="calculatorOperation">
    <h2>${calculatorOperation.getNum1()} ${calculatorOperation.getType()} ${calculatorOperation.getNum2()} = ${calculatorOperation.getResult()}</h2>
</core:forEach>

</body>
</html>
