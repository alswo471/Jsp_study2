package database;

import java.sql.*;

public class Exam05 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/madang?user=root&password=als@1655119";
		String sql = "INSERT INTO book_log(bookname_l,publisher_l, price_l)" +
					 "VALUES(?,?,?);";
		try(Connection conn = DriverManager.getConnection(url); 
				PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"bookid_l"})){
			pstmt.setString(1, "책1");
			pstmt.setString(2, "출판사1");
			pstmt.setInt(3, 30000);
			
			int affectedRows = pstmt.executeUpdate();
			System.out.println("affectedRows : " + affectedRows);
			
			ResultSet rs = pstmt.getGeneratedKeys();
			if(rs.next()) {
				int bookid = rs.getInt(1);
				System.out.println("추가된 bookid : " + bookid);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
