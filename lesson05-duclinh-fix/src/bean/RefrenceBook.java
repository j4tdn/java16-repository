package bean;

public class RefrenceBook extends Book{
	private double tax;
	public RefrenceBook() {
		// TODO Auto-generated constructor stub
	}

	public RefrenceBook(String id, double price, String publiser, double tax) {
		super(id, price, publiser);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
