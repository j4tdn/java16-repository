package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import service.ItemService;
import service.ItemServiceImpl;
import utils.PrintUtils;

public class ItemPage {
	
	private static Connection conn = null;
	
	public static Connection getConnection() {
		// Phần connection này mình đã code bên package configuration rồi em :/
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String URL = "jdbc:mysql://localhost:3306/java16_shopping_test";
		String USER = "root";
		String PASS = "Ashinone";
		if (conn == null) {
			try {
				Class.forName(DRIVER);
				conn = DriverManager.getConnection(URL, USER, PASS);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void ex01() {
		
		try {
			LocalDate sellDate = LocalDate.of(2019, 11, 23);
			String sql = "SELECT * FROM sales WHERE ThoiGianBan = ?";
			PreparedStatement pstmt;
			pstmt = conn.prepareStatement(sql);
			pstmt.setDate(1, java.sql.Date.valueOf(sellDate));
			ResultSet rs = pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		ex01();
		
		/* 
		  Sorry Chiến - Nhưng a thấy Chiến chưa làm được câu 1 nữa :(
		  Câu truy vấn cũng đang viết bị sai chưa đúng yêu cầu đề bài
		  Kết luận: Failed in JDBC
		*/
	}
}
