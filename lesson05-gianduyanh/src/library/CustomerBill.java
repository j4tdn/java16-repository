package library;

import java.util.Arrays;

public class CustomerBill {
	private Customer customerid;
	private Company[] books;
	public Customer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Customer customerid) {
		this.customerid = customerid;
	}
	public Company[] getBooks() {
		return books;
	}
	public void setBooks(Company[] books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "CustomerBill [customerid=" + customerid + ", books=" + Arrays.toString(books) + "]";
	}
	public CustomerBill(Customer customerid, Company[] books) {
		super();
		this.customerid = customerid;
		this.books = books;
	}
	
	public int bill() {
		int bill01 = 0;
		Company[] companies = getBooks();
		for (Company company : companies) {
			
			
		}
		
		
		return bill01;
	}

}
