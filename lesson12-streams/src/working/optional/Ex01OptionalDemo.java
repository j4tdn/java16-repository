package working.optional;

import java.util.Optional;

public class Ex01OptionalDemo {
	public static void main(String[] args) {
		Integer nonNullValue = 10;
		Integer nullValue = null;
		
		Optional.of(nonNullValue).ifPresent(System.out::println);
		
		Optional.of(nullValue).ifPresent(System.out::println);
		
		
	}
}
