
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
        <h1>Welcome. Please add a Dojo using the form below:</h1>
        <a href="/ninjas/add">Add a Ninja to a Dojo</a>
        <form:form action="/dojos/create" method="post" modelAttribute="dojo">
            <p>
                <form:label path="name">Title</form:label>
                <form:errors path="name" class= "text-danger"/>
                <form:input path="name" type="text" class= "form-control"/>
            </p>
          
            <input type="submit" value="Submit"/>
        </form:form>    
        
    </div>
        

</body>
</html>