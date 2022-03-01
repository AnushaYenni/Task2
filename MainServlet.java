package email.com;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession(false);
		response.setContentType("text/html");
		if((session.getAttribute("email")!= null) && (session.getAttribute("pass")!=null)) {
		pw.println("Welcome Anu " );
		pw.println("<br/><a href=\"logout\">Logout</a>");
		}
		else {
			
		response.sendRedirect("index.html");
		
		}
		}
}

 
   