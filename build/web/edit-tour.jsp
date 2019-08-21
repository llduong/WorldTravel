<%-- 
    Document   : edittour
    Created on : Mar 2, 2019, 10:57:16 AM
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
                            <form id="login-form" class="form" action="MainController" method="POST" enctype="multipart/form-data">
                                <h3 class="text-center text-info">Edit Tour</h3>
                                <div class="form-group">
                                    <label for="tourid" class="text-info">TourID:</label><br>
                                    <input type="text" name="txtTourID" id="tourid" class="form-control" readonly="true" value="${requestScope.INFO.ID}">
                                </div>
                                <div class="form-group">
                                    <label for="tourname" class="text-info">Tourname:</label><br>
                                    <input type="text" name="txtTourName" id="tourname" class="form-control" value="${requestScope.INFO.name}">
                                    <font color ="red">
                                    ${requestScope.INVALID.tourNameError}
                                    <font>
                                </div>
                                <div class="form-group">
                                    <label for="dateDeparture" class="text-info">Date Departure:</label>
                                    &emsp;&emsp;&emsp;&emsp;
                                    <input type="date" name="dateDeparture" class="form-control" value="${requestScope.INFO.departureTime}"/>
                                    <font color ="red">
                                    ${requestScope.INVALID.departureTimeError}
                                    <font>
                                </div>
                                <div class="form-group">
                                    <label for="dateArrival" class="text-info">Date Arrival:</label>
                                    &emsp;&emsp;&emsp;&emsp;
                                    <input type="date" name="dateArrival" class="form-control" value="${requestScope.INFO.arrivalTime}"/>
                                    <font color ="red">
                                    ${requestScope.INVALID.arrivalTimeError}
                                    <font>
                                </div>
                                <div class="form-group">
                                    <label for="departurename" class="text-info">Departure name:</label><br>
                                    <input type="text" name="txtDepartureName" id="tourname" class="form-control" value="${requestScope.INFO.departure}">
                                    <font color ="red">
                                    ${requestScope.INVALID.departureNameError}
                                    <font>
                                </div>
                                <div class="form-group">
                                    <label for="arrivalname" class="text-info">Arrival name:</label><br>
                                    <input type="text" name="txtArrivalName" id="tourname" class="form-control" value="${requestScope.INFO.arrival}">
                                    <font color ="red">
                                    ${requestScope.INVALID.arrivalNameError}
                                    <font>
                                </div>
                                <div class="form-group">
                                    <label for="tourname" class="text-info">Ticket:</label><br>
                                    <input type="text" name="Ticket" ma id="tourname" class="form-control" value="${requestScope.INFO.ticket}">
                                    <font color ="red">
                                    ${requestScope.INVALID.ticketError}
                                    <font>
                                </div>
                                <div class="form-group">
                                    <label for="tourname" class="text-info">Price:</label><br>
                                    <input type="text" name="Price" id="tourname" class="form-control" value="${requestScope.INFO.price}">
                                    <font color ="red">
                                    ${requestScope.INVALID.priceError}
                                    <font>
                                </div>
                                <div class="form-group">
                                    <label for="tourname" class="text-info">Details:</label><br>
                                    <textarea name="txtDetails" class="form-control" >${requestScope.INFO.detail}</textarea>
                                    <font color ="red">
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
                                    <input type="hidden" name="isDelete" value="${requestScope.INFO.delete}"/>
                                    <input type="hidden" name="txtTName" value="${requestScope.txtTName}"/>
                                    <input type="hidden" name="imageUrl" value="${requestScope.INFO.image}"/>
                                    <input type="hidden" name="date" value="${requestScope.date}"/>
                                    <input type="submit" name="action" class="btn btn-info btn-md" value="Update Tour">
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
