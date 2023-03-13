
public class Ex02 {
	public static void main(String[] args) {
		System.out.println(PowerCheck(8, 2));
		System.out.println(PowerCheck(2, 6));
	}
	private static boolean PowerCheck(int a, int b) {

		for (int i = 0; i < a + b; i++) {
			if (Math.pow(a, i) == b) {
				return true;
			}
			if (Math.pow(b, i) == a) {
				return true;
			}
		}
		return false;
	}
}
