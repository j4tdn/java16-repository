package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import bean.ItemGroup;
import utils.SqlUtils;

public class JdbcItemGroupDao extends AbstractJdbcDao implements ItemGroupDao {
	
	private static final String GET_ALL = ""
				+ "SELECT  	ID "		+ ItemGroup.PROP_ID	 	+ ",\n"	  
				+ "         NAME "		+ ItemGroup.PROP_NAME	+ ",\n" 
				+ "      	IG_DESC " 	+ ItemGroup.PROP_DESC	+ "\n"	
				+ "  FROM ITEM_GROUP";
	
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
	public void save(ItemGroup ig) {
		String sql  = "INSERT INTO ITEM_GROUP(ID, NAME, IG_DESC)\n"
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
		String sql  = "UPDATE ITEM_GROUP	 \n"
					+ "		SET NAME 	= ?, \n"
					+ "		IG_DESC 	= ?	 \n"
					+ "	  WHERE ID	 	= ?";
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
			ig = new ItemGroup(rs.getInt(ItemGroup.PROP_ID),
							   rs.getString(ItemGroup.PROP_NAME),
							   rs.getString(ItemGroup.PROP_DESC));
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ig;
	}

}
