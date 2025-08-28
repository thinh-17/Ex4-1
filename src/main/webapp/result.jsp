<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Result Submit</title>
    <link rel="stylesheet" href="styles/survey.css">
</head>
<body>
	<div class="container">
		<header>
			<h1>Thanks for your submittion</h1>

			<p>Here is the information that you entered:</p>
		</header>

		<label>Email:</label>
		<span>${user.email}</span><br>
		<label>First Name:</label> 
		<span>${user.firstName}</span><br>
		<label>Last Name:</label> 
		<span>${user.lastName}</span><br>
		<label>Date Of Birth:</label> 
		<span>${user.date}</span><br>
		
		<p>Here is the survey information that you chose:</p>
		
		<label>You heared about us:</label>
		<span>${choose.hear}</span><br>
		<label>You want to receive announcements new CDs and special offers:</label> 
		<span>${choose.receiveUp}</span><br>
		<label>You want to send email:</label> 
		<span>${choose.receiveEmail}</span><br>
		<label>You want to contact by:</label> 
		<span>${choose.contact}</span><br>
		
		<p>To enter again your information, click on the Back button in
			your browser or the Return button shown below.</p>

		<form action="" method="get">
			<div class="boxSubmit">
				<input type="hidden" name="action" value="join"> <input
				type="submit" value="Return">
			</div>
		</form>
	</div>
</body>
</html>