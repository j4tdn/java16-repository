package ex05;

public class ReferenceBook extends Book {
	private double tax;

	public ReferenceBook() {
	}

	public ReferenceBook(String id, double cost, String publishing, double tax) {
		super(id, cost, publishing);
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
		return super.toString() + " ,tax=" + tax;
	}

	@Override
	protected double intoMoney() {
		return this.getCost() * (1 + tax);
	}
}
