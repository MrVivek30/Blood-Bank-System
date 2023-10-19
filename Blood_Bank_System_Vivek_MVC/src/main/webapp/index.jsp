<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>Blood Bank System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        .container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        h1 {
            color: #ff4f4f;
            margin-bottom: 20px;
        }

        .link-container {
            display: flex;
            flex-direction: column;
            gap: 20px;
        }

        .link-container a {
            text-decoration: none;
            color: #007bff;
            font-weight: bold;
            padding: 15px 30px;
            border: 2px solid #007bff;
            border-radius: 25px;
            background-color: #ffffff;
            transition: all 0.3s ease;
        }

        .link-container a:hover {
            background-color: #007bff;
            color: #ffffff;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome to the Blood Bank System</h1>
        <div class="link-container">
            <a href="donate.jsp">Donate Blood</a>
            <a href="getAllDonor">Receive Blood</a>
            <a href="getAllReceiver">AllReceiver</a>
        </div>
    </div>
</body>
</html>
