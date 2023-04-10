package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.SqlResult;
import com.mysql.cj.xdevapi.SqlStatement;

import bean.ItemGroup;
import configuration.DbConnection;
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao{

	private Connection conn;
	private Statement st ;
	private PreparedStatement pst;
	private ResultSet rs;
	public JdbcItemGroupDao() {
		conn = DbConnection.getConnection();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		String sql = "SELECT ID "   		+  ",\n"
					+ "		`NAME`"	 		+  ",\n"
					+ "		`DESC`"			+  "\n"
					+ " FROM  ITEM_GROUP";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()){
				// transfomer
				result.add(transformer(rs));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs , st);
		}
		return result;	
	}
	
	
	@Override
	public ItemGroup get(int id) {
		String sql = "SELECT ID "   		+  ",\n"
					+ "		`NAME`"	 		+  ",\n"
					+ "		`DESC`"			+  "\n"
					+ " FROM ITEM_GROUP \n"
					+ "WHERE ID = " + id;
		ItemGroup result = null;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()){
				// transfomer
				result = transformer(rs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs , st);
		}
		return result;
	}
	
	@Override
	public ItemGroup get(String name) {
		String sql = "SELECT ID "   		+  ",\n"
					+ "		`NAME`"	 		+  ",\n"
					+ "		`DESC`"			+  "\n"
					+ " FROM  ITEM_GROUP \n"
					+ "WHERE `NAME` = " + name;
		ItemGroup result = null;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()){
				// transfomer
				result = transformer(rs);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs , st);
		}
		return result;
	}
	
	@Override
	public void save(ItemGroup ig) {
		String sql =  "INSERT INTO ITEM_GROUP(ID, NAME , `DESC`)\n"
					+ "VALUES(?, ?, ?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, ig.getId());
			pst.setString(2, ig.getName());
			pst.setString(3, ig.getDesc());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}
	
	@Override
	public void update(ItemGroup ig) {
		String sql = "UPDATE ITEM_GROUP  \n"
				   + "	 SET NAME  = ?,	 \n"
				   + " 	  	`DESC` = ? 	 \n"
				   + " WHERE ID	   = ?";
	try {
		pst = conn.prepareStatement(sql);
		pst.setInt(1, ig.getId());
		pst.setString(2, ig.getName());
		pst.setString(3, ig.getDesc());
		pst.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		SqlUtils.close(pst);
	}
		
}
	
	public static ItemGroup transformer(ResultSet rs) throws SQLException {
		ItemGroup ig = null;
		try {
				ig =  new ItemGroup(
					rs.getInt(ItemGroup.PROP_ID),
					rs.getString(ItemGroup.PROP_NAME),
					rs.getString(ItemGroup.PROP_DESC));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ig;
	}
}
