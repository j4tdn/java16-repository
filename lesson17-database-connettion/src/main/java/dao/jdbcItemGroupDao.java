package dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.ItemGroup;
import dto.ItemGroupDto;
import utils.SqlUtils;

public class jdbcItemGroupDao extends AbstractJdbcDao implements ItemGroupDao {

	private static final String GET_ALL = ""
			+ "SELECT ID "   + ItemGroup.PROP_ID + ",\n"
			+ "    `NAME`"   + ItemGroup.PROP_NAME + ",\n"
			+ "    `DESC`"   + ItemGroup.PROP_DESC + "\n"
			+ "  FROM ITEM_GROUP";
	
	@Override
	public List<ItemGroup> getAll() {
		return getAll(GET_ALL, () -> transformer(rs));
	}
	
	@Override
	public ItemGroup get(int id) {
		String sql = "SELECT ID "      + ItemGroup.PROP_ID + ",\n"
				   + "       `NAME`"   + ItemGroup.PROP_NAME + ",\n"
				   + "       `DESC`"   + ItemGroup.PROP_DESC + "\n"
				   + "  FROM ITEM_GROUP\n"
				   + " WHERE ID = " + id;
		ItemGroup result = null;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				result = transformer(rs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
	@Override
	public ItemGroup get(String name) {
		String sql = "SELECT ID "      + ItemGroup.PROP_ID + ",\n"
				   + "       `NAME`"   + ItemGroup.PROP_NAME + ",\n"
				   + "       `DESC`"   + ItemGroup.PROP_DESC + "\n"
				   + "  FROM ITEM_GROUP\n"
				   + " WHERE `NAME` = ?";
		ItemGroup result = null;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();
			if(rs.next()) {
				result = transformer(rs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
	@Override
	public void save(ItemGroup ig) {
		String sql = "INSERT INTO ITEM_GROUP(ID, NAME, `DESC`)\n"
				   + "VALUES(?, ?, ?)";
		try {
			pst = conn.prepareStatement(sql);
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
	public void update(ItemGroup ig) {
		String sql = "UPDATE ITEM_GROUP \n"
				   + "   SET NAME  = ?,   \n"
				   + "      `DESC` = ?  \n"
				   + " WHERE ID    = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, ig.getName());
			pst.setString(2, ig.getDescription());
			pst.setInt(3, ig.getId());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
		
	}
	
	public static ItemGroup transformer(ResultSet rs) {
		ItemGroup ig = null;
		try {
			ig = new ItemGroup(
					rs.getInt(ItemGroup.PROP_ID),
					rs.getString(ItemGroup.PROP_NAME),
					rs.getString(ItemGroup.PROP_DESC));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ig;
	}
	
	private static final String COUNT_ITEM_BY_ITEM_GROUP = ""
			+ "SELECT ig.ID " + ItemGroupDto.PROP_IG_ID + ", \n"
			+ "ig.`NAME` " + ItemGroupDto.PROP_IG_NAME + " , \n"
			+ "SUM(id.AMOUNT) totalOfItems " +ItemGroupDto.PROP_TOTAL_OF_ITEMS + ", \n"
			+ "GROUP_CONCAT(CONCAT(it.`NAME`, '-', id.SIZE_ID, '-', id.AMOUNT) SEPARATOR ', ') ITEMDETAILS \n"
			+ "FROM item_group ig  \n"
			+ "JOIN item it  \n"
			+ "on ig.ID =it.ITEM_GROUP_ID \n"
			+ "JOIN item_detail ID \n"
			+ "on it.ID = id.ITEM_ID \n"
			+ "GROUP BY ig.ID";
			

	@Override
	public List<ItemGroupDto> CountItemByItemGroup() {
		List<ItemGroupDto> result = new ArrayList<>();
		try {
			pst = conn.prepareStatement(COUNT_ITEM_BY_ITEM_GROUP);
			rs= pst.executeQuery();
			while(rs.next()) {
				ItemGroupDto igDto = new ItemGroupDto(
						rs.getInt(ItemGroupDto.PROP_IG_ID),
						rs.getString(ItemGroupDto.PROP_IG_NAME),
						rs.getLong(ItemGroupDto.PROP_TOTAL_OF_ITEMS),
						rs.getString(ItemGroupDto.PROP_ITEM_DETAILS)
						);
				result.add(igDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs, pst);
		}

		return  result;
	}



}
