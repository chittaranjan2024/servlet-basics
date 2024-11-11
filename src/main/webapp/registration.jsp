<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h3>User registration</h3>
  <form action="/process" method="post">
  
    <label>Name:</label>
    <input type="text" name="uname" required>
    <br/>
    <label>City:</label>
    <input type="text" name="city" required>
     <br/>
    <label>Email:</label>
    <input type="email" name="email" required>
    <br/>
    <input type="submit" value="register"> 
    
  </form>
</body>
</html>