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
		Customer newCust = new Customer(5, "Van a","028283298","danang","vanc","vanc12344");
		customerService.insert(newCust);
	}

}
