<%-- 
    Document   : MyCart
    Created on : Mar 6, 2019, 11:59:17 AM
    Author     : hp
--%>

<%@page import="duong.dtos.RegistrationDTTicket"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
        <div class="top">            
            <div class="container">
                <div class="newsletter_content">
                    <c:if test="${requestScope.INFO != null}">
                        <c:if test="${not empty requestScope.INFO}" var="checkList">
                            <table border="4" class="table-info table">
                                <thead>
                                    <tr>
                                        <th>No</th>
                                        <th>Ticket ID</th>
                                        <th>Tour ID</th>
                                        <th>Tour Name</th>
                                        <th>Adult Ticket</th>
                                        <th>Children Ticket</th>
                                        <th>Total Price</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${requestScope.INFO}" var="dto" varStatus="counter">
                                        <tr>
                                            <td>${counter.count}</td>
                                            <td>${dto.ID}</td>
                                            <td>${dto.tourID}</td>
                                            <td>${dto.tourname}</td>
                                            <td>${dto.adultTicket}</td>
                                            <td>${dto.childrenTicket}</td>
                                            <td>${dto.totalPrice}</td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </c:if>
                        <c:if test="${!checkList}">
                            <h3 class="text-center text-info">You didn't buy anytour</h3>
                        </c:if>
                    </c:if>
                    <h3 class="text-center text-info">${requestScope.MESSAGE}</h3>
                    <form action ="MainController">
                        <input type="submit" class="btn btn-danger" value="Show History" name="action"/>
                    </form>
                </div>                
            </div>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
