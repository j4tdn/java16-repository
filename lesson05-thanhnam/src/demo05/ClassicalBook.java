package demo05;

public class ClassicalBook extends Book{
		//Sách giáo khoa: Mã sách, đơn giá, nhà xuất bản, tình trạng (mới, cũ).
	private boolean status;
	
	public ClassicalBook() {
	}
	public ClassicalBook(String idBook, String publisher, boolean status, double price) {
		super(idBook, price, publisher);
		this.status = status;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
	return super.toString() + ", " + status;
	}
}
