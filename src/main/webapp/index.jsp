<%--
  Created by IntelliJ IDEA.
  User: torra
  Date: 28.1.23
  Time: 1:39 e pasdites
  To change this template use File | Settings | File Templates.
--%>




<%@ page contentType="text/html;charset=UTF-8" language="java" %>






<!DOCTYPE html>
<html lang="en">
<head>
    <title>Page Title</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        * {
            box-sizing: border-box;
        }

        /* Style the body */
        body {
            font-family: Arial, Helvetica, sans-serif;
            margin: 0;
            background-image: -webkit-gradient(radial, 100% 100%, 10, 90% 90%, 600, from(#435d7d), to(#ffffff));
        }

        /* Header/logo Title */
        .header {
            padding: 80px;
            text-align: center;

            color: black;
            background-image: -webkit-gradient(radial, 100% 100%, 10, 90% 90%, 600, from(#435d7d), to(#ffffff));
        }

        /* Increase the font size of the heading */
        .header h1 {
            font-size: 40px;
        }

        /* Style the top navigation bar */
        .navbar {
            overflow: hidden;
            color: black;
            background-image: -webkit-gradient(radial, 100% 100%, 10, 90% 90%, 600, from(#435d7d), to(#ffffff));
        }

        /* Style the navigation bar links */
        .navbar a {
            float: left;
            display: block;
            color: black;
            text-align: center;
            padding: 14px 20px;
            text-decoration: none;
        }

        /* Right-aligned link */
        .navbar a.right {
            float: right;
            color: black;
        }

        /* Change color on hover */
        .navbar a:hover {
            background-color: #ddd;
            color: black;
        }

        /* Column container */
        .row {
            display: -ms-flexbox; /* IE10 */
            display: flex;
            -ms-flex-wrap: wrap; /* IE10 */
            flex-wrap: wrap;
        }

        /* Create two unequal columns that sits next to each other */
        /* Sidebar/left column */
        .side {
            -ms-flex: 30%; /* IE10 */
            flex: 30%;
            background-color: #f1f1f1;
            padding: 20px;
        }

        /* Main column */
        .main {
            -ms-flex: 70%; /* IE10 */
            flex: 70%;
            background-color: white;
            padding: 20px;
        }

        /* Fake image, just for this example */
        .fakeimg {
            background-color: #aaa;
            width: 100%;
            padding: 20px;
        }

        /* Footer */
        .footer {
            padding: 20px;
            text-align: center;
            background: #ddd;
        }

        /* Responsive layout - when the screen is less than 700px wide, make the two columns stack on top of each other instead of next to each other */
        @media screen and (max-width: 700px) {
            .row {
                flex-direction: column;
            }
        }

        /* Responsive layout - when the screen is less than 400px wide, make the navigation links stack on top of each other instead of next to each other */
        @media screen and (max-width: 400px) {
            .navbar a {
                float: none;
                width: 100%;
            }
        }
    </style>
</head>
<body>

<div class="header" style="font-size: xx-large;">
    <a href="${pageContext.request.contextPath}/ "> <h1>Hotel Management</h1> </a>
    <p></p>
</div>

<div class="navbar" style="font-size: xx-large">
    <a href="${pageContext.request.contextPath}/booking/listRooms">Book</a>
    <a href=""></a>
    <a href="${pageContext.request.contextPath}/booking/idPersonal">Watch Bookings Time</a>
    <a href="${pageContext.request.contextPath}/showMyLoginPage" class="right">Log In</a>
</div>


</body>
</html>

