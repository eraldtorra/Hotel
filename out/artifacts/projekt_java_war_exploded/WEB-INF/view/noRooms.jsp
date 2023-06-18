<%--
  Created by IntelliJ IDEA.
  User: torra
  Date: 1.2.23
  Time: 7:34 e pasdites
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <style>
        body{
            background-color: #f1f2f6;
        }
        .container{
            background-color: #fff;
            padding: 30px;
            margin-top: 50px;
            border-radius: 5px;
        }
    </style>
</head>

<body>
<div class="container">
    <div class="alert alert-danger" role="alert">
       Na Falni! Nuk kemi Dhomat e lira ne kete kohe te caktuar
    </div>
    <a href="${pageContext.request.contextPath}/" class="btn btn-primary">Back to Home</a>
</div>
</body>

</html>
