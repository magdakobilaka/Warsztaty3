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

<form action="receiver" method="get">
    <label>Name:<input type="text" name="name"></label>
    <label>Mail:<input type="text" name="mail"></label>
    <label>Id:<input type="number" name="id"></label>
    <input type="submit" value="send"/>
</form>



</body>
</html>
