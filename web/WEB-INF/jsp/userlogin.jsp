<%-- 
    Document   : uaerlogin
    Created on : 23 Sep, 2018, 2:25:23 PM
    Author     : krawler
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User List</h1>
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Password</th>
            </tr>
            <tr>
                <c:forEach var="user" items="${users}">
                <tr>
                    <td>
                        <c:out value="${user.getId()}"></c:out>
                    </td>
                    <td>
                        <c:out value="${user.getUsername()}"></c:out>
                    </td>
                    <td>
                        <c:out value="${user.getPassword()}"></c:out>
                    </td>
                </tr>
                </c:forEach>
            </tr>
        </table>
    </body>
</html>
