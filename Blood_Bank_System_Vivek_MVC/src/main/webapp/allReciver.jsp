<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.trackobit.model.Receiver" %>

<html>
<head>
    <title>All Receiver</title>
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

        .no-receivers-message {
            margin-top: 20px;
            font-size: 18px;
            color: #333;
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
    <h1>All Receiver</h1>

<%
List<Receiver> receivers = (List<Receiver>) request.getAttribute("receivers");
if (receivers != null && !receivers.isEmpty()) { %>
        <table>
            <tr>
                <th>Blood donor Donor ID</th>
                <th>Name of Receiver</th>
                <th>Donation Date and Time</th>
                <th>Address</th>
                <th>Units Received</th>
            </tr>

            <% for (Receiver receiver : receivers) { %>
                <tr>
                    <td><%= receiver.getEnterDonorId() %></td>
                    <td><%= receiver.getName() %></td>
                    <td><%= receiver.getLocalDateTime() %></td>
                    <td><%= receiver.getAddress() %></td>
                    <td><%= receiver.getUnit() %></td>
                </tr>
            <% } %>
        </table>

 <% } else { %>

     <p class="no-receivers-message">No receivers found.</p>

 <% } %>
    <div class="action-links">
        <a href="index.jsp">Home page</a>

             <a href="getAllDonor">View Donors</a>
    </div>
</body>
</html>
