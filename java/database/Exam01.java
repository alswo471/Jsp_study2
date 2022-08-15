package database;

import java.sql.*;

import javax.servlet.jsp.tagext.TryCatchFinally;

public class Exam01 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection conn = null;
		Statement stmt = null;
		try {
			String url = "jdbc:mysql://localhost:3306/madang?user=madang&password=als@1655119";
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();

			int bookid = 24;
			String bookname = "책24";
			String publisher = "출판사24";
			int price = 30000;

			String sql = "INSERT INTO Book VALUES(" + bookid + ",'" + bookname + "','" + publisher + "'," + price
					+ ")";
			int affectedRows = stmt.executeUpdate(sql);
			System.out.println(affectedRows);

			System.out.println(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
