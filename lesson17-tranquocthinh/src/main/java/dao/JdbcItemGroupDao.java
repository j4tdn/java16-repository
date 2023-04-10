package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.ItemGroup;
import dto.ItemGroupDto;
import utils.SqlUtils;

public class JdbcItemGroupDao extends AbstractJdbcDao implements ItemGroupDao {
	
	
	
	private static final String COUNT_ITEM_BY_ITEM_GROUP = ""
			+ "SELECT ig.ID " + ItemGroupDto.PROP_IG_ID + " , \n"
			+ "       ig.`NAME` " + ItemGroupDto.PROP_IG_NAME + " ,\n"
			+ "	   GROUP_CONCAT(CONCAT(it.`NAME`, '-', id.SIZE_ID, '-', id.AMOUNT, it.`NAME`, id.AMOUNT) SEPARATOR ', ') iTEM_SIZE_DETAIL, \n"
			+ "       SUM(id.AMOUNT) TOTAL_AMOUNT " + ItemGroupDto.PROP_TOTAL_OF_ITEMS + " ,\n"
			+ "	FROM ITEM_GROUP ig \n"
			+ "    JOIN ITEM it \n"
			+ "	  ON ig.ID = it.ITEM_GROUP_ID \n"
			+ "	JOIN ITEM_DETAIL id\r\n"
			+ "	  ON it.ID = id.ITEM_GROUP_ID \n"
			+ "GROUP BY ig.ID;";

	@Override
	public List<ItemGroupDto> countItemsByItemGroup() {
		List<ItemGroupDto> result = new ArrayList<ItemGroupDto>();
		try {
			pst = conn.prepareStatement(COUNT_ITEM_BY_ITEM_GROUP);
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemGroupDto igDto = new ItemGroupDto(rs.getInt(ItemGroupDto.PROP_IG_ID), 
						                              rs.getString(ItemGroupDto.PROP_IG_NAME), 
						                              rs.getString(ItemGroupDto.PROP_ITEM_DETAIL),
													  rs.getInt(ItemGroupDto.PROP_IG_ID));
				result.add(igDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	@Override
	public  void save(ItemGroup itemGroup) {
		String sql = "INSERT INTO ITEM_GROUP(ID, `NAME`, `DESC`)\n"
				   + "VALUES(?, ?, ?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, itemGroup.getId());
			pst.setString(2, itemGroup.getName());
			pst.setString(3, itemGroup.getDescription());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}
	
	
}
