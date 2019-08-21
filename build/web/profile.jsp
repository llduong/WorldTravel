<%-- 
    Document   : profile
    Created on : Feb 27, 2019, 8:46:24 PM
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
                                <h3 class="text-center text-info">Edit profile</h3>
                                <div class="form-group">
                                    <label for="username" class="text-info">Username:</label><br>
                                    <input type="text" name="txtUsername" id="username" class="form-control" value="${requestScope.INFO.ID}" readonly="true">
                                </div>
                                <div class="form-group">
                                    <label for="fullname" class="text-info">Fullname:</label><br>
                                    <input type="text" name="txtFullname" id="fullname" class="form-control" value="${requestScope.INFO.fullname}">
                                    <font color="red">
                                    ${requestScope.INVALID.fullnameError}
                                    </font>
                                </div>
                                <div class="form-group">
                                    <label for="gender" class="text-info">Gender:</label>
                                    <c:if test="${requestScope.INFO.gender == true}">
                                        &emsp;&emsp;
                                        <input name="gender" type="radio" value="Male" checked="checked" /><label class="text-info">Male</label>
                                        &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                                        <input name="gender" type="radio" value="Female"/><label class="text-info">Female</label>
                                    </c:if>
                                    <c:if test="${requestScope.INFO.gender == false}">
                                        &emsp;&emsp;
                                        <input name="gender" type="radio" value="Male" /><label class="text-info">Male</label>
                                        &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                                        <input name="gender" type="radio" value="Female" checked="checked" /><label class="text-info">Female</label>
                                    </c:if>
                                    <font color ="red">
                                    ${requestScope.INVALID.genderError}
                                    </font>
                                </div>
                                <div class="form-group">
                                    <label for="address" class="text-info">Address:</label><br>
                                    <input type="text" name="txtAddress" id="address" class="form-control" value="${requestScope.INFO.address}">
                                    <font color ="red">
                                    ${requestScope.INVALID.addressError}
                                    </font>
                                </div>
                                <div class="form-group">
                                    <label for="phone" class="text-info">Phone:</label><br>
                                    <input type="text" name="txtPhone" id="phone" class="form-control" value="${requestScope.INFO.phone}">
                                    <font color ="red">
                                    ${requestScope.INVALID.phoneError}
                                    </font>
                                </div>
                                <div class="form-group">
                                    <a href="change-password.jsp" class="btn btn-info">Change password</a>
                                    &emsp;&emsp;&emsp;
                                    <input type="submit" name="action" class="btn btn-info btn-md" value="Update Profile">
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
