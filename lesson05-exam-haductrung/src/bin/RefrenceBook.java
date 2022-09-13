package bin;

public class RefrenceBook extends Book {
	private double tax;

	public RefrenceBook() {
		// TODO Auto-generated constructor stub
	}

	public RefrenceBook(String id, double price, String publisher, double tax) {
		super(id, price, publisher);
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
		// TODO Auto-generated method stub
		return super.toString() + " , " + tax;
	}
}
