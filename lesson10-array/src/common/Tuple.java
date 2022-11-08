package common;

public class Tuple {
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
		return "Tuple [left=" + left + ", right=" + right + "]";
	}
	
}
