package problem05.dto;

public final class ReferenceBook extends Book {
	Double tax;

	public ReferenceBook() {
		super();
	}

	public ReferenceBook(String id, Double price, String publisher, Double tax) {
		super(id, price, publisher);
		this.tax = tax;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook [id=" + id + ", price=" + price + ", publisher=" + publisher + ", tax=" + tax + "]";
	}
}
