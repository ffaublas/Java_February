<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1>Edit Menu Item below:</h1>
    
        <form:form action="/expenseitems/update/${itemToEdit.id}" method="post" modelAttribute="itemToEdit">
            <input type="hidden" name="_method" value="put">
              <p>
			      <form:label path="expense">Expense: </form:label>
			      <form:errors path="expense" class = "text-danger" />
			      <form:input type="text" path="expense" class= "form-control"/>
    			</p>
		    <p>
		        <form:label path="vendor">Vendor: </form:label>
		        <form:errors path="vendor" class = "text-danger"/>
		        <form:input type="text" path="vendor" class= "form-control"/>
		    </p>
		    <p>
		        <form:label path="amount">Amount: </form:label>
		        <form:errors path="amount" class = "text-danger"/>
		        <form:input type = "number" path="amount" step="0.01" class= "form-control"/>
		    </p>
		    <p>
		        <form:label path="description">Description: </form:label>
		        <form:errors path="description" class = "text-danger"/>     
		        <form:textarea path="description" class= "form-control"/>
		    </p>    
            <input type="submit" value="Submit"/>
        </form:form>
        
       	<a href="/expenseitems">Cancel</a>

    </div>
</body>
</html>