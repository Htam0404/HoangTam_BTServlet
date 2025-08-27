package vn.iotstar.Controller;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(urlPatterns= {"/hello","/xin-chao"})
public class HelloServlet extends HttpServlet {
	@Override
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws 
	ServletException, IOException {
	  resp.setContentType("text/html");
	  PrintWriter printWriter = resp.getWriter();
	  String name="";
	  Cookie[] cookie = req.getCookies();
	  for (Cookie c: cookie) {
	  if(c.getName().equals("username")) {
	  name = c.getValue();}}
	  if(name.equals("")){
	

	  resp.sendRedirect("/HelloServlet/login");
	  }
	  printWriter.println("Xin chao " + name);
	  }
}