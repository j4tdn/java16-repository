package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.ItemGroup;
import dto.ItemGroupDto;
import utils.SqlUtils;

public class JdbcItemGroupDao extends AbstractJdbcDao implements ItemGroupDao {
	
	
	private static final String GET_ALL_IG = "SELECT "
			                               + "ID " + ItemGroup.PROP_ID + ", \n"
			                               + "`NAME` "+ ItemGroup.PROP_NAME +" , \n"
			                               + "`DESC` " + ItemGroup.PROP_DESC + " \n"
			                               + "FROM ITEM_GROUP";	
	
	private static final String GET_IG_BY_ID = "SELECT "
            								  + "ID " + ItemGroup.PROP_ID + ", \n"
            								  + "`NAME` "+ ItemGroup.PROP_NAME +" , \n"
            								  + "`DESC` " + ItemGroup.PROP_DESC + " \n"
            								  + "FROM ITEM_GROUP \n"
            								  + "WHERE ID = ?";
	
	private static final String GET_IG_BY_NAME = "SELECT "
			                                   + "ID " + ItemGroup.PROP_ID + ", \n"
			                                   + "`NAME` "+ ItemGroup.PROP_NAME +" , \n"
			                                   + "`DESC` " + ItemGroup.PROP_DESC + " \n"
			                                   + "FROM ITEM_GROUP \n"
			                                   + "WHERE `NAME` = ?";
	
	private static final String UPDATE_IG = "UPDATE "
										  + "ITEM_GROUP \n"
			                              + " SET `NAME` = ? ,\n"
			                              + " `DESC` = ?	\n"
			                              + " WHERE ID = ?";
	
	private static final String SAVE_IG = "INSERT INTO ITEM_GROUP(ID, `NAME`, `DESC`) VALUES (?, ?, ?)";
	
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
	public List<ItemGroup> getAll() {
		return getAll(GET_ALL_IG, () -> SqlUtils.transformer(rs));
	}
	
	@Override
	public ItemGroup get(int id) {
		ItemGroup result = null;
		try {
			pst = conn.prepareStatement(GET_IG_BY_ID);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			
			if (rs.next()) {
				result = SqlUtils.transformer(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}
	
	@Override
	public ItemGroup get(String name) {
		ItemGroup result = null;
		try {
			pst = conn.prepareStatement(GET_IG_BY_NAME);
			pst.setString(1, name);
			rs = pst.executeQuery();
			
			if (rs.next()) {
				result = SqlUtils.transformer(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}
	
	@Override
	public void update(ItemGroup ig) {
		try {
			pst = conn.prepareStatement(UPDATE_IG);
			
			pst.setInt(1, ig.getId());
			pst.setString(2, ig.getName());
			pst.setString(3, ig.getDescription());
			
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}
	
	@Override
	public void save(ItemGroup ig) {
		try {
			pst = conn.prepareStatement(SAVE_IG);
			
			pst.setInt(1, ig.getId());
			pst.setString(2, ig.getName());
			pst.setString(3, ig.getDescription());
			
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}
	
	@Override
	public List<ItemGroupDto> countItemsByItemGroup() {
		List<ItemGroupDto> result = new ArrayList<ItemGroupDto>();
		try {
			pst = conn.prepareStatement(COUNT_ITEM_BY_ITEM_GROUP);
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemGroupDto igDto = new ItemGroupDto(rs.getInt(ItemGroupDto.PROP_IG_ID), 
						                              rs.getString(ItemGroupDto.PROP_IG_NAME), 
						                              rs.getLong(ItemGroupDto.PROP_TOTAL_OF_ITEMS), 
						                              rs.getString(ItemGroupDto.PROP_ITEM_DETAIL));
				result.add(igDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
}
