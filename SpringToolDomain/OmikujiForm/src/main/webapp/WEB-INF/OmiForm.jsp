<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
	<div class="container">
        <h1>Send an Omikuji!</h1>
        <form action="/get_fortune" method="post">
            <div class="form-group">
                <label for="">Pick any number from 5 to 25</label>
                <input type="number" name="number" id="" class="form-control" style = "width: 20%;">
            </div>
            <div class="form-group">
                <label for="">Enter the name of any city</label>
                <input type="text" name="city_name" id="" class="form-control" >
            </div>
            <div class="form-group">
                <label for="">Enter the name of any real person</label>
                <input type="text" name="real_name" id="" class="form-control">
            </div>
            <div class="form-group">
                <label for="">Enter professional endeavor or hobby</label>
                <input type="text" name="hobby" id="" class="form-control">
            </div>
            <div class="form-group">
                <label for="">Enter any type of living thing</label>
                <input type="text" name="living_thing" id="" class="form-control">
            </div>
            <div class="form-group">
                <label for="">Say something nice to someone</label>
                <textarea name="something_nice" id="" cols="30" rows="10" class="form-control"></textarea>
            </div>
            <h6>Send and show a friend</h6>
            <input type="submit" value="Send" class="btn btn-success">
        </form>
    </div>
    
</body>
</html>