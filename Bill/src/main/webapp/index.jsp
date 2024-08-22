<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing</title>
<style>
body{
background-color:#E6E6FA;
margin:0;
padding:0;
}
.container{
max-width:500px;
background-color:#FOE68C;
margin:50px;
Padding:50px;
}
form{
display:flex;
flex-direction:column;
}
header{
text-align:center;
margin-bottom:20px;
}
h1{
color:#000000;
}
label{
margin-bottom:10px;
}
input{
margin-bottom:10px;
bprder:1px solid #000000;
padding:8px;
}
button{
padding:12px;
background-color:#008080;
border-radius:5px;
cursor:pointer;
}
</style>
</head>
<body>
	<div class="container">
		<header>
			<h1>Electricity Bill Management System</h1>
		</header>
		<form action="Billing" method="post">
			<label>Bill number : </label> 
			<input type="number" name="billnumber" placeholder="eg:123"> 
			<label>No. of units : </label> 
			<input type="number" name="units" placeholder="Enter number of units">
			<button type="submit">Find the bill</button>
		</form>
	</div>
</body>
</html>