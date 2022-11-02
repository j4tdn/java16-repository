package declaration;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		char [] letter = new char[5];
		int [] digit = {2,4,6,7};
		int [] number = getNumber();
	}
	private static int[] getNumber() {
		return new int[] {2,5,6,1};
	}

}
