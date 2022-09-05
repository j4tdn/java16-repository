package ex05;

import java.util.Scanner;

public class Book {
	private String idBook;
	private double price;
	private String publishingCompany;
	
	public Book() {
	}

	public Book(String idBook, double price, String publishingCompany) {
		this.idBook = idBook;
		this.price = price;
		this.publishingCompany = publishingCompany;
	}

	public String getIdBook() {
		return idBook;
	}

	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	@Override
	public String toString() {
		return "Book : idBook=" + idBook + ", Price=" + price + ", Publishing Company=" + publishingCompany + "]";
	}
	
	void input() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Input id Book: ");
		idBook = ip.next();
		System.out.println("Input price: ");
		price = ip.nextDouble();
		System.out.println("Input  Publishing Company ");
		publishingCompany = ip.nextLine();

	}
	
	
	

	
}
