<%-- 
    Document   : ticket-info
    Created on : Mar 13, 2019, 10:39:24 PM
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
        <div class="newsletter">
            <!-- Image by https://unsplash.com/@garciasaldana_ -->
            <div class="newsletter_background" style="background-image:url(images/newsletter.jpg)"></div>
            <div class="container">
                <div class="col">
                    <div class="section_title text-center">
                        <h2 style="color: #ffffff">You have bought tour successful</h2>
                    </div>
                </div>
                <div class="newsletter_content">
                    <center><a href="tour.jsp" class="btn btn-danger">Back to find more tour</a></center>
                    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                    <form action="MainController">
                        <center><input type="submit" class="btn btn-danger" name="action" value="My Cart"/></center>
                    </form>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
