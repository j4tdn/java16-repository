package condition.loop;

public class Ex05Testing {

	public static void main(String[] args) {
		// Viet ham tim max 2 so
		System.out.println("max: " + max(2,4));

	}
	
	private static int max(int a, int b) {
		// Toan tu 3 ngoi
		/* Dung khi N2 N3 don gian
		 * if (expression){
		 * 		N1 = N2;
		 * } else {
		 * 		N1 = N3;
		 * }
		 * 
		 */
		return a > b ? a : b;
	}

}
