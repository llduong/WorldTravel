<%-- 
    Document   : viewtour.jsp
    Created on : Mar 2, 2019, 9:45:42 AM
    Author     : hp
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="duong.dtos.RegistrationDTTicket"%>
<%@page import="duong.dtos.RegistrationDTTour"%>
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
                <div class="row">
                    <div class="col-12">
                        <div class="find_form_container">
                            <form action="MainController" id="find_form" class="find_form d-flex flex-md-row flex-column align-items-md-center align-items-start justify-content-md-between justify-content-start flex-wrap" method="POST">
                                <div class="find_item">
                                    <div>Tour name:</div>
                                    <input type="text" class="destination find_input" name="txtTName">
                                </div>
                                <div class="find_item">
                                    <label for="dateArrival" class="text-info">Date:</label>
                                    &emsp;&emsp;&emsp;&emsp;
                                    <input type="date" name="date" class="form-control" />
                                </div>
                                <div class="find_button">
                                    <input type="submit" value="Search" name="action" class="btn btn-danger" style="background-color: #fe435b; border-color: #fe435b"/>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="top">
            <div class="container">
                <font color="red">
                ${requestScope.MESSAGE}
                <br/>
                </font>
                <c:if test="${requestScope.INFO != null}">
                    <c:if test="${not empty requestScope.INFO}" var ="checkList">
                        <table border="4" class="table table-danger">
                            <thead>
                                <tr>
                                    <th>Tour ID</th>
                                    <th>Tour Name</th>
                                    <th>Departure Time</th>
                                    <th>Arrival Time</th>
                                    <th>Departure Name</th>
                                    <th>Arrival Name</th>
                                    <th>Ticket</th>
                                    <th>Price</th>
                                    <th>Status</th>
                                    <th>Is Delete</th>
                                    <th>Edit</th>
                                    <th>Delete</th>
                                    <th>Customer</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items ="${requestScope.INFO}" var="dto" varStatus="counter">
                                    <tr>
                                        <td>${dto.ID}</td>
                                        <td>${dto.name}</td>
                                        <td>${dto.departureTime}</td>
                                        <td>${dto.arrivalTime}</td>
                                        <td>${dto.departure}</td>
                                        <td>${dto.arrival}</td>
                                        <td>${dto.ticket}</td>
                                        <td>${dto.price}</td>
                                        <td>${dto.status}</td>
                                        <td>${dto.delete}</td>
                                        <td>
                                            <form action="MainController" method="POST">
                                                <input type="hidden" name="txtTourID" value="${dto.ID}"/>
                                                <input type="hidden" name="txtTName" value="${param.txtTName}"/>
                                                <input type="hidden" name="date" value="${param.date}"/>
                                                <input type="submit" name="action" class="btn btn-info btn-sm" value="Edit"/>
                                            </form>
                                        </td>
                                        <td>
                                            <form action="MainController" method="POST">
                                                <input type="hidden" name="txtTourID" value="${dto.ID}"/>
                                                <input type="hidden" name="txtTName" value="${param.txtTName}"/>
                                                <input type="hidden" name="date" value="${param.date}"/>
                                                <a href="#" class="btn btn-info btn-sm" onclick="confirmDelete(<c:out value="id"/>)" id="${dto.ID}">Delete</a>
                                            </form>
                                        </td>
                                        <c:if test="${not empty requestScope.TICKET}" var="checkTicket">
                                            <td>
                                                <c:forEach var="ticketList" items="${requestScope.TICKET}">
                                                    <c:if test="${ticketList.tourID == dto.ID}" var="check">
                                                        ${ticketList.totalTicket}                                                        
                                                    </c:if>                                                    
                                                </c:forEach>                                                
                                            </td>
                                        </c:if>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </c:if>

                    <c:if test="${!checkList}">
                        No record found
                    </c:if>
                </c:if>
            </div>
        </div>

        <%@include file="footer.jsp" %>
    </body>
</html>
