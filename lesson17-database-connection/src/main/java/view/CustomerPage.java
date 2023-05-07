package view;

import java.util.ArrayList;
import java.util.List;

import bean.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

public class CustomerPage {
	
	private static CustomerService customerService;
	
	static {
		customerService = new CustomerServiceImpl();
	}
	
	public static void main(String[] args) {
		Customer newCust = new Customer(5, "Văn A", "034898999", "Đà Nẵng", "vana", "vana1234");
		customerService.insert(newCust);
		
		List<Customer> customers = new ArrayList<>();
		for (Customer customer: customers) {
			customerService.insert(customer);
		}
		
		// Server BE
		
		// N requests ---> BATCH UPDATE
		
		// 1 request(insert/update/delete) --> 1 ELEMENT  in BATCH
		// N request                       --> N ELEMENTS in BATCH
		// execute BATCH --> 1 TIME
		
		// Server DB
	}
}
