
public class Ex02 {
	public static void main(String[] args) {
		int n = 44;
		int nCopy = n;
		int sum = 0;
		do {
			sum = 0;
			do {
				sum += (nCopy%10) * (nCopy%10);
				nCopy /= 10;
//				System.out.println("sum now = " + sum);
//				System.out.println("n copy = " + nCopy);
			} while (nCopy >= 1);
//			System.out.println("sum now 2 = " + sum + "\n");
			nCopy = sum;
		} while (sum >= 10);
//		System.out.println("Sum final: " + sum);
		if (sum == 1) {
			System.out.println(n + " => Happy Number");
		}
	}
}
