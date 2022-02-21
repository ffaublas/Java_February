<!-- c:out ; c:forEach ; c:if -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <!-- form:form -->
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

    <h1>Save Travels</h1>
  
    <table class="table table-dark">
      <thead>
        <tr>
          <th scope="col">ID</th>
          <th scope="col">Expense</th>
          <th scope="col">Vendor</th>
          <th scope="col">Amount</th>
          <th>Actions: </th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items='${ allExpenses }' var='travObj'>
          <tr>
            <th scope="row">${travObj.id}</th>
            <td><a href="/expenseitems/${travObj.id}">${travObj.expense}</a></td>
            <td>${travObj.vendor}</td>
            <td>${travObj.amount}</td>
            <td>
              <a href="/expenseitems/edit/${travObj.id}">Edit</a> ||
              <a href="/expenseitems/delete/${travObj.id}">Delete</a>
            </td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
    <hr>

	<h1>Add an expense: </h1>
	
    <form:form action="/expenseitem/create" method="post" modelAttribute="expenseitem"> <!--The model attribute represents which model to bind to-->
      <!-- The path="" must match the member variables from the Table Model class -->
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
  </div>
</body>
</html>