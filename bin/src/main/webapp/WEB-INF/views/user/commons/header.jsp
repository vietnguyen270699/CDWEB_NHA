<%@ include file="/WEB-INF/views/user/commons/taglib.jsp"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<header>
	<div id="top">
		<div class="container">

			<ul class="nav nav-pills nav-top navbar-right">

				<li><a href="#" title="" data-placement="bottom"
					data-toggle="tooltip" data-original-title="Email"><i
						class="fa fa-envelope-o"></i></a></li>
				<li><a href="#" title="" data-placement="bottom"
					data-toggle="tooltip" data-original-title="Facebook"><i
						class="fa fa-facebook"></i></a></li>
				<li><a href="#" title="" data-placement="bottom"
					data-toggle="tooltip" data-original-title="Twitter"><i
						class="fa fa-twitter"></i></a></li>
				<li><a href="#" title="" data-placement="bottom"
					data-toggle="tooltip" data-original-title="Google+"><i
						class="fa fa-google-plus"></i></a></li>
				<li><select class="form-control form-control-sm m-5"
					id="locales">
						<option value="en">English</option>
						<option value="vn">VietNamese</option>
				</select></li>
			</ul>
		</div>
	</div>
	<nav class="navbar navbar-default pgl-navbar-main" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>

				<a class="logo" href="/hostel/home"><img
					src="/templates/web/images/nha.gif" alt="Flatize"></a>
			</div>

			<div class="navbar-collapse collapse width">
				<ul class="nav navbar-nav pull-right">

					<!-- <li><a href="list-fullwidth.html">Danh sách nhà trọ</a></li> -->
					<li><a href="/hostel/lsHome">Danh sách nhà trọ</a></li>
					<li><a href="/hostel/blog">Blog</a></li>
					<li><a href="/hostel/contact">Liên hệ</a></li>
					<li class="login "><a href="/hostel/profile"><i
							class="fa fa-user"></i>Tài khoản</a></li>
					<li><a href="/hostel/home">Đăng nhập</a></li>


				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
		<!--/.container-fluid -->
	</nav>
</header>