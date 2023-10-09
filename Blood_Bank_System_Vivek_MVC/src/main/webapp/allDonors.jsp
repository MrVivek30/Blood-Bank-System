<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

        .select-button {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            text-decoration: none;
            margin: 5px;
            cursor: pointer;
        }

        .select-button:hover {
            background-color: #45a049;
        }

        .donate-again-link {
            margin-top: 20px;
            font-size: 18px;
            color: #1565c0;
            text-decoration: none;
        }

        .donate-again-link:hover {
            text-decoration: underline;
        }
         .action-links {
                    margin-top: 20px;
                }

                .action-links a {
                    text-decoration: none;
                    margin: 0 10px;
                    padding: 10px 20px;
                    border: 2px solid #1565c0;
                    border-radius: 5px;
                    color: #1565c0;
                    transition: all 0.3s ease;
                }

                .action-links a:hover {
                    background-color: #1565c0;
                    color: #ffffff;
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
            <th>Action</th>
        </tr>
        <%
        List<Donor> donors = (List<Donor>) request.getAttribute("donors");
        for (Donor donor : donors) { %>
            <tr>
                <td><%= donor.getId() %></td>
                <td><%= donor.getName() %></td>
                <td><%= donor.getAge() %></td>
                <td><%= donor.getBloodGroup() %></td>
                <td><%= donor.getUnit() %></td>
                <td><%= donor.getAddress() %></td>
                <td><%= donor.getLocalDateTime() %></td>
                <td><a href="receive.jsp?donorId=<%= donor.getId() %>&units=<%= donor.getUnit() %>" class="select-button">Select</a></td>
            </tr>
        <% } %>
    </table>


     <div class="action-links">
      <a href="donate.jsp" >Donate again</a>
     <a href="index.jsp" >Home page</a>
        </div>
</body>
</html>
