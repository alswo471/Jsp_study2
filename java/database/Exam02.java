package database;

import java.sql.*;

public class Exam02 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/madang";
		String user = "madang";
		String password = "als@1655119";
		
		try(Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement()) {

				String sql = "SELECT * FROM Book";
				ResultSet rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int bookid = rs.getInt("bookid");
					String bookname = rs.getString("bookname");
					String publisher = rs.getString("publisher");
					int price = rs.getInt("price");
					
					System.out.println(bookid + "," + bookname + "," + publisher + "," + price);
				}
				
				rs.close();
				
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
