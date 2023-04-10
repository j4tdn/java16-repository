package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.Item;
import bean.ItemGroup;
import utils.DateUtils;
import utils.SqlUtils;

public class JdbcItemDao extends AbstractJdbcDao implements ItemDao {

	private static final String PROP_ITEM_GROUP_ID = String.join("_", Item.PROP_ITEM, 
																	  ItemGroup.PROP_ITEM_GROUP,
			                                                          ItemGroup.PROP_ID);

	private static final String PROP_ITEM_GROUP_NAME = String.join("_", Item.PROP_ITEM, 
																		ItemGroup.PROP_ITEM_GROUP,
																		ItemGroup.PROP_NAME);

	private static final String PROP_ITEM_GROUP_DESC = String.join("_", Item.PROP_ITEM, 
																		ItemGroup.PROP_ITEM_GROUP,
																		ItemGroup.PROP_DESC);

	private static final String GET_ITEMS_BY_ORDER_TIME = ""
			+ "SELECT it.ID         "  + Item.PROP_ID         + ", \n"
			+ "       it.`NAME`     "  + Item.PROP_NAME       + ", \n"
			+ "       od.ORDER_TIME "
			+ "	FROM ITEM it \n"
			+ "    JOIN ORDER_DETAIL odd \n"
			+ "     ON it.ID = odd.ITEM_ID \n"
			+ "    JOIN `ORDER` od \n"
			+ "     ON od.ID = odd.ORDER_ID \n"
			+ "	WHERE CAST(od.ORDER_TIME AS DATE) = ?";
	
	private static String Q_GETS_THREE_ITEMS_BEST_SEELING_OF_THE_YEAR = 
			"SELECT 	it.NAME \n"
			+ "  FROM item it \n"
			+ "    JOIN item_detail itt \n"
			+ "	ON itt.ID = it.ID \n"
			+ "JOIN item_group ig \n"
			+ "	ON ig.ID = it.ID \n"
			+ "JOIN order_detail odd \n"
			+ "	ON odd.ID = it.ID \n"
			+ "JOIN order od \n"
			+ "	ON od.ID = odd.ID \n"
			+ " WHERE YEAR(od.ORDER_TIME) = ? \n"
			+ " ORDER BY itt.AMOUNT DESC\n"
			+ "LIMIT 3;";
	

	public List<Item> getItems(LocalDate sellDate) {
		return getElements(GET_ITEMS_BY_ORDER_TIME, 
				  () -> transformerItem(rs, null), 
				  pst -> {
					  try {
						pst.setDate(1, DateUtils.toSDate(sellDate));
					} catch (SQLException e) {
						e.printStackTrace();
					}
				  });
	}

	public static ItemGroup transformerItemGroup(ResultSet rs) {
		ItemGroup ig = null;
		try {
			ig = new ItemGroup(rs.getInt(PROP_ITEM_GROUP_ID), rs.getString(PROP_ITEM_GROUP_NAME),
					rs.getString(PROP_ITEM_GROUP_DESC));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ig;
	}

	public static Item transformerItem(ResultSet rs, ItemGroup ig) {
		Item item = null;

		try {
			item = new Item(rs.getInt(Item.PROP_ID), rs.getString(Item.PROP_NAME), rs.getString(Item.PROP_COLOR),
					rs.getDouble(Item.PROP_BUY_PRICE), rs.getDouble(Item.PROP_SELL_PRICE),
					rs.getString(Item.PROP_MERTERIAL), ig);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return item;
	}
	
	@Override
	public List<String> getThreeItemBestSellingOfTheYear(int year) {
		List<String> result = new ArrayList<String>();
		try {
			pst = conn.prepareStatement(Q_GETS_THREE_ITEMS_BEST_SEELING_OF_THE_YEAR);
			pst.setInt(1, year);
			rs = pst.executeQuery();
			while(rs.next()) {
				result.add(rs.getString("TenMH"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs,pst);
		}
		
		
		return result;
	}

}
