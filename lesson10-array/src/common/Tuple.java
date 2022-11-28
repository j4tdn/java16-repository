package common;

public class Tuple implements Comparable<Tuple>{
	private int left;
	private int right;

	
	public Tuple() {
		// TODO Auto-generated constructor stub
	}


	public int getLeft() {
		return left;
	}


	public void setLeft(int left) {
		this.left = left;
	}


	public int getRight() {
		return right;
	}


	public void setRight(int right) {
		this.right = right;
	}


	public Tuple(int left, int right) {
		super();
		this.left = left;
		this.right = right;
	}


	@Override
	public String toString() {
		return  left + " " +   right + "\n";
	}


	@Override
	public int compareTo(Tuple o) {
		Tuple t1 = this;
		Tuple t2 = o;
		return t1.getRight() - t2.getRight();
	}
	
}
