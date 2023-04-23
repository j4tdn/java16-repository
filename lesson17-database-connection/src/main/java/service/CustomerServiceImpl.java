package service;

import bean.Customer;
import dao.CustomerDao;
import dao.JdbcCustomerDao;

public class CustomerServiceImpl implements CustomerService{
	private CustomerDao customerDao;
	
	public CustomerServiceImpl() {
		this.customerDao = new JdbcCustomerDao();
	}
	
	@Override
	public void insert(Customer customer) {
		
		
	}
}
