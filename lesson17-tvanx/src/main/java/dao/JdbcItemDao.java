package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dto.ItemDtoOrderTime;
import utils.SqlUtils;

public class JdbcItemDao extends AbstractJdbcDao implements ItemDao{

	private static final String GET_ITEM_BY_ORDER_TIME =""
			+ "SELECT 	i.ID "    + ItemDtoOrderTime.PROP_ID   + ", "
			+ "			i.`NAME`" + ItemDtoOrderTime.PROP_NAME + ", "
			+ "			o.ORDER_TIME " + ItemDtoOrderTime.PROP_ORDER_TIME + "\n"
			+ "	 FROM ORDER_DETAIL od \n"
			+ "	 	JOIN ITEM i \n"
			+ "			ON od.ITEM_ID = i.ID  \n"
			+ "	 	JOIN `ORDER` o \n"
			+ "			ON od.ORDER_ID = o.ID \n"
			+ "	 WHERE CAST(o.`ORDER_TIME` AS DATE) = ?;";
	
	private static ItemDtoOrderTime transformerItemDto(ResultSet rs) {
		ItemDtoOrderTime ido = null;
		String date = ItemDtoOrderTime.PROP_ORDER_TIME;
		try {
			ido = new ItemDtoOrderTime(
			rs.getInt(ItemDtoOrderTime.PROP_ID),
			rs.getString(ItemDtoOrderTime.PROP_NAME),
			rs.getString(date));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ido;
	}
	
	@Override
	public List<ItemDtoOrderTime> getAll(LocalDate timeOrder) {
		System.out.println("sql ==> " + GET_ITEM_BY_ORDER_TIME);
		return getAll(GET_ITEM_BY_ORDER_TIME, () ->transformerItemDto(rs));
	}
}
