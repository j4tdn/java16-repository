package view;

import java.util.List;

public class PrintUtils {
	private PrintUtils() {
	}

	public static <E> void generate(String prefix, E elements) {
		System.out.println(prefix + " --> {" + elements + " } ");
	}

	public static <E> void generate(String prefix, List<E> elements) {
		System.out.println(prefix + " --> {");
		elements.forEach(e -> System.out.println(">>" + e));
		System.out.println(" } ");
	}
}
