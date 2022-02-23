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
	
    <div class="container">
        <h1>Details about ${bookToShow.title}</h1>
      
        <p> ${bookToShow.creator.userName} read ${bookToShow.title} by ${bookToShow.author}</p>
        
        <p>Here are ${bookToShow.creator.userName} thoughts: </p>
        
        <hr>
        
        <p> ${bookToShow.thoughts}</p>
        
        <hr>
        
        <c:if test='${idOfLoggedInUser == bookToShow.creator.id}'>
            <a href="/books/${bookToShow.id}/edit">Edit</a> ||
            <a href="/books/${bookToShow.id}/delete">Delete</a>
        </c:if>

		
    </div>
    
    <div>
	<a href="/home">back to the shelves</a>
	</div>

</body>
</html>