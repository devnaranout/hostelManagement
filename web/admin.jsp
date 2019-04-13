<%-- 
    Document   : admin
    Created on : Mar 29, 2019, 2:24:06 PM
    Author     : Devna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login</title>
        <style>
            
body {
background-size:cover;
}

img {
  display: block;
  margin-left: auto;
  margin-right: auto;
}

.center {
text-align: center;
}
        
input[type=text], input[type=password] {
    width: 50%;
    padding: 15px;
    margin: 5px 0 22px 0;
    border: none;
    background: #f1f1f1;
}
input[type=text]:focus, input[type=password]:focus {
    background-color: #ddd;
    outline: none;
}
/* Set a style for the submit button */
.btn {
    background-color: #4CAF50;
    color: white;
    padding: 16px 20px;
    border: none;
    cursor: pointer;
    width: 50%;
    opacity: 0.9;
}
.btn:hover {
    opacity: 1;
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
        </style>
    </head>
<body background="480421.jpg">

    <font face="forte" color="white" size="7">
    <center><u>Hostel Management</u></center></font>
    <hr><br><br>
    
    <img src="images.jpg" height="150" width="150">
    <div class="bg-img center">
   <form action="admin" method="post" class="container">
       <br><br>

      <input type="text" placeholder="Enter id" name="id" pattern="[0-9]{10}" title="ten digits" required>

    <input type="password" placeholder="Enter Password" name="psw" required>

    <button type="submit" class="btn">Login</button>
  </form>
</div>
    </body>
</html>
