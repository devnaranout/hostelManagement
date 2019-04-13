<%-- 
    Document   : studentInfo
    Created on : Mar 31, 2019, 2:40:21 AM
    Author     : Devna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>



<% String name= (String)session.getAttribute("name"); %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Info</title>
        <style>
            table, td, th {
  border: 4px solid black;
}

table {
  border-collapse: collapse;
  width: 50%;
}

th {
  height: 50px;
}

th, td {
  padding: 20px;
}
body {
background-size:cover;
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
    <table align="center" cellpadding="4" cellspacing="4">
<tr>

</tr>
<tr>
<td bgcolor="darkgrey"><b>Id :</b></td>
        
        <%
try {
Connection con=null;
        PreparedStatement pr=null;
            String myUrl="jdbc:mysql://localhost/hostelmanagement";
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(myUrl,"root","");
String query = "SELECT * FROM student where name=?";

pr=con.prepareStatement(query);
            pr.setString(1,name);
            
            ResultSet rs;
            rs=pr.executeQuery();
while (rs.next()) {
%>

<td bgcolor="gainsboro"><%=rs.getInt("id")%></td>
</tr>
<tr>
<td bgcolor="darkgrey"><b>Name :</b></td>
<td bgcolor="gainsboro"><%=rs.getString("name")%></td>  
</tr>
<tr>
<td bgcolor="darkgrey"><b>Mobile no :</b></td>
<td bgcolor="gainsboro"><%=rs.getInt("mobNo")%></td>   
</tr>
<tr>
<td bgcolor="darkgrey"><b>Father name :</b></td>
<td bgcolor="gainsboro"><%=rs.getString("fName")%></td>
</tr>
<tr>
<td bgcolor="darkgrey"><b>Father's Contact :</b></td>
<td bgcolor="gainsboro"><%=rs.getInt("fMobNo")%></td>
</tr>
<tr>
<td bgcolor="darkgrey"><b>Mentor :</b></td>
<td bgcolor="gainsboro"><%=rs.getString("admin")%></td>
</tr>
<%
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
        
        
    </body>
</html>
