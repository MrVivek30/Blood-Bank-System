<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Sorting</title>
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

        form {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 300px;
            display: flex;
            flex-direction: column;
            gap: 10px;
        }

        select {
            width: calc(100% - 20px);
            padding: 10px;
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
    <form action="SortingServlet" method="post">
        <table>
            <tr>
                <td>Select sorting Criteria:</td>
                <td>
                    <select name="sortingCriteria">
                        <option value="name">Name</option>
                        <option value="age">Age</option>
                        <option value="bloodType">Blood Type</option>
                        <option value="address">Address</option>
                        <option value="bloodUnit">Blood Unit</option>
                    </select>
                </td>
            </tr>
        </table>
        <input type="submit" value="Sorting">
    </form>
</body>
</html>
