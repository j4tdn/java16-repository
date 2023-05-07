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
		Customer newCust = new Customer(5, "Van A", "0234243433", "Da Nang", "vana", "vana1234");
		customerService.insert(newCust);
	}
}
