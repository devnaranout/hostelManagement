<%-- 
    Document   : sComplaint
    Created on : Mar 31, 2019, 11:08:29 PM
    Author     : Devna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="javax.servlet.ServletException"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>

<% String name= (String)session.getAttribute("name"); %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Complaints</title>
        <style>
body {
background-size:cover;
}

img {
  float: right;
}
.btn {
    background-color: #4CAF50;
    color: white;
    padding: 16px 20px;
    border: none;
    cursor: pointer;
    width: 20%;
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
    
    <body background="480421.jpg" link="white" alink="green" vlink="salmon">

    <font face="forte" color="white" size="7">
    <center><u>Hostel Management</u></center></font>
    <nav style="text-align:right;">
         |        <a href="homepage.jsp"><font size=4 face="Comic Sans MS">    Log out</font></a>
</nav>
    <hr> 
    
    <br><br>
    
    <font face="forte" color="white" size="6">
        <p><img src="comp.jpg" height="290" width="500" border="5">
            Complaint :
    <form action="sComplaint" method="post" class="container">
       

        <textarea rows="14" cols="100" name="comp" placeholder="Write your complaint here......" required></textarea>
       <br>
    <button type="submit" class="btn">Submit</button>
  </form>
            
            
        </p>
        </font>
    
    
    
    </body>
</html>
