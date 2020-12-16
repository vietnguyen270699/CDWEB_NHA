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
							<h2><span>Chi tiết</span></h2>
						</div>
					</div>
				</section>
				<!-- End page top -->
				
				<!-- Begin content with sidebar -->
				<div class="container">
					<div class="row">
						<div class="col-md-9 content">
							
							<section class="pgl-pro-detail pgl-bg-light">
								<div id="slider" class="flexslider">
									<ul class="slides">
										<li>
											<img src="/templates/web/images/properties/property-detail-1.jpg" alt="">
											<span class="property-thumb-info-label">
												<span class="label price">$358,000</span>
												<span class="label forrent">Rent</span>
											</span>
										</li>
										<li>
											<img src="/templates/web/images/properties/property-detail-2.jpg" alt="">
											<span class="property-thumb-info-label">
												<span class="label price">$358,000</span>
											</span>
										</li>
										<li>
											<img src="/templates/web/images/properties/property-detail-3.jpg" alt="">
											<span class="property-thumb-info-label">
												<span class="label price">$358,000</span>
												<span class="label forrent">Rent</span>
											</span>
										</li>
										<li>
											<img src="/templates/web/images/properties/property-detail-4.jpg" alt="">
											<span class="property-thumb-info-label">
												<span class="label price">$358,000</span>
											</span>
										</li>
										<li>
											<img src="/templates/web/images/properties/property-detail-5.jpg" alt="">
											<span class="property-thumb-info-label">
												<span class="label price">$358,000</span>
											</span>
										</li>
										<li>
											<img src="/templates/web/images/properties/property-detail-1.jpg" alt="">
											<span class="property-thumb-info-label">
												<span class="label price">$358,000</span>
												<span class="label forrent">Rent</span>
											</span>
										</li>
										<li>
											<img src="/templates/web/images/properties/property-detail-2.jpg" alt="">
											<span class="property-thumb-info-label">
												<span class="label price">$358,000</span>
											</span>
										</li>
										<li>
											<img src="/templates/web/images/properties/property-detail-3.jpg" alt="">
											<span class="property-thumb-info-label">
												<span class="label price">$358,000</span>
												<span class="label forrent">Rent</span>
											</span>
										</li>
									</ul>
								</div>
								<div id="carousel" class="flexslider">
									<ul class="slides">
										<li> <img src="/templates/web/images/properties/property-detail-s-1.jpg" alt=""></li>
										<li> <img src="/templates/web/images/properties/property-detail-s-2.jpg" alt=""></li>
										<li> <img src="/templates/web/images/properties/property-detail-s-3.jpg" alt=""></li>
										<li> <img src="/templates/web/images/properties/property-detail-s-4.jpg" alt=""></li>
										<li> <img src="/templates/web/images/properties/property-detail-s-5.jpg" alt=""></li>
										<li> <img src="/templates/web/images/properties/property-detail-s-1.jpg" alt=""></li>
										<li> <img src="/templates/web/images/properties/property-detail-s-2.jpg" alt=""></li>
										<li> <img src="/templates/web/images/properties/property-detail-s-3.jpg" alt=""></li>
									</ul>
								</div>
								<div class="pgl-detail">
									<div class="row">
										<div class="col-sm-4">
											<ul class="list-unstyled amenities amenities-detail">
												<li><strong>Chủ cho thuê : </strong> </li>
												<li>Nguyễn Quốc Việt</li>
												<li><strong>Sđt : </strong> 0963058536 </li>
												
											</ul>
										</div>
										<div class="col-sm-8">
											<h2>Phòng KTX</h2>
											<p><strong>Phòng có máy lạnh , có view đẹp</strong></p>
										
										</div>
									</div>
								
									<div class="tab-detail">
										<h3>Thông tin chi tiết</h3>
										<div class="panel-group" id="accordion">
											<div class="panel panel-default pgl-panel">
												<div class="panel-heading">
													<h4 class="panel-title"> <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne">Additional Details</a> </h4>
												</div>
												<div id="collapseOne" class="panel-collapse collapse in">
													<div class="panel-body">
														<ul>
															<li><strong>AC:</strong> Ceiling Fan(s), Central</li>
															<li><strong>Acres Source:</strong> Assessor</li>
															<li><strong>Bathrooms Description:</strong> Stall Shower</li>
															<li><strong>Bathrooms Features:</strong> Main Floor Master Bedroom</li>
															<li><strong>Dining Area:</strong> Family Kitchen</li>
															<li><strong>Lot Description:</strong> Curbs-Walks</li>
														
														</ul>
													</div>
												</div>
											</div>
											<div class="panel panel-default pgl-panel">
												<div class="panel-heading">
													<h4 class="panel-title"> <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" class="collapsed">Video</a> </h4>
												</div>
												<div id="collapseTwo" class="panel-collapse collapse">
													<div class="panel-body"> <p>Sed perspiciatis unde omnisiste natus error voluptatem remopa accusantium doloremque laudantium, totam rem aperiam.</p> </div>
												</div>
											</div>
											
											
											<div class="panel panel-default pgl-panel">
												<div class="panel-heading">
													<h4 class="panel-title"> <a data-toggle="collapse" data-parent="#accordion" href="#collapseFive" class="collapsed">Comment</a> </h4>
												</div>
												<div id="collapseFive" class="panel-collapse collapse">
													<div class="comment"> 
														<div class="post-block post-comments clearfix" >
														
															<ul style="list-style-type: none">
																<li>
																	<div class="comment">
																		<div class="img-circle"> <img class="avatar" width="50" alt="" src="/templates/web/images/blog/avatar.png"> </div>
																		<div class="comment-block">
																			<span class="comment-by"> <strong>Frank Reman</strong></span>
																			<span class="date"><small><i class="fa fa-clock-o"></i> January 12, 2013</small></span>
																			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque urna varius vitae, gravida pellentesque urna varius vitae. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
																			
																		</div>
																	</div>
																	
																		<li>
																			<div class="comment">
																				<div class="img-circle"> <img class="avatar" width="50" alt="" src="/templates/web/images/blog/avatar.png"> </div>
																				<div class="comment-block">
																					<span class="comment-by"> <strong>Frank Reman</strong></span>
																					<span class="date"><small><i class="fa fa-clock-o"></i> July 11, 2014</small></span>
																					<p>Gravida pellentesque urna varius vitae. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
																			
																				</div>
																			</div>
																		</li>
																	</ul>
																</li>
															
															</ul>
														</div>
														<div class="post-block post-leave-comment">
															<h3>Leave a comment</h3>
															
															<div class="row">
																<form action="#" type="post" class="col-md-9">
																
																	
																	<div class="form-group" id="commentreply">
																		<div class="row">
																			<div class="col-md-12">
																				<label>Comment *</label>
																				<textarea maxlength="5000" rows="10" class="form-control" name="comment" id="comment"></textarea>
																			</div>
																		</div>
																	</div>
																	<div class="row">
																		<div class="col-md-12">
																			<input type="submit" value="Submit Comment" class="btn btn-default btn-sm" data-loading-text="Loading...">
																		</div>
																	</div>
																</form>
															</div>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</section>
							
								<!-- Begin Related properties -->
								<section class="pgl-properties">
									<h2>Danh sách gợi ý</h2>
									<div class="row">
										<div class="owl-carousel pgl-pro-slide" data-plugin-options='{"items": 3, "itemsDesktop": 3, "singleItem": false, "autoPlay": false, "pagination": false}'>
											<div class="col-md-12 animation">
												<div class="pgl-property">
													<div class="property-thumb-info">
														<div class="property-thumb-info-image">
															<img alt="" class="img-responsive" src="/templates/web/images/properties/property-1.jpg">
															<span class="property-thumb-info-label">
																<span class="label price">$358,000</span>
																
															</span>
														</div>
														<div class="property-thumb-info-content">
															<h3><a href="property-detail.html">Poolside character home on a wide 422sqm</a></h3>
															<address>Ferris Park, Jersey City Land in Sales</address>
														</div>
														<div class="amenities clearfix">
															<ul class="pull-left">
																<li><strong>Area:</strong> 450<sup>m2</sup></li>
															</ul>
															<ul class="pull-right">
																<span class="label forrent pull-right"><a href="#">Lưu Tin</a> </span>
															</ul>
														</div>
													</div>
												</div>
											</div>
											<div class="col-md-12 animation">
												<div class="pgl-property">
													<div class="property-thumb-info">
														<div class="property-thumb-info-image">
															<img alt="" class="img-responsive" src="/templates/web/images/properties/property-2.jpg">
															<span class="property-thumb-info-label">
																<span class="label price">$358,000</span>
																
															</span>
														</div>
														<div class="property-thumb-info-content">
															<h3><a href="property-detail.html">Poolside character home on a wide 422sqm</a></h3>
															<address>Ferris Park, Jersey City Land in Sales</address>
														</div>
														<div class="amenities clearfix">
															<ul class="pull-left">
																<li><strong>Area:</strong> 450<sup>m2</sup></li>
															</ul>
															<ul class="pull-right">
																<span class="label forrent pull-right"><a href="#">Lưu Tin</a> </span>
															</ul>
														</div>
													</div>
												</div>
											</div>
											<div class="col-md-12 animation">
												<div class="pgl-property">
													<div class="property-thumb-info">
														<div class="property-thumb-info-image">
															<img alt="" class="img-responsive" src="/templates/web/images/properties/property-3.jpg">
															<span class="property-thumb-info-label">
																<span class="label price">$358,000</span>
																
															</span>
														</div>
														<div class="property-thumb-info-content">
															<h3><a href="property-detail.html">Poolside character home on a wide 422sqm</a></h3>
															<address>Ferris Park, Jersey City Land in Sales</address>
														</div>
														<div class="amenities clearfix">
															<ul class="pull-left">
																<li><strong>Area:</strong> 450<sup>m2</sup></li>
															</ul>
															<ul class="pull-right">
																<span class="label forrent pull-right"><a href="#">Lưu Tin</a> </span>
															</ul>
														</div>
													</div>
												</div>
											</div>
											<div class="col-md-12 animation">
												<div class="pgl-property">
													<div class="property-thumb-info">
														<div class="property-thumb-info-image">
															<img alt="" class="img-responsive" src="/templates/web/images/properties/property-4.jpg">
															<span class="property-thumb-info-label">
																<span class="label price">$358,000</span>
															
															</span>
														</div>
														<div class="property-thumb-info-content">
															<h3><a href="property-detail.html">Poolside character home on a wide 422sqm</a></h3>
															<address>Ferris Park, Jersey City Land in Sales</address>
														</div>
														<div class="amenities clearfix">
															<ul class="pull-left">
																<li><strong>Area:</strong> 450<sup>m2</sup></li>
															</ul>
															<ul class="pull-right">
																<span class="label forrent pull-right"><a href="#">Lưu Tin</a> </span>
															</ul>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</section>
								<!-- End Related properties -->
							
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