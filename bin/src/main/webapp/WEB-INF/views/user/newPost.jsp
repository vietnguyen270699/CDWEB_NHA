<%@ include file="/WEB-INF/views/user/commons/taglib.jsp"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="keywords" content="HTML5 Template" />
<meta name="description"
	content="Flatize - Shop HTML5 Responsive Template">
<meta name="author" content="pixelgeeklab.com">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Nha</title>

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
    <div role="main" class="main pgl-bg-grey">
        <!-- Begin page top -->
    <section class="page-top">
        <div class="container">
            <div class="page-top-in">
            
            </div>
        </div>
    </section>
    <!-- End page top -->
    <!-- Begin Featured Agents -->
    <section class="pgl-agents">
        <div class="container">
            <h2>Đăng bài</h2>
            <div class="agent-profile">
                <div class="row">
                    <form id="contact-form" name="form1" method="post" action="#">
                        <div class="form-group">
                            <div class="row">
                                <div class="col-sm-6">
                                    <label for="name">Tên nhà trọ*</label>
                                    <input type="text" name="title" id="title" class="form-control" data-msg-required="Please enter text." required>
                                </div>
                                <div class="row">
                                    <div class="col-xs-6 col-sm-3">
                                        <label for="name" >Loại bài đăng</label>
                                        <div class="form-group">	
                                            <input type="radio" id="cost" name="Xu" value="0" checked>
                                            <label for="0">Miễn Phí</label><br>
                                            <input type="radio" id="cost1" name="Xu" value="10">
                                            <label for="10">10 Xu</label><br>
                                            <input type="radio" id="cost2" name="Xu" value="20">
                                            <label for="20">20 Xu</label>	
                                            
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="row">
                                <div class="col-sm-6">
                                    <label for="customer_mail">Giá (vnđ)*</label>
                                    <input type="number" name="price" id="price" class="form-control" required>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-6">
                                    <label for="subject">Địa chỉ*</label>
                                    <input type="text" name="address" id="address" class="form-control" data-msg-required="Please enter the address." required>
                                </div>
                                <div class="col-sm-6">
                                    <label for="subject">Diện tích (m2)*</label>
                                    <input type="number" name="acreage" id="acreage" class="form-control" data-msg-required="Please enter the subject." required>
                                </div>
                            </div>
                            <div class="row">
                                
                                <div class="col-sm-6">
                                    <label for="subject">Tiền điện (vnđ)* </label>
                                    <input type="number" name="electricPrice" id="electricPrice" class="form-control" data-msg-required="Please enter the subject." required>
                                </div>
                                <div class="col-sm-6">
                                    <label for="subject">Tiền nước (vnđ)*</label>
                                    <input type="number" name="waterPrice" id="waterPrice" class="form-control" data-msg-required="Please enter the subject." required>
                                </div>
                            </div>
                            <div class="row">
                                
                                <div class="col-sm-6">
                                    <label for="subject">Ảnh* </label>
                                    <input type="file" name="image" id="image" multiple="multiple" class="form-control" data-msg-required="Please enter the image." required>
                                </div>
                             
                            </div>
                            <div class="row">
                                <div class="form-group">
                                    <label for="comments">Mô tả</label>
                                    <textarea rows="9" name="description" id="description" class="form-control" data-msg-required="Please enter your message." required></textarea>
                                </div>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <input type="submit" value="Đăng" class="btn btn-primary min-wide" >
                            <input type="reset" value="Hủy" class="btn btn-primary min-wide" >
                        </div>
                    </form>
                </div>
           
            </div>
            <div class="col-md-3 sidebar">
                </div>
            </div>
            <!-- End Featured Agents -->
    
            
                
</div>
<!-- End Main -->

			<!-- footer  -->
			<jsp:include page="commons/footer.jsp"></jsp:include>
			<!-- end footer  -->
			<jsp:include page="commons/script.jsp"></jsp:include>
		</div>
</body>
</html>