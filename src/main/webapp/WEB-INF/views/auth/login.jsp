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
<!-- Resume section end -->


<!-- Review section start -->
<!-- Review section end -->


<!-- Portfolio section start -->
<!-- Portfolio section end -->

<!-- Extra section start -->
<!-- Extra section end -->

<!-- Login section start -->
<section class="contact-section spad">
    <div class="container-fluid">
        <div class="row">
            <div class="col-xl-8 offset-xl-2">
<%--                <div class="section-title">--%>
<%--                    <h1>Login or register</h1>--%>
<%--                </div>--%>
                <div class="section-title">
                    <h2>Login</h2>
                </div>
                <div>
                    <form method="post" form class="contact-form" action='<c:url value="/login"/>'>
                        <div class="row">
                            <div class="col-md-6">
                                <input type="text" id="username" name="username" placeholder="Username" required autofocus>
                            </div>

                            <div class="col-md-6">
                                <input type="password" id="password" name="password" placeholder="Password" required>
                            </div>
                            <div class="text-md-right">
                                <button class="site-btn" type="submit">Log in</button>
                            </div>

                    </form>
                </div>
            </div>
</section>
<!-- Login section end -->

<!-- Register section start
<section class="contact-section spad">
    <div class="container-fluid">
        <div class="row">
            <div class="col-xl-8 offset-xl-2">
                <div class="section-title">
                    <h2>Register</h2>
                </div>
                <div>
                    <form method="post" form class="contact-form" action='<c:url value="/login"/>'>
                        <div class="row">

                            <div class="col-md-6">
                                <input name="eMail" type="text" placeholder="E-mail">
                            </div>
                        <div class="row">

                            <div class="col-md-6">
                                <input name="password" type="text" placeholder="Password">
                            </div>
                            <div class="text-md-right">
                                <button class="site-btn">Register</button>
                            </div>

                    </form>
                </div>
            </div>
</section>
 Register section end -->

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