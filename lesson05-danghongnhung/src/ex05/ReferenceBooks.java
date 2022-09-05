package ex05;

import java.util.Scanner;

public class ReferenceBooks extends Book{
	public double tax;
	
	public ReferenceBooks() {
	}

	public ReferenceBooks(String idBook, double price, String publishingCompany, double tax) {
		super(idBook, price, publishingCompany);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	
	@Override
	public String toString() {
		return "ReferenceBooks : IdBook = " + getIdBook()	+ ", Price = " + getPrice() + ", PublishingCompany = " + getPublishingCompany() + " Tax = " + getTax();
	}

	@Override
	void input() {
		Scanner ip = new Scanner(System.in);
		super.input();
		System.out.println("Input tax: ");
		tax = ip.nextDouble();
	}
	

}
