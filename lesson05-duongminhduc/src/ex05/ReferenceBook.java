package ex05;

public class ReferenceBook extends Book {

	private float tax;
	
	public ReferenceBook()
	{
		
	}

	public ReferenceBook(float tax) {
		super();
		this.tax = tax;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook [tax=" + tax + ", getIdbook()=" + getIdbook() + ", getPrice()=" + getPrice()
				+ ", getPubcompany()=" + getPubcompany() + "]";
	}
	
}
