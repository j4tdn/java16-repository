package common;

public class Tuple implements Comparable<Tuple> {
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
	public int compareTo(Tuple o) {
		Tuple T1 = this;
		Tuple T2 = o;

		return T1.getRight() - T2.getRight();//right trước lớn hơn right sau thì hoán vị
		//tăng dần
	}

}
