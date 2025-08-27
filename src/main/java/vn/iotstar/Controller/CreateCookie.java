package vn.iotstar.Controller;

import java.io.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/createcookie")
public class CreateCookie extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	  String ten = request.getParameter("ten");
	  String holot = request.getParameter("holot");
	  Cookie firstName = new Cookie("ten",ten);
	  Cookie lastName = new Cookie("holot",holot);
	  firstName.setMaxAge(60 * 60 * 24);
	  lastName.setMaxAge(60 * 60 * 24);   
	  response.addCookie(firstName);
	  response.addCookie(lastName); 
	  PrintWriter out = response.getWriter();
	  out.println("<b>First Name</b>: " + firstName.getValue()  + " - <b>Last Name</b>: " + 
	 lastName.getValue());
  }
}