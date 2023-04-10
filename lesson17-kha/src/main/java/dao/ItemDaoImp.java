package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import connection.DbManager;
import persistence.Item;
import persistence.ItemDTO;
import persistence.ItemGroup;
import persistence.ItemGroupDTO;
import persistence.Provider;
import utils.DateUntils;
import utils.SqlUtils;

public class ItemDaoImp implements ItemDao {

	private final Connection connect;
	private ResultSet rs;
	private PreparedStatement prest;

	public ItemDaoImp() {
		connect = DbManager.getConnection();
	}

	public List<ItemDTO> getAllItemWithTime(LocalDate orderDate) {
		List<ItemDTO> results = new ArrayList();
		String sql = "SELECT item.ID MaMH, item.`NAME` TenMH, DATE_FORMAT(`order`.ORDER_TIME, '%H:%i:%s') ThoiGianDatHang\n"
				+ "FROM item\n"
				+ "JOIN order_detail ON order_detail.ITEM_ID = item.ID\n"
				+ "JOIN `order` ON order_detail.ORDER_ID = `order`.ID\n"
				+ "WHERE `order`.ORDER_TIME = ?;";
		try {
			prest = connect.prepareStatement(sql);
			prest.setDate(1, DateUntils.toDate(orderDate));
			rs = prest.executeQuery();
			while (rs.next()) {
				ItemDTO item = new ItemDTO(rs.getInt(1), rs.getString(2), rs.getTime(3).toLocalTime());
				results.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, prest);
		}
		return results;
	}

	public List<ItemGroupDTO> getAllItemGroupDTO() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Item> getItems() {
		List<Item> results = new ArrayList();
		String sql = "WITH TB_WITH_HIGH_SELL_PRICE AS (\n"
				+ "	SELECT MAX(SELL_PRICE) SELL_PRICE ,ITEM_GROUP_ID\n"
				+ "    FROM item\n"
				+ "    GROUP BY ITEM_GROUP_ID\n"
				+ ")\n"
				+ "SELECT ITEM.ID, ITEM.`NAME`, ITEM.COLOR, ITEM.ITEM_GROUP_ID, ITEM.SELL_PRICE\n"
				+ "FROM ITEM, TB_WITH_HIGH_SELL_PRICE sss\n"
				+ "WHERE ITEM.ITEM_GROUP_ID = sss.ITEM_GROUP_ID\n"
				+ "  AND ITEM.SELL_PRICE = sss.SELL_PRICE;";
		try {
			prest = connect.prepareStatement(sql);
			rs = prest.executeQuery();
			while (rs.next()) {
				Item item = new Item(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getDouble(4), rs.getInt(5)); 
				results.add(item);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, prest);
		}
		return results;
	}

	

}
