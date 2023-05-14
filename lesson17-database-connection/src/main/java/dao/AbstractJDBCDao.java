package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import bean.Item;
import configuration.DbConnection;
import utils.SqlUtils;

public class AbstractJDBCDao {
	Connection conn;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	
	public AbstractJDBCDao() {
		conn = DbConnection.getConnection();
	}
	<E> List<E> getAll(String sql, Supplier<E> supplier){
		final List<E> result = new ArrayList<>();
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				result.add(supplier.get());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst, rs);
		}
		return result;
	}

}
