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
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
        }
    </style>
</head>

<body>
<div class="container">
    <div class="alert alert-danger" role="alert">
        Ju nuk keni rezervuar ne hotelin tone!
    </div>
    <a href="${pageContext.request.contextPath}/booking/idPersonal" class="btn btn-primary">Back</a>
</div>
</body>

</html>