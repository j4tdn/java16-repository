package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import bean.ItemGroup;
import dto.ItemGroupDto;
import utils.SQLUtils;

public class JdbcItemGroupDao extends AbstractJdbcDao implements ItemGroupDao {
	
	private static final String GET_ALL = ""
			+ "SELECT ID " + ItemGroup.PROP_ID + ",\n"
			+ "      `NAME`" + ItemGroup.PROP_NAME + ",\n"
		    + "      `DESCRIPTION` " + ItemGroup.PROP_DESC + "\n"
			+ "FROM ITEM_GROUP" ;
	
	private static final String COUNT_ITEMS_BY_ITEM_GROUP = ""
			+ "SELECT ig.ID  " + ItemGroupDto.PROP_IG_ID + ",\n"
			+ "	   ig.`NAME` " + ItemGroupDto.PROP_IG_NAME + ", \n"
			+ "       SUM(id.AMOUNT) " + ItemGroupDto.PROP_TOTAL_OF_ITEMS + ", \n"
			+ "       GROUP_CONCAT(CONCAT(it.NAME, '-', id.SIZE_ID, '-', id.AMOUNT) SEPARATOR ', ') " + ItemGroupDto.PROP_ITEMS_DETAIL + " \n"
			+ "  FROM ITEM_GROUP ig \n"
			+ "  JOIN ITEM it \n"
			+ "	ON ig.ID = it.ITEM_GROUP_ID \n"
			+ "  JOIN ITEM_DETAIL id \n"
			+ "    ON it.ID = id.ITEM_ID \n"
			+ " GROUP BY ig.ID";
	
	@Override
	public List<ItemGroup> getAll() {
		return getAll(GET_ALL, () -> transfomer(rs));
	}
	
	@Override
	public ItemGroup get(int id) {
		String sql = "SELECT ID " + ItemGroup.PROP_ID + ",\n"
				+ "      `NAME`" + ItemGroup.PROP_NAME + ",\n"
			    + "      `DESCRIPTION` " + ItemGroup.PROP_DESC + "\n"
				+ "FROM ITEM_GROUP\n" 
			    + "WHERE ID = " + id;
		ItemGroup result = null;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				// transformer
				result = transfomer(rs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SQLUtils.close(rs, st);
		}
		return result;
	}
	
	@Override
	public ItemGroup get(String name) {
		String sql = "SELECT ID " + ItemGroup.PROP_ID + ",\n"
						  + "       `NAME`" + ItemGroup.PROP_NAME + ",\n"
						  + "       `DESCRIPTION` " + ItemGroup.PROP_DESC + "\n"
						  + "  FROM ITEM_GROUP\n" 
						  + "  WHERE`NAME` =  '" + name +"'";
		ItemGroup result = null;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				// transformer
				result = transfomer(rs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SQLUtils.close(rs, st);
		}
		return result;
	}
	
	@Override
	public void save(ItemGroup ig) {
		String sql = "INSERT INTO ITEM_GROUP(ID, `NAME`, `DESCRIPTION`)"
				+ "\nVALUES(?, ?, ?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, ig.getId());
			pst.setString(2, ig.getName());
			pst.setString(3, ig.getDecscription());
			
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SQLUtils.close(pst);
		}
	}
	
	@Override
	public void update(ItemGroup ig) {
		String sql = "UPDATE ITEM_GROUP\n"
				   + "   SET `NAME` = ? ,\n"
				   + "       `DESCRIPTION` = ? \n"
				   + " WHERE ID = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, ig.getName());
			pst.setString(2, ig.getDecscription());
			pst.setInt(3, ig.getId());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SQLUtils.close(pst);
		}
	}
	
	@Override
	public List<ItemGroupDto> countItemsByItemsGroup() {
		return getAll(COUNT_ITEMS_BY_ITEM_GROUP, () -> transfomerDto(rs));
	}
	
	
	public static ItemGroup transfomer(ResultSet rs) {
		ItemGroup ig = null;
		try {
			ig = new ItemGroup(
					rs.getInt(ItemGroup.PROP_ID), 
					rs.getString(ItemGroup.PROP_NAME),
					rs.getString(ItemGroup.PROP_DESC));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ig;
	}
	
	private static ItemGroupDto transfomerDto(ResultSet rs) {
		ItemGroupDto igDto = null;
		try {
			igDto = new ItemGroupDto(
					rs.getInt(ItemGroupDto.PROP_IG_ID), 
					rs.getString(ItemGroupDto.PROP_IG_NAME),
					rs.getInt(ItemGroupDto.PROP_TOTAL_OF_ITEMS),
					rs.getString(ItemGroupDto.PROP_ITEMS_DETAIL));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return igDto;
	}
}
