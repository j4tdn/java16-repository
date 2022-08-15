package bean;

public class Rectangle {
// atributes
	private int width;
	private int height;

	public Rectangle()
	{
		
	}
	// constructor
	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	// getters, setters
	public int getWidth()
	{
		return width;
	}	
	public void setWidth(int width)
	{
		this.width = width;
	}
	public int getHeight()
	{
		return height;
	}	
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return width + ", "+ height;
		}
}
