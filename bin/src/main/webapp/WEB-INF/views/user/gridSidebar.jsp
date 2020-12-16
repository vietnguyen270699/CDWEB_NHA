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
						<h2><span></span></h2>
					</div>
				</div>
			</section>
			<!-- End page top -->
			
			<!-- Begin content with sidebar -->
			<div class="container">
				<div class="row">
					<div class="col-md-9 content">
						
						
						
						<!-- Begin Properties -->
						<section class="pgl-properties pgl-bg-grey">
							<h2>Danh sách</h2>
							<div class="properties-full">
								<div class="listing-header clearfix">
									<ul class="list-inline list-icons pull-left">
										<li class="active"><a href="grid-fullwidth-4-column.html"><i class="fa fa-th"></i></a></li>
										
									</ul>
									<ul class="list-inline list-sort pull-right">
								
										<li><label for="sortby-status">Sắp xếp</label></li>
										<li>
											<select id="sortby-status" name="sortby-status" data-placeholder="Sort by" class="chosen-select">
												<option value="DienTich">Diện tích</option>
												<option value="Gia">Giá</option>
												
											</select>
										</li>
									</ul>
								</div>
								<div class="row">
									<div class="col-xs-4 animation">
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
													<span class="label forrent pull-right"><a href="#">Lưu Tin</a> </span>
												</div>
											</div>
										</div>
									</div>
									<div class="col-xs-4 animation">
										<div class="pgl-property">
											<div class="property-thumb-info">
												<div class="property-thumb-info-image">
													<img alt="" class="img-responsive" src="/templates/web/images/properties/property-2.jpg">
													<span class="property-thumb-info-label">
														<span class="label price">$358,000</span>
													</span>
												</div>
												<div class="property-thumb-info-content">
													<h3><a href="property-detail.html">Presidential Parcel Frames Command Views</a></h3>
													<address>Ferris Park, Jersey City Land in Sales</address>
												</div>
												<div class="amenities clearfix">
													<ul class="pull-left">
														<li><strong>Area:</strong> 450<sup>m2</sup></li>
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
													<img alt="" class="img-responsive" src="/templates/web/images/properties/property-3.jpg">
													<span class="property-thumb-info-label">
														<span class="label price">$358,000</span>
													
													</span>
												</div>
												<div class="property-thumb-info-content">
													<h3><a href="property-detail.html">Californian Class, Grand Family Proportions</a></h3>
													<address>Ferris Park, Jersey City Land in Sales</address>
												</div>
												<div class="amenities clearfix">
													<ul class="pull-left">
														<li><strong>Area:</strong> 450<sup>m2</sup></li>
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
													<img alt="" class="img-responsive" src="/templates/web/images/properties/property-4.jpg">
													<span class="property-thumb-info-label">
														<span class="label price">$358,000</span>
													
													</span>
												</div>
												<div class="property-thumb-info-content">
													<h3><a href="property-detail.html">Chatham St NW, Roanoke, VA 24012</a></h3>
													<address>Ferris Park, Jersey City Land in Sales</address>
												</div>
												<div class="amenities clearfix">
													<ul class="pull-left">
														<li><strong>Area:</strong> 450<sup>m2</sup></li>
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
													<img alt="" class="img-responsive" src="/templates/web/images/properties/property-5.jpg">
													<span class="property-thumb-info-label">
														<span class="label price">$358,000</span>
													</span>
												</div>
												<div class="property-thumb-info-content">
													<h3><a href="property-detail.html">Chatham St NW, Roanoke, VA 24012</a></h3>
													<address>Ferris Park, Jersey City Land in Sales</address>
												</div>
												<div class="amenities clearfix">
													<ul class="pull-left">
														<li><strong>Area:</strong> 450<sup>m2</sup></li>
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
													<img alt="" class="img-responsive" src="/templates/web/images/properties/property-6.jpg">
													<span class="property-thumb-info-label">
														<span class="label price">$358,000</span>
													</span>
												</div>
												<div class="property-thumb-info-content">
													<h3><a href="property-detail.html">Chatham St NW, Roanoke, VA 24012</a></h3>
													<address>Ferris Park, Jersey City Land in Sales</address>
												</div>
												<div class="amenities clearfix">
													<ul class="pull-left">
														<li><strong>Area:</strong> 450<sup>m2</sup></li>
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
													<img alt="" class="img-responsive" src="/templates/web/images/properties/property-4.jpg">
													<span class="property-thumb-info-label">
														<span class="label price">$358,000</span>
													
													</span>
												</div>
												<div class="property-thumb-info-content">
													<h3><a href="property-detail.html">Chatham St NW, Roanoke, VA 24012</a></h3>
													<address>Ferris Park, Jersey City Land in Sales</address>
												</div>
												<div class="amenities clearfix">
													<ul class="pull-left">
														<li><strong>Area:</strong> 450<sup>m2</sup></li>
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
													<img alt="" class="img-responsive" src="/templates/web/images/properties/property-5.jpg">
													<span class="property-thumb-info-label">
														<span class="label price">$358,000</span>
													</span>
												</div>
												<div class="property-thumb-info-content">
													<h3><a href="property-detail.html">Chatham St NW, Roanoke, VA 24012</a></h3>
													<address>Ferris Park, Jersey City Land in Sales</address>
												</div>
												<div class="amenities clearfix">
													<ul class="pull-left">
														<li><strong>Area:</strong> 450<sup>m2</sup></li>
													</ul>
													<span class="label forrent pull-right"><a href="#">Lưu Tin</a> </span>
												</div>
											</div>
										</div>
									</div>
									
								</div>
								<ul class="pagination">
									<li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
									<li><a href="#">2</a></li>
									<li><a href="#">3</a></li>
									<li><a href="#">Next</a></li>
							   </ul>
							</div>
						</section>
						<!-- End Properties -->
						
					</div>
					<div class="col-md-3 sidebar">
						<!-- Begin Advanced Search -->
						<aside class="block pgl-advanced-search pgl-bg-light">
							<h3>Tìm kiếm</h3>
							<form name="advancedsearch">
								
								<div class="form-group">
									Tỉnh/Thành
									<label class="sr-only" for="location">Tỉnh/Thành</label>
									<select id="location" name="location" data-placeholder="Location" class="chosen-select">
										<option selected="selected" value="TPHCM">TP Hồ Chí Minh</option>
										<option value="BinhDuong">Bình Dương</option>		
										<option value="DongNai">Đồng Nai</option>
										<option value="BenTre">Bến Tre</option>
										
										
									</select>
								</div>
								<div class="form-group">
									Diện tích
									<label class="sr-only" for="property-types">Diện tích</label>
									<select id="property-types" name="property-types" data-placeholder="Property Types" class="chosen-select">
										<option selected="selected" value="30m2"> < 30 m2</option>
										<option value="40m2"> < 40 m2</option>
										<option value="50m2"> < 50m2</option>
										<option value="60m2"> < 60 m2</option>
										<option value="70m2"> < 70 m2</option>
										<option value="70m2"> > 70 m2</option>
									</select>
								</div>
								<div class="form-group">
									Giá
									<label class="sr-only" >Giá</label>
									<select id="" name="property-types" data-placeholder="Property Types" class="chosen-select">
										<option selected="selected" value="1 triệu"> < 1 triệu</option>
										<option value="2 triệu"> < 2 triệu</option>
										<option value="3 triệu"> < 3 triệu</option>
										<option value="4 triệu"> < 4 triệu</option>
										<option value="4 triệu"> > 4 triệu</option>
									</select>
								</div>
								
									
								
								<div class="form-group">
									<button type="submit" class="btn btn-block btn-primary">Tìm kiếm</button>
								</div>
								
							</form>
						</aside>
						<!-- End Advanced Search -->
	
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