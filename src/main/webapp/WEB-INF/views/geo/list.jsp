<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../base/docHeader.jsp"%>
<h1 class="h3 mb-0 text-gray-800">Lista użytkowników</h1>
<table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
    <thead>
    <tr>
    <th>Id</th>
    <th>Nazwa</th>
    <th>email</th>
    <th>Typ</th>
    <th>Edit/Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="list">
        <c:if test="${logUser.id != list.id}">
        <tr>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.email}</td>
            <td>${list.type.title}</td>
            <td>
                <a href="${pageContext.request.contextPath}/user/${type_prefix}/form/${list.id}" class="btn btn-info rounded-0 text-light m-1">Edit</a>
                <a href="${pageContext.request.contextPath}/user/${type_prefix}/list/del/${list.id}" class="btn btn-danger rounded-0 text-light m-1">Delete</a>

            </td>
        </tr>
        </c:if>
    </c:forEach>
    </tbody>

</table>
${errorMsg}
<%@include file="../../base/docFooter.jsp"%>
