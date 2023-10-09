<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>Receive Blood</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        h2 {
            color: #b71c1c;
        }

        form {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 300px;
            display: flex;
            flex-direction: column;
            gap: 10px;
        }

        input[type="text"],
        input[type="number"] {
            width: calc(100% - 20px);
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }

        input[type="submit"] {
            width: 100%;
            background-color: #b71c1c;
            color: #ffffff;
            border: none;
            padding: 15px;
            border-radius: 5px;
            cursor: pointer;
            font-size: 18px;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #d32f2f;
        }

        .readonly-input {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2>Receive Blood</h2>
    <form action="ReceiveServlet" method="post">
        DonorId: <input value="<%= request.getParameter("donorId") %>" type="number" name="enterDonorId" required readonly class="readonly-input"> <br>
        Name: <input type="text" name="name" required><br>
        Address: <input type="text" name="address" required><br>
         <%

                int availableUnits = Integer.parseInt(request.getParameter("units"));
            %>
        Units Available: <input value="<%= request.getParameter("units") %>" type="number" name="units" required readonly class="readonly-input"><br>
            Units needed: <input type="number" name="unit" required max="<%= availableUnits %>"><br>
        <input type="submit" value="Receive">

    </form>
       <a href="RequestBlood.jsp">RequestBlood</a>
</body>
</html>
