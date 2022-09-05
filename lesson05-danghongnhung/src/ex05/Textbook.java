package ex05;

import java.util.Scanner;

public class Textbook extends Book {
	private String status;
	
	public Textbook() {
	}

	public Textbook(String idBook, double price, String publishingCompany, String status) {
		super(idBook, price, publishingCompany);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Textbook :  IdBook = " + getIdBook()+ ", Price = " + getPrice() + ", PublishingCompany = " + getPublishingCompany() + " status = " + getStatus()  ;
	}

	@Override
	void input() {
		Scanner ip = new Scanner(System.in);
		super.input();
		System.out.println("Input status: ");
		status = ip.next();
	}
	
	
	

}
