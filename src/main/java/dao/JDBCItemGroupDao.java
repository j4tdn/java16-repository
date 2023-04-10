package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.ItemGroup;
import configuration.DbConnection;
import utils.SqlUtils;

public class JDBCItemGroupDao extends AbstractJDBCDao implements ItemGroupDao {
	
	final String sql = "SELECT ID " + ItemGroup.PROP_ID +",\n" 
			+ " `NAME` " + ItemGroup.PROP_NAME +",\n" 
			+ " `DESC` " + ItemGroup.PROP_DESC +"\n" 

			
			+ "FROM ITEM_GROUP";
	
	@Override
	public List<ItemGroup> getAll() {
		
		return getAll(sql, () -> transformer(rs));
	}
	public static ItemGroup transformer(ResultSet rs) {
		ItemGroup ig = null;
		try {
			ig = new ItemGroup(
					rs.getInt(ItemGroup.PROP_ID), 
					rs.getString(ItemGroup.PROP_NAME), 
					rs.getString(ItemGroup.PROP_DESC));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ig;
	}
	@Override
	public ItemGroup get(int id) {
		
		String sql = "SELECT ID " + ItemGroup.PROP_ID +",\n" 
				+ " `NAME` " + ItemGroup.PROP_NAME +",\n" 
				+ " `DESC` " + ItemGroup.PROP_DESC +"\n" 
				+ "FROM ITEM_GROUP"
				+ " WHERE ID = " + id;
		ItemGroup result = null;
	try {
		st = conn.createStatement();
		rs = st.executeQuery(sql);
		if(rs.next()) {
			result = transformer(rs);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		SqlUtils.close(st,rs);
	}
	
	return result;
	}
	@Override
	public void save(ItemGroup ig) {
		String sql = "INSERT INTO ITEM_GROUP(ID, NAME, `DESC`)\n"
					+ "VALUES(?, ?, ?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1,ig.getId());
			pst.setString(2, ig.getName());
			pst.setString(3, ig.getDescription());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close();
		}
	}
	@Override
	public void update(ItemGroup ig) {
		String sql = "UPDATE ITEM_GROUP\n" 
					+ " SET `NAME` =  ?, \n"
					+ " 	`DESC` = ? \n"
					+ " WHERE ID = ? ";
						
	try {
		pst = conn.prepareStatement(sql);
		
		pst.setString(1, ig.getName());
		pst.setString(2, ig.getDescription());
		pst.setInt(3,ig.getId());
		pst.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		SqlUtils.close();
	}
		
	}
	@Override
	public ItemGroup get(String name) {
		
		String sql = "SELECT ID " + ItemGroup.PROP_ID +",\n" 
				+ " `NAME` " + ItemGroup.PROP_NAME +",\n" 
				+ " `DESC` " + ItemGroup.PROP_DESC +"\n" 
				+ "FROM ITEM_GROUP"
				+ " WHERE `NAME` = '" + name + "'";
		ItemGroup result = null;
	try {
		st = conn.createStatement();
		rs = st.executeQuery(sql);
		if(rs.next()) {
			result = transformer(rs);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		SqlUtils.close(st,rs);
	}
	
	return result;
	}

}
