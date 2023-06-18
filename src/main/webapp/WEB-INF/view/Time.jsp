<%--
  Created by IntelliJ IDEA.
  User: torra
  Date: 6.10.22
  Time: 6:19 e pasdites
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Save Check</title>
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
        .save{
            background-color: #145A32;
            border: none;
            color: white;
            padding: 5px 7px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 6px 4px;
            cursor: pointer;
            border-radius: 10px;
        }
        .pagination {
            float: right;
            margin: 0 0 5px;
        }

        .pagination li a {
            border: none;
            font-size: 13px;
            min-width: 30px;
            min-height: 30px;
            color: #999;
            margin: 0 2px;
            line-height: 30px;
            border-radius: 2px !important;
            text-align: center;
            padding: 0 6px;
        }

        .pagination li a:hover {
            color: #666;
        }

        .pagination li.active a, .pagination li.active a.page-link {
            background: #03A9F4;
        }

        .pagination li.active a:hover {
            background: #0397d6;
        }

        .pagination li.disabled i {
            color: #ccc;
        }

        .pagination li i {
            font-size: 16px;
            padding-top: 6px
        }

    </style>

</head>
<body>
        <div class="container">
              <h2>Check In Out</h2>

            <form:form action="saveCheck" modelAttribute="time" method="post">
                <table class="table">

                    <tbody>
                    <tr>
                        <td><label>Check In: </label></td>
                        <td>
                            <form:input type="date" path="checkInDate" required="required"/>
                        </td>
                    </tr>

                    <tr>
                    <td><label>Check Out:</label></td>
                        <td>
                            <form:input type="date" path="checkOutDate" required="required"/>
                        </td>
                    </tr>
                    <tr>
                        <td> <input type="submit" value="Save" class="save"/> </td>
                    </tr>


                    </tbody>
                </table>
            </form:form>





        <p>
            <a href="${pageContext.request.contextPath}/booking/showFormForAdd" class="btn btn-primary">Back</a>
        </p>

            <div class="clearfix">

                <ul class="pagination">

                    <li class="page-item"><a href="#" class="page-link">1</a></li>
                    <li class="page-item"><a href="#" class="page-link">2</a></li>
                    <li class="page-item"><a href="#" class="page-link">3</a></li>
                    <li class="page-item active"><a href="#" class="page-link">4</a></li>

                </ul>
            </div>

        </div>


</body>
</html>
