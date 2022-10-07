package condition.loop;

public class Ex05Testing {
	public static void main(String[] args) {
		// Viet 1 ham tim max cua 2 so a va b
		System.out.println("max: " + max(2, 4));
	}

	private static int max(int a, int b) {
		return (a > b) ? a : b;
	}
}
