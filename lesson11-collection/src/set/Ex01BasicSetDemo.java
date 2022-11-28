package set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicSetDemo {
	public static void main(String[] args) {
		Set<String> text = new TreeSet<>(Comparator.reverseOrder());
		text.add("a");
		text.add("Ngoc Tram");
		text.add("c");
		text.add(new String("b"));
		System.out.println("size: " + text.size()); // still 3
		printf(text); // a, b, c
	}

	private static <E> void printf(Set<E> set) {
		for (E e : set) {
			System.out.println(e);
		}
	}
}
