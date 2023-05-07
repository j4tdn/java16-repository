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
		Customer newCus = new Customer(5, "Van A", "012383473", "Đà Nẵng", "vana", "vana1234567");
		customerService.insert(newCus);
	}
}
