<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>Donate Blood</title>
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
        }

        input[type="text"],
        input[type="number"] {
            width: calc(100% - 20px);
            padding: 10px;
            margin: 10px 0;
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
    </style>
</head>
<body>
    <h2>Donate Blood</h2>
    <form action="DonateServlet" method="post">
        Id: <input type="number" name="id" required><br>
      <label for="name">Name:</label>
      <input type="text" id="name" name="name" minlength="4" required><br>
        Age: <input type="number" name="age" required min="0" max="105"><br>
        Blood Group: <input type="text" name="bloodGroup" pattern="^(O\+|O-|A\+|A-|B\+|B-|AB\+|AB-\o+|o-|a\+|a-|b\+|b-|ab\+|ab-)$" required><br>
        Unit: <input type="number" name="unit" required><br>
        Address: <input type="text" name="address" required><br>
        <input type="submit" value="Donate">
    </form>
</body>
</html>
