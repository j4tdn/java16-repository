package working.finding_matching;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 1, 4, 5, 8, 10, 4, 12};
		
		boolean hasNumberDivisibleBy10 = Arrays.stream(numbers) //IntStream
		  .anyMatch(number -> number % 10 == 0);
		System.out.println("1st. Is there any element that divisible by 10: " + hasNumberDivisibleBy10);
		
		OptionalInt opInt =  Arrays.stream(numbers)
				.filter(number -> number % 4 == 0)
				.findFirst();
		opInt.ifPresent(value -> System.out.println("2nd. First element divisible by 4: " + value));
		
		Arrays.stream(numbers)
		.filter(number -> number % 5 == 0)
		.findAny()  //khoong truyeen -> optional
		.ifPresent(value -> System.out.println("3rd. Element divisible by 5: " + value));
		
		boolean isAllLessThan100 = Arrays.stream(numbers)
		.allMatch(number -> number < 100); //truyenf dk(predicate) --> boolean
		System.out.println("4th. Is all elements less than 100: " + isAllLessThan100);
		
		boolean isNoElementGreaterrThan0 = Arrays.stream(numbers)
				.noneMatch(number -> number < 0);
		System.out.println("5th. Is no elements greater than 0: " + isNoElementGreaterrThan0);	
	}
}
