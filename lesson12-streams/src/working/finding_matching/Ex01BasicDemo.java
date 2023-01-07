package working.finding_matching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 1, 16, 5, 7, 10, 4, 15 };

		// 1. is there any element that is divisible by 10
		boolean hasNumbersDivisibleBy10 = Arrays.stream(numbers).anyMatch(num -> num % 10 == 0);
		System.out.println(hasNumbersDivisibleBy10);

		// 2. find 1st element divisible by 4
//		OptionalInt firstElementDivisibleBy4 = Arrays.stream(numbers).filter(num -> num % 4 == 0).findFirst();
//		firstElementDivisibleBy4.ifPresent(value -> System.out.println(value));
		findFirst(numbers, num -> num % 4==0)
		.ifPresent(value -> System.out.println(value));
		
		// 3. find the element that is divisible by 5
		Arrays.stream(numbers)
		.filter(number -> number%5==0)
		.findAny()
		.ifPresent(value -> System.out.println(value));
	
		// 4. all elements < 100?
		boolean isAllElementsLessThan100 = Arrays.stream(numbers)
				.allMatch(num -> num < 100);
		System.out.println(isAllElementsLessThan100);
		
		// 5. no elements > 0?
		boolean isNoneElementsGreaterThan0 = Arrays.stream(numbers)
				.noneMatch(num -> num > 0);
		System.out.println(isNoneElementsGreaterThan0);
	}
	
	private static OptionalInt findFirst(int[] arr, IntPredicate predicate) {
		return Arrays.stream(arr).filter(predicate).findFirst();
	}
	
}
