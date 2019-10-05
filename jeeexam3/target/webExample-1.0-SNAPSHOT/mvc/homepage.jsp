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
<form action="hompepage" method="get">
    <p>Informujemy, że ta strona korzysta z plików cookies.</p>
    <label>
        Aceptuje cookie:
        <input type="checkbox" name="option" value="Yes">Yes
        <input type="checkbox" name="option" value="NO">No
    </label>
    </br>
    <p><input type="submit" value="Submit"></p>
</form>


</body>
</html>
