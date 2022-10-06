package demo05;

public class ReferenceBook extends Book{
	private double tax;
	
	public ReferenceBook() {
	}

	public ReferenceBook(String idBook, double price, String publisher, double tax) {
		super(idBook, price, publisher);
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
		return super.toString() + ", " + tax;
	}
}
