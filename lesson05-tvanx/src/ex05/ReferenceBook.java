package ex05;

public class ReferenceBook extends Book {
	private double tax;
	
	public ReferenceBook() {
		// TODO Auto-generated constructor stub
	}

	public ReferenceBook(String bookid, double price, String producer, double tax) {
		super(bookid, price, producer);
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
		return "bookid:" + getBookid() + ", price:" + getPrice() + ", producer:" + getProducer() + ", tax:" + tax;
	}
}
