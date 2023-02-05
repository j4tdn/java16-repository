package working.finding_matching;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int[] numbers = {1,12,1,4,5,8,10,4,15};
		//1. is there any element that is divisible by 10
		boolean divisibleBy10 = Arrays.stream(numbers)
		.anyMatch(d -> d % 10 == 0);
		System.out.println(divisibleBy10);
		//2. find first element that is divisible by 4
		Arrays.stream(numbers)
				.filter(d -> d%4 ==0)
				.findFirst()
				.ifPresent(d -> System.out.println(d));
		System.out.println("==============");
		//3. fine the element that is divisible by 5 in the list
		Arrays.stream(numbers)
		.parallel()
		.filter(d -> d > 5 && d <=20)
		.findAny()
		.ifPresent(System.out::println);
		//4. does all elements less than 100
		boolean s = Arrays.stream(numbers)
		.allMatch(d -> d < 100);
		System.out.println(s);
		boolean f =Arrays.stream(numbers)
				.noneMatch(d -> d > 0);
		System.out.println(f);
	}

}
