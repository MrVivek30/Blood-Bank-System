<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>Donation Successful</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8d7da;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        .message-container {
            background-color: #ffeeba;
            color: #856404;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.1);
            text-align: center;
            position: relative;
        }

        .decorative-line {
            width: 100px;
            height: 5px;
            background-color: #ffc107;
            margin: 20px auto;
            border-radius: 5px;
        }

        h2 {
            font-size: 28px;
            margin-bottom: 20px;
        }

        p {
            font-size: 18px;
            margin-top: 20px;
        }

        a {
            color: #007bff;
            text-decoration: none;
            font-weight: bold;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="message-container">
        <div class="decorative-line"></div>
        <h2>Thank You for Your Blood Donation!</h2>
        <p>Your contribution is invaluable and can save lives. Your act of kindness and generosity will make a significant difference in someone's life. Please consider donating again in the future.</p>
        <p>Redirecting to <a href="index.jsp">Home Page</a>...</p>
    </div>
    <script>
        setTimeout(function() {
            window.location.href = "index.jsp";
        }, 3000);
    </script>
</body>
</html>


