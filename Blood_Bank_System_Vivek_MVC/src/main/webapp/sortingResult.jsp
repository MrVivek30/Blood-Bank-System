<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page import="java.util.List" %>
<%@ page import="com.trackobit.model.Donor" %>

<html>
<head>
    <title>All Donors</title>
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

        h1 {
            color: #b71c1c;
        }

        table {
            width: 80%;
            margin-top: 20px;
            border-collapse: collapse;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        th, td {
            border: 1px solid #dddddd;
            padding: 12px;
            text-align: center;
        }

        th {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #f5f5f5;
        }
    </style>
</head>
<body>
    <h1>All Donors</h1>
    <table>
        <tr>
            <th>Donor ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Blood Group</th>
            <th>Units Available</th>
            <th>Address</th>
            <th>Donation Date and Time</th>
        </tr>
        <%
            List<Donor> donors = (List<Donor>) request.getAttribute("vivek");
            for (Donor donor : donors) {
        %>
        <tr>
            <td><%= donor.getId() %></td>
            <td><%= donor.getName() %></td>
            <td><%= donor.getAge() %></td>
            <td><%= donor.getBloodGroup() %></td>
            <td><%= donor.getUnit() %></td>
            <td><%= donor.getAddress() %></td>
            <td><%= donor.getLocalDateTime() %></td>
        </tr>
        <%
            }
        %>
    </table>
     </br>
          <a href="index.jsp">Home page</a>
</body>
</html>
