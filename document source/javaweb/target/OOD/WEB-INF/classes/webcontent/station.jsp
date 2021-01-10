<%--
  Created by IntelliJ IDEA.
  User: 15414
  Date: 2021/1/4
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
    <!-- Basic -->
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <!-- Site Metas -->
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <meta name="author" content="" />

    <title>Joice</title>

    <!-- slider stylesheet -->
    <link rel="stylesheet" type="text/css" href="../css/owl.carousel.min.css" >

    <!-- bootstrap core css -->
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.css" >

    <!-- fonts style -->
    <link href="https://fonts.googleapis.com/css?family=Poppins:400,700|Raleway:400,500,700&display=swap" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="../css/style.css" rel="stylesheet" >
    <!-- responsive style -->
    <link href="../css/responsive.css" rel="stylesheet" >
</head>

<body>

<div class="hero_area">
    <!-- header section strats -->
    <header class="header_section">
        <div class="container-fluid">
            <nav class="navbar navbar-expand-lg custom_nav-container ">
                <a class="navbar-brand" href="selectstation">
            <span>
              Station
            </span>
                </a>
                </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <div class="d-flex mx-auto flex-column flex-lg-row align-items-center">
                        <ul class="navbar-nav  ">
                            <li class="nav-item active">
                                <a class="nav-link" href="selectstation">Station <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="selectservice"> Service</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="selectfacility"> Facility </a>
                        </ul>

                    </div>
                </div>
            </nav>
        </div>
    </header>
    <!-- end header section -->
    <!-- end slider section -->
</div>

<!-- our ice cream section -->
<section class="our_section layout_padding">
    <div class="container">
        <div class="heading_container">
            <h2>
          <span>
            Information provided
          </span>
            </h2>
        </div>
        <div class="our_container">
            <div class="box">
                <div class="img-box">
                    <img src="../images/service_1.jpg" alt="">
                </div>
                <div class="detail-box">
                    <h5>
                        Nearby services
                    </h5>
                    <p>
                        On this page you can see all the services around the subway station that you can use or provide for your convenience.
                    </p>
                    <a href="selectservice">
                        See More
                    </a>
                </div>
            </div>
            <div class="box">
                <div class="img-box">
                    <img src="../images/facility.png" alt="">
                </div>
                <div class="detail-box">
                    <h5>
                        Nearby facilities
                    </h5>
                    <p>
                        On this page you can see all the facilities around the subway station that you can use or provide for your convenience.
                    </p>
                    <a href="selectfacility">
                        See More
                    </a>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- end our ice cream section -->

<!-- about section -->
<section class="about_section layout_padding-bottom">
    <div class="container">
        <div class="about_container">
            <div class="row">
                <div class="col-lg-7 col-md-6 ">
                    <div class="detail-box">
                        <div class="heading_container">
                            <h2>
                  <span>
                    About
                  </span>
                            </h2>
                        </div>
                        <p>
                            station name : ${station.station_name}<br>
                            station location : ${location.location}<br>
                            station line : ${station.station_line}<br>
                            start time : ${station.start_time}<br>
                            end time : ${station.end_time}<br>
                            starting station : ${station.starting_station}<br>
                            terminal station : ${station.terminal_station}<br>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- end about section -->




<!-- contact section -->
<section class="contact_section layout_padding">
    <div class="container">
        <div class="heading_container">
            <h2>
          <span>
            Use feedback
          </span>
            </h2>
        </div>
        <div class="layout_padding">
            <div class="row">
                <div class="col-md-6 ">
                    <form action="updateFeedback" method="post">
                        <div class="contact_form-container">
                            <div>
                                <div>
                                    <input type="name" name="name_user" id="name_user" placeholder="Name" />
                                </div>
                                <div>
                                    <input type="email" name="email" id="email" placeholder="Email" />
                                </div>
                                <div>
                                    <input type="text" name="phone" id="phone" placeholder="Phone Number" />
                                </div>
                                <div class="mt-5">
                                    <input type="text" name="message" id="message" placeholder="Message" />
                                </div>
                                <div class="mt-5">
                                    <button type="submit">
                                        Send
                                    </button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- end contact section -->



<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.js"></script>

</body>

</html>
