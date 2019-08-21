<%-- 
    Document   : createaccount
    Created on : Feb 23, 2019, 9:59:45 AM
    Author     : hp
--%>

<%@page import="duong.dtos.RegistrationErrorUser"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="find">
            <!-- Image by https://unsplash.com/@garciasaldana_ -->
            <div class="find_background parallax-window" data-parallax="scroll" data-image-src="images/find.jpg" data-speed="0.8"></div>
            <div class="container">
                <div id="login-row" class="row justify-content-center align-items-center">
                    <div id="login-column" class="col-md-6">
                        <div id="login-box" class="col-md-12">
                            <form id="login-form" class="form" action="MainController" method="POST">
                                <h3 class="text-center text-info">Register</h3>
                                <div class="form-group">
                                    <label for="username" class="text-info">Username:</label><br>
                                    <input type="text" name="txtUsername" id="username" class="form-control" value="${param.txtUsername}">
                                    <font color="red">
                                    ${requestScope.INVALID.usernameError}
                                    </font>
                                </div>
                                <div class="form-group">
                                    <label for="password" class="text-info">Password:</label><br>
                                    <input type="password" name="txtPassword" id="password" class="form-control">
                                    <font color="red">
                                    ${requestScope.INVALID.passwordError}
                                    </font>
                                </div>
                                <div class="form-group">
                                    <label for="confirmpassword" class="text-info">Confirm Password:</label><br>
                                    <input type="password" name="txtConfirm" id="confirmpassword" class="form-control">
                                    <font color="red">
                                    ${requestScope.INVALID.confirmpasswordError}
                                    </font>
                                </div>
                                <div class="form-group">
                                    <label for="fullname" class="text-info">Fullname:</label><br>
                                    <input type="text" name="txtFullname" id="fullname" class="form-control" value="${param.txtFullname}">
                                    <font color="red">
                                    ${requestScope.INVALID.fullnameError}
                                    </font>
                                </div>
                                <div class="form-group">
                                    <label for="gender" class="text-info">Gender:</label>
                                    &emsp;&emsp;
                                    <input name="gender" type="radio" value="Male" /><label class="text-info">Male</label>
                                    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                                    <input name="gender" type="radio" value="Female"/><label class="text-info">Female</label>
                                    <font color ="red">
                                    ${requestScope.INVALID.genderError}
                                    </font>
                                </div>
                                <div class="form-group">
                                    <label for="address" class="text-info">Address:</label><br>
                                    <input type="text" name="txtAddress" id="address" class="form-control" value="${param.txtAddress}">
                                    <font color ="red">
                                    ${requestScope.INVALID.addressError}
                                    </font>
                                </div>
                                <div class="form-group">
                                    <label for="phone" class="text-info">Phone:</label><br>
                                    <input type="text" name="txtPhone" id="phone" class="form-control" value="${param.txtPhone}">
                                    <font color ="red">
                                    ${requestScope.INVALID.phoneError}
                                    </font>
                                </div>
                                <div class="form-group">
                                    <input type="submit" name="action" class="btn btn-info btn-md" value="Create">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>                
            </div>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
