<%--
  Created by IntelliJ IDEA.
  User: achaiguer
  Date: 12/03/2019
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add a new customer</title>
</head>
<body>

<form action="/app/add_customer" method="post">

    <table>
        <tr>
            <td>Name</td>
            <td>Adresse</td>
            <td>Phone</td>
            <td>Email</td>
        </tr>
        <tr>
            <td><input type="text" name="name" id=""></td>
            <td><input type="text" name="address"></td>
            <td><input type="text" name="phone"></td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Add"></td>
            <td><input type="reset" value="cancel"></td>
        </tr>
    </table>

</form>

</body>
</html>
