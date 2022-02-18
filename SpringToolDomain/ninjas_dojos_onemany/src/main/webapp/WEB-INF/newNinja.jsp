
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1>New Ninja</h1>
        <form:form action="/ninjas/create" method="post" modelAttribute="ninja">
        	 <div>
                <form:label path="dojo">Dojo</form:label>
                <form:errors path="dojo" class= "text-danger"/>
                <form:select path="dojo" name="" id="" class="form-select">
                    <c:forEach items='${ alldojos }' var='dojoObj'>
                        <option value="${dojoObj.id}">${dojoObj.name}</option>
                    </c:forEach>
                </form:select>

            </div>
            <div>
                <form:label path="firstName">First Name</form:label>
                <form:errors path="firstName" class= "text-danger"/>
                <form:input path="firstName" type="text" class= "form-control"/>
            </div>
            <div>
                <form:label path="lastName">Last Name</form:label>
                <form:errors path="lastName" class= "text-danger"/>
                <form:input path="lastName" type="text" class= "form-control"/>
            </div>
            <div>
                <form:label path="age">Age</form:label>
                <form:errors path="age" class= "text-danger"/>
                <form:input path="age" type="number" class= "form-control"/>
            </div>
           

            
          
            <input type="submit" value="Create"/>
        </form:form>
    </div>
</body>
</html>