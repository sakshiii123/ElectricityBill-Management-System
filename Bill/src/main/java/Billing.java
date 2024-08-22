

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Billling
 */
@WebServlet("/Billing")
public class Billing extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		int billnumber=Integer.parseInt(request.getParameter("billnumber"));
		int units=Integer.parseInt(request.getParameter("units"));
		PrintWriter pw=response.getWriter();
		int bill=0;
		if(units<99) 
			bill=units*10;
		else if(units>99 && units<200) 
			bill=units*20;
		else if(units>199 && units < 300)
			bill=units*30;
		else if(units >300)
			bill=units*40;
		else 
			bill=0;
request.setAttribute("billnumber",billnumber);
request.setAttribute("units",units);
request.setAttribute("bill",bill);


			request.getRequestDispatcher("result.jsp").forward(request, response);
	}

}
