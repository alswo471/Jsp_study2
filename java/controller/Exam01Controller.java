package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Exam01Controller extends HttpServlet{
	@Override
	public void init(ServletConfig config) throws ServletException {
		String test1 = config.getInitParameter("test1");
		System.out.println("test1 : " + test1);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("hello", "안녕하세요");
		req.setAttribute("msg", "반갑습니다.");
		
		ServletContext application = req.getServletContext();
		application.setAttribute("hello", "(수정)안녕하세요");
		
		RequestDispatcher rd = req.getRequestDispatcher("day04/exam01.jsp");
		rd.forward(req, resp);
	}

	
}
