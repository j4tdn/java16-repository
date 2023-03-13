
import static java.lang.Math.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Ex02PowerNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter A: ");
		int a = ip.nextInt();
		System.out.println("Enter A: ");
		int b = ip.nextInt();
		
		boolean result = (a > b) ? isPower(b, a) : isPower(a, b);
		System.out.println(result);
	}
	
	private static boolean isPower(int a, int b) {
		double resultlog = log(b) / log(a);

		resultlog = BigDecimal.valueOf(resultlog).setScale(1, RoundingMode.HALF_UP).doubleValue();

		return ceil(resultlog) == floor(resultlog);
	}
}
