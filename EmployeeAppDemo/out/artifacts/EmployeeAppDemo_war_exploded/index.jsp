<%--
  Created by IntelliJ IDEA.
  User: uruckcharti
  Date: 2020-04-01
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Welcome to Ukrit Corporation</title>
  </head>
  <body>
  <h1>Welcome to Ukrit Corporation</h1>
  <form action="LoginServlet" method="post">
   Firstname <input type="text" required name="firstname"><br>
    Lastname <input type="text" required name="lastname"><br>
   Password <input type="text" required name="password"><br>
    <input type="submit">
  </form>
  </body>
</html>
