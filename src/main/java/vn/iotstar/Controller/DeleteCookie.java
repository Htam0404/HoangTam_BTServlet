package vn.iotstar.Controller;


import java.io.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/deletecookie")
public class DeleteCookie extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;charset=UTF-8");

    Cookie cookie = null;
    Cookie[] cookies = null;
    // Get an array of Cookies associated with this domain
    cookies = request.getCookies(); 
    // Set response content type
    response.setContentType("text/html"); 
    PrintWriter out = response.getWriter();        
    if (cookies != null) {
        out.println("<h2> Cookies Name and Value</h2>");
        for (int i = 0; i < cookies.length; i++) {
            cookie = cookies[i];
            if ((cookie.getName()).compareTo("ten") == 0) {
                // delete cookie
                cookie.setMaxAge(0);
                response.addCookie(cookie);
out.print("Deleted cookie : " + cookie.getName() + "<br/>");
            }
            out.print("Name : " + cookie.getName() + ",  ");
            out.print("Value: " + cookie.getValue() + " <br/>");
        }
    }
    out.close();
  }
}
