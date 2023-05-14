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
		Customer newCust = new Customer(6, "Văn A", "034898888", "Đà Nẵng", "vana", "vana1234");
		customerService.insert(newCust);
	}

}
