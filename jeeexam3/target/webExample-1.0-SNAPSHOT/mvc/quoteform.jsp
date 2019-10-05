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

<form action="addquote" method="post">
    <label>Autor:<input type="text" name="name"></label> </br>
    <label>Content:<input type="text" name="content"></label> </br>
    <input type="submit" value="send"/>
</form>

${quote}<br>
<br>
<a href="index.jsp">index.jsp</a>

</body>
</html>
