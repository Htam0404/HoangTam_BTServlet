package vn.iotstar.Controller;
import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.ServletException;

@WebServlet(urlPatterns= {"/login"})
public class LoginServlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
          throws ServletException, IOException {
	  resp.setContentType("text/html");
	  String user = req.getParameter("username");
	  String pass = req.getParameter("password");
	  if(user.equals("tam") && pass.equals("123"))
	  {
	  Cookie cookie = new Cookie("username", user); 
	  cookie.setMaxAge(15);
	  resp.addCookie(cookie);
	  resp.sendRedirect("/HelloServlet/hello");
	  }else {
	  resp.sendRedirect("/HelloServlet/login");
	  }}
}