package working.optional;

import java.util.Optional;

public class Ex01OptionalDemo {
	public static void main(String[] args) {
		Integer nonull = 10;
		Integer nulll = null;
		Optional.ofNullable(nonull).ifPresent(System.out::println);
		Optional.ofNullable(nulll).ifPresent(System.out::println);
	}

}
