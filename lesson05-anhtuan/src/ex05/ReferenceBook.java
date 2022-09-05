package ex05;

public class ReferenceBook extends Father {
	private int tax;
	
	public ReferenceBook() {
		
	}

	public ReferenceBook(String id, int price, String publishingCompany, int tax) {
		super(id, price, publishingCompany);
		this.tax = tax;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook [tax=" + tax + "]";
	}
	

}
