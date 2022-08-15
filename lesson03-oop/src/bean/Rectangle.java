package bean;

public class Rectangle {
	// attributes
	private int width;
	private int height;
	
	// empty/default constructor
	public Rectangle() {
		
	}
	// constructor
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}	
	// getters, setters
	public int getWidth() {
		return width;
		}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight() {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return width + "," + height;
	}
}
