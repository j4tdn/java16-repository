package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.ItemGroup;
import utils.SqlUtils;

public class JdbcItemGroupDao extends AbstractJdbcDao implements ItemGroupDao {
	
	private static final String GET_ALL = ""
				+ "SELECT  	ID "		+ ItemGroup.PROP_ID	 	+ ",\n"	  
				+ "         NAME "		+ ItemGroup.PROP_NAME	+ ",\n" 
				+ "      	IG_DESC " 	+ ItemGroup.PROP_DESC	+ "\n"	
				+ "  FROM ITEM_GROUP";
	
	private static final String GET_ITEMS_IN_A_YEAR = ""
			+ "SELECT ig.id, ig.`NAME`, SUM(odd.AMOUNT) AS so_luong\n"
			+ "	from ITEM_GROUP ig\n"
			+ " JOIN ITEM it\n"
			+ "   ON ig.id = it.ITEM_GROUP_ID\n"
			+ "	JOIN ORDER_DETAIL odd\n"
			+ "	  ON odd.ITEM_ID = it.ID\n"
			+ "	JOIN `ORDER` od\n"
			+ "   ON od.ID = odd.ORDER_ID\n"
			+ "	WHERE YEAR(od.ORDER_TIME) = '?'\n"
			+ "      GROUP BY ig.id;";
	
	@Override
	public List<ItemGroup> getItemsInAYear(String year) {
		List<ItemGroup> result = new ArrayList<>();
		
		try {
			pst = conn.prepareStatement(GET_ITEMS_IN_A_YEAR);
			pst.setString(1, year);
			rs = pst.executeQuery();
			while(rs.next()) {
				try {
					ItemGroup ig = new ItemGroup(rs.getInt(ItemGroup.PROP_ID),
									   rs.getString(ItemGroup.PROP_NAME),
									   rs.getInt("so_luong"));
					result.add(ig);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
		}
	
	public List<ItemGroup> getAll() {
		return getAll(GET_ALL, () -> transformer(rs));
	}
	
	@Override
	public ItemGroup get(int id) {
		ItemGroup result = null;
		String sql = "SELECT  ID "	+ ItemGroup.PROP_ID	  + ",\n"	  
				+ "         NAME "	+ ItemGroup.PROP_NAME + ",\n" 
				+ "      IG_DESC "  + ItemGroup.PROP_DESC + "\n"	
				+ "  FROM ITEM_GROUP\n"
				+ "WHERE ID = " + id;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if (rs.next()) {
				result = transformer(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs);
			SqlUtils.close(st);
		}
		return result;
	}
	
	@Override
	public ItemGroup get(String name) {
		ItemGroup result = null;
		String sql = "SELECT  ID "	+ ItemGroup.PROP_ID	  + ",\n"	  
				+ "         NAME "	+ ItemGroup.PROP_NAME + ",\n" 
				+ "      IG_DESC "  + ItemGroup.PROP_DESC + "\n"	
				+ "  FROM ITEM_GROUP\n"
				+ "WHERE NAME = ? ";
		try {
			
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();
			if (rs.next()) {
				result = transformer(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs);
			SqlUtils.close(st);
		}
		return result;
	}
	
	@Override
	public List<ItemGroup> getAllItems() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static ItemGroup transformer(ResultSet rs) {
		ItemGroup ig = null;
		try {
			ig = new ItemGroup(rs.getInt(ItemGroup.PROP_ID),
							   rs.getString(ItemGroup.PROP_NAME),
							   rs.getString(ItemGroup.PROP_DESC));
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ig;
	}

}
