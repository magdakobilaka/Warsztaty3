<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: Jola
  Date: 2019-05-28
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Smerfy</title>
</head>
<body>

<tr>
    <td>Name:</td>
    <td>Description</td>
    <td> Attribute</td>
</tr>
    <table>
<c:forEach items="${smurfs}" var="smurfs">
    <tr>
        <td>${smurfs.name}, ${smurfs.description}, ${smurfs.atribiute}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
