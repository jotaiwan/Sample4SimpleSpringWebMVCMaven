<%--
  Created by IntelliJ IDEA.
  User: jotaiwan
  Date: 8/07/2017
  Time: 7:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>All Employees</title>
</head>
<body>
<h3>Employee page</h3>
<div>Display all employees</div>
<div>
    <c:forEach items="${employees}" var="employee">
        ${employee.id}, ${employee.name}<br>
    </c:forEach>
</div>
</body>
</html>
