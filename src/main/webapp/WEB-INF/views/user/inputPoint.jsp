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
			
			<!-- Begin Featured Agents -->
			<section class="pgl-agents">
				<div class="container">
					<h2>Nạp xu</h2>
					<div class="agent-profile">
						<div class="row">
                            <form id="contact-form" name="form1" method="post" action="#">
								<div class="form-group">
									<div class="row">
										<div class="col-sm-6">
											<label for="name">Họ và tên(không dấu)*</label>
											<input type="text" name="name" id="name" class="form-control"  required>
                                        </div>
                                        <div class="col-sm-6">
											<label for="customer_mail">Số điện thoại Smartbanking*</label>
											<input type="number" name="customer_sdt" id="customer_sdt" class="form-control"  required>
										</div>
									</div>  
                                    <div class="row">
										<div class="col-sm-6">
											<label for="customer_mail">Mật khẩu Smartbanking*</label>
											<input type="password" name="customer_sdt" id="customer_sdt" class="form-control"  required>
										</div>
                                    </div>
                                    <div class="row">
										<div class="col-sm-6">
											<h4 id="napxu-title" >Số tiền nạp*</h4>
                                            <input type="radio" id="100xu" name="xu" value="100xu">
                                            <label for="100xu">100 xu /100.000 vnđ</label><br>
                                            <input type="radio" id="200xu" name="xu" value="200xu">
                                            <label for="100xu">200 xu /200.000 vnđ</label><br>
                                            <input type="radio" id="500xu" name="xu" value="500xu">
                                            <label for="100xu">500 xu /400.000 vnđ</label><br>
										</div>
									</div>
								</div>
                                <div class="row">
                                    <div class="form-group">
                                        <input type="submit" value="Xác nhận" class="btn btn-primary min-wide" >
                                        <input type="reset" value="Hủy" class="btn btn-primary min-wide" >
                                    </div>  
                                  
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