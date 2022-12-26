package working.finding_matching;

import java.util.Arrays;
import java.util.OptionalInt;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 1, 25, 5, 8, 10, 4, 12 };

		// 1. is there any element that is divisible by 10
		boolean hasNumberDivisibleBy10 = Arrays.stream(numbers).anyMatch(number -> number % 10 == 0);
		System.out.println("1st hasNumberDivisibleBy10 --> " + hasNumberDivisibleBy10);

		// 2. find the first element that is divisible by 4
		OptionalInt optInt = Arrays.stream(numbers).filter(number -> number % 4 == 0).findFirst();
		optInt.ifPresent(value -> System.out.println("2nd first element divisible 4 --> " + value));

		// 3. find the elements that is divisible by 5 in the list
		Arrays.stream(numbers).filter(number -> number / 5 == 0).findAny()
				.ifPresent(value -> System.out.println("3nd element divisible by 5 --> " + value));

		// 4. does all elements less than by 100
		boolean isAllLessThan100 = Arrays.stream(numbers).allMatch(number -> number < 100);
		System.out.println("4th is all elements less than 100 --> " + isAllLessThan100);

		// 5. does no elements greater than 0
		boolean isNoElementsGreaterThan100 = Arrays.stream(numbers).noneMatch(number -> number > 0);
		System.out.println("isNoElementsGreaterThan100 --> " + isNoElementsGreaterThan100);

	}
}
