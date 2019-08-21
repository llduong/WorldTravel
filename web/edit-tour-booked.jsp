<%-- 
    Document   : edittour-booked
    Created on : Mar 9, 2019, 8:57:04 PM
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
                                <h3 class="text-center text-info">Edit Tour</h3>
                                <div class="form-group">
                                    <label for="tourid" class="text-info">TourID:</label><br>
                                    <input type="text" name="txtTourID" id="tourid" class="form-control" readonly="true" value="${requestScope.INFO.ID}">
                                </div>                                
                                <div class="form-group">
                                    <label for="tourid" class="text-info">Ticket:</label><br>
                                    <input type="text" name="Ticket" id="tourid" class="form-control" value="${requestScope.INFO.ticket}">
                                    <font color="red">
                                    ${requestScope.INVALID}
                                    </font>
                                </div>
                                <div class="form-group">
                                    <label for="image" class="text-info">Status:</label>
                                    &emsp;&emsp;&emsp;&emsp;
                                    <c:if test="${requestScope.INFO.status == false}">
                                        <input type="checkbox" name="status" value="status"/>
                                    </c:if>
                                    <c:if test="${requestScope.INFO.status == true}">
                                        <input type="checkbox" name="status" value="status" checked="checked"/>
                                    </c:if>
                                </div>
                                <div class="form-group">
                                    <input type="hidden" name="txtTName" value="${requestScope.txtTName}"/>
                                    <input type="hidden" name="date" value="${requestScope.date}"/>
                                    <input type="submit" name="action" class="btn btn-info btn-md" value="Update Tour Booked">
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
