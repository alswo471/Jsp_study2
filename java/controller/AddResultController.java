package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add_result")
public class AddResultController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		String text = req.getParameter("text");
		int num1 = Integer.valueOf(req.getParameter("num1"));
		int num2 = Integer.valueOf(req.getParameter("num2"));
		out.println("<div>text:" + text + "</div>");
		out.println("<div>" + num1 + "+" + num2 + " = " + (num1 + num2));

	}

}
