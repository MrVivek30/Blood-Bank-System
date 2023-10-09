<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>Blood Bank System</title>
</head>
<body>
    <h1>Welcome to the Blood Bank System</h1>
    <p>
        <a href="donate.jsp">Donate Blood</a><br>
        <a href="getAllDonor">GetAllDonorDetails</a> <!-- Assuming HomeServlet is mapped to "/getAllDonor" -->
        <br>
         <a href="receive.jsp">Receive Blood</a><br>

    </p>

</body>
</html>
