<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/css.jspf" %>

<body>

<!-- Header section start -->
<%@include file="../dynamic/navigationMain.jspf" %>
<!-- Header section end -->

<!-- Hero section start -->
<!-- Hero section end -->

<!-- Social links section start -->
<div class="social-section">
    <div class="container-fluid">
        <div class="row">
            <div class="col-xl-10 offset-xl-1">
                <div class="social-link-warp">
                    <div class="social-links">
                        <a href="https://www.linkedin.com/in/katarzyna-majzel-pospiech/" target="_blank"><i
                                class="fa fa-linkedin"></i></a>
                    </div>
                    <h2 class="hidden-md hidden-sm">My Ll Profile</h2>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Social links section end -->

<!-- Resume section start -->
<!-- Resume section end -->

<!-- Resume section start -->
<%@include file="../dynamic/editEducation.jspf" %>
<!-- Resume section end -->


<!-- Review section start -->
<!-- Review section end -->


<!-- Portfolio section start -->
<!-- Portfolio section end -->

<!-- Extra section start -->
<!-- Extra section end -->

<!-- Contact section start -->
<%@include file="../dynamic/contact.jspf" %>
<!-- Contact section end -->

<!-- Footer section start -->
<footer class="footer-section">
    <div class="container text-center">

    </div>
</footer>
<!-- Footer section end -->


<!--====== Javascripts & Jquery ======-->
<%@include file="../dynamic/javaScript.jspf" %>

</body>
</html>