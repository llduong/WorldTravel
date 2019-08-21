<%-- 
    Document   : tour
    Created on : Mar 2, 2019, 10:03:05 PM
    Author     : hp
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="duong.dtos.RegistrationDTTour"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file= "header.jsp"%>
        <%@include file= "find.jsp"%>
        <%! List<RegistrationDTTour> Info = new ArrayList<>();%>
        <%
            Info = (List<RegistrationDTTour>) request.getAttribute("INFO");
        %>
        <c:if test="${requestScope.INFO != null}">
            <c:if test="${not empty requestScope.INFO}" var ="checkList">
                <c:forEach items ="${requestScope.INFO}" var="dto" varStatus="counter">
                    <div style="z-index: 9999;" class="modal fade" id="-${dto.ID}" tabindex="-1" role="dialog">
                        <div class="modal-dialog modal-lg">
                            <div class="modal-content container">
                                <div class="modal-header">
                                    <h4 class="modal-title" id="exampleModalLabel" style="color: #17a2b8;">Tour name: ${dto.name}</h4>
                                    <h4 class="modal-title" style="color: #dc3545;">Price($): ${dto.price}</h4>
                                </div>
                                <div class="modal-body">
                                    <h3 style="color: #17a2b8;">Tour's detail</h3>
                                    <p>${dto.detail}</p>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </c:if>

        </c:if>

        <c:if test="${sessionScope.USER != null}">
            <c:if test="${requestScope.INFO != null}">
                <c:if test="${not empty requestScope.INFO}" var ="checkList">
                    <c:forEach items ="${requestScope.INFO}" var="dto" varStatus="counter">
                        <div style="z-index: 9999;" class="modal fade" id="${dto.ID}${counter.count}" tabindex="-1">
                            <div class="modal-dialog modal-lg">
                                <div class="modal-content container">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLabel">Add Tour ${dto.name} to your cart</h5>
                                    </div>
                                    <div class="modal-body">
                                        <h3 for="ticket" class="text-info">Ticket available for this tour: ${dto.ticket}</h3>
                                        <br/>
                                        <label for="ticketAdult" class="text-info">Ticket for adult :</label><br/>
                                        <input type="number" name="adult" required id="adultT${counter.count}" value="0" min="0">
                                        <br/>
                                        <label for="ticketChildren" class="text-info">Ticket for children (Half price):</label>
                                        <br/>
                                        <input type="number" name="children" required id="childrenT${counter.count}" value="0" min="0">
                                        <button class="btn btn-info" onclick="check(${dto.price}, ${counter.count})">Click to know total price</button>
                                        <br/>
                                        <label for="price" class="text-info" id="totalPrice${counter.count}"></label>
                                        <a href="#" class="btn btn-info" id="${dto.ID}" style="width: 100%" onclick="addTicket(<c:out value="id"/>, ${counter.count}, ${dto.ticket})">Add to your cart</a>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </c:if>

            </c:if>
            <div class="top">
                <c:if test="${requestScope.INFO != null}">
                    <c:if test="${not empty requestScope.INFO}" var ="checkList">
                        <c:forEach items ="${requestScope.INFO}" var="dto" varStatus="counter">
                            <c:if test="${counter.count % 4 == 1}" var="index">
                                <div class="container">
                                    <div class="row top_content">
                                        <div class="col-lg-3 col-md-6 top_col">
                                            <h5>${dto.name}</h5>
                                            <div class="top_item">
                                                <div class="top_item_image"><img src="${dto.image}"/></div>
                                                    <c:if test="${dto.status == true}" var="checkStatus">
                                                    <div class="top_item_content">
                                                        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#-${dto.ID}">
                                                            More detail
                                                        </button>
                                                        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#${dto.ID}${counter.count}">
                                                            Add to Cart
                                                        </button>
                                                    </div>
                                                </c:if>
                                                <c:if test="${!checkStatus}">
                                                    <div class="top_item_content">
                                                        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#-${dto.ID}">
                                                            More detail
                                                        </button>
                                                        <button type="button" class="btn btn-secondary" disabled="true">
                                                            Tour is on updating
                                                        </button>
                                                    </div>
                                                </c:if>
                                            </div>
                                        </div>
                                    </c:if>
                                    <c:if test="${!index}">
                                        <div class="col-lg-3 col-md-6 top_col">
                                            <h5>${dto.name}</h5>
                                            <div class="top_item">
                                                <div class="top_item_image"><img src="${dto.image}"/></div>
                                                    <c:if test="${dto.status == true}" var="checkStatus">
                                                    <div class="top_item_content">
                                                        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#-${dto.ID}">
                                                            More detail
                                                        </button>
                                                        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#${dto.ID}${counter.count}">
                                                            Add to Cart
                                                        </button>
                                                    </div>
                                                </c:if>
                                                <c:if test="${!checkStatus}">
                                                    <div class="top_item_content">
                                                        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#-${dto.ID}">
                                                            More detail
                                                        </button>
                                                        <button type="button" class="btn btn-secondary" disabled="true">
                                                            Tour is on updating
                                                        </button>
                                                    </div>
                                                </c:if>
                                            </div>
                                        </div>
                                        <c:if test="${counter.count == 4}">
                                        </div>
                                    </div>
                                </c:if>
                            </c:if>
                        </c:forEach>
                        <% if (!Info.isEmpty()) {
                                if (Info.size() % 4 != 0) {  %>
                    </div>
                </div>
                <%
                        }
                    }
                %>
            </c:if>

            <c:if test="${!checkList}">
                <div class="col">
                    <div class="section_title text-center">
                        <h2 class="text-info">We don't have that tour yet</h2>
                    </div>
                </div>
            </c:if>
        </c:if>
    </div>
</c:if>

<c:if test="${sessionScope.ADMIN != null}">
    <div class="top">
        <c:if test="${requestScope.INFO != null}">
            <c:if test="${not empty requestScope.INFO}" var ="checkList">
                <c:forEach items ="${requestScope.INFO}" var="dto" varStatus="counter">
                    <c:if test="${counter.count % 4 == 1}" var="index">
                        <div class="container">
                            <div class="row top_content">
                                <div class="col-lg-3 col-md-6 top_col">
                                    <h5>${dto.name}</h5>
                                    <div class="top_item">
                                        <div class="top_item_image"><img src="${dto.image}"/></div>
                                            <c:if test="${dto.status == true}" var="checkStatus">
                                            <div class="top_item_content">
                                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#-${dto.ID}">
                                                    More detail
                                                </button>                                                 
                                            </div>
                                        </c:if>
                                        <c:if test="${!checkStatus}">
                                            <div class="top_item_content">
                                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#-${dto.ID}">
                                                    More detail
                                                </button>
                                                <button type="button" class="btn btn-secondary" disabled="true">
                                                    Tour is on updating
                                                </button>
                                            </div>
                                        </c:if>
                                    </div>
                                </div>
                            </c:if>
                            <c:if test="${!index}">
                                <div class="col-lg-3 col-md-6 top_col">
                                    <h5>${dto.name}</h5>
                                    <div class="top_item">
                                        <div class="top_item_image"><img src="${dto.image}"/></div>
                                            <c:if test="${dto.status == true}" var="checkStatus">
                                            <div class="top_item_content">
                                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#-${dto.ID}">
                                                    More detail
                                                </button>
                                            </div>
                                        </c:if>
                                        <c:if test="${!checkStatus}">
                                            <div class="top_item_content">
                                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#-${dto.ID}">
                                                    More detail
                                                </button>
                                                <button type="button" class="btn btn-secondary" disabled="true">
                                                    Tour is on updating
                                                </button>
                                            </div>
                                        </c:if>
                                    </div>
                                </div>
                                <c:if test="${counter.count == 4}">
                                </div>
                            </div>
                        </c:if>
                    </c:if>
                </c:forEach>
                <%
                    if (!Info.isEmpty()) {
                        if (Info.size() % 4 != 0) {
                %>
            </div>
        </div>
        <%
                }
            }
        %>
    </c:if>

    <c:if test="${!checkList}">
        <div class="col">
            <div class="section_title text-center">
                <h2 class="text-info">We don't have that tour yet</h2>
            </div>
        </div>
    </c:if>
</c:if>
</div>
</c:if>
<c:if test="${sessionScope.ADMIN == null && sessionScope.USER == null}">
    <div class="top">
        <c:if test="${requestScope.INFO != null}">
            <c:if test="${not empty requestScope.INFO}" var ="checkList">
                <c:forEach items ="${requestScope.INFO}" var="dto" varStatus="counter">
                    <c:if test="${counter.count % 4 == 1}" var="index">
                        <div class="container">
                            <div class="row top_content">
                                <div class="col-lg-3 col-md-6 top_col">
                                    <h5>${dto.name}</h5>
                                    <div class="top_item">
                                        <div class="top_item_image"><img src="${dto.image}"/></div>
                                            <c:if test="${dto.status == true}" var="checkStatus">
                                            <div class="top_item_content">
                                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#-${dto.ID}">
                                                    More detail
                                                </button>
                                                <button type="button" class="btn btn-secondary" disabled="true">
                                                    Must login to buy tour
                                                </button>
                                            </div>
                                        </c:if>
                                        <c:if test="${!checkStatus}">
                                            <div class="top_item_content">
                                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#-${dto.ID}">
                                                    More detail
                                                </button>
                                                <button type="button" class="btn btn-secondary" disabled="true">
                                                    Must login to buy tour
                                                </button>
                                            </div>
                                        </c:if>
                                    </div>
                                </div>
                            </c:if>
                            <c:if test="${!index}">
                                <div class="col-lg-3 col-md-6 top_col">
                                    <h5>${dto.name}</h5>
                                    <div class="top_item">
                                        <div class="top_item_image"><img src="${dto.image}"/></div>
                                            <c:if test="${dto.status == true}" var="checkStatus">
                                            <div class="top_item_content">
                                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#-${dto.ID}">
                                                    More detail
                                                </button>
                                                <button type="button" class="btn btn-secondary" disabled="true">
                                                    Must login to buy tour
                                                </button>
                                            </div>
                                        </c:if>
                                        <c:if test="${!checkStatus}">
                                            <div class="top_item_content">
                                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#-${dto.ID}">
                                                    More detail
                                                </button>
                                                <button type="button" class="btn btn-secondary" disabled="true">
                                                    Tour is on updating
                                                </button>
                                            </div>
                                        </c:if>
                                    </div>
                                </div>
                                <c:if test="${counter.count == 4}">
                                </div>
                            </div>
                        </c:if>
                    </c:if>
                </c:forEach>
                <%
                    if (!Info.isEmpty()) {
                        if (Info.size() % 4 != 0) {
                %>
            </div>
        </div>
        <%
                }
            }
        %>
    </c:if>

    <c:if test="${!checkList}">
        <div class="col">
            <div class="section_title text-center">
                <h2 class="text-info">We don't have that tour yet</h2>
            </div>
        </div>
    </c:if>
</c:if>
</div>
</c:if>
<%@include  file="footer.jsp" %>
</body> 
</html>
