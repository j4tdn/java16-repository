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
	
	/**
	 * Help method for get elements
	 * @param <E> generic type
	 * @param sql given sql
	 * @param supplier transformer for each row, from rs -> object
	 * @param consumer consumer to pass sql parameter
	 * @return list of elements
	 */
	<E> List<E> getElements(String sql, Supplier<E> supplier, Consumer<PreparedStatement> consumer) {
		List<E> result = new ArrayList<>();
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
