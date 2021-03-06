<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page import="com.captcha.botdetect.web.servlet.Captcha"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>TradeKart - ${title}</title>

<!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Readable Theme -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">


<!-- Custom CSS -->
<link href="${css}/myapp.css" rel="stylesheet">

<script>
	window.menu = '${title}';

	window.contextRoot = '${contextRoot}'
</script>

</head>
<body>

	<div class="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<div class="container">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<a class="navbar-brand" href="${contextRoot}/home">TradeKart</a>
				</div>
			</div>
		</nav>

		<!-- Page Content -->

		<div class="content">

			<div class="container">

				<c:if test="${not empty message}">
					<div class="row">
						<div class="col-xs-12 col-md-offset-2 col-md-8">
							<div class="alert alert-danger fade in">${message}</div>
						</div>
					</div>
				</c:if>

				<div class="row">
					<div class="col-md-offset-3 col-md-6">
						<div class="panel panel-primary">
							<div class="panel-heading">
								<h4>Welcome ${name}.Here you can reset your Password</h4>
							</div>

							<div class="panel-body">
								<form action="${contextRoot}/newPassword" method="POST"
									class="form-horizontal" id="loginForm">
									<div class="form-group">
										<label for="username" class="col-md-4 control-label">Email:
										</label>
										<div class="col-md-8">
											<input type="text" name="rusername" id="rusername" value="${emailId}"
												class="form-control" />
										</div>
									</div>
									<div class="form-group">
										<label for="password" class="col-md-4 control-label">New Password:
										</label>
										<div class="col-md-8">
											<input type="password" name="rpassword" id="rpassword"
												class="form-control" />
										</div>
									</div>
									
									<div class="form-group">
										<label for="password" class="col-md-4 control-label">Confirm Password:
										</label>
										<div class="col-md-8">
											<input type="password" name="rcpassword" id="rcpassword"
												class="form-control" />
										</div>
									</div>

									<div class="form-group">
										<label for="captchaCode" class="col-md-4 control-label">Retype
											the characters from the picture: </label>
										<div class="col-md-8">
											<%
												// Adding BotDetect Captcha to the page
												Captcha captcha = Captcha.load(request, "CaptchaObject");
												captcha.setUserInputID("captchaCode");

												String captchaHtml = captcha.getHtml();
												out.write(captchaHtml);
											%>

										</div>


										<div class="col-md-8">
											<input id="captchaCode" type="text" name="captchaCode"
												id="password" required="required" class="form-control" />
										</div>
									</div>

									<div class="form-group">
										<div class="col-md-offset-4 col-md-8">
											<input type="hidden" name="${_csrf.parameterName}"
												value="${_csrf.token}" /> <input type="submit"
												value="Reset" class="btn btn-primary" />
										</div>
									</div>
								</form>
							</div>
							<div class="panel-footer">

								<div class="text-right">
									Your account password will be reset.
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>


		<!-- Footer comes here -->
		<%@include file="./shared/footer.jsp"%>

		<!-- jQuery -->
		<script src="${js}/jquery.js"></script>

		<script src="${js}/jquery.validate.js"></script>

		<!-- Bootstrap Core JavaScript -->
		<script src="${js}/bootstrap.min.js"></script>

		<!-- Self coded javascript -->
		<script src="${js}/myapp.js"></script>

	</div>
	here we go!!! ${name} ${emailId}
</body>
</html>