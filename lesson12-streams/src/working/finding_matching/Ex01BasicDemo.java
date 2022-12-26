package working.finding_matching;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 1, 24, 5, 8, 10, 4, 12};
		boolean hasNumberDivisibleBy10 = Arrays.stream(numbers)  // IntStream
		.anyMatch(number -> number % 10 == 0);
        System.out.println("1. is there any element that is divisible by 10 --> " + hasNumberDivisibleBy10);
        
       OptionalInt OptInt = Arrays.stream(numbers)
        .filter(number -> number % 4 == 0) //IntStream
        .findFirst();
       OptInt.ifPresent(value -> System.out.println("2. find the first element that is divisible by 4 --> " + value));
	
       Arrays.stream(numbers)
       .filter(number -> number % 5 == 0)
       .findAny()
       .ifPresent(value -> System.out.println("3. find the element that is divisible by 5 in the list --> " + value));
       
      boolean isAllLess100 =  Arrays.stream(numbers)
       .allMatch(number -> number < 100 );
      System.out.println("4. does all elements less than 100 --> " + isAllLess100);
      
      boolean isNoEGreaterThan0 = Arrays.stream(numbers) 
    		  .noneMatch(number -> number > 0);
      System.out.println("5. does no elements greater than 0 --> " + isNoEGreaterThan0);
    		  
	}
}
