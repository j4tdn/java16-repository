package bean;

public class Rectrangle {
		// attributes
	private int width;
	private int height;
	
	// empty/default constructor
		public Rectrangle() {
			
		}
	// constructor
	public Rectrangle(int width, int height) {
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
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
	return width + " , " + height;
	}
}
