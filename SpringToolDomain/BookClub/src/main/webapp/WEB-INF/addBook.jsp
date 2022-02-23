 <!-- c:out ; c:forEach ; c:if -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!-- Formatting (like dates) -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 <!-- form:form -->
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
   <!-- for rendering errors on PUT routes -->
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
        <h1>Add a Book to Your Shelf!</h1>
        <form:form action="/books/create" method="post" modelAttribute="book">
            <form:input type="hidden" path="creator" value="${idOfLoggedInUser}" />
            <div> 
                <form:label path="title">Title:</form:label>
                <form:errors path="title" class = "text-danger"/>
                <form:input path="title" type="text" class= "form-control"/>
            </div>
            <div>
                <form:label path="author">Author:</form:label>
                <form:errors path="author" class = "text-danger"/>
                <form:input path="author" type="text" class= "form-control"/>
            </div>
            <div>
                <form:label path="thoughts">My thoughts:</form:label>
                <form:errors path="thoughts" class = "text-danger"/>
                <form:textarea path="thoughts" type="text" class= "form-control"/>
            </div>
            <input type="submit" value="Submit" class= "btn btn-success mt-3"/>
        </form:form>  
        <a href="/home">back to the shelves</a> 
    </div>
</body>
</html>