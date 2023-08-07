/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.hello;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

/**
 *
 * @author DELL
 */
public class hello extends HttpServlet {
    public void init(){
        System.out.println("Init");
    }
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
        PrintWriter out = (PrintWriter) res.getWriter();
        out.println("Hello from the other side");
        
    }
    public void destroy(){
        System.out.println("Destroy");
    }
    
}
