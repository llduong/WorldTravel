package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import duong.data.Tour;
import duong.data.Tour;

public final class tour_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/find.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_var_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_var_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_var_test.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("                line-height: 30px;\n");
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
      out.write("                z-index: 999; /* Sit on top */\n");
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
      out.write("        <script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"styles/bootstrap4/popper.js\"></script>\n");
      out.write("        <script src=\"styles/bootstrap4/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"plugins/OwlCarousel2-2.2.1/owl.carousel.js\"></script>\n");
      out.write("        <script src=\"plugins/easing/easing.js\"></script>\n");
      out.write("        <script src=\"plugins/parallax-js-master/parallax.min.js\"></script>\n");
      out.write("        <script src=\"plugins/magnific-popup/jquery.magnific-popup.min.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
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
      out.write("                                <!-- Main Navigation -->\n");
      out.write("                                <nav class=\"main_nav ml-auto\">\n");
      out.write("                                    <ul class=\"main_nav_list\">\n");
      out.write("                                        <li class=\"main_nav_item active\"><a href=\"#\">Home</a></li>\n");
      out.write("                                        <li class=\"main_nav_item\"><a href=\"about.jsp\">About us</a></li>\n");
      out.write("                                        <li class=\"main_nav_item\"><a href=\"tour.jsp\">Tours</a></li>\n");
      out.write("                                        <li class=\"main_nav_item\"><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                                            ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </nav>\n");
      out.write("\n");
      out.write("                                <!-- Search -->\n");
      out.write("                                <div class=\"search\">\n");
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
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("<div class=\"find\">\n");
      out.write("    <!-- Image by https://unsplash.com/@garciasaldana_ -->\n");
      out.write("    <div class=\"find_background parallax-window\" data-parallax=\"scroll\" data-image-src=\"images/find.jpg\" data-speed=\"0.8\"></div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-12\">\n");
      out.write("                <div class=\"find_title text-center\">Find the Adventure of a lifetime</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-12\">\n");
      out.write("                <div class=\"find_form_container\">\n");
      out.write("                    <form action=\"MainController\" id=\"find_form\" class=\"find_form d-flex flex-md-row flex-column align-items-md-center align-items-start justify-content-md-between justify-content-start flex-wrap\" method=\"POST\">\n");
      out.write("                        <div class=\"find_item\">\n");
      out.write("                            <div>Destination:</div>\n");
      out.write("                            <input type=\"text\" class=\"destination find_input\" placeholder=\"Keyword here\" name=\"txtDeparture\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"find_item\">\n");
      out.write("                            <div>Arrival:</div>\n");
      out.write("                            <input type=\"text\" class=\"find_input\" placeholder=\"Keyword here\" name=\"txtArrival\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"find_item\">\n");
      out.write("                            <div>Min price</div>\n");
      out.write("                            <select name=\"minprice\" id=\"min_price\" class=\"dropdown_item_select find_input\" value=\"0\" >\n");
      out.write("                                <option value=\"0\">0</option>\n");
      out.write("                                <option value=\"500\">500</option>\n");
      out.write("                                <option value=\"1000\">1000</option>\n");
      out.write("                                <option value=\"1500\">2000</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"find_item\">\n");
      out.write("                            <div>Max price</div>\n");
      out.write("                            <select name=\"maxprice\" id=\"max_price\" class=\"dropdown_item_select find_input\" value=\"2500\">\n");
      out.write("                                <option value=\"2000\">2500</option>\n");
      out.write("                                <option value =\"5000\">6000</option>\n");
      out.write("                                <option value=\"10000\">10000</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"find_button\">\n");
      out.write("                            <input type=\"submit\" value=\"Find\" name=\"action\" class=\"btn btn-info\" style=\"background-color: #fe435b; border-color: #fe435b\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"top\">\n");
      out.write("            ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_3.setPageContext(_jspx_page_context);
      _jspx_th_c_if_3.setParent(null);
      _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.INFO != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_var_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_if_4.setPageContext(_jspx_page_context);
          _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
          _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty requestScope.INFO}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          _jspx_th_c_if_4.setVar("checkList");
          int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
          if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                    ");
              if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                    ");

                        List<Tour> Info = (List<Tour>) request.getAttribute("INFO");
                        if (!Info.isEmpty()) {
                            if (Info.size() % 4 != 0) {
                    
              out.write("\n");
              out.write("                </div>\n");
              out.write("            </div>\n");
              out.write("            ");

                    }
                }
            
              out.write("\n");
              out.write("        ");
              int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_4);
            return;
          }
          _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_4);
          out.write("\n");
          out.write("\n");
          out.write("        ");
          if (_jspx_meth_c_if_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      out.write("\n");
      out.write("</div>\n");
      out.write("<footer class=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <!-- Footer Column -->\n");
      out.write("            <div class=\"col-lg-4 footer_col\">\n");
      out.write("                <div class=\"footer_about\">\n");
      out.write("                    <!-- Logo -->\n");
      out.write("                    <div class=\"logo_container\">\n");
      out.write("                        <div class=\"logo\">\n");
      out.write("                            <div>destino</div>\n");
      out.write("                            <div>travel agency</div>\n");
      out.write("                            <div class=\"logo_image\"><img src=\"images/logo.png\" alt=\"\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer_about_text\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer pulvinar sed mauris eget tincidunt. Sed lectus nulla, tempor vel eleifend quis, tempus rut rum metus. Pellentesque ultricies enim eu quam fermentum hendrerit.</div>\n");
      out.write("                    <div class=\"copyright\"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                        Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Footer Column -->\n");
      out.write("            <div class=\"col-lg-4 footer_col\">\n");
      out.write("                <div class=\"footer_latest\">\n");
      out.write("                    <div class=\"footer_title\">Latest News</div>\n");
      out.write("                    <div class=\"footer_latest_content\">\n");
      out.write("\n");
      out.write("                        <!-- Footer Latest Post -->\n");
      out.write("                        <div class=\"footer_latest_item\">\n");
      out.write("                            <div class=\"footer_latest_image\"><img src=\"images/latest_1.jpg\" alt=\"https://unsplash.com/@peecho\"></div>\n");
      out.write("                            <div class=\"footer_latest_item_content\">\n");
      out.write("                                <div class=\"footer_latest_item_title\"><a href=\"news.html\">Brazil Summer</a></div>\n");
      out.write("                                <div class=\"footer_latest_item_date\">Jan 09, 2018</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Footer Latest Post -->\n");
      out.write("                        <div class=\"footer_latest_item\">\n");
      out.write("                            <div class=\"footer_latest_image\"><img src=\"images/latest_2.jpg\" alt=\"https://unsplash.com/@sanfrancisco\"></div>\n");
      out.write("                            <div class=\"footer_latest_item_content\">\n");
      out.write("                                <div class=\"footer_latest_item_title\"><a href=\"news.html\">A perfect vacation</a></div>\n");
      out.write("                                <div class=\"footer_latest_item_date\">Jan 09, 2018</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Footer Column -->\n");
      out.write("            <div class=\"col-lg-4 footer_col\">\n");
      out.write("                <div class=\"tags footer_tags\">\n");
      out.write("                    <div class=\"footer_title\">Tags</div>\n");
      out.write("                    <ul class=\"tags_content d-flex flex-row flex-wrap align-items-start justify-content-start\">\n");
      out.write("                        <li class=\"tag\"><a href=\"#\">travel</a></li>\n");
      out.write("                        <li class=\"tag\"><a href=\"#\">summer</a></li>\n");
      out.write("                        <li class=\"tag\"><a href=\"#\">cruise</a></li>\n");
      out.write("                        <li class=\"tag\"><a href=\"#\">beach</a></li>\n");
      out.write("                        <li class=\"tag\"><a href=\"#\">offer</a></li>\n");
      out.write("                        <li class=\"tag\"><a href=\"#\">vacation</a></li>\n");
      out.write("                        <li class=\"tag\"><a href=\"#\">trip</a></li>\n");
      out.write("                        <li class=\"tag\"><a href=\"#\">city break</a></li>\n");
      out.write("                        <li class=\"tag\"><a href=\"#\">adventure</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("    // Get the modal\n");
      out.write("    var modal = document.getElementById('id01');\n");
      out.write("\n");
      out.write("    // When the user clicks anywhere outside of the modal, close it\n");
      out.write("    window.onclick = function (event) {\n");
      out.write("        if (event.target == modal) {\n");
      out.write("            modal.style.display = \"none\";\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("    $('#myModal').modal({\n");
      out.write("        keyboard: false\n");
      out.write("    });\n");
      out.write("    $('#myModal').modal('toggle');\n");
      out.write("    $('#myModal').modal('show');\n");
      out.write("    $('#myModal').modal('hide');\n");
      out.write("    $('#myModal').modal('handleUpdate');\n");
      out.write("    $('#myModal').on('hidden.bs.modal', function (e) {\n");
      out.write("        // do something...\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    function check(number) {\n");
      out.write("        var totalPrice = document.getElementById('totalPrice');\n");
      out.write("        totalPrice.innerHTML = \"Total price for your ticket($): \" + $('input#adultT').val() * number;\n");
      out.write("    }\n");
      out.write("//\n");
      out.write("//    function validTicket(num1, num2) {\n");
      out.write("//        if (num1 > num2) {\n");
      out.write("//            return false;\n");
      out.write("//        }\n");
      out.write("//        return true;\n");
      out.write("//    }\n");
      out.write("//\n");
      out.write("//    function checkTicket() {\n");
      out.write("//        var addCart = document.getElementById('AddCart}');\n");
      out.write("//        var childrenT = document.getElementById('childrenT");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${counter.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("').value;\n");
      out.write("//        var adultT = document.getElementById('adultT");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${counter.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("').value;\n");
      out.write("//        alert(adultT + \"      \" + childrenT);\n");
      out.write("//        var valid = validTicket(childrenT, adultT);\n");
      out.write("//        if (valid === true) {\n");
      out.write("//            addCart.href =\n");
      out.write("//                    'MainController?action=AddToCart&txtTourID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&adult=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.adultTicket}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&children=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.childrenTicket}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&price=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&username=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("//        } else {\n");
      out.write("//\n");
      out.write("//            alert(\"Children ticket can't be more than adult ticket\");\n");
      out.write("//        }\n");
      out.write("//    }\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("</body> \n");
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
        out.write("                                                <li class=\"dropdown main_nav_item \" ><a class=\"drop-btn\" href=\"#\" id=\"navbarDropdown\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                                                    <div class=\"dropdown-content\">\n");
        out.write("                                                        <form action =\"MainController\" method=\"POST\">\n");
        out.write("                                                            <input type=\"submit\" class=\"dropdown-item\" name=\"action\" value=\"Edit Profile\"/>\n");
        out.write("                                                            <input type=\"hidden\" name=\"txtUsername\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                        </form>\n");
        out.write("                                                        <form action =\"MainController\" method=\"POST\">\n");
        out.write("                                                            <input type=\"submit\" class=\"dropdown-item\" name=\"action\" value=\"My Cart\"/>\n");
        out.write("                                                            <input type=\"hidden\" name=\"txtUsername\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                        </form>\n");
        out.write("                                                        <div class=\"dropdown-divider\"></div>\n");
        out.write("                                                        <form action =\"MainController\" method=\"POST\">\n");
        out.write("                                                            <input type=\"submit\" class=\"dropdown-item\" style=\"background-color:#17a2b8;\" name=\"action\" value=\"Log out\"/>\n");
        out.write("                                                            <input type=\"hidden\" name=\"txtUsername\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                        </form>\n");
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
        out.write("                                                <li class=\"dropdown main_nav_item\"><a class=\"drop-btn\" href=\"#\" id=\"navbarDropdown\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ADMIN}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                                                    <div class=\"dropdown-content\">\n");
        out.write("                                                        <a class=\"dropdown-item\" href=\"insert.jsp\">Add new tour</a>\n");
        out.write("                                                        <a class=\"dropdown-item\" href=\"viewtour.jsp\">View tour</a>\n");
        out.write("                                                        <div class=\"dropdown-divider\"></div>\n");
        out.write("                                                        <form action =\"MainController\" method=\"POST\">\n");
        out.write("                                                            <input type=\"submit\" class=\"dropdown-item\" name=\"action\" value=\"Log out\"/>\n");
        out.write("                                                            <input type=\"hidden\" name=\"txtUsername\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ADMIN}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                        </form>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.INFO != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_var_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty requestScope.INFO}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    _jspx_th_c_if_1.setVar("checkList");
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.INFO}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("dto");
    _jspx_th_c_forEach_0.setVarStatus("counter");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div style=\"z-index: 9999;\" class=\"modal fade\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" tabindex=\"-1\" role=\"dialog\">\n");
          out.write("                        <div class=\"modal-dialog modal-lg\">\n");
          out.write("                            <div class=\"modal-content container\">\n");
          out.write("                                <div class=\"modal-header\">\n");
          out.write("                                    <h4 class=\"modal-title\" id=\"exampleModalLabel\" style=\"color: #17a2b8;\">Tour name: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                    <h4 class=\"modal-title\" style=\"color: #dc3545;\">Price($): ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"modal-body\">\n");
          out.write("                                    <h3 style=\"color: #17a2b8;\">Tour's detail</h3>\n");
          out.write("                                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.detail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"modal-footer\">\n");
          out.write("                                    <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!checkList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                No record found\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.INFO}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("dto");
    _jspx_th_c_forEach_1.setVarStatus("counter");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_var_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${counter.count % 4 == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    _jspx_th_c_if_5.setVar("index");
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <div class=\"container\">\n");
        out.write("                                <div class=\"row top_content\">\n");
        out.write("                                    <div class=\"col-lg-3 col-md-6 top_col\">\n");
        out.write("                                        <h5>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h5>\n");
        out.write("                                        <div class=\"top_item\">\n");
        out.write("                                            <div class=\"top_item_image\"><img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></div>\n");
        out.write("                                            <div class=\"top_item_content\">\n");
        out.write("                                                <label for=\"ticketAdult\" class=\"text-info top_item_text\">Ticket for adult:</label>\n");
        out.write("                                                <input type=\"number\" name=\"adultTicket\" value=\"0\"/>\n");
        out.write("                                                <label for=\"ticketChildren\" class=\"text-info top_item_text\">Ticket for children:</label><br/>\n");
        out.write("                                                <input type=\"number\" name=\"childrenTicket\" value=\"0\"/>\n");
        out.write("                                                <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                    See More\n");
        out.write("                                                </button>\n");
        out.write("                                                <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${counter.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                    Add to Cart\n");
        out.write("                                                </button>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!index}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <div class=\"col-lg-3 col-md-6 top_col\">\n");
        out.write("                                        <h5>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h5>\n");
        out.write("                                        <div class=\"top_item\">\n");
        out.write("                                            <div class=\"top_item_image\"><img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></div>\n");
        out.write("                                            <div class=\"top_item_content\">\n");
        out.write("                                                <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                    More detail\n");
        out.write("                                                </button>\n");
        out.write("                                                <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dto.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${counter.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                    Add to Cart\n");
        out.write("                                                </button>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                    ");
        if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${counter.count == 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!checkList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            No record found\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }
}
