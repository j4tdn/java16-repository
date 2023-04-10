package dao;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.List;

import dto.ItemDto;

public class JdbcItemDao extends AbstractJdbcDao implements ItemDao {
	private static final String GET_ITEMS_BY_ORDER_TIME = ""
			+ "SELECT i.ID, i.`NAME`, o.ORDER_TIME \n"
			+ "	FROM ORDER_DETAIL od \n"
			+ "	INNER JOIN ITEM i \n"
			+ "		ON od.ITEM_ID = i.ID  \n"
			+ "	INNER JOIN `ORDER` o \n"
			+ "		ON od.ORDER_ID = o.ID \n"
			+ "	WHERE CAST(o.`ORDER_TIME` AS DATE) = ?";
			
	private static ItemDto transformer(ResultSet rs){
		ItemDto it =null;
		try {
			it = new ItemDto(
					rs.getInt(ItemDto.PROP_ID), 
					rs.getString(ItemDto.PROP_NAME),
					rs.getDate(ItemDto.PROP_ORDER_DETAIL)
			);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return it;
	}

	public List<ItemDto> getItemByAnyDate(LocalDate date) {
		return getAll(GET_ITEMS_BY_ORDER_TIME, transformer(rs));
	}




}
