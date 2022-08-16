package bean;

public class Rectangle {
	//attributes
	private int width;
	private int height;
	
	//Empty default Constructor
	public Rectangle(){
		
	}
	
	//Constructor
	public Rectangle(int width, int height ){
		this.width = width;
		this.height = height;
	}
	//getters, setters
	public int getWidth() {
		return this.width;
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
		return width + ", " + height;
	}
}
