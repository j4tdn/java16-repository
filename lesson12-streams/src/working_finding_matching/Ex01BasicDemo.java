package working_finding_matching;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int[] numbers = {1,2,1,25,5,8,16,4,12};
		boolean hasNumberDivisibleBy10 = Arrays.stream(numbers)
				.anyMatch(number -> number % 10 == 0);
		System.out.println("1st hasNumberDivisibleBy10 --> " + hasNumberDivisibleBy10 );
		
		OptionalInt optInt = Arrays.stream(numbers)
				.filter(number -> number % 4 ==0)
				.findFirst();
		optInt.ifPresent(value -> 
				System.out.println("2nd first element divisible by 4 --> " + value));
		
		findFirst(numbers, number -> number % 4 ==0)
			.ifPresent(value ->
			System.out.println("2nd first element divisible by 4 --> " + value));
		
		
		Arrays.stream(numbers)
			.filter(number -> number % 5 == 0)
			.findAny()
			.ifPresent(value ->System.out.println("3rd first element divisible by 5 --> " + value));
		
		boolean isAllLessThan100 = Arrays.stream(numbers)
				.allMatch(number -> number < 100);
		System.out.println("4th is all element less than 100 --> " + isAllLessThan100);
		
		boolean isNoElementsGreaterThan0 = Arrays.stream(numbers)
				.noneMatch(number -> number > 0);
		System.out.println("5th is no element greater than 0 --> " + isNoElementsGreaterThan0);
	}
	
	private static <T> Optional<T> findFirst(Collection<T> collections , Predicate<T> predicate ) {
		return collections.stream().filter(predicate).findFirst();
	}
	
	private static OptionalInt findFirst(int[] elements, IntPredicate predicate ) {
		return Arrays.stream(elements).filter(predicate).findFirst();
	}
}
