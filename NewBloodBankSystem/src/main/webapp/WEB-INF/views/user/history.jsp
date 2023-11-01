<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User History</title>
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
    .btn {
                        margin-top: 10px;
                        display: inline-block;
                        padding: 10px 20px;
                        background-color: #4CAF50;
                        color: white;
                        text-decoration: none;
                        border-radius: 5px;
                    }

                    .btn:hover {
                        background-color: #45a049;
                    }
            </style>
</head>

<body>
    <div class="container">
        <h2> History</h2>

        <c:if test="${not empty history}">
            <h3>Donate History</h3>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Email</th>
                    <th>Unit</th>
                    <th>BloodGroup</th>
                    <th>Address</th>
                    <th>Date & Time</th>
                   <%--     <th>Role</th> --%>
                    <th>Type</th>
                       <th>Status</th>
                        <th>Remark</th>
                         <th>Action:ReSubmit</th>
                </tr>
                <c:forEach var="request" items="${history}">
                    <c:if test="${request.type == 'Donate'}">
                        <tr>
                            <td>${request.id}</td>
                            <td>${request.name}</td>
                            <td>${request.age}</td>
                            <td>${request.email}</td>
                            <td>${request.unit}</td>
                            <td>${request.bloodGroup}</td>
                            <td>${request.address}</td>
                            <td>${request.localDateTime}</td>
                         <%--      <td>${request.role.toUpperCase()}</td>  --%>
                            <td>${request.type}</td>
                                <td style="color:red;">${request.status}</td>
                                     <td>${request.remark}</td>


                <td>
                    <c:choose>
                        <c:when test="${request.status == 'Rejected'}">
                            <a href="/com/BloodBank/v1/request/editRequest?uniqueId=${request.uniqueId}">Edit</a>
                        </c:when>
                        <c:otherwise>
                            N/A
                        </c:otherwise>
                    </c:choose>
                </td>


                        </tr>
                    </c:if>
                </c:forEach>
            </table>

            <h3>Receive History</h3>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Email</th>
                    <th>Unit</th>
                    <th>BloodGroup</th>
                    <th>Address</th>
                    <th>Date & Time</th>
               <%--     <th>Role</th> --%>
                    <th>Type</th>
                    <th>Status</th>
                    <th>Remark</th>
                    <th>Action:ReSubmit</th>

                </tr>
                <c:forEach var="request" items="${history}">
                    <c:if test="${request.type == 'Receive'}">
                        <tr>
                            <td>${request.id}</td>
                            <td>${request.name}</td>
                            <td>${request.age}</td>
                            <td>${request.email}</td>
                            <td>${request.unit}</td>
                            <td>${request.bloodGroup}</td>
                            <td>${request.address}</td>
                            <td>${request.localDateTime}</td>
                      <%--      <td>${request.role.toUpperCase()}</td>  --%>
                            <td>${request.type}</td>
                            <td style="color:red;">${request.status}</td>
                                 <td>${request.remark}</td>
                        <td>
                                    <c:choose>
                                        <c:when test="${request.status == 'Rejected'}">
                                            <a href="/com/BloodBank/v1/request/editRequest?uniqueId=${request.uniqueId}">Edit</a>
                                        </c:when>
                                        <c:otherwise>
                                            N/A
                                        </c:otherwise>
                                    </c:choose>
                                </td>
                        </tr>
                    </c:if>
                </c:forEach>
            </table>
        </c:if>

        <c:if test="${empty history}">
            <p>No history found.</p>
        </c:if>

        <a href="/com/BloodBank/v1/user/userDashboard">Back to Dashboard</a>
    </div>
</body>

</html>
