package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloConterller extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.setContentType("text/html; charset=UTF-8");
//		PrintWriter out = resp.getWriter();
		
//		out.print("<!DOCTYPE html>");
//		out.println("<html>");
//		out.println("<head><title>연습!</title></head>");
//		out.println("<body>");
//		out.println("<h1>안녕하세요!</h1>");
//		out.println("</body>");
//		out.println("</html>");
		
		RequestDispatcher rd = req.getRequestDispatcher("hello2.jsp");
		rd.forward(req, resp);
	}
}
