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
		Customer newCust = new Customer(5, "Văn C", "091237128", "Đà Nẵng", "VanC", "vanc6173" );
		customerService.insert(newCust);
		
		
	}
}
