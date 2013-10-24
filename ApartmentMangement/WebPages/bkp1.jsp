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
        <title>Pick Thingzzz!!!</title>

        <script type="text/javascript">
           
        </script>
        <link rel="stylesheet" href="Content/css/bootstrap.css"/>
        <link rel="stylesheet" href="Content/css/bootstrap-responsive.css"/>
        <link rel="stylesheet" href="Content/css/MainPage.css"/>
        <script src="JQueryScripts/Lib/jquery-1.9.1.js"></script>
        <script src="AngularScripts/Lib/angular.js"></script>
        <script src="AngularScripts/Lib/angular-loader.js"></script>
        <script src="AngularScripts/Lib/angular-resource.js"></script>
        <script src="AngularScripts/Lib/bootstrap.js"></script>
        <script src="AngularScripts/MainModule.js"></script>
        <script src="AngularScripts/Controllers/UserController.js"></script>
        <script src="AngularScripts/Directives/loginPartialBinder.js"></script>
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
                                <a class="brand" href="#">Pick Thingzzz!!!</a>
                                <!-- Responsive Navbar Part 2: Place all navbar contents you want collapsed withing .navbar-collapse.collapse. -->
                                <div class="nav-collapse collapse" nav-highlight-active>
                                    <ul class="nav">
                                        <li data-match-route="/Home/Index" data-match-route-default=""><a href="#/Home">Home</a></li>
                                        <li data-match-route="/AboutUs"><a href="#/AboutUs">About Us</a></li>
                                        <li class="dropdown">
                                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Cloud Services <b class="caret"></b></a>
                                            <ul class="dropdown-menu">
                                                <li><a href="#">Car Pooling</a></li>
                                                <li class="divider"></li>
                                                <li class="nav-header">Under Construction</li>
                                                <li><a href="#">Online Exams</a></li>
                                            </ul>
                                        </li>
                                    </ul>

                                    <div style="min-width:100px">

                                    </div>
                                    <ul class="nav pull-right">
                                        <li><a href="#/Login">Login</a></li>
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
                                    <h1>Pick Thingzzz</h1>
                                    <p class="lead hidden-phone">Find things you need. We serve several blogs and cloud services .</p>
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
                    <h3>Pick Thingzzz!!!</h3>
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


    </body>
</html>
