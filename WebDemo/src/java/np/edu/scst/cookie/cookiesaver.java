/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.cookie;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 *
 * @author DELL
 */
public class cookiesaver extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String role = req.getParameter("role");
        Cookie cookie = new Cookie("username",name);
        Cookie roleCookie = new Cookie("role",role);
        resp.addCookie(cookie);
        resp.addCookie(roleCookie);
        
        PrintWriter out = resp.getWriter();
        out.println("Cookie successfully saved");
        out.println("<a href='readsavedcookie'>Read cookie</a>");
    }
    

}
