package utils;

import java.util.List;

public class PrintUtils {

	public PrintUtils() {
	}
	
	public static <E> void generate(String prefix, E element) {
		System.out.println(prefix + "---> { " + element + "}");
	}
	
	public static <E> void generate(String prefix, List<E> element) {
		System.out.println(prefix + " ---> {");
		element.forEach(e->System.out.println(">>" + e));
		System.out.println("}");
	}
}
