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

</head>
<body>

<c:forEach items="${quotes}" var="quote">
    <table>
        <tr>
            <td>
                Author: <c:out value="${quote.author}">Author</c:out>
                Content: <c:out value="${quote.content}">Content</c:out>
            </td>
        </tr>
    </table>
</c:forEach>

</body>
</html>
