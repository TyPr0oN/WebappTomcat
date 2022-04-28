<%--
  Created by IntelliJ IDEA.
  User: uruckcharti
  Date: 2020-04-01
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SearchEmployee</title>
</head>
<body>
<%--    <form action="SearchEmployeeServlet" method="post">--%>
<%--        First name <input type="text" required name="firstname"><br>--%>
<%--        Last name <input type="text" required name="lastname"><br>--%>
<%--        <input type="submit">--%>
<%--    </form>--%>
<table>
    <tr>
        <td>Firstname</td>
        <td></td>
        <td>${employee.firstname}</td>
    </tr>
    <tr>
        <td>lastname</td>
        <td></td>
        <td>${employee.lastname}</td>
    </tr>
    <tr>
        <td>hire_date</td>
        <td></td>
        <td>${employee.hire_date}</td>
    </tr>
</table>
</body>
</html>
