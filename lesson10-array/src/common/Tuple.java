package common;

public class Tuple<E>  implements Comparable<E>{
	private int left;
	private int right;
	
	public Tuple() {
		
	}

	public Tuple(int left, int right) {
		
		this.left = left;
		this.right = right;
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

	@Override
	public String toString() {
		return "Tuple [left=" + left + ", right=" + right + "]";
	}

	@Override
	public int compareTo(E o) {
		Tuple e1 = this;
		Tuple e2 =  (Tuple) o;
		return e1.getRight() - e2.getRight();
	}
	

}
