<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.trackobit.model.Receiver" %>

<html>
<head>
    <title>Requested Receiver</title>
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
        select, input[type="text"] {
                     width: calc(100% - 20px);
                     padding: 10px;
                     margin-top: 5px;
                     border: 1px solid #ccc;
                     border-radius: 5px;
                     font-size: 16px;
                 }

    </style>
</head>
<body>
    <h1>Request For Blood</h1>

<%
List<Receiver> receivers = (List<Receiver>) request.getAttribute("pendingList");


if (receivers != null && !receivers.isEmpty()) { %>
        <table>
            <tr>
                <th>Donor ID</th>
                <th>Name of Receiver</th>
                <th>Donation Date and Time</th>
                <th>Address</th>
                <th>Units Requested</th>
                <th>Action</th>
            </tr>

            <% for (Receiver receiver : receivers) {
Integer id = (Integer) request.getAttribute("id");

            if(receiver.getEnterDonorId() ==id){
            %>
                <tr>
                    <td><%= receiver.getEnterDonorId() %></td>
                    <td><%= receiver.getName() %></td>
                    <td><%= receiver.getLocalDateTime() %></td>
                    <td><%= receiver.getAddress() %></td>
                    <td><%= receiver.getUnit() %></td>

                    <td>
             <a href="ApprovalServlet?action=Accept&donorId=<%= receiver.getEnterDonorId()%>&reqUnit=<%=receiver.getUnit()%>">Accept</a>
               </br></br>
               <a href="ApprovalServlet?action=Reject&donorId=<%= receiver.getEnterDonorId() %>&reqUnit=<%=receiver.getUnit()%>">Reject</a>
                </td>

                </tr>
            <%
            }
            }%>
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
