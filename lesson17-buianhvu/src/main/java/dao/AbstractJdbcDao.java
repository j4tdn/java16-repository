package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

import configuration.DbConnection;
import utils.SqlUtils;

public class AbstractJdbcDao {

	final Connection conn;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;

	public AbstractJdbcDao() {
		conn = DbConnection.getConnection();
	}
	
	<E> List<E> getAll(String sql, Supplier<E> supplier) {
		return getElements(sql, supplier, pst -> {});
	}
	
	
	<E> List<E> getElements(String sql, Supplier<E> supplier, Consumer<PreparedStatement> consumer) {
		final List<E> result = new ArrayList<>();
		try {
			pst = conn.prepareStatement(sql);
			consumer.accept(pst);
			rs = pst.executeQuery();
			while(rs.next()) {
				result.add(supplier.get());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}
	
	void setInt(int parameterIndex, int x) {
		Objects.requireNonNull(pst, "pst cannot be null");
		try {
			pst.setInt(parameterIndex, x);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}