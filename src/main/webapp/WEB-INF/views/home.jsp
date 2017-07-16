<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false" %>

<head>
    <title>My Home</title>
</head>
<body>
    <h3>welcome</h3>
    page <a href="page/1">1</a> | <a href="page/2">2</a> |

    <a href="<c:url value="/employee/all"/>">Employee</a>
    <a href="<c:url value="/spittles"/>">Spittles</a>
    <a href="<c:url value="/spitter/register" />">Register</a>
</body>


