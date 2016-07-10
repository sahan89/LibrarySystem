<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: sahan
  Date: 7/10/2016
  Time: 6:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Delete Book Details</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/simple-sidebar.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

<div id="wrapper">

    <!-- Sidebar -->
    <div id="sidebar-wrapper">
        <ul class="sidebar-nav">
            <li class="sidebar-brand">
                <a href="createBook.jsp">
                    Library System
                </a>
            </li>
            <li>
                <a href="createBook.html"> Save Book Details</a>
            </li>
            <li>
                <a href="viewBooks.html">View Books Details</a>
            </li>
        </ul>
    </div>
    <!-- /#sidebar-wrapper -->

    <!-- Page Content -->
    <div id="page-content-wrapper">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Delete Book Details</h1>

                    <div class="form-group" style="width: 50%">
                        <form:form action="" commandName="deleteBook" method="post">
                            <table>

                                <tr>
                                    <td>Title</td>
                                    <td><form:input type="text" path="title" name="title" class="form-control"
                                                    required="true"/>
                                    </td>
                                </tr>

                                <tr>
                                    <td>Author</td>
                                    <td><form:input type="text" path="author" name="author" class="form-control"
                                                    required="true"/></td>
                                </tr>

                                <tr>
                                    <td>ISBN No</td>
                                    <td><form:input type="text" path="isbnNo" name="isbnNo" class="form-control"
                                                    required="true"/></td>
                                </tr>

                                <tr>
                                    <td> Price</td>
                                    <td><form:input type="text" path="price" name="price" class="form-control"
                                                    required="true"/></td>
                                </tr>

                                <tr>
                                    <td>Group</td>
                                    <td><form:input type="text" path="group" name="group" class="form-control"
                                                    required="true"/></td>
                                </tr>

                                <tr>
                                    <td>Place Of Pub</td>
                                    <td><form:input type="text" path="placeOfPub" name="placeOfPub" class="form-control"
                                                    required="true"/></td>
                                </tr>

                                <tr>
                                    <td> Available</td>
                                    <td><form:input type="text" path="available" name="available" class="form-control"
                                                    required="true"/></td>
                                </tr>

                                <tr>
                                    <td></td>
                                    <td><input type="submit" value="Delete" name="submit" id="submit"
                                               class="btn btn-danger btn-block pull-right"></td>
                                </tr>
                            </table>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- /#page-content-wrapper -->

</div>
<!-- /#wrapper -->

<!-- jQuery -->
<script src="js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>

<!-- Menu Toggle Script -->
<script>
    $("#menu-toggle").click(function (e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
</script>

</body>

</html>
