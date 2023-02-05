package working.finding_matching;

import java.util.Arrays;
import java.util.OptionalInt;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int [] numbers = {1,2,1,4,5,8,10,4,12};
		
		//1. có số nào chia hết cho 10 không?
		boolean hasNumberDivisibleBy10 = 
				Arrays.stream(numbers)//IntStream
		      .anyMatch(number-> number%10==0);
		System.out.println("1st hasNumberDivisibleBy10 " +hasNumberDivisibleBy10);
		//2
		OptionalInt opInt = Arrays.stream(numbers)
		      .filter(number -> number %4==0)
		      .findFirst();
		opInt.ifPresent(value -> System.out.println("2nd" +value));
		//3
		Arrays.stream(numbers)
		      .filter(number -> number%5==0)
		      .findAny()
		      .ifPresent(value ->System.out.println("3nd" +value));
		//4
		boolean isAlllessthan100 =  Arrays.stream(numbers)
				                          .allMatch(number-> number<100);
		System.out.println("4th" +isAlllessthan100);
		//5
		boolean isNoElementGreaterThat0 = Arrays.stream(numbers)
				                                .noneMatch(number->number>0);
		System.out.println("5th--> " +isNoElementGreaterThat0);
	}

}
