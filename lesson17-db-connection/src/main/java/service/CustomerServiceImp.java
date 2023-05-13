package service;

import dao.CustomerDao;
import dao.JdbcCustomerDao;

public class CustomerServiceImp implements CustomerService {

	private CustomerDao customerDao;
	
	public CustomerServiceImpl() {
		this.customerDao = new JdbcCustomerDao();
		
	}
	
	@Override
	public void insert (Customer customer) {
		Object.requireNonNull (customer, "Customer cannot be null");
		customerDao.insert(customer);
		System.out.println("LOG >> insert cuss");
	}
}
