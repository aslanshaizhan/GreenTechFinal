<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EnergySource</title>
    <jsp:include page="layout/head.jsp"/>
</head>
<body>
<header id="header" class="transparent-nav">
<%@include file="layout/navbar.jsp"%>
</header>
<div id="home" class="hero-area">

    <div class="bg-image bg-parallax overlay" style="background-image:url(assets/img/home-background.jpg)"></div>

    <div class="home-wrapper">
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <h1 class="white-text">Find the right energy plan for you</h1>
                    <p class="lead white-text">We will help you by comparing all the retailers</p>
                    <a class="main-button icon-button" href="#">Get Started!</a>
                </div>
            </div>
        </div>
    </div>
</div>


<div id="about" class="section">

    <div class="container">

        <div class="row">
            <div class="col-md-6">
                <div class="section-header">
                    <h2>Welcome to EnergyWeb</h2>
                    <p class="lead">Electricity is the flow of electrical power or charge. Electricity is both a basic part of nature and one of the most widely used forms of energy.</p>
                </div>

                <div class="feature">
                    <i class="feature-icon fa fa-flask"></i>
                    <div class="feature-content">
                        <h4>Who can use Energy Made Easy?</h4>
                        <p>Energy Made Easy is a free Australian Government energy price comparison service for households and small businesses in New South Wales, Queensland, South Australia, Tasmania and the Australian Capital Territory, that can be used to find and compare home and small business electricity and gas plans.</p>
                    </div>
                </div>


                <div class="feature">
                    <i class="feature-icon fa fa-users"></i>
                    <div class="feature-content">
                        <h4>Do you really have every plan covered?</h4>
                        <p>Yes. Energy companies that operate in New South Wales, Queensland, South Australia, Tasmania or the Australian Capital Territory are required by law to provide us with data for every plan they make available to most customers. This may include plans with special conditions that you need to meet, to be able to take up a plan. If this is the case, our plan information documents will list any conditions that the retailer has specified.</p>
                    </div>
                </div>


                <div class="feature">
                    <i class="feature-icon fa fa-comments"></i>
                    <div class="feature-content">
                        <h4>Can you switch me to a new plan?</h4>
                        <p>No, we cannot switch you to a new plan. We provide all the details you need to make an informed decision but you need to contact the retailer of your choice, to switch to a new plan. </p>
                    </div>
                </div>

            </div>
            <div class="col-md-6">
                <div class="about-img">
                    <img src="assets/img/about.png" alt="">
                </div>
            </div>
        </div>

    </div>

</div>


<div id="courses" class="section">

    <div class="container">

        <div class="row">
            <div class="section-header text-center">
                <h2>Explore Sources</h2>
                <p class="lead">In 2017, the world generated more than 9,000 TWh of low-carbon electricity. In 2019, a record 75% of new generating capacity was renewable. </p>
            </div>
        </div>


        <div id="courses-wrapper">

            <div class="row">

                <div class="col-md-3 col-sm-6 col-xs-6">
                    <div class="course">
                        <a href="#" class="course-img">
                            <img src="assets/img/sr01.jpg" alt="">
                            <i class="course-link-icon fa fa-link"></i>
                        </a>
                        <a class="course-title" href="#">Clean Energy: renewable energy sector</a>
                        <div class="course-details">
                            <span class="course-category">Department of Energy</span>
                            <span class="course-price course-free">Free</span>
                        </div>
                    </div>
                </div>


                <div class="col-md-3 col-sm-6 col-xs-6">
                    <div class="course">
                        <a href="#" class="course-img">
                            <img src="assets/img/sr02.jpg" alt="">
                            <i class="course-link-icon fa fa-link"></i>
                        </a>
                        <a class="course-title" href="#">Fossil: Fossil energy sources</a>
                        <div class="course-details">
                            <span class="course-category">Energy Source</span>
                            <span class="course-price course-premium">Premium</span>
                        </div>
                    </div>
                </div>


                <div class="col-md-3 col-sm-6 col-xs-6">
                    <div class="course">
                        <a href="#" class="course-img">
                            <img src="assets/img/sr03.jpg" alt="">
                            <i class="course-link-icon fa fa-link"></i>
                        </a>
                        <a class="course-title" href="#">Electric Power</a>
                        <div class="course-details">
                            <span class="course-category">Drawing</span>
                            <span class="course-price course-premium">Premium</span>
                        </div>
                    </div>
                </div>

                <div class="col-md-3 col-sm-6 col-xs-6">
                    <div class="course">
                        <a href="#" class="course-img">
                            <img src="assets/img/sr04.jpg" alt="">
                            <i class="course-link-icon fa fa-link"></i>
                        </a>
                        <a class="course-title" href="#">Energy Storage</a>
                        <div class="course-details">
                            <span class="course-category">Energy Store</span>
                            <span class="course-price course-free">Free</span>
                        </div>
                    </div>
                </div>

            </div>


            <div class="row">

                <div class="col-md-3 col-sm-6 col-xs-6">
                    <div class="course">
                        <a href="#" class="course-img">
                            <img src="assets/img/sr05.jpg" alt="">
                            <i class="course-link-icon fa fa-link"></i>
                        </a>
                        <a class="course-title" href="#">Hydrogen & Fuel cells</a>
                        <div class="course-details">
                            <span class="course-category">Hydrogen fuel</span>
                            <span class="course-price course-free">Free</span>
                        </div>
                    </div>
                </div>


                <div class="col-md-3 col-sm-6 col-xs-6">
                    <div class="course">
                        <a href="#" class="course-img">
                            <img src="assets/img/sr06.jpg" alt="">
                            <i class="course-link-icon fa fa-link"></i>
                        </a>
                        <a class="course-title" href="#">Wind Energy</a>
                        <div class="course-details">
                            <span class="course-category">Wind Energy</span>
                            <span class="course-price course-free">Free</span>
                        </div>
                    </div>
                </div>


                <div class="col-md-3 col-sm-6 col-xs-6">
                    <div class="course">
                        <a href="#" class="course-img">
                            <img src="assets/img/sr07.jpg" alt="">
                            <i class="course-link-icon fa fa-link"></i>
                        </a>
                        <a class="course-title" href="#">Solar Energy</a>
                        <div class="course-details">
                            <span class="course-category">Photography</span>
                            <span class="course-price course-free">Free</span>
                        </div>
                    </div>
                </div>


                <div class="col-md-3 col-sm-6 col-xs-6">
                    <div class="course">
                        <a href="#" class="course-img">
                            <img src="assets/img/sr08.jpg" alt="">
                            <i class="course-link-icon fa fa-link"></i>
                        </a>
                        <a class="course-title" href="#">Smart Home Energy</a>
                        <div class="course-details">
                            <span class="course-category">Smart</span>
                            <span class="course-price course-free">Free</span>
                        </div>
                    </div>
                </div>

            </div>

        </div>

        <div class="row">
            <div class="center-btn">
                <a class="main-button icon-button" href="#">More Sources</a>
            </div>
        </div>
    </div>

</div>


<div id="cta" class="section">

    <div class="bg-image bg-parallax overlay" style="background-image:url(assets/img/cta1-background.jpg)"></div>


    <div class="container">

        <div class="row">
            <div class="col-md-6">
                <h2 class="white-text">What are Different Alternative Sources of Energy?</h2>
                <p class="lead white-text">There are 10 main different alternative sources of energy that are used in the world to generate power. While other sources are being discovered all the time, none of them has reached the stage where they can be used to provide the power to help modern life function.</p>
                <a class="main-button icon-button" href="#">Get Started!</a>
            </div>
        </div>

    </div>

</div>

<jsp:include page="layout/footer.jsp"/>
<jsp:include page="layout/script.jsp"/>
</body>
</html>
