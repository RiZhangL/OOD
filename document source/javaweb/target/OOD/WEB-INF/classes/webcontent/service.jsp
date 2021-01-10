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
    <link rel="stylesheet" type="text/css" href="../css/owl.carousel.min.css" />

    <!-- bootstrap core css -->
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.css" />

    <!-- fonts style -->
    <link href="https://fonts.googleapis.com/css?family=Poppins:400,700|Raleway:400,500,700&display=swap" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="../css/style.css" rel="stylesheet" />
    <!-- responsive style -->
    <link href="../css/responsive.css" rel="stylesheet" />
</head>

<body class="sub_page">

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
                            <li class="nav-item ">
                                <a class="nav-link" href="selectstation">Station <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item active">
                                <a class="nav-link" href="selectservice"> Service</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="selectfacility"> Facility </a>
                            </li>
                        </ul>

                    </div>
                </div>
            </nav>
        </div>
    </header>
    <!-- end header section -->
</div>



<!-- blog section -->

<section class="blog_section layout_padding">
    <div class="container">
        <div class="heading_container">
            <h2>
          <span>
            Service
          </span>
            </h2>
        </div>
        <div class="row">
            <c:forEach items="${services}" var="service">
                <div class="col-md-6">
                <div class="box">
                    <div class="img-box">
                        <img src="../images/${service.service_pic}" alt="">
                    </div>
                    <div class="detail-box">
                        <h4>
                                ${service.service_name}
                        </h4>
                        <p>
                                ${service.service_detail}
                        </p>
                    </div>
                </div>
            </div>
            </c:forEach>
        </div>
    </div>
</section>

<!-- end blog section -->

<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.js"></script>

</body>

</html>
