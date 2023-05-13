package view;

import service.CustomerServiceImp;

public class CustomerPage {

	private static CustomerService customerService;
	
	static {
		customerService = new CustomerServiceImp();
		
	}
	
	public static void main(String[] args) {
		Customer newCust =  new Customer(5,"A")
	}
}
