package working.finding_matching;

import java.util.Arrays;
import java.util.OptionalInt;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 1, 25, 5, 8, 16, 4, 12 };
	boolean hasNumberDivisibleBy10 = Arrays.stream(numbers)
			.anyMatch(number -> number % 10 == 0);
	System.out.println("1st hasNumberDivisible");
	
//	OptionalInt 
//	boolean isAllL
	}
	
	

}
