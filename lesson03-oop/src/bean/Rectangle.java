package bean;

public class Rectangle {
	// attributes
	private int height;
	private int width;

	// empty / default constructor
	public Rectangle() {

	}
	
	// constructor with parameters
		public Rectangle(int height, int width) {
			this.height = height;
			this.width = width;
		}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}
}
