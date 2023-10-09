<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>Receive Blood</title>
</head>
<body>
    <h2>Receive Blood</h2>
    <form action="ReceiveServlet" method="post">
     DonorId: <input value="<%= request.getParameter("donorId") %>" type="number" name="enterDonorId" required readonly> <br>

        Name: <input type="text" name="name" required><br>
        Address: <input type="text" name="address" required><br>
 <%

        int availableUnits = Integer.parseInt(request.getParameter("units"));
    %>
Units Available: <input value="<%= request.getParameter("units") %>" type="number" name="unit" required  readonly><br>
      Units needed: <input type="number" name="unit" required max="<%= availableUnits %>"><br>



        <input type="submit" value="Receive">
    </form>
</body>
</html>
