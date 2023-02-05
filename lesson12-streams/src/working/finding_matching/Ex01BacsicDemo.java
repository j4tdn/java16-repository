package working.finding_matching;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class Ex01BacsicDemo {
public static void main(String[] args) {
	int[] numbers = {1, 2, 1, 4, 25, 8, 10, 4, 12};
	boolean hasNumberDivisibleBy10 = Arrays.stream(numbers) 
	.allMatch(number -> number % 10 == 0);
	System.out.println("1st hasNumberDivisibleBy10 --> " + hasNumberDivisibleBy10);

	OptionalInt otpInt =	Arrays.stream(numbers)
	.filter(number -> number % 4 == 0)
	.findFirst();
	otpInt.ifPresent(value -> 
	System.out.println("2nd first element divisble by 4 -->" + value));
	Arrays.stream(numbers)
	.filter(number -> number % 5 == 0)
	.findAny()
	.ifPresent(value -> System.out.println("3rd element divisble by 5 -->" + value));
boolean isAllLessThan100 =	Arrays.stream(numbers)
	.allMatch(number -> number <100 );
System.out.println("4th is all element less than 100 -->" + isAllLessThan100);
boolean isNoElementGreaterThan0 = Arrays.stream(numbers)
.noneMatch(number -> number > 0);
System.out.println("5th isNoElementGreaterThan0 -->" +isNoElementGreaterThan0);
}

}
