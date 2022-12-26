package working.optional;

import java.util.Optional;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Ex01OptionalDemo {
	public static void main(String[] args) {
		Integer nonNullValue = 10;
		Integer nullValue = null;
		
		Optional.ofNullable(nonNullValue).ifPresent(System.out::println);
		
		Optional.ofNullable(nullValue).ifPresent(System.out::println);

	}
}
