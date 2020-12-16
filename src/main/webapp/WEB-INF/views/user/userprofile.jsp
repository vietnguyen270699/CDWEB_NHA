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
					
					</div>
				</div>
			</section>
			<!-- End page top -->
			
			<!-- Begin Featured Agents -->
			<section class="pgl-agents">
				<div class="container">
					<h2>Thông tin khách hàng</h2>
					<div class="agent-profile">
						<div class="row">
							<div class="col-md-12">
								<div class="pgl-agent-item pgl-bg-light">
									<div class="row pgl-midnarrow-row">
										<div class="col-xs-3">
											<div class="img-thumbnail-medium">
												<a href="agentprofile.html"><img src="/templates/web/images/agents/temp-agent.png" class="img-responsive" alt=""></a>
											</div>
										</div>
										<div class="col-xs-9">
											<div class="pgl-agent-info">
										
												<h4><a href="agentprofile.html">Quốc Việt</a></h4>
												<address>
													<h5 > Xu hiện có : 0 xu </h5> 
													<i class="fa fa-phone"></i> Điện thoại : 0800-666-6666<br>
													<i class="fa fa-envelope-o"></i> Mail: <a href="mailto:viet@gmail.com">viet@gmail.com</a>
												</address>
												
												<div class="col-md-12">
													<a   class="btn btn-default btn-sm" href="update-user.html" > Cập nhật</a>
																								
													<a   class="btn btn-default btn-sm" href="inputXu.html" > Nạp xu</a>

													<a   class="btn btn-default btn-sm" href="newPost.html" > Đăng Bài</a>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- End Featured Agents -->

					<!--Begin History  -->

					<section class="pgl-properties pgl-bg-grey">
						<div class="container">
							<h2>Lịch sử nạp xu</h2>
							<div class="properties-full properties-listing properties-listfull">
								<div class="listing-header clearfix">
									<ul style="list-style-type: none" >
										<li class="active listing-header clearfix">lịch sử nạp 1 <span class="label forrent pull-right"><a href="#">Xóa</a> </span></li>
										<li class="active listing-header clearfix">lịch sử nạp 2 <span class="label forrent pull-right"><a href="#">Xóa</a> </span></li>
										
									</ul>		
								</div>
							</div>
						</div>
					</section>
			
					<!-- End history -->

						<!--Begin History post  -->

						<section class="pgl-properties pgl-bg-grey">
							<div class="container">
								<h2>Tin đã lưu</h2>
								<div class="properties-full properties-listing properties-listfull">
									<div class="pgl-property animation">
										<div class="row">
											<div class="col-sm-6 col-md-4">
												<div class="property-thumb-info-image">
													<img alt="" class="img-responsive" src="/templates/web/images/properties/property-1.jpg">
													<span class="property-thumb-info-label">
														<span class="label price">$358,000</span>
													</span>
												</div>
											</div>
											<div class="col-sm-6 col-md-8">
												<div class="property-thumb-info">
														
													<div class="property-thumb-info-content">
														<h3><a href="property-detail.html">Poolside character home on a wide 422sqm</a></h3>
														<address>Ferris Park, Jersey City Land in Sales</address>
														<p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
													</div>
													<div class="amenities clearfix">
														<ul class="pull-left">
															<li><strong>Diện tích</strong> 450<sup>m2</sup></li>
														</ul>
														<ul class="pull-right">
															<span class="label forrent pull-right"><a href="#">Xóa</a> </span>
														</ul>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="pgl-property animation">
										<div class="row">
											<div class="col-sm-6 col-md-4">
												<div class="property-thumb-info-image">
													<img alt="" class="img-responsive" src="/templates/web/images/properties/property-2.jpg">
													<span class="property-thumb-info-label">
														<span class="label price">$358,000</span>
													</span>
												</div>
											</div>
											<div class="col-sm-6 col-md-8">
												<div class="property-thumb-info">
														
													<div class="property-thumb-info-content">
														<h3><a href="property-detail.html">Poolside character home on a wide 422sqm</a></h3>
														<address>Ferris Park, Jersey City Land in Sales</address>
														<p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
													</div>
													<div class="amenities clearfix">
														<ul class="pull-left">
															<li><strong>Diện tích</strong> 450<sup>m2</sup></li>
														</ul>
														<ul class="pull-right">
															<span class="label forrent pull-right"><a href="#">Xóa</a> </span>
														</ul>
													</div>
												</div>
											</div>
										</div>
									</div>
									
								</div>
							</div>
						</section>
				
						<!-- End history post-->

				<!-- Begin Properties -->
				<section class="pgl-properties pgl-bg-grey">
					<div class="container">
						<h2>Danh sách bài đã đăng</h2>
						<div class="properties-full properties-listing properties-listfull">
							<div class="listing-header clearfix">
								<ul class="list-inline list-icons pull-left">
								
									<li class="active"><a href="list-fullwidth.html"><i class="fa fa-th-list"></i></a></li>
								
								</ul>
								
							</div>
							<div class="pgl-property animation">
								<div class="row">
									<div class="col-sm-6 col-md-4">
										<div class="property-thumb-info-image">
											<img alt="" class="img-responsive" src="/templates/web/images/properties/property-1.jpg">
											<span class="property-thumb-info-label">
												<span class="label price">$358,000</span>
											</span>
										</div>
									</div>
									<div class="col-sm-6 col-md-8">
										<div class="property-thumb-info">
												
											<div class="property-thumb-info-content">
												<h3><a href="property-detail.html">Poolside character home on a wide 422sqm</a></h3>
												<address>Ferris Park, Jersey City Land in Sales</address>
												<p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
											</div>
											<div class="amenities clearfix">
												<ul class="pull-left">
													<li><strong>Diện tích</strong> 450<sup>m2</sup></li>
												</ul>
												<ul class="pull-right">
													<span class="label forrent pull-right"><a href="#">Xóa</a> </span>
												</ul>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="pgl-property animation">
								<div class="row">
									<div class="col-sm-6 col-md-4">
										<div class="property-thumb-info-image">
											<img alt="" class="img-responsive" src="/templates/web/images/properties/property-2.jpg">
											<span class="property-thumb-info-label">
												<span class="label price">$358,000</span>
											</span>
										</div>
									</div>
									<div class="col-sm-6 col-md-8">
										<div class="property-thumb-info">
												
											<div class="property-thumb-info-content">
												<h3><a href="property-detail.html">Poolside character home on a wide 422sqm</a></h3>
												<address>Ferris Park, Jersey City Land in Sales</address>
												<p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
											</div>
											<div class="amenities clearfix">
												<ul class="pull-left">
													<li><strong>Diện tích</strong> 450<sup>m2</sup></li>
												</ul>
												<ul class="pull-right">
													<span class="label forrent pull-right"><a href="#">Xóa</a> </span>
												</ul>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="pgl-property animation">
								<div class="row">
									<div class="col-sm-6 col-md-4">
										<div class="property-thumb-info-image">
											<img alt="" class="img-responsive" src="/templates/web/images/properties/property-3.jpg">
											<span class="property-thumb-info-label">
												<span class="label price">$358,000</span>
											</span>
										</div>
									</div>
									<div class="col-sm-6 col-md-8">
										<div class="property-thumb-info">
												
											<div class="property-thumb-info-content">
												<h3><a href="property-detail.html">Poolside character home on a wide 422sqm</a></h3>
												<address>Ferris Park, Jersey City Land in Sales</address>
												<p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
											</div>
											<div class="amenities clearfix">
												<ul class="pull-left">
													<li><strong>Diện tích</strong> 450<sup>m2</sup></li>
												</ul>
												<ul class="pull-right">
													<span class="label forrent pull-right"><a href="#">Xóa</a> </span>
												</ul>
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