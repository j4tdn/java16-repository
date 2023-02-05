package working.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.OptionalInt;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,10,7,8,6,9,7,20,24};
		boolean a = Arrays.stream(numbers).anyMatch(number -> number % 10 == 0);
		System.out.println(a);
		
		OptionalInt a1 = Arrays.stream(numbers).filter(number -> number % 4 == 0).findFirst();;
		a1.ifPresent(value -> System.out.println("1st number " +  value));
		
		Arrays.stream(numbers).filter(o -> o % 5 == 0).findAny().ifPresent(o -> System.out.println(o));
		
		boolean b = Arrays.stream(numbers).allMatch(o -> (o < 100));
		System.out.println(b);
		boolean k = Arrays.stream(numbers).anyMatch(o -> (o < 0));
		System.out.println(k);
		
	}
	

}
