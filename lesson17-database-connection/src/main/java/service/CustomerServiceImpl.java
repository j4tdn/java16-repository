package service;

import java.util.Objects;

import bean.Customer;
import dao.CustomerDao;
import dao.JDBCCustomerDao;

public class CustomerServiceImpl implements CustomerService{
	
	private CustomerDao customerDao;
	
	public CustomerServiceImpl()
	{
		this.customerDao = new JDBCCustomerDao();
	}
	@Override
	public void insert(Customer customer) {

		Objects.requireNonNull(customer, "Customer cannot be null");
		customerDao.insert(customer);
		System.out.println("LOG >> insert customer " + customer.getId() + " success !");
	}

}
