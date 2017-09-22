package com.codebind;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GradeCalculatorServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		String grade = req.getParameter("grade number");
		String gradeLetter = GradeCalculator.calculateGrade(grade);
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		out.println("<html><head><title>");
		out.println("Grade Calculator");
		out.println("</title></head><body>");
		out.println("<h1>Enter a grade number to know grade letter</h1>");
		out.println(" <form action=\"\" method=\"POST\">\r\n");
		out.println(" Your grade number:<br/>\r\n");
		if (grade != null) {
			out.println(" <input type=\"text\" name=\"grade number\" size =\"10\" value=\""
					+ grade + "\"/><br/>\r\n");
			out.println(" <input type=\"submit\" value=\"Calculate\"/>\r\n");
			out.println(" </form>\r\n");
			
			out.println("<p>Your grade letter: " + gradeLetter +"</p>");
		} else {
			out.println(" <input type=\"text\" name=\"grade number\" size =\"10\" value=\"\"/><br/>\r\n");
			out.println(" <input type=\"submit\" value=\"Calculate\"/>\r\n");
			out.println(" </form>\r\n");
			
			out.println("<p>Your grade letter: </p>");
		}
		
		out.println("</body></html>");
		
		out.close();
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException{
		doGet(req, res);
	}
}
