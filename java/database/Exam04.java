package database;

import java.sql.*;

public class Exam04 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/madang?user=root&password=als@1655119";
		String sql = "CALL InsertBook(?,?,?,?)";
		
		try(Connection conn = DriverManager.getConnection(url);
				CallableStatement cstmt = conn.prepareCall(sql)) {
				cstmt.setInt(1, 27);
				cstmt.setString(2, "책27");
				cstmt.setString(3, "출판사27");
				cstmt.setInt(4, 30000);
				
				int affectedRows = cstmt.executeUpdate();
				System.out.println(affectedRows);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
