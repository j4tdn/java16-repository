package bean;

public class ReBook extends Book {
	private double tax;
	
	public ReBook() {
		// TODO Auto-generated constructor stub
	}

	public ReBook(String id, double price, String publisher, double tax) {
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
		return  super.toString() + "," + tax;
	}
	
	
	

}
