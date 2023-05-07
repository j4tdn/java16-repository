package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.Customer;
import configuration.DbConnection;
import utils.SqlUtils;

public class JdbcCustomerDao implements CustomerDao{
	
	private Connection conn;
	private PreparedStatement pst;
	
	public JdbcCustomerDao() {
		conn = DbConnection.getConnection();
	}
	
	private static final String SAVE_CUSTOMER = ""
			+ "INSERT INTO CUSTOMER(ID, `NAME`, PHONE, ADDRESS, ACCOUNT, PASSWORD)\n"
			+ "VALUES(?, ?, ?, ?, ?, ?);";
	
	public void insert(Customer customer) {
		try {
			pst = conn.prepareStatement(SAVE_CUSTOMER);
			pst.setInt(1, customer.getId());
			pst.setString(2, customer.getName());
			pst.setString(3, customer.getPhone());
			pst.setString(4, customer.getAddress());
			pst.setString(5, customer.getAccount());
			pst.setString(6, customer.getPassword());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
		
		
	}
}
