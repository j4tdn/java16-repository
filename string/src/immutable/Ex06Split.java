package immutable;

import java.util.Arrays;

public class Ex06Split {
	public static void main(String[] args) {
		String text = "welcome to class";
		Arrays.asList(text.split("\\s")).forEach(System.out::println);
		System.out.println("=====================");
		String line = "Nasus, 094564343, 29, English";
		String[] tokens = line.split(",\\s");
		Arrays.asList(tokens).forEach(System.out::println);
		System.out.println("=====================");
		line = "Lucifer , , 066666666  ,     oo ,,,, Hell";
		tokens = line.split("[,\\s]+");
		Arrays.asList(tokens).forEach(System.out::println);
		System.out.println("=====================");
		line = "ab123bx09aa222";
		tokens = line.split("[A-z]+");
		Arrays.asList(tokens).stream().filter(o -> !o.equals("")).forEach(System.out::println);
		System.out.println("=====================");
	}
}
