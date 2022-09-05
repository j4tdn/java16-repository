package ex05;

public class ReferenceBook extends Book {
	private double tax;

	public ReferenceBook() {
		super();
	}

	public ReferenceBook(String idBook, float price, String publishingCompany, double tax) {
		super(idBook, price, publishingCompany);
		this.tax = tax;
	}

	@Override
	public String toString() {
		return super.toString() + " Tax: " + this.tax;
	}

}
