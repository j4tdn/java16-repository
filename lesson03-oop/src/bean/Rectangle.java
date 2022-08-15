package bean;

public class Rectangle {
	// atributes
	private int width;
	private int height;
	
	// empty/default constructor
	public Rectangle() {
		
	}
	//contructor
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// getters, setters
	public int getWidth() {
		return this.width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return this.width + ", " + this.height;
	}
}
