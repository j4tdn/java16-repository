package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Year;
import java.util.List;

import bean.Item;
import bean.ItemGroup;
import dto.ItemAmountDto;
import dto.ItemDto;
import dto.ItemOrderTimeDto;
import dto.ItemSellPriceDto;
import utils.DateUtils;

public class JdbcItemDao extends AbstractJdbcDao implements ItemDao{
	
	private static final String GET_ITEMS_ORDER_TIME = ""
			+ "SELECT it.ID 			" + ItemOrderTimeDto.PROP_ID +", \n"
			+ "		  it.`NAME`		" + ItemOrderTimeDto.PROP_NAME +", \n"
			+ "         od.ORDER_TIME " + ItemOrderTimeDto.PROP_ORDER_TIME + " \n"
			+ "FROM ITEM it \n"
			+ "JOIN ORDER_DETAIL odd \n"
			+ "  ON it.ID = odd.ITEM_ID \n"
			+ "JOIN `ORDER` od \n"
			+ "  ON od.ID = odd.ORDER_ID \n"
			+ "WHERE CAST(od.ORDER_TIME AS DATE) = ?";
	
	private static final String GET_TOP3_SELLER_ITEMS = ""
			+ "SELECT it.ID " + ItemAmountDto.PROP_ID +", \n"
			+ "		it.NAME " + ItemAmountDto.PROP_NAME +", \n"
			+ "        SUM(odd.AMOUNT) " + ItemAmountDto.PROP_AMOUNT +"\n"
			+ "   FROM `ORDER`od \n"
			+ "   JOIN ORDER_DETAIL odd \n"
			+ "	 ON od.ID = odd.ORDER_ID \n"
			+ "   JOIN ITEM it \n"
			+ "     ON odd.ITEM_ID = it.ID \n"
			+ "  WHERE YEAR(od.ORDER_TIME) = ? \n"
			+ "  GROUP BY it.ID"
			+ "  ORDER BY SUM(odd.AMOUNT) DESC \n"
			+ "  LIMIT 3";
	
	private static final String GET_ITEMS_MAX_PRICE_BY_ITEM_GROUP = ""
			+ "WITH MAX_SELL_PRICE_ITEMS AS ( \n"
			+ "SELECT ig.ID IG_ID, \n"
			+ "	  MAX(it.SELL_PRICE) MAX_PRICE \n"
			+ "  FROM ITEM_GROUP ig \n"
			+ "  JOIN ITEM it \n"
			+ "    ON ig.ID = it.ITEM_GROUP_ID \n"
			+ " GROUP BY ig.ID) \n"
			+ " \n"
			+ "SELECT it.ID " + ItemSellPriceDto.PROP_ID + ", \n"
			+ "	      it.NAME " + ItemSellPriceDto.PROP_NAME + ", \n"
			+ "       it.ITEM_GROUP_ID " + ItemSellPriceDto.PROP_ITEM_GROUP_ID + ", \n"
			+ "       it.SELL_PRICE " + ItemSellPriceDto.PROP_SELL_PRICE + " \n"
			+ "  FROM ITEM it, \n"
			+ "	      MAX_SELL_PRICE_ITEMS ms \n"
			+ " WHERE it.ITEM_GROUP_ID = ms.IG_ID \n"
			+ "   AND it.SELL_PRICE = ms.MAX_PRICE";
	
	@Override
	public List<ItemOrderTimeDto> getItemsOrderTime(LocalDate orderDate) {
		return getElements(GET_ITEMS_ORDER_TIME, 
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
	public List<String> getNamesOfTop3Items(Year year) {
		return getElements(GET_TOP3_SELLER_ITEMS,
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
	public List<ItemSellPriceDto> getItemsMaxPriceByIgId() {
		return getAll(GET_ITEMS_MAX_PRICE_BY_ITEM_GROUP, 
				() -> transformerItemSellPriceDto(rs));
	}
	
	private static ItemSellPriceDto transformerItemSellPriceDto(ResultSet rs) {
		ItemSellPriceDto is = null;
		try {
			is = new ItemSellPriceDto(
					rs.getInt(ItemSellPriceDto.PROP_ID),
					rs.getString(ItemSellPriceDto.PROP_NAME),
					rs.getInt(ItemSellPriceDto.PROP_ITEM_GROUP_ID),
					rs.getDouble(ItemSellPriceDto.PROP_SELL_PRICE)
					);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return is;
	}
	
	private static ItemOrderTimeDto transformerItemOrderTimeDto(ResultSet rs) {
		ItemOrderTimeDto it = null;
		try {
			it = new ItemOrderTimeDto(
					rs.getInt(ItemDto.PROP_ID), 
					rs.getString(ItemDto.PROP_NAME), 
					DateUtils.toLTime(rs.getTime(ItemOrderTimeDto.PROP_ORDER_TIME)));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return it;
	}
}
