
import java.util.Scanner;

public class Ex01FirstDegreeEquation {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("x1 = " + findX());
	}

	private static float findX() {
		int a = 0;
		int b = 0;
		do {
			try {
				
				System.out.print("Enter a: ");
				a = Integer.parseInt(ip.nextLine());
				if (a == 0)
					throw new ArithmeticException();
				System.out.print("Enter b: ");
				b = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Please enter again");
				// e.printStackTrace();
			} catch (ArithmeticException e) {
				System.out.println("Please enter a=!0: ");
			}
		} while (true);
		return (float) -b / a;
	}
}