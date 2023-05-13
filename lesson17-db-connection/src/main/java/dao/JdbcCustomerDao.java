package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.Customer;
import configuration.DbConnection;
import utils.SqlUtils;

public class JdbcCustomerDao implements CustomerDao {
	
	private Connection conn;
	private PreparedStatement pst;
	
	
	public JdbcCustomerDao() {
		conn = DbConnection.getConnection();
	}

	private static final String SAVE_CUSTOMER = ""
			+"INSERT INTO CUSTTOMER(ID, `NAME`, PHONE, ADDRESS, `ACCOUNT`, `PASSWORD`)\n"
	        + "VALUES(?,?,?,?,?,?)" ;
	
	@Override
	public void insert(Customer customer) {
		try {
			pst = conn.prepareStatement(SAVE_CUSTOMER);
			pst.setInt(1, customer.getId());
			pst.setString(1, customer.getName());
			pst.setString(1, customer.getPhone());
			pst.setString(1, customer.getAddress());
			pst.setString(1, customer.getAccount());
			pst.setString(1, customer.getPassword());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
		
	}

}
