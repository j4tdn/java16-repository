package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import configuration.DbConnection;
import utils.SqlUtils;

public class AbstractJdbcDao {

	final Connection conn;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;

	public AbstractJdbcDao() {
		conn = DbConnection.getConnection();
	}

	// void --> E
	<E> List<E> getAll(String sql, E transformer) {
		final List<E> result = new ArrayList<E>();
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				result.add(transformer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}
}
