/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.28
 * Generated at: 2024-12-26 16:48:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.View_005fJSP;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar", Long.valueOf(1733294917722L));
    _jspx_dependants.put("jar:file:/D:/Java_Project/Web/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Web/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar!/META-INF/c.tld", Long.valueOf(1602848772000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Watches an E-Commerce online Shopping Category Flat\r\n");
      out.write("	Bootstrap Responsive Website Template| Single :: w3layouts</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("	content=\"Watches Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\">\r\n");
      out.write("	\r\n");
      out.write("	 addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<!--webfont-->\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=PT+Sans+Narrow:400,700'\r\n");
      out.write("	rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Dorsa' rel='stylesheet'\r\n");
      out.write("	type='text/css'>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<!-- start menu -->\r\n");
      out.write("<link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	media=\"all\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/megamenu.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("	$(document).ready(function() {\r\n");
      out.write("		$(\".megamenu\").megamenu();\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"js/jquery.easydropdown.js\"></script>\r\n");
      out.write("<script src=\"js/easyResponsiveTabs.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	$(document).ready(function() {\r\n");
      out.write("		$('#horizontalTab').easyResponsiveTabs({\r\n");
      out.write("			type : 'default', //Types: default, vertical, accordion           \r\n");
      out.write("			width : 'auto', //auto or any width like 600px\r\n");
      out.write("			fit : true\r\n");
      out.write("		// 100% fit in a container\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"js/simpleCart.min.js\">\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("	<div class=\"men\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"col-md-9 single_top\">\r\n");
      out.write("				<div class=\"single_left\">\r\n");
      out.write("					<div class=\"labout span_1_of_a1\">\r\n");
      out.write("						<div class=\"flexslider\">\r\n");
      out.write("							<ul class=\"slides\">\r\n");
      out.write("							");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("								<li data-thumb=\"images/s2.jpg\"><img src=\"images/s2.jpg\" />\r\n");
      out.write("								</li>\r\n");
      out.write("								<li data-thumb=\"images/s3.jpg\"><img src=\"images/s3.jpg\" />\r\n");
      out.write("								</li>\r\n");
      out.write("								<li data-thumb=\"images/s4.jpg\"><img src=\"images/s4.jpg\" />\r\n");
      out.write("								</li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"clearfix\"></div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"cont1 span_2_of_a1 simpleCart_shelfItem\">\r\n");
      out.write("						<h1>Duis autem</h1>\r\n");
      out.write("						<p class=\"availability\">\r\n");
      out.write("							Availability: <span class=\"color\">In stock</span>\r\n");
      out.write("						</p>\r\n");
      out.write("						<div class=\"price_single\">\r\n");
      out.write("							<span class=\"reducedfrom\">$140.00</span> <span\r\n");
      out.write("								class=\"amount item_price actual\">$120.00</span><a href=\"#\">click\r\n");
      out.write("								for offer</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<h2 class=\"quick\">Quick Overview:</h2>\r\n");
      out.write("						<p class=\"quick_desc\">Nam liber tempor cum soluta nobis\r\n");
      out.write("							eleifend option congue nihil imperdiet doming id quod mazim\r\n");
      out.write("							placerat facer possim assum. Typi non habent claritatem insitam;\r\n");
      out.write("							es</p>\r\n");
      out.write("						<div class=\"wish-list\">\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li class=\"wish\"><a href=\"#\">Add to Wishlist</a></li>\r\n");
      out.write("								<li class=\"compare\"><a href=\"#\">Add to Compare</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("						<ul class=\"size\">\r\n");
      out.write("							<h3>Length</h3>\r\n");
      out.write("							<li><a href=\"#\">32</a></li>\r\n");
      out.write("							<li><a href=\"#\">34</a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("						<div class=\"quantity_box\">\r\n");
      out.write("							<ul class=\"product-qty\">\r\n");
      out.write("								<span>Quantity:</span>\r\n");
      out.write("								<select>\r\n");
      out.write("									<option>1</option>\r\n");
      out.write("									<option>2</option>\r\n");
      out.write("									<option>3</option>\r\n");
      out.write("									<option>4</option>\r\n");
      out.write("									<option>5</option>\r\n");
      out.write("									<option>6</option>\r\n");
      out.write("								</select>\r\n");
      out.write("							</ul>\r\n");
      out.write("							<ul class=\"single_social\">\r\n");
      out.write("								<li><a href=\"#\"><i class=\"fb1\"> </i> </a></li>\r\n");
      out.write("								<li><a href=\"#\"><i class=\"tw1\"> </i> </a></li>\r\n");
      out.write("								<li><a href=\"#\"><i class=\"g1\"> </i> </a></li>\r\n");
      out.write("								<li><a href=\"#\"><i class=\"linked\"> </i> </a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("							<div class=\"clearfix\"></div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<a href=\"#\"\r\n");
      out.write("							class=\"btn btn-primary btn-normal btn-inline btn_form button item_add item_1\"\r\n");
      out.write("							target=\"_self\">Add to cart</a>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"clearfix\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"sap_tabs\">\r\n");
      out.write("					<div id=\"horizontalTab\"\r\n");
      out.write("						style=\"display: block; width: 100%; margin: 0px;\">\r\n");
      out.write("						<ul class=\"resp-tabs-list\">\r\n");
      out.write("							<li class=\"resp-tab-item\" aria-controls=\"tab_item-0\" role=\"tab\"><span>Product\r\n");
      out.write("									Description</span></li>\r\n");
      out.write("							<li class=\"resp-tab-item\" aria-controls=\"tab_item-1\" role=\"tab\"><span>Additional\r\n");
      out.write("									Information</span></li>\r\n");
      out.write("							<li class=\"resp-tab-item\" aria-controls=\"tab_item-2\" role=\"tab\"><span>Reviews</span></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("						<div class=\"resp-tabs-container\">\r\n");
      out.write("							<div class=\"tab-1 resp-tab-content\" aria-labelledby=\"tab_item-0\">\r\n");
      out.write("								<div class=\"facts\">\r\n");
      out.write("									<ul class=\"tab_list\">\r\n");
      out.write("										<li><a href=\"#\">Lorem ipsum dolor sit amet,\r\n");
      out.write("												consectetuer adipiscing elit, sed diam nonummy nibh euismod\r\n");
      out.write("												tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut\r\n");
      out.write("												wisi enim ad minim veniam, quis nostrud exerci tation\r\n");
      out.write("												ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo\r\n");
      out.write("												consequat</a></li>\r\n");
      out.write("										<li><a href=\"#\">augue duis dolore te feugait nulla\r\n");
      out.write("												facilisi. Nam liber tempor cum soluta nobis eleifend option\r\n");
      out.write("												congue nihil imperdiet doming id quod mazim placerat facer\r\n");
      out.write("												possim assum. Typi non habent claritatem insitam; est usus\r\n");
      out.write("												legentis in iis qui facit eorum claritatem. Investigatione</a></li>\r\n");
      out.write("										<li><a href=\"#\">claritatem insitam; est usus legentis\r\n");
      out.write("												in iis qui facit eorum claritatem. Investigationes\r\n");
      out.write("												demonstraverunt lectores legere me lius quod ii legunt\r\n");
      out.write("												saepius. Claritas est etiam processus dynamicus, qui\r\n");
      out.write("												sequitur mutationem consuetudium lectorum. Mirum est notare\r\n");
      out.write("												quam littera gothica</a></li>\r\n");
      out.write("										<li><a href=\"#\">Mirum est notare quam littera\r\n");
      out.write("												gothica, quam nunc putamus parum claram, anteposuerit\r\n");
      out.write("												litterarum formas humanitatis per seacula quarta decima et\r\n");
      out.write("												quinta decima. Eodem modo typi, qui nunc nobis videntur\r\n");
      out.write("												parum clari, fiant sollemnes in futurum.</a></li>\r\n");
      out.write("									</ul>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"tab-1 resp-tab-content\" aria-labelledby=\"tab_item-1\">\r\n");
      out.write("								<div class=\"facts\">\r\n");
      out.write("									<ul class=\"tab_list\">\r\n");
      out.write("										<li><a href=\"#\">augue duis dolore te feugait nulla\r\n");
      out.write("												facilisi. Nam liber tempor cum soluta nobis eleifend option\r\n");
      out.write("												congue nihil imperdiet doming id quod mazim placerat facer\r\n");
      out.write("												possim assum. Typi non habent claritatem insitam; est usus\r\n");
      out.write("												legentis in iis qui facit eorum claritatem. Investigatione</a></li>\r\n");
      out.write("										<li><a href=\"#\">claritatem insitam; est usus legentis\r\n");
      out.write("												in iis qui facit eorum claritatem. Investigationes\r\n");
      out.write("												demonstraverunt lectores legere me lius quod ii legunt\r\n");
      out.write("												saepius. Claritas est etiam processus dynamicus, qui\r\n");
      out.write("												sequitur mutationem consuetudium lectorum. Mirum est notare\r\n");
      out.write("												quam littera gothica</a></li>\r\n");
      out.write("										<li><a href=\"#\">Mirum est notare quam littera\r\n");
      out.write("												gothica, quam nunc putamus parum claram, anteposuerit\r\n");
      out.write("												litterarum formas humanitatis per seacula quarta decima et\r\n");
      out.write("												quinta decima. Eodem modo typi, qui nunc nobis videntur\r\n");
      out.write("												parum clari, fiant sollemnes in futurum.</a></li>\r\n");
      out.write("									</ul>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"tab-1 resp-tab-content\" aria-labelledby=\"tab_item-2\">\r\n");
      out.write("								<div class=\"facts\">\r\n");
      out.write("									<ul class=\"tab_list\">\r\n");
      out.write("										<li><a href=\"#\">Lorem ipsum dolor sit amet,\r\n");
      out.write("												consectetuer adipiscing elit, sed diam nonummy nibh euismod\r\n");
      out.write("												tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut\r\n");
      out.write("												wisi enim ad minim veniam, quis nostrud exerci tation\r\n");
      out.write("												ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo\r\n");
      out.write("												consequat</a></li>\r\n");
      out.write("										<li><a href=\"#\">augue duis dolore te feugait nulla\r\n");
      out.write("												facilisi. Nam liber tempor cum soluta nobis eleifend option\r\n");
      out.write("												congue nihil imperdiet doming id quod mazim placerat facer\r\n");
      out.write("												possim assum. Typi non habent claritatem insitam; est usus\r\n");
      out.write("												legentis in iis qui facit eorum claritatem. Investigatione</a></li>\r\n");
      out.write("										<li><a href=\"#\">claritatem insitam; est usus legentis\r\n");
      out.write("												in iis qui facit eorum claritatem. Investigationes\r\n");
      out.write("												demonstraverunt lectores leg</a></li>\r\n");
      out.write("										<li><a href=\"#\">Mirum est notare quam littera\r\n");
      out.write("												gothica, quam nunc putamus parum claram, anteposuerit\r\n");
      out.write("												litterarum formas humanitatis per seacula quarta decima et\r\n");
      out.write("												quinta decima. Eodem modo typi, qui nunc nobis videntur\r\n");
      out.write("												parum clari, fiant sollemnes in futurum.</a></li>\r\n");
      out.write("									</ul>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-3 tabs\">\r\n");
      out.write("				<h3 class=\"m_1\">Related Products</h3>\r\n");
      out.write("				<ul class=\"product\">\r\n");
      out.write("					<li class=\"product_img\"><img src=\"images/m5.jpg\"\r\n");
      out.write("						class=\"img-responsive\" alt=\"\" /></li>\r\n");
      out.write("					<li class=\"product_desc\">\r\n");
      out.write("						<h4>\r\n");
      out.write("							<a href=\"#\">quod mazim</a>\r\n");
      out.write("						</h4>\r\n");
      out.write("						<p class=\"single_price\">$66.30</p> <a href=\"#\" class=\"link-cart\">Add\r\n");
      out.write("							to Wishlist</a> <a href=\"#\" class=\"link-cart\">Add to Cart</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					<div class=\"clearfix\"></div>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<ul class=\"product\">\r\n");
      out.write("					<li class=\"product_img\"><img src=\"images/m6.jpg\"\r\n");
      out.write("						class=\"img-responsive\" alt=\"\" /></li>\r\n");
      out.write("					<li class=\"product_desc\">\r\n");
      out.write("						<h4>\r\n");
      out.write("							<a href=\"#\">quod mazim</a>\r\n");
      out.write("						</h4>\r\n");
      out.write("						<p class=\"single_price\">$66.30</p> <a href=\"#\" class=\"link-cart\">Add\r\n");
      out.write("							to Wishlist</a> <a href=\"#\" class=\"link-cart\">Add to Cart</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					<div class=\"clearfix\"></div>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<ul class=\"product\">\r\n");
      out.write("					<li class=\"product_img\"><img src=\"images/m2.jpg\"\r\n");
      out.write("						class=\"img-responsive\" alt=\"\" /></li>\r\n");
      out.write("					<li class=\"product_desc\">\r\n");
      out.write("						<h4>\r\n");
      out.write("							<a href=\"#\">quod mazim</a>\r\n");
      out.write("						</h4>\r\n");
      out.write("						<p class=\"single_price\">$66.30</p> <a href=\"#\" class=\"link-cart\">Add\r\n");
      out.write("							to Wishlist</a> <a href=\"#\" class=\"link-cart\">Add to Cart</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					<div class=\"clearfix\"></div>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<ul class=\"product\">\r\n");
      out.write("					<li class=\"product_img\"><img src=\"images/m3.jpg\"\r\n");
      out.write("						class=\"img-responsive\" alt=\"\" /></li>\r\n");
      out.write("					<li class=\"product_desc\">\r\n");
      out.write("						<h4>\r\n");
      out.write("							<a href=\"#\">quod mazim</a>\r\n");
      out.write("						</h4>\r\n");
      out.write("						<p class=\"single_price\">$66.30</p> <a href=\"#\" class=\"link-cart\">Add\r\n");
      out.write("							to Wishlist</a> <a href=\"#\" class=\"link-cart\">Add to Cart</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					<div class=\"clearfix\"></div>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"clearfix\"></div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("	<!-- FlexSlider -->\r\n");
      out.write("	<script defer src=\"js/jquery.flexslider.js\"></script>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\"\r\n");
      out.write("		media=\"screen\" />\r\n");
      out.write("	<script>\r\n");
      out.write("		// Can also be used with $(document).ready()\r\n");
      out.write("		$(window).load(function() {\r\n");
      out.write("			$('.flexslider').flexslider({\r\n");
      out.write("				animation : \"slide\",\r\n");
      out.write("				controlNav : \"thumbnails\"\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /View_JSP/single.jsp(66,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("img");
      // /View_JSP/single.jsp(66,7) name = items type = jakarta.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/View_JSP/single.jsp(66,7) '${product.listimg}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${product.listimg}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("								<li data-thumb=\"images/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${img}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"><img src=\"images/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${img}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" />\r\n");
            out.write("								</li>							\r\n");
            out.write("							");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
