<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false" %>

<head>
    <title>Sound Plaer</title>
</head>

<body>
<h3>Sound Player</h3>

<div>Disc detail: <c:out value="${compactDisc.title}"/>, <c:out value="${compactDisc.artist}"/></div>

<c:forEach items="${compactDisc.tracks}" var="track" varStatus="idx">
    <div>Track <c:out value="${idx.count}"/>: <c:out value="${track}"/></div>
</c:forEach>

</body>
