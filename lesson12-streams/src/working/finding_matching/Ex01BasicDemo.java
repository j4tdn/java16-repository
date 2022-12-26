package working.finding_matching;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 1, 24, 5, 8, 16, 4, 12};
		
		boolean hasNumberDivBy10 = Arrays.stream(numbers)
			.anyMatch(number -> number %10 ==0);
		System.out.println("1st hasNumberDivBy10 --> " + hasNumberDivBy10);
		
		OptionalInt optInt = Arrays.stream(numbers)
			.filter(number -> number % 4 ==0)
			.findFirst();
		optInt.ifPresent(value -> 
			System.out.println("2nd first element divisible by 4 --> " + value));
		
		Arrays.stream(numbers)
			.filter(number -> number % 5 == 0)
			.findAny()
			.ifPresent(value -> 
			System.out.println("3rd first element divisible by 5 --> " + value));
		
		boolean isAllLessThan100 = Arrays.stream(numbers)
			.allMatch(number -> number < 100);
		System.out.println("4th is all elements less than 100 --> " + isAllLessThan100);
		
		boolean isNoElenmentFreaterthan0 = Arrays.stream(numbers)
			.noneMatch(number -> number > 0);
		System.out.println("5th is no elements greater than 0 --> " + isNoElenmentFreaterthan0);
	}
}
