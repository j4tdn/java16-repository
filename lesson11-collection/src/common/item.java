package common;

public class item {
	private int left;
	private int right;

	public item() {

	}

	public item(int left, int right) {
		super();
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

}
