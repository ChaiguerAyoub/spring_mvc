<%--
  Created by IntelliJ IDEA.
  User: achaiguer
  Date: 12/03/2019
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit customer</title>
</head>
<body>

<form action="/app/edit_customer/${id}" method="post">

    <table>
        <tr>
            <td>Name</td>
            <td>Adresse</td>
            <td>Phone</td>
            <td>Email</td>
        </tr>
        <tr>
            <td><input type="text" name="name" value="${customer.name}"></td>
            <td><input type="text" name="address" value="${customer.address}"></td>
            <td><input type="text" name="phone" value="${customer.phone}"></td>
            <td><input type="text" name="email" value="${customer.email}"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Update"></td>
            <td><input type="reset" value="cancel"></td>
        </tr>
    </table>

</form>

</body>
</html>
