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
    <title>Save Employee</title>
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
        .formg{

            height: 50px;
            padding: 10px;
            margin: 10px;
            border-radius: 4px;
            box-sizing: border-box;
        }
        .formc{
            width: 200px;
            height: 50px;
            padding: 10px;
            margin: 10px;

            border-radius: 4px;
            box-sizing: border-box;
        }
        .save{
            background-color: #3498DB;
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
        

    </style>


</head>
<body>
        <div class="container">

            <h3 class="display-5 test-primary">Save Employee</h3>
            <form:form action="saveEmployee" modelAttribute="employees" method="post">

                <!-- need to associate this data with employee id -->
                <form:hidden path="employeeID"/>

                <table>
                    <tbody>
                    <tr>
                        <td class="formg"><label for="p1">First name: </label></td>
                        <td class="formc" id="p1">
                            <form:input path="employeeFirstName" required="required"/>
                        </td>
                    </tr>

                    <tr>
                    <td class="formg"><label for="p2">Last name:</label></td>
                        <td class="formc" id="p2">
                            <form:input path="employeeLastName" required="required"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="formg"><label for="p3">Position :</label></td>
                        <td class="formc" id="p3">
                            <form:input path="position" required="required"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="formg"><label for="p4">Phone: </label></td>
                        <td class="formc" id="p4">
                            <form:input path="employeePhone" required="required"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="formg"><label for="p5">Email: </label></td>
                        <td class="formc" id="p5">
                            <form:input path="employeeEmail" required="required"/>
                        </td>

                    <tr>
                    <td> <input type="submit" value="Save" class="save"/> </td>
                    </tr>


                    </tbody>
                </table>
            </form:form>



        <p>
            <a href="${pageContext.request.contextPath}/employee/list">Back</a>
        </p>


 </div>

</body>
</html>
