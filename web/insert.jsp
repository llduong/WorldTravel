<%-- 
    Document   : insert
    Created on : Feb 24, 2019, 6:02:09 PM
    Author     : hp
--%>

<%@page import="duong.dtos.RegistrationErrorTour"%>
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
                            <form id="login-form" class="form" action="MainController" method="POST" enctype="multipart/form-data">
                                <h3 class="text-center text-info">Insert Tour</h3>
                                <div class="form-group">
                                    <label for="tourid" class="text-info">TourID:</label><br>
                                    <input type="text" name="txtTourID" id="tourid" class="form-control" value="${param.txtTourID}">
                                    <font color ="#ba2525">
                                    ${requestScope.INVALID.tourIDError}
                                    <font>
                                </div>
                                <div class="form-group">
                                    <label for="tourname" class="text-info">Tourname:</label><br>
                                    <input type="text" name="txtTourname" id="tourname" class="form-control" value="${param.txtTourname}">
                                    <font color ="#ba2525">
                                    ${requestScope.INVALID.tourNameError}
                                    <font>
                                </div>
                                <div class="form-group">
                                    <label for="dateDeparture" class="text-info">Date Departure:</label>
                                    &emsp;&emsp;&emsp;&emsp;
                                    <input type="date" name="dateDeparture" class="form-control" value="${param.dateDeparture}"/>
                                    <font color ="#ba2525">
                                    ${requestScope.INVALID.departureTimeError}
                                    <font>
                                </div>
                                <div class="form-group">
                                    <label for="dateArrival" class="text-info">Date Arrival:</label>
                                    &emsp;&emsp;&emsp;&emsp;
                                    <input type="date" name="dateArrival" class="form-control" value="${param.dateArrival}"/>
                                    <font color ="#ba2525">
                                    ${requestScope.INVALID.arrivalTimeError}
                                    <font>
                                </div>
                                <div class="form-group">
                                    <label for="departurename" class="text-info">Departure name:</label><br>
                                    <input type="text" name="txtDeparturename" id="tourname" class="form-control" value="${param.txtDeparturename}">
                                    <font color ="#ba2525">
                                    ${requestScope.INVALID.departureNameError}
                                    <font>
                                </div>
                                <div class="form-group">
                                    <label for="arrivalname" class="text-info">Arrival name:</label><br>
                                    <input type="text" name="txtArrivalname" id="tourname" class="form-control" value="${param.txtArrivalname}">
                                    <font color ="#ba2525">
                                    ${requestScope.INVALID.arrivalNameError}
                                    <font>
                                </div>
                                <div class="form-group">
                                    <label for="tourname" class="text-info">Ticket:</label><br>
                                    <input type="text" name="Ticket" class="form-control" value="${requestScope.INFO.ticket}">
                                    <font color ="#ba2525">
                                    ${requestScope.INVALID.ticketError}
                                    <font>
                                </div>
                                <div class="form-group">
                                    <label for="tourname" class="text-info">Price($):</label><br>
                                    <input type="text" name="Price" class="form-control" value="${requestScope.INFO.price}">
                                    <font color ="#ba2525">
                                    ${requestScope.INVALID.priceError}
                                    <font>
                                </div>
                                <div class="form-group">
                                    <label for="tourname" class="text-info">Details:</label><br>
                                    <textarea name="txtDetails" class="form-control">${param.txtDetails}</textarea>
                                    <font color ="#ba2525">
                                    ${requestScope.INVALID.detailError}
                                    <font>
                                </div>
                                <div class="form-group">
                                    <label for="image" class="text-info">Image:</label>
                                    &emsp;&emsp;&emsp;&emsp;
                                    <input type="file" name="txtImage" id="tourimage" class="form-control" value="${param.txtImage}"/>
                                    <font color="#ba2525">
                                    ${requestScope.INVALID.imageError}
                                    <font>
                                </div>
                                <div class="form-group">
                                    <input type="submit" name="action" class="btn btn-info btn-md" value="Add Tour">
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
