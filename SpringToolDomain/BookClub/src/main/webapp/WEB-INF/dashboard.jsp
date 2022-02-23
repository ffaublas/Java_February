<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <h1>Welcome, ${loggedInUser.userName} </h1>
        <p>Books from everyone's shelves:</p>
        <a href="/logout">Logout</a>
        <a href="/books/new">Add a book to my shelf</a>
        <table class="table table-striped table-info table-sm table-bordered table-hover container">
            <thead>
              <tr>
                <th scope="col">ID#</th>
                <th scope="col">Title</th>                
                <th scope="col">Author Name</th>
                <th scope="col">Posted By (creator)</th>
                <th scope="col">Actions</th>

              </tr>
            </thead>
            <tbody>
                <c:forEach items='${ allBooks }' var='bookObj'>

                    <tr>
                        <th scope="row">${bookObj.id}</th>
                        <td><a href="/books/${bookObj.id}/details">${bookObj.title}</a></td>                                       
                        <td>${bookObj.author}</td>
                        <td>${bookObj.creator.userName}</td>
                        <td>
                            <!--if the logged in users id is the same as the bookObj's creator's id, then they can see the edit link-->
                            <c:if test='${loggedInUser.id == bookObj.creator.id }'>
                                <a href="/books/${bookObj.id}/edit">Edit</a> || 
                                <a href="/books/${bookObj.id}/delete">Delete</a>
                            </c:if>
                        </td>
                        

                    </tr>
                </c:forEach>
              
            </tbody>
          </table>
    </div>
 
</body>
</html>