<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link href="<c:url value="/resources/bootstrap/css/style.css"/>" rel="stylesheet">
<title>Clickart</title>
</head>
<body>
<hr>
<footer id="footer">
<div class="container">
	<div class="row">
		<div class="col-3 column">
			<h4>Information</h4>
			<ul class="nav">
				<li><a href="about-us.html">Products</a></li>
				<li><a href="about-us.html">Services</a></li>
				<li><a href="about-us.html">Benefits</a></li>
				<li><a href="elements.html">Developers</a></li>
			</ul>
		</div>
		<div class="col-3 column">
			<h4>Follow Us</h4>
			<ul class="nav">
				<li><a href="#">Twitter</a></li>
				<li><a href="#">Facebook</a></li>
				<li><a href="#">Google+</a></li>
				<li><a href="#">Pinterest</a></li>
			</ul>
		</div>
		<div class="col-3 column">
			<h4>Contact Us</h4>
			<ul class="nav">
				<li><a href="#">Email</a></li>
				<li><a href="#">Headquarters</a></li>
				<li><a href="#">Management</a></li>
				<li><a href="#">Support</a></li>
			</ul>
		</div>
		<div class="col-3 column">
			<h4>Customer Service</h4>
			<ul class="nav">
				<li><a href="#">About Us</a></li>
				<li><a href="#">Delivery Information</a></li>
				<li><a href="#">Privacy Policy</a></li>
				<li><a href="#">Terms &amp; Conditions</a></li>
			</ul>
		</div>
	</div>
	<!--/row-->
	<p class="text-right">�Clickart</p>
</div>
</footer>

<div class="scroll-up">
	<a href="#"><i class="fa fa-angle-up"></i></a>
</div>

<div id="myModal" class="modal fade" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">�</button>
				<h2 class="text-center">
					<img src="//placehold.it/110" class="img-circle"><br>Login
				</h2>
			</div>
			<div class="modal-body row">
				<h6 class="text-center">COMPLETE THESE FIELDS TO SIGN UP</h6>
				<form class="col-md-10 col-md-offset-1 col-xs-12 col-xs-offset-0">
					<div class="form-group">
						<input type="text" class="form-control input-lg"
							placeholder="Email">
					</div>
					<div class="form-group">
						<input type="password" class="form-control input-lg"
							placeholder="Password">
					</div>
					<div class="form-group">
						<button class="btn btn-danger btn-lg btn-block">Sign In</button>
						<span class="pull-right"><a href="#">Register</a></span><span><a
							href="#">Need help?</a></span>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<h6 class="text-center">
					<a href="">Privacy is important to us. Click here to read why.</a>
				</h6>
			</div>
		</div>
	</div>
</div>

</body>
</html>