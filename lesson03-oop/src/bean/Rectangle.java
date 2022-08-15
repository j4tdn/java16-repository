package bean;

public class Rectangle {
	//attributes: thuộc tính
	private int width;
	private int height;
	
	//enpty/default constructor: hàm khởi tạo rỗng
	public Rectangle() {
		
	}
	
	//constructor
	//new Rectangle(6,3)
	public Rectangle(int width,int height) {
		this.width = width;
		this.height = height;
	}
	
	//getters, setters
	public int getWidh() {
		return this.width;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.width+","+this.height;
	}

}
