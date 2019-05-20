<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Homepage</title>
</head>
<body>
<p>ABC QWERTY</p>

<a href="${pageContext.request.contextPath}/geo" class="btn btn-info rounded-0 text-light m-1">Geo</a><br>
<a href="${pageContext.request.contextPath}/gw" class="btn btn-info rounded-0 text-light m-1">GW</a><br>
<a href="${pageContext.request.contextPath}/sub" class="btn btn-info rounded-0 text-light m-1">SUB</a><br>
<hr>
<a href="${pageContext.request.contextPath}/admin" class="btn btn-info rounded-0 text-light m-1">admin</a><br>
<a href="${pageContext.request.contextPath}/logout" class="btn btn-info rounded-0 text-light m-1">logout</a><br>



</body>
</html>
