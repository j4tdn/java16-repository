package library;

public class TextBook extends Company {
	private String status;
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}
	
	public TextBook(String bookcode, int price, String company, String status) {
		super();
		this.bookcode = bookcode;
		this.price = price;
		this.company = company;
		this.status = status;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "status : ]" + this.status + " [ SACH GIAO KHOA";
	}
	
	
	

}
