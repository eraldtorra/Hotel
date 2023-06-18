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

    <title>Vendos ID Personal</title>
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
            background-color: #4CAF50;
            border: none;
            color: white;
            padding: 5px 7px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
            border-radius: 10px;
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



    </style>

</head>

<body>


<div class="container">


    <h1 class="display-6 test-primary">Vendos ID Personal</h1>

            <form:form action="savePersonal" modelAttribute="personal" method="post">

                <table>
                    <tbody>
                    <tr>
                        <td class="formg"><label for="personalId">ID Personal:</label></td>

                        <td class="formc" id="personalId">
                            <form:input path="personalName" required="required"/>
                        </td>
                    </tr>

                    <tr>
                    <td class="save"> <input type="submit" value="Save" class="save"/> </td>
                    </tr>


                    </tbody>
                </table>
            </form:form>
            <br>
            <div>
                <a href="${pageContext.request.contextPath}/" class="btn btn-primary" >Back</a>
            </div>

        </div>

        <div style="clear: both; " ></div>



</body>
</html>
