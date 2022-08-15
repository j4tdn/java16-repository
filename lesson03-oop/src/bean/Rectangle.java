package bean;

public class Rectangle {
	// attributes
	private int width;
	private int height;
	
	public Rectangle() {}
	
	public Rectangle(int Width, int Height) {
		this.width = Width;
		this.height = Height;
	}
	
	
	
	//getters, setters
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "width " + this.width + " - " + "height " + this.height;
	}
}
