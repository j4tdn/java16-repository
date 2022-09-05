package library;

public class ReferenceBooks extends TextBook {
	private int tax;
	public ReferenceBooks() {
		// TODO Auto-generated constructor stub
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public ReferenceBooks(String bookcode, int price, String company, int tax) {
		super();
		this.bookcode = bookcode;
		this.price = price;
		this.company = company;
		this.tax = tax;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "tax : "  + this.tax;
	}
	
	

}
