<%-- 
    Document   : changepassword
    Created on : Feb 27, 2019, 9:46:55 PM
    Author     : hp
--%>

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
                                <h3 class="text-center text-info">Change password</h3>                                
                                <div class="form-group">
                                    <label for="password" class="text-info">Old password:</label><br>
                                    <input type="password" name="txtPassword" id="password" class="form-control" />
                                    <font color="red">
                                    ${requestScope.INVALID.passwordError}
                                    </font>
                                </div>
                                <div class="form-group">
                                    <label for="newpassword" class="text-info">New password:</label><br>
                                    <input type="password" name="txtNewPassword" id="newpassword" class="form-control" />
                                    <font color="red">
                                    ${requestScope.INVALID.newpasswordError}
                                    </font>
                                </div>
                                <div class="form-group">
                                    <label for="confirmpassword" class="text-info">Confirm new password:</label><br>
                                    <input type="password" name="txtConfirmNewPassword" id="confirmnewpassword" class="form-control"/>
                                    <font color="red">
                                    ${requestScope.INVALID.confirmpasswordError}
                                    </font>
                                </div>
                                <input type="submit" name="action" class="btn btn-info btn-md" value="Change Password">
                            </form>
                        </div>
                    </div>
                </div>                
            </div>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
