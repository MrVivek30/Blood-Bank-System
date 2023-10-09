

<html>
<head>
    <title>All Receiver</title>
    <style>
        table {
            width: 50%;
            margin: 20px auto;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid black;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1>All Receiver</h1>

     <table>
           <tr>
               <th>Blood donor Donor ID</th>
               <th>Name of Receiver</th>


               <th>Units Available</th>
               <th>Address</th>
               <th>Donation Date and Time</th>

           </tr>
           <%
               List<Donor> donors = (List<Donor>) request.getAttribute("donors");
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

       <h1> <a href="donate.jsp">Donate Blood</a><br>  <h1>
       <h1> <a href="allDonors.jsp">view Donors </a><br>  <h1>

</body>
</html>
