package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.ItemGroup;
import configuration.DbConnection;
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao {
	
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	
	public JdbcItemGroupDao() {
		conn = DbConnection.getConnection();
	}
	
	
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "SELECT  ID "	+ ItemGroup.PROP_ID	  + ",\n"	  
				+ "         NAME "	+ ItemGroup.PROP_NAME + ",\n" 
				+ "      IG_DESC "  + ItemGroup.PROP_DESC + "\n"	
				+ "  FROM ITEM_GROUP";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt(ItemGroup.PROP_ID),
											 rs.getString(ItemGroup.PROP_NAME),
											 rs.getString(ItemGroup.PROP_DESC));
				result.add(ig);
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

}
