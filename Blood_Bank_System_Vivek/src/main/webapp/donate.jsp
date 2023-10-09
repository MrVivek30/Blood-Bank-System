<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>Donate Blood</title>
</head>
<body>
    <h2>Donate Blood</h2>
    <form action="DonateServlet" method="post">
        Id: <input type="number" name="id" required> <br>
        Name: <input type="text" name="name" required><br>
        Age: <input type="number" name="age" required min=0 max=105><br>
        Blood Group: <input type="text" name="bloodGroup" pattern="^(O\+|O-|A\+|A-|B\+|B-|AB\+|AB-\o+|o-|a\+|a-|b\+|b-|ab\+|ab-)$" required><br>
        Unit: <input type="number" name="unit" required><br>
        Address: <input type="text" name="address" required><br>
        <input type="submit" value="Donate">

    </form>

</body>
</html>
