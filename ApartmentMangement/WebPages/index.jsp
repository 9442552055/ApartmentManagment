<%-- 
    Document   : index
    Created on : Sep 18, 2013, 12:30:25 PM
    Author     : arunmozhi
--%>

<%@page import="org.apache.jasper.tagplugins.jstl.core.Set"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html ng-app="MainModule">
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AMS</title>

                <link rel="stylesheet" href="Content/css/bootstrap.css"/>
                <link rel="stylesheet" href="Content/css/bootstrap-responsive.css"/>
                <link rel="stylesheet" href="Content/css/MainPage.css"/>
              

                <script type="text/javascript" src="js/Lib/jquery-1.9.1.js"></script>
                <script type="text/javascript" src="js/Lib/angular.js"></script>
                <script type="text/javascript" src="js/Lib/angular-resource.js"></script>
                <script type="text/javascript" src="js/Lib/bootstrap.js"></script>

                <link rel="stylesheet" href="Content/css/ng-grid.css"/>
                <script type="text/javascript" src="js/Lib/ng-grid-2.0.7.min.js"></script>

                <script type="text/javascript" src="js/App/MainModule.js"></script>
                <script type="text/javascript" src="js/App/Controllers/ContextController.js"></script>
                <script type="text/javascript" src="js/App/Controllers/MasterListController.js"></script>
                <script type="text/javascript" src="js/App/Controllers/ApartmentDetailController.js"></script>

<!--                Start Directives-->
                <script type="text/javascript" src="js/App/Directives/loginPartialBinder.js"></script>
<!--                End Directives -->


</head>
<body>
    <div id="wrap">
        <div ng-cloak>
            <!-- NAVBAR-->

            <div class="navbar-wrapper">
                <!-- Wrap the .navbar in .container to center it within the absolutely positioned parent. -->
                <div class="container">
                    <div class="navbar navbar-inverse">
                        <div class="navbar-inner">
                            <!-- Responsive Navbar Part 1: Button for triggering responsive navbar (not covered in tutorial). Include responsive CSS to utilize. -->
                            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="brand" href="#">
                                <img class="icon" src="Content/Images/blue-house-hi.png">
                            </a>
                            <!-- Responsive Navbar Part 2: Place all navbar contents you want collapsed withing .navbar-collapse.collapse. -->
                            <div class="nav-collapse collapse" nav-highlight-active>
                                <ul class="nav">
                                    <li data-match-route="/Home/Index" data-match-route-default=""><a href="#/Home">Home</a></li>
                                    <li data-match-route="/AboutUs"><a href="#/AboutUs">About Us</a></li>
                                    <li class="dropdown">
                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Masters <b class="caret"></b></a>
                                        <ul class="dropdown-menu span2">
                                            <li class="nav-header">Mandatory masters</li>
                                            <li><a href="#/Masters/Apartments">Apartment</a></li>
                                            <li><a href="#/Masters/Tenants">Tenant</a></li>
                                            <li><a href="#/Masters/Amenities">Amenities</a></li>
                                            <li class="divider"></li>
                                            <li class="nav-header">Utility masters</li>
                                            <li><a href="#">Contact</a></li>
                                        </ul>
                                    </li>
                                    <li class="dropdown">
                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Transactions <b class="caret"></b></a>
                                        <ul class="dropdown-menu span3">
                                            <li class="nav-header">Tenancy</li>
                                            <li><a href="#">Start Tenancy</a></li>
                                            <li><a href="#">Add tenancy agreement</a></li>
                                            <li><a href="#">End tenancy</a></li>
                                            <li class="divider"></li>
                                            <li class="nav-header">Payments</li>
                                            <li><a href="#">Rent Payments</a></li>
                                            <li><a href="#">Service Payments</a></li>
                                        </ul>
                                    </li>
                                </ul>

                                <div style="min-width:100px">

                                </div>


                                <ul login-partial-binder="Account/LoginPartial" id="loginPartial" class="nav pull-right">

                                </ul>
                            </div>
                            <!-- /.navbar-inner -->
                        </div>
                        <!-- /.navbar -->
                    </div>
                    <!-- /.container -->
                </div>
                <!-- /.navbar-wrapper -->
            </div>


            <!-- Header
    ================================================== -->

            <header class="header">
                <!--<img src="" alt="">-->
                <div class="container">
                    <div class="header-empty-top">
                        <br />
                    </div>
                    <div class="row-fluid">
                        <div class="span6">
                            <div class="header-caption">
                                <h2>AMS</h2>
                                <p class="lead hidden-phone">
                                    AMS lets u to manage things
                                </p>
                            </div>
                        </div>
                        <div class="span4">
                            <div class="header-caption">
                                <div>
                                    <a class="btn btn-large btn-success" href="/us/en/Rings">Start your quest!</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
            <!-- /.header -->

            <div class="content">
                <div class="container">
                    <!-- To Check MVC Caching -->

                    <div ng-view>

                    </div>


                </div>
            </div>

        </div>

        <div id="push">

        </div>
    </div>
    <%-- #wrap --%>

    <div id="footer">
        <div class="container">
            <div class="span2 offset2">
                <h3>Apartment Management System</h3>
            </div>
            <div class="span2">
                <ul>
                    <li><a href="#">News</a></li>
                </ul>

            </div>
            <div class="span2">
                <ul>
                    <li><a href="/Home/About">About Us</a></li>
                    <li><a href="#">Partners</a></li>
                    <li><a href="#">Contact</a></li>
                </ul>
            </div>
        </div>
    </div>




    <script type="text/javascript">
            services.value('UserName','<%= request.getSession().getAttribute("Login_UserName")%>');
    </script>

</body>

</html>
