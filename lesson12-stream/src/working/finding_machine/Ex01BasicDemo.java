package working.finding_machine;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int[] numbers = {1 ,2 ,1 ,25 ,5 ,8 ,16 ,4 ,12 };
		boolean hasNumberDivisibleBy10 = Arrays.stream(numbers)
				.anyMatch(number -> number % 10 == 0);
		System.out.println("1st has numberdivisibleBy10-->" +hasNumberDivisibleBy10);
		OptionalInt optInt = Arrays.stream(numbers)
			.filter(number -> number % 5 == 0)
			.findAny()
			.ifPresent(value -> System.out.println("3rd" );
		boolean isAllLessThan100 = Arrays.stream(numbers)
				.allMatch(number -> number < 100);
		System.out.println("4th is all elements less than 100 -->" + isAllLessThan100);
		
		boolean isNoElementGreaterThan0 = Arrays.stream(numbers)
				.noneMatch(number -> number > 0);
		System.out.println("5th is no element greater than 0 -->" +isNoElementsGreaterThan0);
		
		private static <T> Optional<T> findFirst<Collection<T>collection
	}
}
