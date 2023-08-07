/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionDemo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String name = req.getParameter("name");

        // Get the HttpSession object from the request
        HttpSession session = req.getSession();

        // Set the "username" attribute in the session
        session.setAttribute("name", name);
//        session.removeAttribute("name");

        // Redirect to the page that displays the personalized greeting
        resp.sendRedirect("sessionform.html");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        // Get the value of a session attribute named "username"
        String name = (String) session.getAttribute("name");
        
        resp.setContentType("text/html");
        // Use the retrieved attribute value as needed
        if (name != null && !name.isEmpty()) {
            resp.getWriter().println("Hello, " + name + "!");
        } else {
            resp.getWriter().println("Welcome, Guest!");
        }
    }

   

}
