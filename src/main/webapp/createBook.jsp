<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>View Book Details</title>

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
                    <h2 class="page-header">Save Book Details</h2>

                    <div class="form-group" style="width: 40%">
                        <form action="createBook.html" commandName="saveBooks" method="post">
                            <label>Book Name</label>

                            <div class="input-group">
                                <input type="text" name="title" class="form-control" placeholder="Book Name"
                                       required/>
                            </div>
                            <br>

                            <label>Author Name</label>

                            <div class="input-group">
                                <input type="text" name="author" class="form-control" placeholder=""
                                       required/>
                            </div>
                            <br>

                            <label>ISBN No</label>

                            <div class="input-group">
                                <input type="text" name="isbnNo" class="form-control" placeholder=""
                                       required/>
                            </div>
                            <br>

                            <label>Price</label>

                            <div class="input-group">
                                <input type="number" name="price" class="form-control" placeholder=""
                                       required/>
                            </div>
                            <br>

                            <label>Group</label>

                            <div class="input-group">
                                <input type="text" name="group" class="form-control" placeholder=""
                                       required/>
                            </div>
                            <br>

                            <label>place Of Publication</label>

                            <div class="input-group">
                                <input type="text" name="placeOfPub" class="form-control" placeholder=""
                                       required/>
                            </div>
                            <br>

                            <label>Available</label>

                            <div class="input-group">
                                <%--<input type="text" name="available" class="form-control" placeholder=""--%>
                                    <%--required/>--%>
                                <select class="form-control" style="width: 200px" required name="available">
                                    <option value="Yes">Yes</option>
                                    <option value="No">No</option>
                                </select>
                            </div>
                            <br>

                            <input type="submit" name="submit" id="submit" value="Save"
                                   class="btn btn-primary btn-block pull-left" style="width: 200px"/>
                        </form>
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
