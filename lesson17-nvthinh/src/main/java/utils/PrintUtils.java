package utils;

import java.util.List;

public class PrintUtils {
	public PrintUtils() {
		// TODO Auto-generated constructor stub
	}
	public static <E> void generate(String prefix ,List<E> elements) {
		System.out.println(prefix + "--> {");
		elements.forEach( e -> System.out.print(">>" e));
		System.out.println(prefix + " }");
	}
}

