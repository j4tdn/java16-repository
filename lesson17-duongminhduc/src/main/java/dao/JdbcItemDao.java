package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.ItemDTO;
import bean.ItemDTOByItemGroup;
import bean.ItemGroup;
import configuration.DbConnection;



public class JdbcItemDao implements ItemDao {
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;

	public JdbcItemDao() {
		connection = DbConnection.getConnection();
	}

	@Override
	public List<ItemDTO> getItemsbyDate(LocalDate deliveryOrder) {
		List<ItemDTO> result = new ArrayList<>();
		String sql = ""
				+ "select it.ID, it.NAME, TIME(od.ORDER_TIME) ORDER_TIME from ORDER od \r\n"
				+ "join ITEM it\r\n"
				+ "where Date(od.ORDER_TIME) = ?";
		try {
			pst= connection.prepareStatement(sql);
			pst.setDate(1, Date.valueOf(deliveryOrder));
			rs = pst.executeQuery();
			while(rs.next()) {
				ItemDTO item = new ItemDTO(rs.getInt("ID"), 
						rs.getString("NAME"),
						rs.getTime("ORDER_TIME").toLocalTime());
				result.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public List<ItemDTO> getTop3Items(Integer year) {
		// Em có thể trả về List<String> ở đây luôn chứ k cần List<ItemDto>
		// Chỗ SELECT mình SELECT i.NAME thôi
		// List<String>
		List<ItemDTO> result = new ArrayList<ItemDTO>();
		String sql = "SELECT i.ID, i.NAME, SUM(od.AMOUNT) AS SoLuong "
				+ "FROM ORDER_DETAIL od"
				+ "JOIN `ORDER` o ON od.ORDER_ID=o.ID AND YEAR(o.ORDER_TIME) = ?"
				+ "JOIN ITEM i ON od.ITEM_ID = i.ID"
				+ "GROUP BY i.ID, i.NAME"
				+ "ORDER BY SoLuong DESC"
				+ "limit 3;";
		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(1, year);
			rs = pst.executeQuery();
			while(rs.next()) {
				// Xem comment chỗ đầu dòng của getTop3Items của a
				// Rồi chỗ ni lấy result.add(rs.getString("NAME"));
				ItemDTO item = new ItemDTO(rs.getInt("ID"), rs.getString("NAME"), rs.getInt("SoLuong"));
				result.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
	@Override
	public List<ItemDTOByItemGroup> getItemsByIG() {
		List<ItemDTOByItemGroup> result = new ArrayList<ItemDTOByItemGroup>();
		// Đề yêu cầu là liệt kê mặt hàng có giá bán cao nhất trong 'từng' loại hàng
		// Câu Query của em a chưa chạy nhưng a thấy chưa đúng
		// Em đang làm là
		// B1: Liệt kê giá bán cao nhất của từng loại hàng --> OK
		// B2: Liệt kê mặt hàng có giá nằm trong giá bán cao nhất ở B1 --> SAI
		
		// VD: Loại Hàng A --> Mặt Hàng A1(300), A2(200)
		// VD: Loại Hàng B --> Mặt Hàng B1(200), B2(100)
		// --> B1 của em sẽ có thằng B1(200) --> và B2 sẽ có thằng A2 --> SAI
		String sql = "select i.* from ITEM i\r\n"
				+ "where i.SELL_PRICE in (\r\n"
				+ "		SELECT MAX(i.SELLPRICE) AS HDN\r\n"
				+ "		FROM ITEM i\r\n"
				+ "		GROUP BY i.ITEM_GROUP_ID\r\n"
				+ "		ORDER BY HDN DESC);";
		try {
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				ItemDTOByItemGroup item = new ItemDTOByItemGroup(
						rs.getInt("ID"),
						rs.getString("NAME"),
						rs.getString("COLOR"),
						new ItemGroup(rs.getInt("ITEM_GROUP_ID"), null), rs.getInt("SELL_PRICE"));
				result.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}