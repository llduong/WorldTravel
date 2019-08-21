package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Destino</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"description\" content=\"Destino project\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/bootstrap4/bootstrap.min.css\">\n");
      out.write("        <link href=\"plugins/font-awesome-4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.carousel.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.theme.default.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/animate.css\">\n");
      out.write("        <link href=\"plugins/magnific-popup/magnific-popup.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/main_styles.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/responsive.css\">\n");
      out.write("        <style>\n");
      out.write("            .dropdown-content{\n");
      out.write("                background: #fe435b;\n");
      out.write("                margin-left: 18px;\n");
      out.write("                display: none;\n");
      out.write("                position: absolute;\n");
      out.write("                background-color: #f5f5f5;\n");
      out.write("                z-index: 1;\n");
      out.write("                list-style: none;\n");
      out.write("            }\n");
      out.write("            .dropdown{\n");
      out.write("                position: relative;\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("            .dropdown:hover .dropdown-content{\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("            .dropdown-item{\n");
      out.write("                /*background-color: #003366;*/\n");
      out.write("                display: block;\n");
      out.write("                font-size: 15px;\n");
      out.write("                font-weight: 400;\n");
      out.write("                line-height: 60px;\n");
      out.write("                padding-left: 10px;\n");
      out.write("                padding-right: 10px;\n");
      out.write("                -webkit-transition: all 200ms ease;\n");
      out.write("                -moz-transition: all 200ms ease;\n");
      out.write("                -ms-transition: all 200ms ease;\n");
      out.write("                -o-transition: all 200ms ease;\n");
      out.write("                transition: all 200ms ease;\n");
      out.write("            }\n");
      out.write("            .dropdown-item:hover{\n");
      out.write("                background: #fff;\n");
      out.write("                background-color:#c82333;\n");
      out.write("                border-color:#bd2130;\n");
      out.write("            }\n");
      out.write("            input[type=text], input[type=password] {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                display: inline-block;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Set a style for all buttons */\n");
      out.write("            button {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button:hover {\n");
      out.write("                opacity: 0.8;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Extra styles for the cancel button */\n");
      out.write("            .cancelbtn {\n");
      out.write("                width: auto;\n");
      out.write("                padding: 10px 18px;\n");
      out.write("                background-color: #f44336;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Center the image and position the close button */\n");
      out.write("            .imgcontainer {\n");
      out.write("                text-align: center;\n");
      out.write("                margin: 24px 0 12px 0;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            img.avatar {\n");
      out.write("                width: 40%;\n");
      out.write("                border-radius: 50%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container {\n");
      out.write("                padding: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            span.psw {\n");
      out.write("                float: right;\n");
      out.write("                padding-top: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* The Modal (background) */\n");
      out.write("            .modal {\n");
      out.write("                /* display: none;  Hidden by default */\n");
      out.write("                position: fixed; /* Stay in place  */\n");
      out.write("                z-index: 1; /* Sit on top */\n");
      out.write("                left: 0; \n");
      out.write("                top: 0; \n");
      out.write("                /* width: 100%;   Full width */\n");
      out.write("                /* height: 100%;  Full height */\n");
      out.write("                overflow: auto; /* Enable scroll if needed */\n");
      out.write("                background-color: rgb(0,0,0);  /* Fallback color */ \n");
      out.write("                background-color: rgba(0,0,0,0.4); /* Black w/ opacity */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Modal Content/Box */\n");
      out.write("            .modal-content {\n");
      out.write("                background-color: #fefefe;\n");
      out.write("                margin: 5% auto 4% auto; /* 5% from the top, 15% from the bottom and centered */\n");
      out.write("                border: 1px solid #888;\n");
      out.write("                width: 80%; /* Could be more or less, depending on screen size */\n");
      out.write("                position: relative;\n");
      out.write("                top: 120px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* The Close Button (x) */\n");
      out.write("            .close {\n");
      out.write("                position: absolute;\n");
      out.write("                right: 25px;\n");
      out.write("                top: 0;\n");
      out.write("                color: #000;\n");
      out.write("                font-size: 35px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .close:hover,\n");
      out.write("            .close:focus {\n");
      out.write("                color: red;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Add Zoom Animation */\n");
      out.write("            .animate {\n");
      out.write("                -webkit-animation: animatezoom 0.6s;\n");
      out.write("                animation: animatezoom 0.6s\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @-webkit-keyframes animatezoom {\n");
      out.write("                from {-webkit-transform: scale(0)} \n");
      out.write("                to {-webkit-transform: scale(1)}\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @keyframes animatezoom {\n");
      out.write("                from {transform: scale(0)} \n");
      out.write("                to {transform: scale(1)}\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Change styles for span and cancel button on extra small screens */\n");
      out.write("            @media screen and (max-width: 300px) {\n");
      out.write("                span.psw {\n");
      out.write("                    display: block;\n");
      out.write("                    float: none;\n");
      out.write("                }\n");
      out.write("                .cancelbtn {\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"super_container\" >\n");
      out.write("\n");
      out.write("            <!-- Header -->\n");
      out.write("\n");
      out.write("            <header class=\"header\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <div class=\"header_container d-flex flex-row align-items-center justify-content-start\">\n");
      out.write("\n");
      out.write("                                <!-- Logo -->\n");
      out.write("                                <div class=\"logo_container\">\n");
      out.write("                                    <div class=\"logo\">\n");
      out.write("                                        <div>destino</div>\n");
      out.write("                                        <div>travel agency</div>\n");
      out.write("                                        <div class=\"logo_image\"><img src=\"images/logo.png\" alt=\"\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!--                                <nav class=\"main_nav ml-auto\">\n");
      out.write("                                                                    <p>AJHKHSJKHDJKSHDJKHDJKSHDJKHDSJKHDJKHSDJKHSDJKHJK</p>\n");
      out.write("                                                                </nav>-->\n");
      out.write("                                <!-- Main Navigation -->\n");
      out.write("                                <nav class=\"main_nav ml-auto\">\n");
      out.write("                                    <ul class=\"main_nav_list\">\n");
      out.write("                                        <li class=\"main_nav_item active\"><a href=\"#\">Home</a></li>\n");
      out.write("                                        <li class=\"main_nav_item\"><a href=\"about.jsp\">About us</a></li>\n");
      out.write("                                        <li class=\"main_nav_item\"><a href=\"tours.jsp\">Tours</a></li>\n");
      out.write("                                        <li class=\"main_nav_item\"><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                                            ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </nav>\n");
      out.write("                                <!--<div class=\"\"-->\n");
      out.write("\n");
      out.write("                                <!-- Search -->\n");
      out.write("                                <div class=\"search\">\n");
      out.write("                                    <form action=\"#\" class=\"search_form\">\n");
      out.write("                                        <input type=\"search\" name=\"search_input\" class=\"search_input ctrl_class\" required=\"required\" placeholder=\"Keyword\">\n");
      out.write("                                        <button type=\"submit\" class=\"search_button ml-auto ctrl_class\"><img src=\"images/search.png\" alt=\"\"></button>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Hamburger -->\n");
      out.write("                                <div class=\"hamburger ml-auto\"><i class=\"fa fa-bars\" aria-hidden=\"true\"></i></div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <!--           <div class=\"menu_container menu_mm\">\n");
      out.write("            \n");
      out.write("                             Menu Close Button \n");
      out.write("                            <div class=\"menu_close_container\">\n");
      out.write("                                <div class=\"menu_close\"></div>\n");
      out.write("                            </div>\n");
      out.write("            \n");
      out.write("                             Menu Items \n");
      out.write("                            <div class=\"menu_inner menu_mm\">\n");
      out.write("                                <div class=\"menu menu_mm\">\n");
      out.write("                                    <div class=\"menu_search_form_container\">\n");
      out.write("                                        <form action=\"#\" id=\"menu_search_form\">\n");
      out.write("                                            <input type=\"search\" class=\"menu_search_input menu_mm\">\n");
      out.write("                                            <button id=\"menu_search_submit\" class=\"menu_search_submit\" type=\"submit\"><img src=\"images/search_2.png\" alt=\"\"></button>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                    <ul class=\"menu_list menu_mm\">\n");
      out.write("                                        <li class=\"menu_item menu_mm\"><a href=\"#\">Home</a></li>\n");
      out.write("                                        <li class=\"menu_item menu_mm\"><a href=\"about.html\">About us</a></li>\n");
      out.write("                                        <li class=\"menu_item menu_mm\"><a href=\"offers.html\">Offers</a></li>\n");
      out.write("                                        <li class=\"menu_item menu_mm\"><a href=\"news.html\">News</a></li>\n");
      out.write("                                        <li class=\"menu_item menu_mm\"><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("            \n");
      out.write("                                     Menu Social \n");
      out.write("            \n");
      out.write("                                    <div class=\"menu_social_container menu_mm\">\n");
      out.write("                                        <ul class=\"menu_social menu_mm\">\n");
      out.write("                                            <li class=\"menu_social_item menu_mm\"><a href=\"#\"><i class=\"fa fa-pinterest\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                            <li class=\"menu_social_item menu_mm\"><a href=\"#\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                            <li class=\"menu_social_item menu_mm\"><a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                            <li class=\"menu_social_item menu_mm\"><a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                            <li class=\"menu_social_item menu_mm\"><a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("            \n");
      out.write("                                    <div class=\"menu_copyright menu_mm\">Colorlib All rights reserved</div>\n");
      out.write("                                </div>\n");
      out.write("            \n");
      out.write("                            </div>\n");
      out.write("            \n");
      out.write("                        </div>-->\n");
      out.write("\n");
      out.write("            <!-- Home -->\n");
      out.write("\n");
      out.write("            <div class=\"home\">\n");
      out.write("                <div class=\"home_background\" style=\"background-image:url(images/home.jpg)\"></div>\n");
      out.write("                <div class=\"home_content\">\n");
      out.write("                    <div class=\"home_content_inner\">\n");
      out.write("                        <div class=\"home_text_large\">discover</div>\n");
      out.write("                        <div class=\"home_text_small\">Discover new worlds</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"id01\" class=\"modal\">\n");
      out.write("            <form class=\"modal-content animate\" action=\"MainController\" method=\"POST\">                \n");
      out.write("\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h2 class=\"text-center\">Login form</h2>\n");
      out.write("                    <label for=\"uname\"><b>Username</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter Username\" name=\"txtUsername\" required>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <label for=\"psw\"><b>Password</b></label>\n");
      out.write("                    <input type=\"password\" placeholder=\"Enter Password\" name=\"txtPassword\" required>\n");
      out.write("\n");
      out.write("                    <button class=\"btn btn-danger\" type=\"submit\" name=\"action\" value=\"Login\">Login</button> \n");
      out.write("                    <a href=\"createaccount.jsp\" class=\"btn btn-danger\" style=\"width: 100%\">Register</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\t<footer class=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Footer Column -->\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 footer_col\">\n");
      out.write("\t\t\t\t\t<div class=\"footer_about\">\n");
      out.write("\t\t\t\t\t\t<!-- Logo -->\n");
      out.write("\t\t\t\t\t\t<div class=\"logo_container\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>destino</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div>travel agency</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"logo_image\"><img src=\"images/logo.png\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"footer_about_text\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer pulvinar sed mauris eget tincidunt. Sed lectus nulla, tempor vel eleifend quis, tempus rut rum metus. Pellentesque ultricies enim eu quam fermentum hendrerit.</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"copyright\"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Footer Column -->\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 footer_col\">\n");
      out.write("\t\t\t\t\t<div class=\"footer_latest\">\n");
      out.write("\t\t\t\t\t\t<div class=\"footer_title\">Latest News</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"footer_latest_content\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- Footer Latest Post -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"footer_latest_item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"footer_latest_image\"><img src=\"images/latest_1.jpg\" alt=\"https://unsplash.com/@peecho\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"footer_latest_item_content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"footer_latest_item_title\"><a href=\"news.html\">Brazil Summer</a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"footer_latest_item_date\">Jan 09, 2018</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- Footer Latest Post -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"footer_latest_item\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"footer_latest_image\"><img src=\"images/latest_2.jpg\" alt=\"https://unsplash.com/@sanfrancisco\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"footer_latest_item_content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"footer_latest_item_title\"><a href=\"news.html\">A perfect vacation</a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"footer_latest_item_date\">Jan 09, 2018</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Footer Column -->\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 footer_col\">\n");
      out.write("\t\t\t\t\t<div class=\"tags footer_tags\">\n");
      out.write("\t\t\t\t\t\t<div class=\"footer_title\">Tags</div>\n");
      out.write("\t\t\t\t\t\t<ul class=\"tags_content d-flex flex-row flex-wrap align-items-start justify-content-start\">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"tag\"><a href=\"#\">travel</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"tag\"><a href=\"#\">summer</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"tag\"><a href=\"#\">cruise</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"tag\"><a href=\"#\">beach</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"tag\"><a href=\"#\">offer</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"tag\"><a href=\"#\">vacation</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"tag\"><a href=\"#\">trip</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"tag\"><a href=\"#\">city break</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"tag\"><a href=\"#\">adventure</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("<script src=\"styles/bootstrap4/popper.js\"></script>\n");
      out.write("<script src=\"styles/bootstrap4/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"plugins/OwlCarousel2-2.2.1/owl.carousel.js\"></script>\n");
      out.write("<script src=\"plugins/easing/easing.js\"></script>\n");
      out.write("<script src=\"plugins/parallax-js-master/parallax.min.js\"></script>\n");
      out.write("<script src=\"plugins/magnific-popup/jquery.magnific-popup.min.js\"></script>\n");
      out.write("<script src=\"js/custom.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            // Get the modal\n");
      out.write("            var modal = document.getElementById('id01');\n");
      out.write("\n");
      out.write("            // When the user clicks anywhere outside of the modal, close it\n");
      out.write("            window.onclick = function (event) {\n");
      out.write("                if (event.target == modal) {\n");
      out.write("                    modal.style.display = \"none\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            ");

                String message = (String) request.getAttribute("ERROR");
                if (message != null) {
            
      out.write("\n");
      out.write("            alert(message);\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        </\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <li class=\"dropdown\">\n");
        out.write("                                                    <a class=\"drop-btn\" href=\"#\" id=\"navbarDropdown\"><label style=\"font-size: 15px\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</label></a>\n");
        out.write("                                                    <div class=\"dropdown-content\">\n");
        out.write("                                                        <form action =\"MainController\" method=\"POST\">\n");
        out.write("                                                            <input type=\"submit\" class=\"dropdown-item\" name=\"action\" value=\"Edit Profile\"/>\n");
        out.write("                                                            <input type=\"hidden\" name=\"txtUsername\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                        </form>\n");
        out.write("                                                        <!--<div class=\"dropdown-divider\"></div>-->\n");
        out.write("                                                        <a class=\"dropdown-item\" href=\"cart.jsp\">My cart</a>\n");
        out.write("                                                        <div class=\"dropdown-divider\"></div>\n");
        out.write("                                                        <a class=\"dropdown-item\" href=\"#\">Log out</a>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </li>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ADMIN != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <li class=\"dropdown\">\n");
        out.write("                                                    <a class=\"drop-btn\" href=\"#\" id=\"navbarDropdown\"><label style=\"font-size: 15px\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ADMIN}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</label></a>\n");
        out.write("                                                    <div class=\"dropdown-content\">\n");
        out.write("                                                        <a class=\"dropdown-item\" href=\"addtour.jsp\">Add new tour</a>\n");
        out.write("                                                        <!--<div class=\"dropdown-divider\"></div>-->\n");
        out.write("                                                        <a class=\"dropdown-item\" href=\"viewtour.jsp\">View tour</a>\n");
        out.write("                                                        <div class=\"dropdown-divider\"></div>\n");
        out.write("                                                        <a class=\"dropdown-item\" href=\"#\">Log out</a>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </li>   \n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \n");
        out.write("                                                <li class=\"main_nav_item\"><a href=\"#\" onclick=\"document.getElementById('id01').style.display = 'block'\" style=\"width:auto;\">Login Or Register</a></li>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
