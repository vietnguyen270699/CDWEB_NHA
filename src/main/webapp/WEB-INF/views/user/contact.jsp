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
<title>Nha-login</title>

<%-- <jsp:include page="web/commons/links.jsp"></jsp:include> --%>
<%-- <%@include file="web/commons/links.jsp" %> --%>

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
		<div role="main" class="main pgl-bg-grey">
			<!-- Begin page top -->
			<section class="page-top">
				<div class="container">
					<div class="page-top-in">
						<h2><span>Liên hệ</span></h2>
					</div>
				</div>
			</section>
			<!-- End page top -->
			
			<!-- Begin content with sidebar -->
			<div class="container">
				<div class="row">
					<div class="col-md-9 content">
						
						<div class="contact">
							
							<div class="row">
								<div class="col-sm-6">
									<strong>Địa chỉ</strong>
									<address>129/6 tristique eu eleifend sit amet, tincid unt afringilla rhoncus lacus in condimentum.</address>
								</div>
								<div class="col-sm-6">
									<address>
										<strong>Điện thoại</strong> 012.666.999<br>
										<strong>Fax.</strong> 012.666.999<br>
										<strong>Email.</strong> viet@gmail.com
									</address>
								</div>
							</div>
							<hr>
							<form id="contact-form" name="form1" method="post" action="http://pixelgeeklab.com/html/realestast/send_contact.php">
								<div class="form-group">
									<div class="row">
										<div class="col-sm-6">
											<label for="name">Your Name*</label>
											<input type="text" name="name" id="name" class="form-control" data-msg-required="Please enter your name." required>
										</div>
										<div class="col-sm-6">
											<label for="customer_mail">Your Email*</label>
											<input type="email" name="customer_mail" id="customer_mail" class="form-control" data-msg-required="Please enter your email address." data-msg-email="Please enter a valid email address." required>
										</div>
									</div>
								</div>
								<div class="form-group">
									<div class="row">
										<div class="col-sm-6">
											<label for="subject">Subject*</label>
											<input type="text" name="subject" id="subject" class="form-control" data-msg-required="Please enter the subject." required>
										</div>
									
									</div>
								</div>
								<div class="form-group">
									<label for="comments">Your Message*</label>
									<textarea rows="9" name="comments" id="comments" class="form-control" data-msg-required="Please enter your message." required></textarea>
								</div>
								<div class="form-group">
									<input type="submit" value="Submit" class="btn btn-primary min-wide" data-loading-text="Loading...">
								</div>
							</form>
						</div>
						
					</div>
					<div class="col-md-3 sidebar">
						
					
						
					
						
					</div>
				</div>	
			</div>
			<!-- End content with sidebar -->
			
		</div>
		<!-- End Main -->
		
		<!-- footer  -->
		<jsp:include page="commons/footer.jsp"></jsp:include>
		<!-- end footer  -->
		<jsp:include page="commons/script.jsp"></jsp:include>
	</div>
</body>
</html>