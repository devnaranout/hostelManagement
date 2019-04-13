<%-- 
    Document   : homepage
    Created on : Mar 20, 2019, 1:06:25 AM
    Author     : Devna
--%>
  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hostel Management</title>
        <style>
body {
  background-size:cover;
}
.center {
  text-align: center;
}
img {
  float: right;
}
a:link, a:visited {
    background-color: #f44336;
    color: white;
    padding: 12px 20px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
}
    a:hover, a:active {
    background-color:red;
}
a.button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 16px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    -webkit-transition-duration: 0.4s; /* Safari */
    transition-duration: 0.4s;
    cursor: pointer;
}
a.button1 {
    background-color: white; 
    color: black; 
    border: 2px solid #4CAF50;
    border-radius: 12px;
}
a.button1:hover {
    background-color: #4CAF50;
    color: white;
}
* {
    box-sizing: border-box;
}
</style>
</head>
<body background="480421.jpg">

    
    <div class="center">
        <font face="forte" color="white" size="8">
        <p><i><b>" WELCOME TO HOSTEL WORLD "</b></i></p>
        
        </font>
        <a href="admin.jsp" class="button button1">ADMIN</a>
        <a href="student.jsp" class="button button1">STUDENT</a>
        </div>
    <br><br>
        <font face="forte" color="white" size="6">
        <p><img src="Hostel_Dormitory.jpg" height="290" width="500" border="5">
        <ul>
            <li>Fully Wi-Fi Hostel</li>
            <li>Our Hostel have separate facilities for boys and girls, caring wardens and tight security arrangements</li>
            <li>We have tie-ups with renowned hospitals to take care of any kind of emergency</li>
            <li>Our Cafeterias menus are designed by professional dieticians, and offer nutritious and wholesome food</li>
        </ul> 
        </p>
        </font>
    
    
    

    </body>
</html>