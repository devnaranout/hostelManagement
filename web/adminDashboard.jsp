<%-- 
    Document   : adminDashboard
    Created on : Mar 29, 2019, 6:21:05 PM
    Author     : Devna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <style>
body {
background-size:cover;
}
img {
  border-radius: 50%;
}

* {
  box-sizing: border-box;
}

.column {
  float: left;
  width: 23.33%;
  padding: 5px;
}

/* Clearfix (clear floats) */
.row::after {
  content: "";
  clear: both;
  display: table;
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
    
    <font face="Comic Sans MS" color="white" size="5">
    <p> Welcome <%=request.getAttribute("name")%>
    </p>
    <br>
    <% String name=(String)request.getAttribute("name");
    session.setAttribute("name", name);%>
   <div class="row">
  <div class="column">
  <a href="myStudents.jsp">
    <img src="56B60798-E63D-4842-9914-582A3566D987.jpg" height="230" width="270"></a>
  </div>
  <div class="column">
      <a href="aFines.jsp">
          <img src="images (1).jpg" height="230" width="270"></a>
  </div>
  <div class="column">
    <img src="87046706-complaint-rubber-stamp.jpg" height="230" width="270">
  </div>
       
       <div class="column">
           <a href="addStudent.jsp">
               <img src="images.png" height="230" width="270"></a>
  </div>
       
</div>  
    <pre><font face="forte" color="white" size="5">            Students                                       Fines                                      Complaints                               Add Student

    </pre>
    </font>
    
    <div class="row">
        <div class="column">
           <a href="deleteStudent.jsp">
               <img src="images (1).png" height="230" width="270"></a>
  </div>
    <div class="column">
           <a href="aChangePassword.jsp">
               <img src="images (2).png" height="230" width="270"></a>
  </div>
    </div>
    
    <pre><font face="forte" color="white" size="5">            Delete Student                         Change Password   

    </pre>
    </font>
    </body>
</html>
