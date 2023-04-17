package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Year;
import java.util.List;

import bean.Item;
import bean.ItemGroup;
import dto.ItemOrderTimeDto;
import dto.ItemSellPriceDto;
import dto.ItemSoldDto;
import utils.DateUtils;

public class JdbcItemDao extends AbstractJdbcDao implements ItemDao {
	private static final String GET_ITEM_BY_ORDER_TIME =""
			+ "SELECT it.ID         , \n"
			+ "       it.`NAME`     ,\n"
			+ "       od.ORDER_TIME \n" // Em nên dùng cast(od.ORDER_TIME TIME) sẽ đúng hơn
			+ "  FROM ITEM it \n"
			+ "  JOIN ORDER_DETAIL odd \n"
			+ "    ON it.ID = odd.ITEM_ID\n"
			+ "  JOIN `ORDER` od \n"
			+ "    ON od.ID = odd.ORDER_ID\n"
			+ "  WHERE CAST(od.ORDER_TIME AS DATE) = ?";
	
	
	 private static final String GET_BESTSELLING_ITEMS = ""
				+ "SELECT it.ID " + ItemSoldDto.PROP_ID +", \n" // Không cần SELECT column này e nha
				+ "		it.NAME " + ItemSoldDto.PROP_NAME +", \n"
				+ "      SUM(odd.AMOUNT) " + ItemSoldDto.PROP_AMOUNT_SOLD +"\n" // Không cần SELECT
				+ "   FROM `ORDER`od \n"
				+ "   JOIN ORDER_DETAIL odd \n"
				+ "	 ON od.ID = odd.ORDER_ID \n"
				+ "   JOIN ITEM it \n"
				+ "     ON odd.ITEM_ID = it.ID \n"
				+ "  WHERE YEAR(od.ORDER_TIME) = ? \n"
				+ "  GROUP BY it.ID"
				+ "  ORDER BY SUM(odd.AMOUNT) DESC \n"
				+ "  LIMIT 3";
	 
	 private static final String GET_HIGHESTPRICE_IGROUP = ""
	 		+ "WITH MAX_SELL_PRICE_IN_ITEM_GROUP AS (\n"
	 		+ "	SELECT ITEM_GROUP_ID,\n"
	 		+ "	MAX(SELL_PRICE) MAX_SELL_PRICE\n"
	 		+ "	FROM ITEM\n"
	 		+ "    GROUP BY ITEM_GROUP_ID\n"
	 		+ ")\n"
	 		+ "SELECT it.ID " + ItemSellPriceDto.PROP_ID +", \n"
			+ "		it.NAME " + ItemSellPriceDto.PROP_NAME +", \n"
			+ "		it.COLOR " + ItemSellPriceDto.PROP_COLOR +", \n"
			+ "		it.ITEM_GROUP_ID " + ItemSellPriceDto.PROP_GROUP_ID +", \n"
			+ "		MAX_SELL_PRICE " + ItemSellPriceDto.PROP_SELL_PRICE +", \n"
	 		+ "FROM ITEM it,\n"
	 		+ "	 MAX_SELL_PRICE_IN_ITEM_GROUP ITGM\n"
	 		+ "  WHERE IT.ITEM_GROUP_ID = ITGM.ITEM_GROUP_ID\n"
	 		+ "	 AND IT.SELL_PRICE = ITGM.MAX_SELL_PRICE";
		
	 @Override
		public List<ItemOrderTimeDto> getItems(LocalDate orderDate) {
			return getElements(GET_ITEM_BY_ORDER_TIME, 
					() -> transformerItemOrderTimeDto(rs), 
					pst -> {
						try {
							pst.setDate(1, DateUtils.toSDate(orderDate));
						} catch (SQLException e) {
							e.printStackTrace();
						}
					});
		}

	@Override
	public List<String> getBestSellingItems(Year year) {
		return getElements(GET_BESTSELLING_ITEMS,
				// Nhìn ri code nó hơi dài, e tạo 1 cái transformer tương tự
				// nhưng chỉ cho string thôi
				() -> {
					try {
						return rs.getString(Item.PROP_NAME);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					return null;
				}, 
				pst -> {
					try {
						pst.setString(1, year.toString());
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}) ;
	}

	@Override
	public List<Item> getHighestPriceItemsByItemGroup() {
		return getAll(GET_HIGHESTPRICE_IGROUP, 
				() -> transformerItemSellPriceDto(rs));
	}
	
	private static ItemOrderTimeDto transformerItemOrderTimeDto(ResultSet rs) {
		ItemOrderTimeDto item = null;
		try {
			item = new ItemOrderTimeDto(
					rs.getInt(ItemOrderTimeDto.PROP_ID), 
					rs.getString(ItemOrderTimeDto.PROP_NAME), 
					// phía trên a có comment chỗ CASE(ORDER_TIME AS TIME)
					// thì chỗ này khỏi cần ép kiểu nha
					// ANW --> OK
					DateUtils.toLTime(rs.getTime(ItemOrderTimeDto.PROP_ORDER_TIME)));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return item;
	}
	
	private static ItemSellPriceDto transformerItemSellPriceDto(ResultSet rs) {
		ItemSellPriceDto item = null;
		try {
			item = new ItemSellPriceDto(
					rs.getInt(ItemSellPriceDto.PROP_ID), 
					rs.getString(ItemSellPriceDto.PROP_NAME), 
					rs.getString(ItemSellPriceDto.PROP_COLOR),
					rs.getInt(ItemSellPriceDto.PROP_GROUP_ID), 
					rs.getDouble(ItemSellPriceDto.PROP_SELL_PRICE));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return item;
	}
	
	private static Item transformerItem(ResultSet rs,ItemGroup ig) {
		Item item = null;
		try {
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
