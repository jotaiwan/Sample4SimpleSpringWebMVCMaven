<%--
  Created by IntelliJ IDEA.
  User: jotaiwan
  Date: 3/07/2017
  Time: 9:22 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false" %>
<html>
<head>
    <title>Employee</title>
    <link ref="stylesheet" type="t3ext/css" href="<c:url value="/resources/style.css" />" >
</head>
<body>
<h1>Welcome to Sample4SimpleSpringWebMVCMaven</h1>

page <a href="page/1">1</a> | <a href="page/2">2</a> |

<a href="<c:url value="/employee/all"/>">Employee</a>
<a href="<c:url value="/spittles"/>">Spittles</a>
<a href="<c:url value="/spitter/register" />">Register</a>
</body>
</html>

</body>
</html>
