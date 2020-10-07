<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>	Hi This Is Rest Web Services</title>
</head>
<body>

	<form action="getCustomer", method="post">
		Customer Id ::<input type="text" name="custId"><br>
		<input type="submit" ><br>
		
	</form>
	
	</br>
	
	<form action="insertCustomer", method="post">
		Customer Id ::<input type="text" name="custId"><br>
		Customer Name ::<input type="text" name="custName"><br>
		Customer Address ::<input type="text" name="custAddr"><br>
		<input type="submit" ><br>	
	</form>
	
		
</body>
</html>