<%@ include file="/WEB-INF/views/user/commons/taglib.jsp"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="keywords" content="HTML5 Template"/>
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
    <jsp:include page="web/commons/header.jsp"></jsp:include>
    <!--end header  -->

 		<!-- Begin Main -->
		<div role="main" class="main pgl-bg-grey">
			
			<!-- Begin Featured Agents -->
			<section class="pgl-agents">
				<div class="container">
					<h2>Quên mật khẩu</h2>
					<div class="agent-profile">
						<div class="row">
                            <form id="contact-form" name="form1" method="post" action="#">
								<div class="form-group">
									<div class="row">
										<div class="col-sm-6">
											<label for="name">Nhập Email của bạn đã đăng ký*</label>
											<input type="email" name="name" id="name" class="form-control"  required>
                                        </div>
									</div>  
                                    
								</div>
								
								<div class="form-group">
									<input type="submit" value="Gửi" class="btn btn-primary min-wide" >
								</div>
							</form>
						</div>
                        <label  for="name"><a href="register.html" >Tạo tài khoản</a></label> </br>
                        <label  for="name"><a href="login.html" >Đã có tài khoản</a></label> </br>
					</div>
					<div class="col-md-3 sidebar">
						</div>
					</div>
					<!-- End Featured Agents -->
			
					
						
		</div>
		<!-- End Main -->

            <%@include file="web/commons/footer.jsp" %>
            <!-- end footer  -->
            <%--    <jsp:include page="web/commons/script.jsp"></jsp:include>--%>
            <%@include file="web/commons/script.jsp" %>
    </div>
</body>
</html>