<%@ include file="/WEB-INF/views/user/commons/taglib.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="keywords" content="HTML5 Template"/>
    <meta name="description"
          content="Flatize - Shop HTML5 Responsive Template">
    <meta name="author" content="pixelgeeklab.com">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Nha</title>

    <!-- Google Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Rochester'
          rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,700'
          rel='stylesheet' type='text/css'>

    <!-- Bootstrap -->
    <link href="/templates/web/bootstrap/css/bootstrap.min.css"
          rel="stylesheet">

    <!-- Libs CSS -->
    <link href="/templates/web/css/fonts/font-awesome/css/font-awesome.css"
          rel="stylesheet">
    <link rel="stylesheet"
          href="/templates/web/vendor/owl-carousel/owl.carousel.css"
          media="screen">
    <link rel="stylesheet"
          href="/templates/web/vendor/owl-carousel/owl.theme.css" media="screen">
    <link rel="stylesheet"
          href="/templates/web/vendor/flexslider/flexslider.css" media="screen">
    <link rel="stylesheet" href="/templates/web/vendor/chosen/chosen.css"
          media="screen">

    <!-- Theme -->
    <link href="/templates/web/css/theme-animate.css" rel="stylesheet">
    <link href="/templates/web/css/theme-elements.css" rel="stylesheet">
    <link href="/templates/web/css/theme-blog.css" rel="stylesheet">
    <link href="/templates/web/css/theme-map.css" rel="stylesheet">
    <link href="/templates/web/css/theme.css" rel="stylesheet">

    <!-- Style Switcher-->
    <link rel="stylesheet"
          href="/templates/web/style-switcher/css/style-switcher.css">
    <link href="/templates/web/css/colors/red/style.html" rel="stylesheet"
          id="layoutstyle">

    <!-- Theme Responsive-->
    <link href="/templates/web/css/theme-responsive.css" rel="stylesheet">
</head>
<body>
<div id="page">
    <!--header  -->
    <jsp:include page="commons/header.jsp"></jsp:include>
    <!--end header  -->

    <!-- Begin Main -->
    <div role="main" class="main">
        <!-- Begin Main Slide -->
        <section class="main-slide">
            <div id="owl-main-slide" class="owl-carousel pgl-main-slide" data-plugin-options='{"autoPlay": true}'>
                <div class="item" id="item1"><img src="/templates/web/images/slides/slider1.jpg" alt="Photo"
                                                  class="img-responsive">
                    <div class="item-caption">
                        <div class="container">
                            <div class="property-info">
									<span class="property-thumb-info-label">
										<span class="label price">$358,000</span>
										<span class="label"><a href="/hostel/detail" class="btn-more">thông tin thêm</a></span>
									</span>
                                <div class="property-thumb-info-content">
                                    <h2><a href="/hostel/detail">Chatham St NW, Roanoke, VA 24012</a></h2>
                                    <p>Sed perspiciatis unde omnisiste natus error voluptatem remopa accusantium
                                        doloremque laudantium, totam rem aperiam.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="item" id="item2"><img src="/templates/web/images/slides/slider2.jpg" alt="Photo"
                                                  class="img-responsive">
                    <div class="item-caption">
                        <div class="container">
                            <div class="property-info">
									<span class="property-thumb-info-label">
										<span class="label price">$358,000</span>
										<span class="label"><a href="property-detail.html" class="btn-more">THông tin thêm</a></span>
									</span>
                                <div class="property-thumb-info-content">
                                    <h2><a href="/hostel/detail">Presidential Parcel Frames Command Views of Mt.
                                        Rushmore</a></h2>
                                    <p>Sed perspiciatis unde omnisiste natus error voluptatem remopa accusantium
                                        doloremque laudantium, totam rem aperiam.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="item" id="item3"><img src="/templates/web/images/slides/slider3.jpg" alt="Photo"
                                                  class="img-responsive">
                    <div class="item-caption">
                        <div class="container">
                            <div class="property-info">
									<span class="property-thumb-info-label">
										<span class="label price">$358,000</span>
										<span class="label"><a href="property-detail.html" class="btn-more">THông tin thêm</a></span>
									</span>
                                <div class="property-thumb-info-content">
                                    <h2><a href="/hostel/detail">Alpine Rd, Stockton, CA 95215</a></h2>
                                    <p>Sed perspiciatis unde omnisiste natus error voluptatem remopa accusantium
                                        doloremque laudantium, totam rem aperiam.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- End Main Slide -->

        <!-- Begin Advanced Search -->
        <section class="pgl-advanced-search pgl-bg-light">
            <div class="container">


                <%--					================================== ACTION        ===============================--%>


                <form action="">
                    <div class="row">

                        <div class="col-xs-6 col-sm-3">
                            Tỉnh/Thành
                            <div class="form-group">
                                <label class="sr-only">Tinh</label>
                                <select name="checkboxLocation" data-placeholder="Location" class="chosen-select">
                                    <option selected="selected" value="TPHCM">TP Hồ Chí Minh</option>
                                    <option value="BinhDuong">Bình Dương</option>
                                    <option value="DongNai">Đồng Nai</option>
                                    <option value="BenTre">Bến Tre</option>


                                </select>
                            </div>
                        </div>
                        <div class="col-xs-6 col-sm-3">
                            Diện tích
                            <div class="form-group">
                                <label class="sr-only">Diện Tích dưới</label>
                                <select name="chekboxArea" data-placeholder="Property Types" class="chosen-select">
                                    <option selected="selected" value="30m2"> < 30 m2</option>
                                    <option value="40m2"> < 40 m2</option>
                                    <option value="50m2"> < 50m2</option>
                                    <option value="60m2"> < 60 m2</option>
                                    <option value="70m2"> < 70 m2</option>
                                    <option value="80m2"> < 80 m2</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-xs-6 col-sm-3">
                            Giá
                            <div class="form-group">
                                <label class="sr-only" for="property-types">Giá</label>
                                <select name="propertpff y-types" data-placeholder="Property Types"
                                        class="chosen-select">
                                    <option selected="selected" value="1 triệu"> < 1 triệu</option>
                                    <option value="2 triệu"> < 2 triệu</option>
                                    <option value="3 triệu"> < 3 triệu</option>
                                    <option value="4 triệu"> < 4 triệu</option>
                                    <option value="5 triệu"> > 4 triệu</option>
                                </select>
                            </div>
                        </div>

                    </div>

                    <div class="row">

                        <div class="col-xs-6 col-sm-3">
                            <div class="form-group">
                                <button type="submit" class="btn btn-block btn-primary">Tìm kiếm</button>
                            </div>
                        </div>


                    </div>

                </form>
            </div>
        </section>
        <!-- End Advanced Search -->

        <!-- Begin Featured -->
        <section class="pgl-featured pgl-bg-grey">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 animation">
                        <div class="pgl-property featured-item">
                            <div class="property-thumb-info">
                                <div class="property-thumb-info-image">
                                    <img alt="" class="img-responsive"
                                         src="/templates/web/images/properties/property-featured-1.jpg">
                                </div>
                                <div class="property-thumb-info-content">
                                    <h3><a href="/hostel/detail">Alpine Rd, Stockton, CA 95215</a></h3>
                                    <p>Amet luctus nisl tempus.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-6 col-md-3 animation">
                        <div class="pgl-property featured-item">
                            <div class="property-thumb-info">
                                <div class="property-thumb-info-image">
                                    <img alt="" class="img-responsive"
                                         src="/templates/web/images/properties/property-featured-2.jpg">
                                </div>
                                <div class="property-thumb-info-content">
                                    <h3><a href="/hostel/detail">J St, Modesto, CA 95351</a></h3>
                                    <p>Amet luctus nisl tempus.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-6 col-md-3 animation">
                        <div class="pgl-property featured-item">
                            <div class="property-thumb-info">
                                <div class="property-thumb-info-image">
                                    <img alt="" class="img-responsive"
                                         src="/templates/web/images/properties/property-featured-3.jpg">
                                </div>
                                <div class="property-thumb-info-content">
                                    <h3><a href="/hostel/detail">Spring Gate DrUNIT 4106</a></h3>
                                    <p>Amet luctus nisl tempus.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-6 col-md-3 animation">
                        <div class="pgl-property featured-item">
                            <div class="property-thumb-info">
                                <div class="property-thumb-info-image">
                                    <img alt="" class="img-responsive"
                                         src="/templates/web/images/properties/property-featured-4.jpg">
                                </div>
                                <div class="property-thumb-info-content">
                                    <h3><a href="/hostel/detail">Chatham St NW, Roanoke</a></h3>
                                    <p>Amet luctus nisl tempus.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-6 col-md-3 animation">
                        <div class="pgl-property featured-item">
                            <div class="property-thumb-info">
                                <div class="property-thumb-info-image">
                                    <img alt="" class="img-responsive"
                                         src="/templates/web/images/properties/property-featured-5.jpg">
                                </div>
                                <div class="property-thumb-info-content">
                                    <h3><a href="/hostel/detail">Stockton, CA 95215</a></h3>
                                    <p>Amet luctus nisl tempus.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <hr class="top-tall">
            </div>
        </section>
        <!-- End Featured -->

        <!-- Begin Properties -->
        <section class="pgl-properties pgl-bg-grey">
            <div class="container">
                <h2>Danh sách</h2>
                <!-- Nav tabs -->
                <ul class="nav nav-tabs pgl-pro-tabs text-center animation" role="tablist">
                    <li class="active"><a href="#all" role="tab" data-toggle="tab">Tất cả</a></li>
                    <li><a href="#ktx" role="tab" data-toggle="tab">Phòng Ktx</a></li>
                    <li><a href="#nhatro" role="tab" data-toggle="tab">Nhà trọ</a></li>

                </ul>

                <!-- Tab panes -->
                <div class="tab-content">
                    <div class="tab-pane active" id="all">
                        <div class="row">
                            <div class="col-xs-4 animation">
                                <div class="pgl-property">
                                    <div class="property-thumb-info">
                                        <div class="property-thumb-info-image">
                                            <img alt="" class="img-responsive"
                                                 src="/templates/web/images/properties/property-1.jpg">
                                            <span class="property-thumb-info-label">
													<span class="label price">$358,000</span>
												</span>
                                        </div>
                                        <div class="property-thumb-info-content">
                                            <h3><a href="/hostel/detail">Poolside character home on a wide 422sqm</a>
                                            </h3>
                                            <address>Ferris Park, Jersey City Land in Sales</address>
                                        </div>
                                        <div class="amenities clearfix">
                                            <ul class="pull-left">
                                                <li><strong>Diện tích</strong> 450<sup>m2</sup></li>
                                            </ul>
                                            <span class="label forrent pull-right"><a href="#">Lưu Tin</a> </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xs-4 animation">
                                <div class="pgl-property">
                                    <div class="property-thumb-info">
                                        <div class="property-thumb-info-image">
                                            <img alt="" class="img-responsive"
                                                 src="/templates/web/images/properties/property-2.jpg">
                                            <span class="property-thumb-info-label">
													<span class="label price">$358,000</span>
												
												</span>
                                        </div>
                                        <div class="property-thumb-info-content">
                                            <h3><a href="/hostel/detail">Presidential Parcel Frames Command Views of Mt.
                                                Rushmore</a></h3>
                                            <address>Ferris Park, Jersey City Land in Sales</address>
                                        </div>
                                        <div class="amenities clearfix">
                                            <ul class="pull-left">
                                                <li><strong>Diện tích</strong> 450<sup>m2</sup></li>
                                            </ul>
                                            <span class="label forrent pull-right"><a href="#">Lưu Tin</a> </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xs-4 animation">
                                <div class="pgl-property">
                                    <div class="property-thumb-info">
                                        <div class="property-thumb-info-image">
                                            <img alt="" class="img-responsive"
                                                 src="/templates/web/images/properties/property-3.jpg">
                                            <span class="property-thumb-info-label">
													<span class="label price">$358,000</span>
													
												</span>
                                        </div>
                                        <div class="property-thumb-info-content">
                                            <h3><a href="/hostel/detail">Californian Class, Grand Family Proportions</a>
                                            </h3>
                                            <address>Ferris Park, Jersey City Land in Sales</address>
                                        </div>
                                        <div class="amenities clearfix">
                                            <ul class="pull-left">
                                                <li><strong>Diện tích</strong> 450<sup>m2</sup></li>
                                            </ul>
                                            <span class="label forrent pull-right"><a href="#">Lưu Tin</a> </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-4 animation">
                                <div class="pgl-property">
                                    <div class="property-thumb-info">
                                        <div class="property-thumb-info-image">
                                            <img alt="" class="img-responsive"
                                                 src="/templates/web/images/properties/property-4.jpg">
                                            <span class="property-thumb-info-label">
													<span class="label price">$358,000</span>
												
												</span>
                                        </div>
                                        <div class="property-thumb-info-content">
                                            <h3><a href="/hostel/detail">Chatham St NW, Roanoke, VA 24012</a></h3>
                                            <address>Ferris Park, Jersey City Land in Sales</address>
                                        </div>
                                        <div class="amenities clearfix">
                                            <ul class="pull-left">
                                                <li><strong>Diện tích</strong> 450<sup>m2</sup></li>
                                            </ul>
                                            <span class="label forrent pull-right"><a href="#">Lưu Tin</a> </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xs-4 animation">
                                <div class="pgl-property">
                                    <div class="property-thumb-info">
                                        <div class="property-thumb-info-image">
                                            <img alt="" class="img-responsive"
                                                 src="/templates/web/images/properties/property-5.jpg">
                                            <span class="property-thumb-info-label">
													<span class="label price">$358,000</span>
												
												</span>
                                        </div>
                                        <div class="property-thumb-info-content">
                                            <h3><a href="/hostel/detail">Chatham St NW, Roanoke, VA 24012</a></h3>
                                            <address>Ferris Park, Jersey City Land in Sales</address>
                                        </div>
                                        <div class="amenities clearfix">
                                            <ul class="pull-left">
                                                <li><strong>Diện tích</strong> 450<sup>m2</sup></li>
                                            </ul>
                                            <span class="label forrent pull-right"><a href="#">Lưu Tin</a> </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xs-4 animation">
                                <div class="pgl-property">
                                    <div class="property-thumb-info">
                                        <div class="property-thumb-info-image">
                                            <img alt="" class="img-responsive"
                                                 src="/templates/web/images/properties/property-6.jpg">
                                            <span class="property-thumb-info-label">
													<span class="label price">$358,000</span>
												
												</span>
                                        </div>
                                        <div class="property-thumb-info-content">
                                            <h3><a href="/hostel/detail">Chatham St NW, Roanoke, VA 24012</a></h3>
                                            <address>Ferris Park, Jersey City Land in Sales</address>
                                        </div>
                                        <div class="amenities clearfix">
                                            <ul class="pull-left">
                                                <li><strong>Diện tích</strong> 450<sup>m2</sup></li>
                                            </ul>
                                            <span class="label forrent pull-right"><a href="#">Lưu Tin</a> </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="tab-pane" id="ktx">
                        <div class="row">
                            <div class="col-xs-4 animation">
                                <div class="pgl-property">
                                    <div class="property-thumb-info">
                                        <div class="property-thumb-info-image">
                                            <img alt="" class="img-responsive"
                                                 src="/templates/web/images/properties/property-4.jpg">
                                            <span class="property-thumb-info-label">
													<span class="label price">$358,000</span>
												
												</span>
                                        </div>
                                        <div class="property-thumb-info-content">
                                            <h3><a href="/hostel/detail">Chatham St NW, Roanoke, VA 24012</a></h3>
                                            <address>Ferris Park, Jersey City Land in Sales</address>
                                        </div>
                                        <div class="amenities clearfix">
                                            <ul class="pull-left">
                                                <li><strong>Diện tích</strong> 450<sup>m2</sup></li>
                                            </ul>
                                            <span class="label forrent pull-right"><a href="#">Lưu Tin</a> </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xs-4 animation">
                                <div class="pgl-property">
                                    <div class="property-thumb-info">
                                        <div class="property-thumb-info-image">
                                            <img alt="" class="img-responsive"
                                                 src="/templates/web/images/properties/property-5.jpg">
                                            <span class="property-thumb-info-label">
													<span class="label price">$358,000</span>
												
												</span>
                                        </div>
                                        <div class="property-thumb-info-content">
                                            <h3><a href="/hostel/detail">Chatham St NW, Roanoke, VA 24012</a></h3>
                                            <address>Ferris Park, Jersey City Land in Sales</address>
                                        </div>
                                        <div class="amenities clearfix">
                                            <ul class="pull-left">
                                                <li><strong>Diện tích</strong> 450<sup>m2</sup></li>
                                            </ul>
                                            <span class="label forrent pull-right"><a href="#">Lưu Tin</a> </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xs-4 animation">
                                <div class="pgl-property">
                                    <div class="property-thumb-info">
                                        <div class="property-thumb-info-image">
                                            <img alt="" class="img-responsive"
                                                 src="/templates/web/images/properties/property-6.jpg">
                                            <span class="property-thumb-info-label">
													<span class="label price">$358,000</span>
													
												</span>
                                        </div>
                                        <div class="property-thumb-info-content">
                                            <h3><a href="/hostel/detail">Chatham St NW, Roanoke, VA 24012</a></h3>
                                            <address>Ferris Park, Jersey City Land in Sales</address>
                                        </div>
                                        <div class="amenities clearfix">
                                            <ul class="pull-left">
                                                <li><strong>Diện tích</strong> 450<sup>m2</sup></li>
                                            </ul>
                                            <span class="label forrent pull-right"><a href="#">Lưu Tin</a> </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="tab-pane" id="nhatro">
                        <div class="row">
                            <div class="col-xs-4 animation">
                                <div class="pgl-property">
                                    <div class="property-thumb-info">
                                        <div class="property-thumb-info-image">
                                            <img alt="" class="img-responsive"
                                                 src="/templates/web/images/properties/property-4.jpg">
                                            <span class="property-thumb-info-label">
													<span class="label price">$358,000</span>
													
												</span>
                                        </div>
                                        <div class="property-thumb-info-content">
                                            <h3><a href="/hostel/detail">Chatham St NW, Roanoke, VA 24012</a></h3>
                                            <address>Ferris Park, Jersey City Land in Sales</address>
                                        </div>
                                        <div class="amenities clearfix">
                                            <ul class="pull-left">
                                                <li><strong>Diện tích</strong> 450<sup>m2</sup></li>
                                            </ul>
                                            <span class="label forrent pull-right"><a href="#">Lưu Tin</a> </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xs-4 animation">
                                <div class="pgl-property">
                                    <div class="property-thumb-info">
                                        <div class="property-thumb-info-image">
                                            <img alt="" class="img-responsive"
                                                 src="/templates/web/images/properties/property-5.jpg">
                                            <span class="property-thumb-info-label">
													<span class="label price">$358,000</span>
													
												</span>
                                        </div>
                                        <div class="property-thumb-info-content">
                                            <h3><a href="/hostel/detail">Chatham St NW, Roanoke, VA 24012</a></h3>
                                            <address>Ferris Park, Jersey City Land in Sales</address>
                                        </div>
                                        <div class="amenities clearfix">
                                            <ul class="pull-left">
                                                <li><strong>Diện tích</strong> 450<sup>m2</sup></li>
                                            </ul>
                                            <span class="label forrent pull-right"><a href="#">Lưu Tin</a> </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </section>
        <!-- End Properties -->


    </div>
    <!-- End Main -->

    <!-- footer  -->
    <jsp:include page="commons/footer.jsp"></jsp:include>
    <!-- end footer  -->
    <jsp:include page="commons/script.jsp"></jsp:include>
</div>
</body>



</html>