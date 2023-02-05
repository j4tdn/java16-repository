package working.optional;

import java.util.Optional;

public class Ex01OptionalDemo {
	public static void main(String[] args) {
		Integer nonNullValue = 10;
		Integer nullvalue =null;
		
		Optional.ofNullable(nullvalue)//đưa opt vào opt
		.ifPresent(System.out::println);
		
		Optional.ofNullable(nonNullValue)
		.ifPresent(System.out::println);
		
		
	}

}
