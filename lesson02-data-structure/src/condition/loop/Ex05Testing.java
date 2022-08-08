package condition.loop;

public class Ex05Testing {
	public static void main(String[] args) {
	max(2,4);
	}

	private static int max(int a, int b) {
		//Toan tu 3 ngoi: N1 = (expression) ? N2:N3
		/*
		 su dung khi N2 va N3 don gian
		 */
		return a > b ? a : b;
	}
}
