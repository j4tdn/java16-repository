package working.optional;

import java.util.Optional;

public class Ex01OptionalDemo {
	public static void main(String[] args) {
		Integer nonNullValue = 5;
		Integer nullValue = null;
		Optional.of(nonNullValue);
		Optional.ofNullable(nullValue);
	}
}
