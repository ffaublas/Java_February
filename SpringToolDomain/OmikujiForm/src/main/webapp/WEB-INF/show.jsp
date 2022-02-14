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
	<h1>Here's Your Omikuji!</h1>
	
        <p>In <%= session.getAttribute("number")  %> years, you will live in  <%= session.getAttribute("city_name")  %> with <%= session.getAttribute("real_name")  %> as your roommate, selling  <%= session.getAttribute("hobby")  %> for a living.  The next time you see a <%= session.getAttribute("living_thing") %> you will have good luck. Also,  <%= session.getAttribute("something_nice")  %>. </p>
</body>
</html>