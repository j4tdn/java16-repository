package bean;

public class ClassicalBook extends Book {
private boolean status;
// this: current object: gọi các thuộc tính, hàm ở class hiện tại và class/interface cha
// super: đối tượng cha: gọi các thuộc tính, hàm ở class/interface cha
// this, super gọi đến các hàm khởi tạo của nhau
public ClassicalBook() {
}
public ClassicalBook(String id, double price, String publisher,boolean status) {
	super(id, price, publisher);
	this.status = status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public boolean isStatus() {
	return status;
}
@Override
	public String toString() {
		
		return super.toString() + "," + status;
	}

}

