package bean;

public class Rectangle {
	// attributes
	private int width;
	private int height;
	
	// empty/default constructor
	public Rectangle() {
		
	}
	
	// constructor
	// new Rectangle(6, 3)
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// getters, setters
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = 10;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return width + ", " + height;
	}
}
