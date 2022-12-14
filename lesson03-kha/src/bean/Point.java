package bean;

public class Point {
	public int x;
	public int y;
	public int value;
	
	public Point(int x, int y, int value) {
		this.x = x;
		this.y = y;
		this.value = value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+ x + ","+ y + ")" + "--with val:" + this.value;
	}
}
