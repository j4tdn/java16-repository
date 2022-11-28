package collection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicSetDemo {
	public static void main(String[] args) {
		Set<String> text = new TreeSet<>(Comparator.reverseOrder());
		text.add("aðâsd");
		text.add("ádasdb");
		text.add("bádasdsac");
		text.add("db");
		text.add(new String("b"));
		printf(text);
		System.out.println("size : "  + text.size());

	}
	private static <E> void printf(Set<E> set) {
		for (E e : set) {
			System.out.println(e);
		}
	}
}
