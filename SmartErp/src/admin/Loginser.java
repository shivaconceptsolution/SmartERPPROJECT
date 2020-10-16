package admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginser
 */
@WebServlet("/Loginser")
public class Loginser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("txtuser");
		String upass = request.getParameter("txtpass");
		if(user.equals("admin") && upass.equals("12345"))
		{
			response.sendRedirect("admin/dashboard.jsp");
		}
		else
		{
			response.sendRedirect("admin/index.jsp?q=invalid userid and password");
		}
		
	}

}
