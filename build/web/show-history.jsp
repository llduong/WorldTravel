<%-- 
    Document   : show-history
    Created on : Mar 13, 2019, 11:59:10 PM
    Author     : hp
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="duong.dtos.RegistrationDTTour"%>
<%@page import="java.util.List"%>
<%@page import="duong.dtos.RegistrationDTTicket"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="newsletter">
            <!-- Image by https://unsplash.com/@garciasaldana_ -->
            <div class="newsletter_background" style="background-image:url(images/newsletter.jpg)"></div>
            <div class="container">
                <%
                    List<RegistrationDTTour> tours = null;
                    List<RegistrationDTTicket> tickets = null;
                    if (request.getAttribute("TOUR") != null) {
                        tours = (ArrayList<RegistrationDTTour>) request.getAttribute("TOUR");
                    }
                    if (request.getAttribute("TICKET") != null) {
                        tickets = (ArrayList<RegistrationDTTicket>) request.getAttribute("TICKET");
                    }
                    if (tickets != null && tours != null) {
                %>
                <table border="1" class="table table-info">
                    <thead>
                        <tr>
                            <th>Ticket ID</th>
                            <th>Tour ID</th>
                            <th>Tour Name</th>
                            <th>Departure Time</th>
                            <th>Arrival Time</th>
                            <th>Departure</th>
                            <th>Arrival</th>
                            <th>Adult</th>
                            <th>Children</th>
                            <th>Total price</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for (int i = 0; i < tickets.size(); i++) {
                        %>
                        <tr>
                            <td>
                                <%= tickets.get(i).getID()%>
                            </td>
                            <td>
                                <%= tours.get(i).getID()%>
                            </td>
                            <td>
                                <%= tours.get(i).getName()%>
                            </td>
                            <td>
                                <%= tours.get(i).getDepartureTime()%>
                            </td>
                            <td>
                                <%= tours.get(i).getArrivalTime()%>
                            </td>
                            <td>
                                <%= tours.get(i).getDeparture()%>
                            </td>
                            <td>
                                <%= tours.get(i).getArrival()%>
                            </td>
                            <td>
                                <%= tickets.get(i).getAdultTicket()%>
                            </td>
                            <td>
                                <%= tickets.get(i).getChildrenTicket()%>
                            </td>
                            <td>
                                <%= tickets.get(i).getTotalPrice()%>
                            </td>
                        </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
                <%                    }
                %>
            </div>
        </div>
    </div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>

