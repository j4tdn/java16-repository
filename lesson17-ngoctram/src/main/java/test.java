import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class test {
	private static Connection conn = null;

	public static Connection getConnection() {
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String URL = "jdbc:mysql://localhost:3306/java16_shopping_test";
		String USER = "root";
		String PASS = "Ngoctram123";
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
	
	private static void ex01() {
		
		try {
			LocalDate sellDate = LocalDate.of(2019, 11, 23);
			String sql = "SELECT * FROM sales WHERE ThoiGianBan = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setDate(1, java.sql.Date.valueOf(sellDate));
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("MaMH");
				String itemName = rs.getString("TenMH");
				LocalTime timeBooking = rs.getTime("ThoiGianDatHang").toLocalTime();
				System.out.printf(id + "\t" + itemName + "\t" + timeBooking + "\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void ex02() {
		try {
			String sql = "SELECT ig.*, group_concat(it.`name`, '-', id.size_id, '-', id.amount order by it.`name`, id.amount separator ', '  ) DanhSachMatHang"
					+ "	sum(id.amount) SoLuong"
					+ "FROM item_group ig"
					+ "join ITEM it"
					+ "on ig.id=it.item_group_id"
					+ "join `item_detail` id"
					+ "on id.item_id = it.id"
					+ "GROUP BY ig.ID;";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int igId = rs.getInt("ID"); 
				String igName = rs.getString("NAME");
				String listItem = rs.getString("DanhSachMatHang");
				int amount = rs.getInt("SoLuong");
				System.out.printf(igId + "\t" + igName + "\t" + listItem + "\t" + amount +"\n");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	// get listItems
	private static List<String> ex03() {
		List<String> listItems = new ArrayList<String>();
		try {
			String sql = "SELECT i.ID, i.NAME, SUM(od.AMOUNT) AS SoLuong "
					+ "FROM ORDER_DETAIL od"
					+ "JOIN `ORDER` o ON od.ORDER_ID=o.ID AND YEAR(o.ORDER_TIME) = 2020"
					+ "JOIN ITEM i ON od.ITEM_ID = i.ID"
					+ "GROUP BY i.ID, i.NAME"
					+ "ORDER BY SoLuong DESC"
					+ "limit 3;";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int iId = rs.getInt("ID"); 
				String iName = rs.getString("NAME");
				int amount = rs.getInt("SoLuong");
				System.out.printf(iId + "\t" + iName + "\t" + amount+"\n");
				listItems.add(iName);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return listItems;
	}
	
	private static void ex04() {
		try {
			String sql = "select i.* from ITEM i\r\n"
					+ "where i.SELLPRICE in (\r\n"
					+ "		SELECT MAX(i.SELLPRICE) AS HangDatNhat\r\n"
					+ "		FROM ITEM i\r\n"
					+ "		GROUP BY i.ITEM_GROUP_ID\r\n"
					+ "		ORDER BY HangDatNhat DESC);";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("ID"); 
				String name = rs.getString("NAME");
				String color = rs.getString("COLOR");
				int buyPrice = rs.getInt("BUYPRICE");
				int sellPrice = rs.getInt("SELLPRICE");
				String material = rs.getString("MATERIAL");
				System.out.printf(id + "\t" + name + "\t" + color + "\t" + buyPrice + "\t"
						+ sellPrice +"\t" + material + "\n");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void ex05() {
		File file = new File("./data.txt");
		String sql = "INSERT INTO ITEM_GROUP (ID, `NAME`, `DESC`) VALUES (?, ?, ?)";
        
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			List<String> lines = Files.readAllLines(file.toPath());
			for (String line : lines) {
				String[] igInfo = line.split(",");
				int id = Integer.parseInt(igInfo[0].trim());
				String name = igInfo[1].trim();
				String desc = igInfo[2].trim();
				statement.setInt(1, id);
	            statement.setString(2, name);
	            statement.setString(3, desc);
	            statement.executeUpdate();
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		conn = getConnection();
//		ex01();
//		ex02();
//		ex03();
//		ex04();
//		ex05();
	}
}
