<%-- 
    Document   : customer-info
    Created on : Mar 10, 2019, 11:02:25 PM
    Author     : hp
--%>

<%@page import="duong.dtos.RegistrationDTAdult"%>
<%@page import="duong.dtos.RegistrationDTChildren" %>
<%@page import="duong.dtos.RegistrationErrorChildrenInfo"%>
<%@page import="duong.dtos.RegistrationErrorAdultInfo"%>
<%@page import="duong.dtos.RegistrationDTTicket"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include  file="header.jsp" %>
        <div class="newsletter">
            <!-- Image by https://unsplash.com/@garciasaldana_ -->
            <div class="newsletter_background" style="background-image:url(images/newsletter.jpg)"></div>
            <div class="container">
                <%!
                    int adultTicket, childrenTicket;
                %>
                <%
                    if (request.getAttribute("adultTicket") != null) {
                        adultTicket = (int) request.getAttribute("adultTicket");
                    }
                    if (request.getAttribute("childrenTicket") != null) {
                        childrenTicket = (int) request.getAttribute("childrenTicket");
                    }
                %>
                <div class="col">
                    <div class="section_title text-center">
                        <h2 style="color: #ffffff">Fill in infomation for all your ticket has bought</h2>
                    </div>
                </div>
                <%
                    if (adultTicket > 0) {
                %>
                <form  action = "MainController" method = "POST" >
                    <div class="newsletter_content">
                        <div class="newsletter_title text-center">Adult Infomation</div>
                        <div class="row top_content">
                            <%
                                RegistrationErrorAdultInfo[] adultError = new RegistrationErrorAdultInfo[adultTicket];
                                RegistrationDTAdult[] adultInfo = new RegistrationDTAdult[adultTicket];
                                if (request.getAttribute("ADULTERROR") != null) {
                                    adultError = (RegistrationErrorAdultInfo[]) request.getAttribute("ADULTERROR");
                                }
                                if (request.getAttribute("ADULTINFO") != null) {
                                    adultInfo = (RegistrationDTAdult[]) request.getAttribute("ADULTINFO");
                                }
                            %>
                            <%                                for (int i = 0; i < adultTicket; i++) {
                            %>
                            <div class="col-lg-3 col-md-6 top_col">
                                <h3 class="text-info">Adult Customer <%= i + 1%></h3>
                                <div class="form-group">
                                    <input type="text" name="txtCusName<%= i%>" id="tourid" class="form-control" placeholder="Name here" 
                                           <%
                                               if (adultInfo[i] != null) {
                                                   if (adultInfo[i].getName() != null) {
                                           %>
                                           value ="<%= adultInfo[i].getName()%>"
                                           <%
                                                   }
                                               }
                                           %>
                                           />
                                    <%
                                        if (adultError[i] != null) {
                                            if (adultError[i].getNameError() != null) {
                                    %>
                                    <font color="red">
                                    <%= adultError[i].getNameError()%>
                                    </font>
                                    <%
                                            }
                                        }
                                    %>
                                    <br/>
                                </div>
                                <div class="form-group">
                                    <input type="text" name="txtCusPassport<%= i%>" id="tourid" class="form-control" placeholder="Passport here" 
                                           <%
                                               if (adultInfo[i] != null) {
                                                   if (adultInfo[i].getPassport() != null) {
                                           %>
                                           value ="<%= adultInfo[i].getPassport()%>"
                                           <%
                                                   }
                                               }
                                           %>/>
                                    <%
                                        if (adultError[i] != null) {
                                            if (adultError[i].getPassportError() != null) {
                                    %>
                                    <font color="red">
                                    <%= adultError[i].getPassportError()%>
                                    </font>
                                    <%
                                            }
                                        }
                                    %>
                                    <br/>
                                </div>
                                <div class="form-group">
                                    <input type="text" name="txtCusPhone<%= i%>" id="tourid" class="form-control" placeholder="Telephone here" 
                                           <%
                                               if (adultInfo[i] != null) {
                                                   if (adultInfo[i].getPhoneNo() != null) {
                                           %>
                                           value ="<%= adultInfo[i].getPhoneNo()%>"
                                           <%
                                                   }
                                               }
                                           %>/>
                                    <%
                                        if (adultError[i] != null) {
                                            if (adultError[i].getPhoneError() != null) {
                                    %>
                                    <font color="red">
                                    <%= adultError[i].getPhoneError()%>
                                    </font>
                                    <%
                                            }
                                        }
                                    %>
                                    <br/>
                                </div>
                                <div class="form-group">
                                    <label for="gender" class="text-info">Gender:</label>
                                    <%
                                        if (adultInfo[i] != null) {
                                            if (adultInfo[i].isGender()) {
                                    %>
                                    &emsp;&emsp;
                                    <input name ="cusGender<%= i%>" type="radio" value="Male" checked ="true" /><label class="text-info">Male</label>
                                    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                                    <input name="cusGender<%= i%>" type="radio" value="Female"/><label class="text-info">Female</label>                                    
                                    <%
                                    } else {
                                    %>
                                    &emsp;&emsp;
                                    <input  name =
                                            "cusGender<%= i%>" type="radio" value="Male" /><label class="text-info">Male</label>
                                    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                                    <input name="cusGender<%= i%>" type="radio" value="Female" checked ="true" /><label class="text-info">Female</label>       
                                    <%
                                        }
                                    } else {
                                    %>
                                    &emsp;&emsp;
                                    <input name ="cusGender<%= i%>" type="radio" value="Male" checked ="true" /><label class="text-info">Male</label>
                                    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                                    <input name="cusGender<%= i%>" type="radio" value="Female"/><label class="text-info">Female</label>  
                                    <%
                                        }
                                        if (adultError[i] != null) {
                                            if (adultError[i].getGenderError() != null) {
                                    %>
                                    <font color="red">
                                    <%= adultError[i].getGenderError()%>
                                    </font>
                                    <%
                                            }
                                        }
                                    %>
                                </div>
                            </div>
                            <%                                    }
                                }
                            %>
                        </div>
                        <%
                            if (childrenTicket > 0) {
                        %>
                        <div class="newsletter_title text-center">Children Infomation</div>
                        <div class="row top_content">
                            <%
                                RegistrationErrorChildrenInfo[] childError = new RegistrationErrorChildrenInfo[childrenTicket];
                                RegistrationDTChildren[] childInfo = new RegistrationDTChildren[childrenTicket];
                                if (request.getAttribute("CHILDRENERROR") != null) {
                                    childError = (RegistrationErrorChildrenInfo[]) request.getAttribute("CHILDRENERROR");
                                }
                                if (request.getAttribute("CHILDRENINFO") != null) {
                                    childInfo = (RegistrationDTChildren[]) request.getAttribute("CHILDRENINFO");
                                }
                            %>
                            <%
                                for (int j = 0; j < childrenTicket; j++) {
                            %>
                            <div class="col-lg-3 col-md-6 top_col">
                                <h3 class="text-info">Children <%=j + 1%></h3>
                                <div class="form-group">
                                    <input type="text" name="txtChildName<%=j%>" id="tourid" class="form-control" placeholder="Name here"
                                           <%
                                               if (childInfo[j] != null) {
                                                   if (childInfo[j].getName() != null) {
                                           %>
                                           value="<%= childInfo[j].getName()%>"
                                           <%
                                                   }
                                               }
                                           %>/>
                                    <%
                                        if (childError[j] != null) {
                                            if (childError[j].getNameError() != null) {
                                    %>
                                    <font color="red">
                                    <%= childError[j].getNameError()%>
                                    </font>
                                    <%
                                            }
                                        }
                                    %>
                                    <br/>
                                </div>
                                <div class="form-group">
                                    <input type="text" name="txtChildPassport<%=j%>" id="tourid" class="form-control" placeholder="Passport here"
                                           <%
                                               if (childInfo[j] != null) {
                                                   if (childInfo[j].getPassport() != null) {
                                           %>
                                           value="<%= childInfo[j].getPassport()%>"
                                           <%
                                                   }
                                               }
                                           %>/>
                                    <%
                                        if (childError[j] != null) {
                                            if (childError[j].getPassportError() != null) {
                                    %>
                                    <font color="red">
                                    <%= childError[j].getPassportError()%>
                                    </font>
                                    <%
                                            }
                                        }
                                    %>
                                    <br/>
                                </div>
                                <div class="form-group">
                                    <label for="gender" class="text-info">Gender:</label>
                                    <%
                                        if (childInfo[j] != null) {
                                            if (childInfo[j].isGender()) {
                                    %>                                    
                                    &emsp;&emsp;                                    
                                    <input name="childGender<%= j%>" type="radio" value="Male" checked ="true" /><label class="text-info">Male</label>
                                    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                                    <input name="childGender<%= j%>" type="radio" value="Female"/><label class="text-info">Female</label>                                    
                                    <%
                                    } else {
                                    %>
                                    &emsp;&emsp;                                    
                                    <input name="childGender<%= j%>" type="radio" value="Male" /><label class="text-info">Male</label>
                                    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                                    <input name="childGender<%= j%>" type="radio" value="Female"  checked ="true"/><label class="text-info">Female</label>                                    
                                    <%
                                        }
                                    } else {
                                    %>
                                    &emsp;&emsp;                                    
                                    <input name="childGender<%= j%>" type="radio" value="Male" checked ="true" /><label class="text-info">Male</label>
                                    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                                    <input name="childGender<%= j%>" type="radio" value="Female"/><label class="text-info">Female</label>       
                                    <%
                                        }
                                        if (childError[j] != null) {
                                            if (childError[j].getGenderError() != null) {
                                    %>
                                    <font color="red">
                                    <%= childError[j].getGenderError()%>
                                    </font>
                                    <%
                                            }
                                        }
                                    %>
                                </div>                                            
                            </div>   

                            <%
                                }
                            %>
                        </div>
                        <%
                            }
                        %>
                        <input type="hidden" name="childrenTicket"  value="<%= childrenTicket + ""%>"/>
                        <input type="hidden" name="adultTicket" value="<%= adultTicket + ""%>"/>
                        <input type="submit" class="btn btn-danger" name="action" value="Add Ticket"/> 
                    </div>
                </form>
            </div>
        </div>
        <%@include  file="footer.jsp" %>
    </body>
</html>
