package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import bean.Item;
import bean.ItemGroup;
import dto.ItemDto;
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
	
			
	
	private static final String GET_ITEMS_BY_IG_ID = ""
			+ GET_ALL_ITEMS + "\n"
			+ "  WHERE ig.id = ?";
	
	private static final String STATISTIC_ITEMS_PER_ITEM_GROUP =""
			+"WITH ITEM_AMOUNT_CTE AS(\n" + 
			"SELECT it.ID,\n" + 
			"it.`NAME`,\n" + 
			"it.ITEM_GROUP_ID,\n" + 
			"SUM(itd.AMMOUNT) AMOUNT \n" + 
			"FROM ITEM it\n" + 
			"JOIN item_detail itd\n" + 
			"ON it.ID = itd.ITEM_ID\n" + 
			"GROUP BY it.ID\n" + 
			"),\n" + 
			"\n" + 
			"\n" + 
			"-- TÌM SỐ LƯỢNG LỚN NHẤT TRONG TỪNG LOẠI HÀNG\n" + 
			"ITEM_GROUP_MAX_ACCOUNT_CTE AS (\n" + 
			"SELECT iacte.ITEM_GROUP_ID,\n" + 
			"MAX(iacte.AMOUNT)\n" + 
			"FROM ITEM_AMOUNT_CTE iacte\n" + 
			"GROUP BY iacte.ITEM_GROUP_ID\n" + 
			")\n" + 
			"\n" + 
			"SELECT ITA_CTE.ID   \n" +  ItemDto.PROP_ID +
			"FROM ITEM_AMOUNT_CTE ita_cte\n" + 
			"JOIN ITEM_GROUP_MAX_ACCOUNT_CTE igm_cte\n" + 
			"ON ita_cte.ITEM_GROUP_ID = igm_cte.ITEM_GROUP_ID\n" + 
			"AND ita_cte.AMOUNT = igm_cte.MAX_AMOUNT;";
	
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
	public List<ItemDto> statisticItemsPerItemGroup() {
		return getElements(STATISTIC_ITEMS_PER_ITEM_GROUP, 
				() -> transformerItemDto(rs),
				pst -> {});
	}
	
	private static ItemDto transformerItemDto(ResultSet rs) {
		ItemDto itemDto = null;
		try {
			itemDto = new ItemDto(
					rs.getInt(ItemDto.PROP_ID),
					rs.getString(ItemDto.PROP_NAME),
					rs.getInt(ItemDto.PROP_AMOUNT));
		} catch (SQLException e) {
		}
		return itemDto;
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