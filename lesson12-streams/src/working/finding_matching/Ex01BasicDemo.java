package working.finding_matching;

import java.util.Arrays;
import java.util.OptionalInt;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		/*
		 * Example: Give a list of numbers: 1, 2, 1, 24, 5, 8, 10, 4, 12
		 * 1st: is there any element that is divisible by 10
		 * 2nd: find the first element that is divisible by 4
		 * 4th: does all elements less than 100
		 * 5th: does no elements greater than 0
		 */
		
		
		int[] numbers = {1, 2, 1, 24, 5, 8, 10, 4, 12};
		boolean hasNumberDivisibleBy10 = Arrays.stream(numbers) // IntStream
			.anyMatch(number -> number % 10 == 0);
		System.out.println("1st hasNumberDivisibleBy10 --> " + hasNumberDivisibleBy10);
		
		OptionalInt optInt = Arrays.stream(numbers)
			.filter(number -> number % 4 == 0) // IntStream
			.findFirst();
		optInt.ifPresent(value -> System.out.println("2nd first element divisible by 4 --> " + value));
		
		Arrays.stream(numbers)
			.filter(number -> number % 5 == 0)
			.findAny()
			.ifPresent(value -> System.out.println("3rd element divisible by 5 -->" + value));
	
		boolean isAllLessThan100 = Arrays.stream(numbers)
			.allMatch(number -> number < 100);
		System.out.println("4th: is all elements less than 100: " + isAllLessThan100);
		
		boolean isNoElementsGreaterThan0 = Arrays.stream(numbers)
			.noneMatch(number -> number > 0);
		System.out.println("5th is no element greater than 0 --> " + isNoElementsGreaterThan0);
	}
}
