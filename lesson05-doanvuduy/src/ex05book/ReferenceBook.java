package ex05book;

public class ReferenceBook extends TextBook {
	private String bookId;
	private int price;
	private String publishing;
	private float tax;

	public ReferenceBook() {

	}

	public ReferenceBook(String bookId, int price, String publishing, float tax) {
		super();
		this.bookId = bookId;
		this.price = price;
		this.publishing = publishing;
		this.tax = tax;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublishing() {
		return publishing;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook [bookId=" + bookId + ", price=" + price + ", publishing=" + publishing + ", tax=" + tax
				+ "]";
	}

}
//Mã sách, đơn giá, nhà xuất bản, thuế %.