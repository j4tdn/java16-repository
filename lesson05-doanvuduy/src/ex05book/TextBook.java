package ex05book;

public class TextBook {
	private String bookId;
	private int price;
	private String publishing;
	private String status;

	public TextBook() {

	}

	public TextBook(String bookId, int price, String publishing, String status) {
		super();
		this.bookId = bookId;
		this.price = price;
		this.publishing = publishing;
		this.status = status;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TextBook [bookId=" + bookId + ", price=" + price + ", publishing=" + publishing + ", status=" + status
				+ "]";
	}

}
//Mã sách, đơn giá, nhà xuất bản, tình trạng (mới, cũ).