<%--
  Created by IntelliJ IDEA.
  User: jotaiwan
  Date: 8/07/2017
  Time: 7:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>All Employees</title>
</head>
<body>
    <h3>Employee page</h3>
    <div>Display all employees</div>
    <div>
        <div><a href="/employee/add">add</a></div>

        <c:choose>
            <c:when test="${mode == 'edit' || mode == 'add'}">
                <c:set var="e" value="${employee}"/>
                "<c:out value="${employee.name}"/>"

                <form:form action="/employee/all" modelAttribute="${employee}" var="e">
                    <table>
                        <tr>
                            <td>Name</td>
                            <td>
                                <input id="id" name="id" type="hidden" value="${employee.id}"/>
                                <form:input path="${employee.name}"  />

                            </td>
                        </tr>
                    </table>
                </form:form>
                <%--
                <form:form method="POST" action="/employee/employeeSave" modelAttribute="${employee}">
                    <form:input path="id"></form:input>
                    <table>
                        <tr>
                            <td><form:label path="name">Name</form:label></td>
                            <td><form:input path="name" value="${employee.name}"/></td>
                        </tr>
                        <tr>
                            <td><form:label path="joiningDate">Contact Number</form:label></td>
                            <td><form:input path="contactNumber"/></td>
                        </tr>
                        <tr>
                            <td><form:label path="ssn">SSN</form:label></td>
                            <td><form:input path="ssn"/></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="Submit"/></td>
                        </tr>
                    </table>
                </form:form>
                --%>
                <div>oh yes</div>
            </c:when>
            <c:otherwise>
                <c:forEach items="${employees}" var="employee">
                    <a href="/employee/edit/${employee.id}">${employee.id}</a>, ${employee.name}<br>
                </c:forEach>
            </c:otherwise>
        </c:choose>

    </div>
</body>
</html>
