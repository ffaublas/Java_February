<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	
	<div>
	<h1>Expense Details</h1>
	
	<p>Expense Name: ${expenseItem.expense} </p>
	<p>Expense Description: ${expenseItem.description} </p>
	<p>Vendor: ${expenseItem.vendor} </p>
    <p>Amount:  $${expenseItem.amount}</p>  

	</div>
	
	<div>
    <a href="/expenseitems">Back</a>
	</div>
</body>
</html>