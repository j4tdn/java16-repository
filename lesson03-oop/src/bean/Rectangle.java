package bean;

public class Rectangle {
	// attributes
	private int width;
	private int height;
	public Rectangle() {
		
	}
	public  Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// getter, setters
	public int getWidth() {
		return this.width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeigt() {
		return this.height;
	}
	public void setHeigh(int width) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return width + "," + height;
	}
}
