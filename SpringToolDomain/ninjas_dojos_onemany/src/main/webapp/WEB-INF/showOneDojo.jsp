
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <div class="table table-striped table-info table-sm table-bordered table-hover container">
        <h1>${showDojoTeam.name} Location Ninjas </h1>
        
        <table class="table table-dark">
            <thead>
              <tr>
                <th scope="col">ID</th>
                <th scope="col">First</th>
                <th scope="col">Last</th>
                <th scope="col">Age</th>
                

              </tr>
            </thead>
            <tbody>
                <c:forEach items='${ showDojoTeam.ninjas }' var='dojObj'>
                    <tr>
                        <th scope="row">${dojObj.id}</th>
                        <td>${dojObj.firstName}</td>
                        <td>${dojObj.lastName}</td>
                        <td>${dojObj.age}</td>                        
                    </tr>
                </c:forEach>
            </tbody>
          </table>
    </div>
</body>
</html>