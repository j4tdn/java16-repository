package condition.loop;

public class Ex05Testing {
	public static void main(String[] args) {
		// Viet ham tim max cua 2 so a, b
		System.out.println("max: " + max(2,4));
	}

	private static int max(int a, int b) {
		// Toan tu 3 ngoi: N1 = expresion ? N2 : N3
		/*
		 Su dung khi N1 va N3 don gian(it bieu thuc code)
		 if(expresion){
		 	N1 = N2;
		 } else {
		 	N1 = N3;
		 }
		 */
		
		return a > b ? a : b;
	}

}
