package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import bean.Item;
import bean.ItemGroup;
import utils.DateUtils;

public class JdbcItemDao extends AbstractJdbcDao implements ItemDao{
	
	private static final String PROP_ITEM_GROUP_ID = String.join("_", 
			Item.PROP_ITEM, ItemGroup.PROP_ITEM_GROUP, ItemGroup.PROP_ID);
	
	private static final String PROP_ITEM_GROUP_NAME = String.join("_", 
			Item.PROP_ITEM, ItemGroup.PROP_ITEM_GROUP, ItemGroup.PROP_NAME);
	
	private static final String PROP_ITEM_GROUP_DESC = String.join("_", 
			Item.PROP_ITEM, ItemGroup.PROP_ITEM_GROUP, ItemGroup.PROP_DESC);
	
	private static final String GET_ALL_ITEMS = ""
			+ "SELECT it.ID         " + Item.PROP_ID         + ", \n"
			+ "       it.`NAME`     " + Item.PROP_NAME       + ", \n"
			+ "       it.COLOR      " + Item.PROP_COLOR      + ", \n"
			+ "       it.BUY_PRICE  " + Item.PROP_BUY_PRICE  + ", \n"
			+ "       it.SELL_PRICE " + Item.PROP_SELL_PRICE + ", \n"
			+ "       it.METERIAL   " + Item.PROP_METERIAL   + ", \n"
			+ "       ig.ID         " + PROP_ITEM_GROUP_ID   + ", \n"
			+ "       ig.`NAME`     " + PROP_ITEM_GROUP_NAME + ", \n"
			+ "       ig.`DESC`     " + PROP_ITEM_GROUP_DESC + "  \n"
			+ "  FROM ITEM it \n"
			+ "  JOIN ITEM_GROUP ig \n"
			+ "    ON it.ITEM_GROUP_ID = ig.ID";
	
	private static final String LIST_ITEM_BY_SOLD_DATE = ""
			+ "SELECT MaMH, TenMH, ThoiGianDatHang FROM MATHANG WHERE DATE(ThoiGianDatHang) = ?";
	
			
	
	private static final String GET_ITEMS_BY_IG_ID = ""
			+ GET_ALL_ITEMS + "\n"
			+ "  WHERE ig.id = ?";
	
	
	
	private static final String GET_ITEMS_BY_ORDER_TIME = ""
			+ "SELECT it.ID         " + Item.PROP_ID         + ", \n"
			+ "       it.`NAME`     " + Item.PROP_NAME       + ", \n"
			+ "       it.COLOR      " + Item.PROP_COLOR      + ", \n"
			+ "       it.BUY_PRICE  " + Item.PROP_BUY_PRICE  + ", \n"
			+ "       it.SELL_PRICE " + Item.PROP_SELL_PRICE + ", \n"
			+ "       it.METERIAL   " + Item.PROP_METERIAL   + " \n"

			
			+ "  FROM ITEM it \n"
			+ "  JOIN order_detail odd \n"
			+ "  ON it.ID = odd.ITEM_ID \n"
			+ "  JOIN ORDER od \n"
			+ "  on od.ID=odd.ORDER_ID \n"
			+ "  WHERE CAST(od.ORDER_TIME AS DATE) = ? ";
	
	
	@Override
	public List<Item> getAll() {
		return getAll(GET_ALL_ITEMS, () -> transformer(rs));
	}
	
	@Override
	public List<Item> getItems() {
		return getElements(
				GET_ALL_ITEMS, 
				() -> transformer(rs),
				pst -> {});
	}
	
	@Override
	public List<Item> getItems(LocalDate sellDate) {
		return getElements(
				GET_ITEMS_BY_ORDER_TIME, 
				() -> transformer(rs),
				pst -> {
					try {
						pst.setDate(1, DateUtils.toDate(sellDate));
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				});
	}
	
	
	
	@Override
	public List<Item> listItemsSoldOnDate(LocalDate date) {
	    String query = "SELECT * FROM Item i INNER JOIN OrderDetail od ON i.id = od.item_id INNER JOIN `Order` o ON od.order_id = o.id WHERE o.order_date = ?";

	    List<Item> items = new ArrayList<>();

	    try (Connection connection = getConnection();
	         PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	        preparedStatement.setDate(1, Date.valueOf(date));

	        try (ResultSet resultSet = preparedStatement.executeQuery()) {
	            while (resultSet.next()) {
	                int itemId = resultSet.getInt("id");
	                String itemName = resultSet.getString("name");
	                int itemPrice = resultSet.getInt("price");
	                LocalTime orderTime = resultSet.getTime("order_time").toLocalTime();

	                Item item = new Item(itemId, itemName, itemPrice, orderTime);
	                items.add(item);
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return items;
	}

	

	private static ItemGroup transformerItemGroup(ResultSet rs) {
		ItemGroup ig = null;
		try {
			ig = new ItemGroup(
					rs.getInt(PROP_ITEM_GROUP_ID),
					rs.getString(PROP_ITEM_GROUP_NAME),
					rs.getString(PROP_ITEM_GROUP_DESC));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ig;
	}
	
	private static Item transformer(ResultSet rs) {
		Item item = null;
		try {
			ItemGroup ig = new ItemGroup(
					rs.getInt(PROP_ITEM_GROUP_ID),
					rs.getString(PROP_ITEM_GROUP_NAME),
					rs.getString(PROP_ITEM_GROUP_DESC));
			item = new Item(
					rs.getInt(Item.PROP_ID),
					rs.getString(Item.PROP_NAME),
					rs.getString(Item.PROP_COLOR),
					rs.getDouble(Item.PROP_BUY_PRICE),
					rs.getDouble(Item.PROP_SELL_PRICE),
					rs.getString(Item.PROP_METERIAL),
					ig);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return item;
	}
}