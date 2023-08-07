/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.io.*;
import javax.servlet.http.*;
import java.sql.*;


public class StudentCrud extends HttpServlet {
    
    Connection getConn() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";
        return DriverManager.getConnection(url, user, password);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  {
         try{
             
            Connection conn = getConn();
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM student";
            ResultSet rs = st.executeQuery(sql);
            
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
             
            out.println("<table> <tr> <th>id</th> <th>name</th> </tr>");
            
            while(rs.next()){
                out.println("<tr>");
                String id = Integer.toString(rs.getInt("id")) ;
                String name = rs.getString("name");
                System.out.println(name);
                out.println("<td>"+id+"</td>");
                out.println("<td>"+name+"</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            
        }catch(Exception e){
            System.out.println(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        try{
            String id = req.getParameter("id");
            String name = req.getParameter("name");
            String type = req.getParameter("type");
            System.out.println(id + name + type);
            switch(type){
                case "add":{
                    this.addStudent(id, name);
                    break;
                }
                case "edit":{
                    this.editStudent(id, name);
                    break;
                }
                case "delete":{
                    this.deleteStudent(id);
                    break;
                }
            }
            System.out.println("done3");
            resp.sendRedirect("studentform.html");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    void addStudent(String id , String name) throws Exception{
        System.out.println("done1");
        Connection conn = getConn();
        Statement st = conn.createStatement();
        String sql = "INSERT INTO student (id, name) VALUES ('"+id+"', '"+name+"')";
        System.out.println("done2");
        st.execute(sql);  
    }
    
    void editStudent(String id , String name) throws Exception{
        Connection conn = getConn();
        Statement st = conn.createStatement();
        String sql = "UPDATE student set name = '"+name+"' where id ="+id+";";
        st.execute(sql);  
    }
     void deleteStudent(String id) throws Exception{
        Connection conn = getConn();
        Statement st = conn.createStatement();
        String sql = "delete from student where id = "+id+";";
        st.execute(sql);  
    }
    
}
