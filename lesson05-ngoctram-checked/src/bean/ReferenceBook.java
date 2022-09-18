package bean;

public class ReferenceBook extends Book {
	private double tax;

	public ReferenceBook() {
		// TODO Auto-generated constructor stub
	}

	public ReferenceBook(String id, double price, String publisher) {
		super(id, price, publisher);
		// TODO Auto-generated constructor stub
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return super.toString() + ", tax=" + tax;
	}

}
