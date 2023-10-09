<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page import="java.util.List" %>
<%@ page import="com.trackobit.Donor" %>

<html>
<head>
    <title>All Donors</title>
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
             <td>

               <a href="receive.jsp?donorId=<%= donor.getId() %>&units=<%= donor.getUnit() %>">Select</a>


             </td>

               </tr>
           <%



               }
           %>
       </table>

       <h1> <a href="donate.jsp">Donate again</a><br>
        <h1>
</body>
</html>
