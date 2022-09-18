package bean;

import bean.Book;

public class ClassicalBook extends Book{
	// mã sách , đơn giá , nhà xuất bản (mới cũ)
	private boolean status;
	public ClassicalBook() {
		// TODO Auto-generated constructor stub
	}
	// this: đối tượng hiện tại
	// : gọi các thuộc tính, hàm ở class hiện tại và class/interface cha
	//super: đối tượng cha 
	// : gọi các thuộc tính, hàm ở class/interface
	// this, super : gọi đến các hàm khởi taoj của nhau
	
	public ClassicalBook(String id, double price, String publiser,boolean status) {
		super(id,price, publiser);
		this.status = status;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean Status) {
		this.status = Status;
	}

	@Override
	public String toString() {
		return super.toString() + ", " +status;
	}
	
	
}
