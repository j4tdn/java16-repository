package dao;

import java.util.ArrayList;
import java.util.List;

import dto.ItemGroupDto;

public class JdbcItemGroupDao extends AbstractJdbcDao implements ItemGroupDao {

	
	private static final String COUNT_ITEMS_BY_ITEM_GROUP = ""
			+ "SELECT ig.ID  " + ItemGroupDto.PROP_IG_ID + ",\n"
			+ "	   	  ig.`NAME` " + ItemGroupDto.PROP_IG_NAME + ", \n"
			+ "       SUM(id.AMOUNT) " + ItemGroupDto.PROP_TOTAL_OF_ITEMS + ", \n"
			+ "       GROUP_CONCAT(CONCAT(it.NAME, '-', id.SIZE_ID, '-', id.AMOUNT) SEPARATOR ', ') " + ItemGroupDto.PROP_ITEMS_DETAIL + " \n"
			+ "  FROM ITEM_GROUP ig \n"
			+ "  JOIN ITEM it \n"
			+ "	 ON ig.ID = it.ITEM_GROUP_ID \n"
			+ "  JOIN ITEM_DETAIL id \n"
			+ "  ON it.ID = id.ITEM_ID \n"
			+ "  GROUP BY ig.ID";


	@Override
	public List<ItemGroupDto> countItemsByItemsGroup() {
		List<ItemGroupDto> result = new ArrayList<>();
		try {
			pst = conn.prepareStatement(COUNT_ITEMS_BY_ITEM_GROUP);
			rs = pst.executeQuery();
			while(rs.next()) {
				ItemGroupDto igDto = new ItemGroupDto(
							rs.getInt(ItemGroupDto.PROP_IG_ID),
							rs.getString(ItemGroupDto.PROP_IG_NAME),
							rs.getLong(ItemGroupDto.PROP_TOTAL_OF_ITEMS),
							rs.getString(ItemGroupDto.PROP_ITEMS_DETAIL)
						);
				result.add(igDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
