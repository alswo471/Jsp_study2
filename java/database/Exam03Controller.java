package database;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.ArrayList;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/db_exam")
public class Exam03Controller extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<BookDto> list = getBooks();
		System.out.println(list);
		req.setAttribute("list", list);
		RequestDispatcher rd = req.getRequestDispatcher("day05/exam03.jsp");
		rd.forward(req, resp);
	}

	private List<BookDto> getBooks() {
		List<BookDto> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/madang";
		Properties props = new Properties();
		props.setProperty("user", "root");
		props.setProperty("password", "als@1655119");
		
		String sql = "SELECT * FROM Book WHERE price >= ? AND price <= ?";
		
		try(Connection conn = DriverManager.getConnection(url, props);
			PreparedStatement pstmt = conn.prepareStatement(sql)) {
				int lowprice = 10000;
				int highprice = 30000;
				pstmt.setInt(1,lowprice);
				pstmt.setInt(2,highprice);
				
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()) {
					BookDto book = new BookDto(rs.getInt("bookid"),
												rs.getString("bookname"),
												rs.getString("publisher"),
												rs.getInt("price")
							);
					list.add(book);
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
