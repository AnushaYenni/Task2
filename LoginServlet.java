package email.com;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");	
		PrintWriter pw = response.getWriter();
		String e= request.getParameter("email");
		String l = request.getParameter("pass");
		HttpSession session = request.getSession();
		if(e.equals("anu@gmail.com") && l.equals("Anu")) {
		session.setAttribute("email", e);
		session.setAttribute("pass", l);
		response.sendRedirect("MainServlet");
		}
		else {
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
		dispatcher.include(request, response);
		response.sendRedirect("index.html");
		
		}}}
