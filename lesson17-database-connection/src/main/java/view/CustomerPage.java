package view;

import bean.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

public class CustomerPage {
	
	private static CustomerService customerService;
	
	static {
		customerService = new CustomerServiceImpl();
	}
	
	public static void main(String[] args) {
		Customer customer = new Customer(99, "IP Man", "0969899998", "Da Nang", "vana", "vanna1234");
		customerService.insert(customer);
	}
}
