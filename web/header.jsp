<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Destino</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="Destino project">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="styles/bootstrap4/bootstrap.min.css">
        <link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
        <link href="plugins/magnific-popup/magnific-popup.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="styles/main_styles.css">
        <link rel="stylesheet" type="text/css" href="styles/responsive.css">
        <style>
            .dropdown-content{
                background: #fe435b;
                margin-left: 18px;
                display: none;
                position: absolute;
                background-color: #f5f5f5;
                z-index: 1;
                list-style: none;
            }
            .dropdown{
                position: relative;
                display: inline-block;
            }
            .dropdown:hover .dropdown-content{
                display: block;
            }
            .dropdown-item{
                /*background-color: #003366;*/
                display: block;
                font-size: 15px;
                font-weight: 400;
                line-height: 60px;
                padding-left: 10px;
                padding-right: 10px;
                -webkit-transition: all 200ms ease;
                -moz-transition: all 200ms ease;
                -ms-transition: all 200ms ease;
                -o-transition: all 200ms ease;
                transition: all 200ms ease;
            }
            .dropdown-item:hover{
                background: #fff;
                background-color:#c82333;
                border-color:#bd2130;
            }
            input[type=text], input[type=password] {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                box-sizing: border-box;
            }

            /* Set a style for all buttons */
            button {
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
            }

            button:hover {
                opacity: 0.8;
            }

            /* Extra styles for the cancel button */
            .cancelbtn {
                width: auto;
                padding: 10px 18px;
                background-color: #f44336;
            }

            /* Center the image and position the close button */
            .imgcontainer {
                text-align: center;
                margin: 24px 0 12px 0;
                position: relative;
            }

            img.avatar {
                width: 40%;
                border-radius: 50%;
            }

            .container {
                padding: 16px;
            }

            span.psw {
                float: right;
                padding-top: 16px;
            }

            /* The Modal (background) */
            .modal {
                /* display: none;  Hidden by default */
                position: fixed; /* Stay in place  */
                z-index: 999; /* Sit on top */
                left: 0; 
                top: 0; 
                /* width: 100%;   Full width */
                /* height: 100%;  Full height */
                overflow: auto; /* Enable scroll if needed */
                background-color: rgb(0,0,0);  /* Fallback color */ 
                background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
            }

            /* Modal Content/Box */
            .modal-content {
                background-color: #fefefe;
                margin: 5% auto 4% auto; /* 5% from the top, 15% from the bottom and centered */
                border: 1px solid #888;
                width: 80%; /* Could be more or less, depending on screen size */
                position: relative;
                top: 120px;
            }

            /* The Close Button (x) */
            .close {
                position: absolute;
                right: 25px;
                top: 0;
                color: #000;
                font-size: 35px;
                font-weight: bold;
            }

            .close:hover,
            .close:focus {
                color: red;
                cursor: pointer;
            }

            /* Add Zoom Animation */
            .animate {
                -webkit-animation: animatezoom 0.6s;
                animation: animatezoom 0.6s
            }

            @-webkit-keyframes animatezoom {
                from {-webkit-transform: scale(0)} 
                to {-webkit-transform: scale(1)}
            }

            @keyframes animatezoom {
                from {transform: scale(0)} 
                to {transform: scale(1)}
            }

            /* Change styles for span and cancel button on extra small screens */
            @media screen and (max-width: 300px) {
                span.psw {
                    display: block;
                    float: none;
                }
                .cancelbtn {
                    width: 100%;
                }
            }
        </style>
        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="styles/bootstrap4/popper.js"></script>
        <script src="styles/bootstrap4/bootstrap.min.js"></script>
        <script src="plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
        <script src="plugins/easing/easing.js"></script>
        <script src="plugins/parallax-js-master/parallax.min.js"></script>
        <script src="plugins/magnific-popup/jquery.magnific-popup.min.js"></script>
        <script src="js/custom.js"></script>
    </head>
    <body>

        <div class="super_container" >

            <!-- Header -->

            <header class="header">
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <div class="header_container d-flex flex-row align-items-center justify-content-start">

                                <!-- Logo -->
                                <div class="logo_container">
                                    <div class="logo">
                                        <div>destino</div>
                                        <div>travel agency</div>
                                        <div class="logo_image"><img src="images/logo.png" alt=""></div>
                                    </div>
                                </div>

                                <!-- Main Navigation -->
                                <nav class="main_nav ml-auto">
                                    <ul class="main_nav_list">
                                        <li class="main_nav_item active"><a href="index.jsp">Home</a></li>
                                        <li class="main_nav_item"><a href="about.jsp">About us</a></li>
                                        <li class="main_nav_item"><a href="tour.jsp">Tours</a></li>
                                        <li class="main_nav_item"><a href="contact.jsp">Contact</a></li>
                                            <c:choose>
                                                <c:when test="${sessionScope.USER != null}">
                                                <li class="dropdown main_nav_item " ><a class="drop-btn" href="#" id="navbarDropdown">${sessionScope.USER}</a>
                                                    <div class="dropdown-content">
                                                        <form action ="MainController" method="POST">
                                                            <input type="submit" class="dropdown-item" name="action" value="Edit Profile"/>
                                                            <input type="hidden" name="txtUsername" value="${sessionScope.USER}">
                                                        </form>
                                                        <form action ="MainController" method="POST">
                                                            <input type="submit" class="dropdown-item" name="action" value="My Cart"/>
                                                        </form>
                                                        <div class="dropdown-divider"></div>
                                                        <form action ="MainController" method="POST">
                                                            <input type="submit" class="dropdown-item" name="action" value="Log out"/>
                                                            <input type="hidden" name="txtUsername" value="${sessionScope.USER}">
                                                        </form>
                                                    </div>
                                                </li>
                                            </c:when>
                                            <c:when test="${sessionScope.ADMIN != null}">
                                                <li class="dropdown main_nav_item"><a class="drop-btn" href="#" id="navbarDropdown">${sessionScope.ADMIN}</a>
                                                    <div class="dropdown-content">
                                                        <form action ="MainController" method="POST">
                                                            <input type="submit" class="dropdown-item" name="action" value="Add new tour"/>                                                            
                                                        </form>
                                                        <form action ="MainController" method="POST">
                                                            <input type="submit" class="dropdown-item" name="action" value="View all tour"/>                                                            
                                                        </form>
                                                        <div class="dropdown-divider"></div>
                                                        <form action ="MainController" method="POST">
                                                            <input type="submit" class="dropdown-item" name="action" value="Log out"/>
                                                            <input type="hidden" name="txtUsername" value="${sessionScope.ADMIN}">
                                                        </form>
                                                    </div>
                                                </li>   
                                            </c:when>
                                            <c:otherwise> 
                                                <li class="main_nav_item"><a href="#" onclick="document.getElementById('id01').style.display = 'block'" style="width:auto;">Login Or Register</a></li>
                                                </c:otherwise>
                                            </c:choose>
                                    </ul>
                                </nav>

                                <!-- Search -->
                                <div class="search">
                                </div>

                                <!-- Hamburger -->
                                <div class="hamburger ml-auto"><i class="fa fa-bars" aria-hidden="true"></i></div>

                            </div>
                        </div>
                    </div>
                </div>
            </header>
            <!-- Home -->

            <div class="home">
                <div class="home_background" style="background-image:url(images/home.jpg)"></div>
                <div class="home_content">
                    <div class="home_content_inner">
                        <div class="home_text_large">discover</div>
                        <div class="home_text_small">Discover new worlds</div>
                    </div>
                </div>
            </div>

        </div>
        <div id="id01" class="modal">
            <form class="modal-content animate" action="MainController" method="POST">                

                <div class="container">
                    <h2 class="text-center">Login form</h2>
                    <label for="uname"><b>Username</b></label>
                    <input type="text" placeholder="Enter Username" name="txtUsername" required>


                    <label for="psw"><b>Password</b></label>
                    <input type="password" placeholder="Enter Password" name="txtPassword" required>

                    <button class="btn btn-danger" type="submit" name="action" value="Login">Login</button> 
                    <a href="create-account.jsp" class="btn btn-danger" style="width: 100%">Register</a>
                </div>

            </form>

        </div>

