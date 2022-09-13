package bean;

public class ReferenceBook extends Book{

	private double tax;
	public ReferenceBook(String id, double price, String publisher, double tax) {
		super(id, price, publisher);
		// TODO Auto-generated constructor stub
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
		return super.toString() + ", " + tax;
	}

	
}
