package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import bean.Item;
import bean.ItemGroup;
import bean.ItemGroupInsert;
import bean.ItemService;
import utils.SqlUtils;

public class ItemgGroupService {
	PreparedStatement prest;
	
	String DB_URL = "jdbc:mysql://localhost:3306/java16_shopping_test12";
	String USER_NAME = "root";
	String PASSWORD = "kylechuchoe26";
	
	public List<ItemGroup> getItembyItemGroup() {
		List<ItemGroup> items1 = new ArrayList<ItemGroup>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			// Tất cả chuyển qua dùng PrepareStatement nhé
			Statement stmt = conn.createStatement();
			// get data from table 'student'
			// dữ liệu lấy chưa đủ theo yêu cầu
			String query = "SELECT item_group.ID ID, item_group.`NAME` NAME, GROUP_CONCAT(item.NAME) ITEMS, SUM(item_detail.AMOUNT) AMOUNT\n"
					+ "FROM item \n"
					+ "JOIN item_group \n"
					+ "ON item_group.ID = item.ITEM_GROUP_ID\n"
					+ "JOIN item_detail \n"
					+ "ON item_detail.ITEM_ID = item.ID\n"
					+ "GROUP BY item_group.ID;";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				
				// get này mình truyền column name vào thay vì STT e nha
				// code convention
				Integer id = rs.getInt(1);
				String name = rs.getString(2);
				
				String list = rs.getString(3);
				Integer amout = rs.getInt(4);
				

				ItemGroup item = new ItemGroup(id, name,list,amout);
				
				items1.add(item);

			}
			// close connection
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return items1;
	}
	
	// sao lại trả về List<ItemService>
	// service là để xử lý logic mà Duy Anh
	public List<ItemService> getItemService() {
		List<ItemService> items1 = new ArrayList<ItemService>();
		try {
			// Tại sao không dùng DbConnection.getConnection() ???
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			Statement stmt = conn.createStatement();
			// get data from table 'student'
			// dữ liệu lấy về của ORDER_TIME là thời gian
			// cần phải CAST sang TIME
			String query = "select ITEM.ID, ITEM.`NAME`, `ORDER`.ORDER_TIME from `ORDER` \n"
					+ "JOIN ORDER_DETAIL ON ORDER_DETAIL.ORDER_ID = `ORDER`.ID\n"
					+ "JOIN ITEM ON ITEM.ID = ORDER_DETAIL.ITEM_ID\n"
					+ "where cast(ORDER_TIME as DATE) = str_to_date('2023/03/06', '%Y/%m/%d');";
			// ngày tháng năm phải là tham số truyền vào dạng
			// localdate
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				
				Integer id = rs.getInt(1);
				String name = rs.getString(2);
				LocalTime time = rs.getTime(3).toLocalTime();
				
				

				ItemService item = new ItemService(id, name, time);
				System.out.println(item);
				items1.add(item);

			}
			// close connection
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return items1;
	}
	
	public List<String> getItemServiceTop3(Integer year) {
		// code nhớ qua DA nghe :(
		List<String> items1 = new ArrayList<String>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			Statement stmt = conn.createStatement();
			// get data from table 'student'
			String query = "select  ITEM.NAME from ITEM\n"
					+ "JOIN ITEM_DETAIL ON ITEM_DETAIL.ITEM_ID = ITEM.ID\n"
					+ "JOIN ORDER_DETAIL ON ORDER_DETAIL.ITEM_ID = ITEM_DETAIL.ITEM_ID\n"
					+ "JOIN `ORDER` ON `ORDER`.ID = ORDER_DETAIL.ORDER_ID\n"
					+ "where YEAR(date(ORDER_TIME )) = " + year  + " \n"
					+ "ORDER BY ITEM_DETAIL.AMOUNT DESC\n"
					+ "LIMIT 3;";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				
				String s = rs.getString(1);
				
				items1.add(s);
				
				
	

			}
			// close connection
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return items1;
	}
	
	public List<Item> getItemServicemaxPrice() {
		List<Item> items1 = new ArrayList<Item>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			Statement stmt = conn.createStatement();
			// get data from table 'student'
			String query = "WITH TB_WITH_HIGH_SELL_PRICE AS (\n"
					+ "    SELECT MAX(SELL_PRICE) SELL_PRICE ,ITEM_GROUP_ID\n"
					+ "    FROM item\n"
					+ "    GROUP BY ITEM_GROUP_ID\n"
					+ ")\n"
					+ "SELECT ITEM.ID, ITEM.`NAME`, ITEM.COLOR, ITEM.ITEM_GROUP_ID, ITEM.SELL_PRICE\n"
					+ "FROM ITEM, TB_WITH_HIGH_SELL_PRICE sss\n"
					+ "WHERE ITEM.ITEM_GROUP_ID = sss.ITEM_GROUP_ID\n"
					+ "  AND ITEM.SELL_PRICE = sss.SELL_PRICE;";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				
				Integer id = rs.getInt(1);
				String name = rs.getString(2);
				String color = rs.getString(3);
				Integer itemgroup = rs.getInt(4);
				Integer sell_price = rs.getInt(5);
				
				
				

				Item item = new Item(id, name, color, itemgroup, sell_price);
				
				items1.add(item);

			}
			// close connection
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return items1;
	}
	public boolean add(List<ItemGroupInsert> listIG) {
        int result = 0;
        String sql = "INSERT INTO item_group(ID, NAME, `DESC`) VALUES (?, ?, ?)";

        try {
        	try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            for (ItemGroupInsert itemGroup : listIG) {
            	// Tìm hiểu batch update
                prest = conn.prepareStatement(sql);
                prest.setInt(1, itemGroup.getId());
                prest.setString(2, itemGroup.getName());
                prest.setString(3, itemGroup.getDecs());

                result += prest.executeUpdate();
            }
            conn.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return result > 0 ? true : false;
    }

}

