package collections.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicSetDemo {
	public static void main(String[] args) {
		// List --> ArrayList, LinkedList --> array
		// get(i)
		Set<String> text = new TreeSet<>(Comparator.reverseOrder());
		text.add("a");
		text.add("b");
		text.add("c");

		text.add(new String("b"));

		System.out.println("size: " + text.size());
		printf(text);
	}

	private static <E> void printf(Set<E> set) {
		for (E e : set)
			System.out.println(e);
	}
}
