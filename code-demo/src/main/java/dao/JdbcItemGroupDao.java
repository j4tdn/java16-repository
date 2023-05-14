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

public class JdbcItemGroupDao implements ItemGroupDao{
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	
	public JdbcItemGroupDao(){
		conn = DbConnection.getConnection();
	}
public List<ItemGroup> getAll() {
	List<ItemGroup> result = new ArrayList<ItemGroup>();
		String sql = "SELECT *\n"
				+ " FROM ITEM_GROUP";
	try {
		st =	conn.createStatement();
		st.executeQuery(sql);
		while(rs.next()) {
			ItemGroup ig = new ItemGroup(rs.getInt("ID"),
					rs.getString("NAME"),
					rs.getString("DESC"));
			result.add(ig);
			
		}
	} catch (SQLException e) {		
		e.printStackTrace();
	}finally {
		SqlUtils.close(rs, st);
	}
		return result;
	}	
	

}
