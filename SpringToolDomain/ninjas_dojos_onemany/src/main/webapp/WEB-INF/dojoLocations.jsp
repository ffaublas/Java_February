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
		<h1>${alldojos} Location Ninjas</h1>
	
<table class="table table-striped table-info table-sm table-bordered table-hover container">
  <thead class = "table-primary">
    <tr>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Age</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="dojoObj" items="${ninja}">
	    <tr>
	      <td>${dojoObj.firstName }</td>
	      <td>${dojoObj.lastName }</td>
	      <td>${dojoObj.age }</td>
	    </tr>
    </c:forEach>
  </tbody>
</table>
</body>
</html>