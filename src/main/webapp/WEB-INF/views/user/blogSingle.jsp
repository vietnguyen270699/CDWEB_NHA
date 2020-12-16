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
						<h2><span>Article detail</span></h2>
					</div>
				</div>
			</section>
			<!-- End page top -->
			
			<!-- Begin content with sidebar -->
			<div class="container">
				<div class="row">
					<div class="col-md-9 content">
						<div class="blog-posts">
							<article class="post post-large post-single">
								<div class="post-image">
									<div class="owl-carousel pgl-pro-slide pgl-img-slide" data-plugin-options='{"items": 1, "pagination": false, "autoHeight": true}'>
										<div class="item"><img class="img-responsive" src="/templates/web/images/blog/demo-1.jpg" alt="Blog">
											<div class="item-caption">
												<p><small>Caption here eaque ipsa</small></p>
											</div>
										</div>
										<div class="item"><img class="img-responsive" src="/templates/web/images/blog/demo-1.jpg" alt="Blog">
											<div class="item-caption">
												<p><small>Excepteur sint occaecat cupidatat</small></p>
											</div>
										</div>
										<div class="item"><img class="img-responsive" src="/templates/web/images/blog/demo-3.jpg" alt="Blog">
											<div class="item-caption">
												<p><small>Voluptatem accusantium doloremque laudantium</small></p>
											</div>
										</div>
									</div>
									
								</div>
								<div class="post-body">
								
										<ul class="post-action" >
											<li class="btn-pre"><a href="#">Riff Raff Eats Fried Okra With Oprah on 'Dolce &amp; Gabbana’</a></li>
											<li class="btn-next"><a href="#">Watch Drunk Riff Raff Freestyle About Failed Hoop Dreams for 10 Minutes</a></li>
										</ul>
										
										<!-- begin comment -->
									<div class="comment"> 
										<div class="post-block post-comments clearfix" >
											<h2 id="title-comment"> Thảo luận</h2>
											<ul style="list-style-type: none">
												<li>
													<div class="comment">
														<div class="img-circle"> <img class="avatar" width="50" alt="" src="/templates/web/images/blog/avatar.png"> </div>
														<div class="comment-block">
															<span class="comment-by"> <strong>Frank Reman</strong></span>
															<span class="date"><small><i class="fa fa-clock-o"></i> January 12, 2013</small></span>
															<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque urna varius vitae, gravida pellentesque urna varius vitae. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
															<a href="#commentreply"><small><i class="fa fa-reply"></i> Reply</small></a>
														</div>
													</div>
													<ul class="comments reply">
														<li>
															<div class="comment">
																<div class="img-circle"> <img class="avatar" width="50" alt="" src="/templates/web/images/blog/avatar.png"> </div>
																<div class="comment-block">
																	<span class="comment-by"> <strong>Frank Reman</strong></span>
																	<span class="date"><small><i class="fa fa-clock-o"></i> July 11, 2014</small></span>
																	<p>Nam viverra euismod odio, gravida pellentesque urna varius vitae, gravida pellentesque urna varius vitae. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
																	<a href="#commentreply"><small><i class="fa fa-reply"></i> Reply</small></a>
																</div>
															</div>
														</li>
														<li>
															<div class="comment">
																<div class="img-circle"> <img class="avatar" width="50" alt="" src="/templates/web/images/blog/avatar.png"> </div>
																<div class="comment-block">
																	<span class="comment-by"> <strong>Frank Reman</strong></span>
																	<span class="date"><small><i class="fa fa-clock-o"></i> July 11, 2014</small></span>
																	<p>Gravida pellentesque urna varius vitae. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
																	<a href="#commentreply"><small><i class="fa fa-reply"></i> Reply</small></a>
																</div>
															</div>
														</li>
													</ul>
												</li>
												<li>
													<div class="comment">
														<div class="img-circle"> <img class="avatar" width="50" alt="" src="/templates/web/images/blog/avatar.png"> </div>
														<div class="comment-block">
															<span class="comment-by"> <strong>Frank Reman</strong></span>
															<span class="date"><small><i class="fa fa-clock-o"></i> July 11, 2014</small></span>
															<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque urna varius vitae, gravida pellentesque urna varius vitae</p>
															<a href="#commentreply"><small><i class="fa fa-reply"></i> Reply</small></a>
														</div>
													</div>
												</li>
												<li>
													<div class="comment">
														<div class="img-circle"> <img class="avatar" width="50" alt="" src="/templates/web/images/blog/avatar.png"> </div>
														<div class="comment-block">
															<span class="comment-by"> <strong>Frank Reman</strong></span>
															<span class="date"><small><i class="fa fa-clock-o"></i> July 11, 2014</small></span>
															<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
															<a href="#commentreply"><small><i class="fa fa-reply"></i> Reply</small></a>
														</div>
													</div>
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

							<!-- end comment -->
							</article>
							
						</div>
					</div>
				
			
		</div>
		<!-- End Main -->

			<!-- footer  -->
			<jsp:include page="commons/footer.jsp"></jsp:include>
			<!-- end footer  -->
			<jsp:include page="commons/script.jsp"></jsp:include>
		</div>
</body>
</html>