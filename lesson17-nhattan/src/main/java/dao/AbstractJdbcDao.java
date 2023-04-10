package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import configuration.DbConnection;
import utils.SQLUtils;

public class AbstractJdbcDao {
	final Connection conn;
	PreparedStatement pst;
	Statement st;
	ResultSet rs;
	
	public AbstractJdbcDao() {
		conn = DbConnection.getConnection();
	}
	
	
	<E> List<E> getAll(String sql, Supplier<E> supplier) {
		return getElements(sql, supplier, (pst) -> {});
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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SQLUtils.close(pst);
		}
		return result;
	}
}
