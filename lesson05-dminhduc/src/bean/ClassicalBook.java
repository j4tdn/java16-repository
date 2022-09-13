package bean;

public class ClassicalBook extends Book {
	private boolean status;
	
	public ClassicalBook()
	{
		
	}
	//this: đối tượng hiện tại
	//     gọi các thuôc tính, hàm ở class hiện tại và class/interface  cha
	//super: đói tượng cha
	//       gọi các thuộc tính, hàm ở class/interface cha
	  //this, super : gọi đến các hàm khởi tạo của nhau
	
	public ClassicalBook(String id, double price, String publisher, boolean status)
	{
		super(id, price, publisher);
		this.status = status;
	}
	
	public boolean isStatus()
	{
		return status;
	}
	public void setStatus(boolean status)
	{
		this.status = status;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", " + status;
	}
}
