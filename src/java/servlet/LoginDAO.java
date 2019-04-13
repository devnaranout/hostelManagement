
package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;


public class LoginDAO {
    
    public String checkInfo(String id,String psw) throws ClassNotFoundException, SQLException
    {
        Connection con=null;
        PreparedStatement pr=null;
            String myUrl="jdbc:mysql://localhost/hostelmanagement";
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(myUrl,"root","");
            
            
           
            String query="select * from admin where id=? and password=?";
            pr=con.prepareStatement(query);
            pr.setString(1,id);
            pr.setString(2,psw);
            
            ResultSet rs;
            rs=pr.executeQuery();
            if(rs.next())
            {
                return "you are logged in";
            }
           
                return "incorrect data";

            
    }
    
    
    public String checkInfo1(String id,String psw) throws ClassNotFoundException, SQLException
    {
        Connection con=null;
        PreparedStatement pr=null;
            String myUrl="jdbc:mysql://localhost/hostelmanagement";
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(myUrl,"root","");
            
            
           
            String query="select * from student where id=? and password=?";
            pr=con.prepareStatement(query);
            pr.setString(1,id);
            pr.setString(2,psw);
            
            ResultSet rs;
            rs=pr.executeQuery();
            if(rs.next())
            {
                return "you are logged in";
            }
           
                return "incorrect data";

            
    }
    
    public String addData(String comp,String name) throws ClassNotFoundException, SQLException
    {
        Connection con=null;
        PreparedStatement pr=null;
            String myUrl="jdbc:mysql://localhost/hostelmanagement";
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(myUrl,"root","");
            
           
            String query="insert into complaint(student,complaint) values(?,?)";
            pr=con.prepareStatement(query);
            pr.setString(1,name);
            pr.setString(2,comp);
            ResultSet rs;
            rs=pr.executeQuery();
            if(rs.next())
            {
                return "data inserted successfully";
            }
            return "data not inserted";
    }
    
    public String addData(String id,String name1,String psw,String mobNo,String fName,String fMobNo,String fineDue,String finePaid,String name) throws ClassNotFoundException, SQLException
    {
        Connection con=null;
        PreparedStatement pr=null;
            String myUrl="jdbc:mysql://localhost/hostelmanagement";
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(myUrl,"root","");
            
           
            
            String query="insert into student(id,name,password,admin,mobNo,fName,fMobNo,fineDue,finePaid) values(?,?,?,?,?,?,?,?,?)";
            pr=con.prepareStatement(query);
            pr.setString(1,id);
            pr.setString(2,name1);
            pr.setString(3,psw);
            pr.setString(4,name);
            pr.setString(5,mobNo);
            pr.setString(6,fName);
            pr.setString(7,fMobNo);
            pr.setString(8,fineDue);
            pr.setString(9,finePaid);
            ResultSet rs;
            rs=pr.executeQuery();
            if(rs.next())
            {
                return "data inserted successfully";
            }
            return "data not inserted";
    }
    
    
    
    public String deleteData(String id) throws ClassNotFoundException, SQLException
    {
        Connection con=null;
        PreparedStatement pr=null;
            String myUrl="jdbc:mysql://localhost/hostelmanagement";
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(myUrl,"root","");
            
           
            
            String query="delete from student where id=?";
            pr=con.prepareStatement(query);
            pr.setString(1,id);
            ResultSet rs;
            rs=pr.executeQuery();
            if(rs.next())
            {
                return "data deleted successfully";
            }
            return "data not deleted";
    }
    
    
    
    public String changePassword(String name,String opsw,String npsw) throws ClassNotFoundException, SQLException
    {
        Connection con=null;
        PreparedStatement pr=null;
            String myUrl="jdbc:mysql://localhost/carpoolingproj";
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(myUrl,"root","");
            
           
            String query="update admin SET password = ? where name=? and password=?";
            pr=con.prepareStatement(query);
            pr.setString(1,npsw);
            pr.setString(2,name);
            pr.setString(3,opsw);
            ResultSet rs;
            rs=pr.executeQuery();
            if(rs.next())
            {
                return "data inserted successfully";
            }
            return "data not inserted";
    }
    
    
    public String changePassword1(String name,String opsw,String npsw) throws ClassNotFoundException, SQLException
    {
        Connection con=null;
        PreparedStatement pr=null;
            String myUrl="jdbc:mysql://localhost/carpoolingproj";
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(myUrl,"root","");
            
           
            String query="update student SET password = ? where name=? and password=?";
            pr=con.prepareStatement(query);
            pr.setString(1,npsw);
            pr.setString(2,name);
            pr.setString(3,opsw);
            ResultSet rs;
            rs=pr.executeQuery();
            if(rs.next())
            {
                return "data inserted successfully";
            }
            return "data not inserted";
    }
    
}
