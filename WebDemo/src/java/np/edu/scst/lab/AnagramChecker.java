/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.lab;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class AnagramChecker extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String str2 = req.getParameter("str1");
        String str1 = req.getParameter("str2");
        boolean isAnagram = this.checkAnagram(str1, str2);
        
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        if(isAnagram){
            out.println(str1 + " and  " + str2 + " is Anagram");
        }else{
            out.println(str1 + " and " + str2 + " is not Anagram");
        }
    }
    
    boolean checkAnagram(String str1, String str2){
        boolean isAnagram = false;
        
        if(str1.length()==str2.length()){
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            
            isAnagram = Arrays.equals(arr1, arr2);
        }
        return isAnagram;
    }
    
   
}
