package view;

public class Ex06_NumberAtPosition {
	public static void main(String[] args) {
		System.out.println(numberAtPos(17));
	}

	private static int numberAtPos(int position) {
		StringBuilder sB = new StringBuilder();
		for (int i = 1; i <= position; i++) {
			sB.append(i);
		}
		return sB.charAt(position - 1) - 48;
	}
}
