<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>Donation Successful</title>
</head>
<body>
    <h2>Successfully done....</h2>
    <p>Redirecting to <a href="index.jsp">Home Page</a>...</p>
    <script>
        setTimeout(function() {
            window.location.href = "index.jsp";
        }, 1000); // Redirect to index.jsp after 1 seconds
    </script>
</body>
</html>
