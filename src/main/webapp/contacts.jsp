<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="contact.Contact" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.lang.reflect.Array" %><%--
  Created by IntelliJ IDEA.
  User: samlansford
  Date: 4/9/21
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    List<Contact> contacts = new ArrayList<>();
    contacts.add(new Contact( 1,"Sam", "sam@gmail.com","123 Sam Way", "4322145954", false));
    contacts.add(new Contact( 2,"Carlos", "carlos@gmail.com","123 Carlos Way, TX", "1231234123", true));
    contacts.add(new Contact( 3,"Micheal", "micheal@gmail.com","123 Micheal Way, TX", "1231232424", false));
    contacts.add(new Contact( 4,"Jacob", "jacob@gmail.com","123 Jacob Way", "2341345234", true));

    request.setAttribute("contacts", contacts);

%>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Contacts"/>
    </jsp:include>

    <style>
        tr{
            padding: 20px;
            margin: 15px;
            border: 20px;
        }
    </style>

</head>
<body>

    <div align="center">
        <table border="1" cellpadding="5">
            <caption> User Contacts </caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Address</th>
                <th>Phone Number</th>
                <th>isActive</th>
            </tr>
            <c:forEach var="contact" items="${contacts}">
                <c:if test="${contact.active}">
                <tr>
                    <td><c:out value="${contact.id}"/></td>
                    <td><c:out value="${contact.name}"/></td>
                    <td><c:out value="${contact.email}"/></td>
                    <td><c:out value="${contact.address}"/></td>
                    <td><c:out value="${contact.phoneNumber}"/></td>
                    <td><c:out value="${contact.active}"/></td>
                </tr>
                </c:if>
            </c:forEach>
        </table>
    </div>

</body>
</html>
