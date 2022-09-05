package model;

import bean.Book;

public class CustomerUtils {
	int CustomerId;
	Book[] books;
	
	public CustomerUtils(int customerId, Book[] books) {
		super();
		CustomerId = customerId;
		this.books = books;
	}
	
	public float printBill() {
		float sum = 0;
		for (Book book : books) {
			sum += book.getPrices();
		}
		return sum;
	}
	
	
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	
	
	
}
