package collections.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicSetDemo {
	public static void main(String[] args) {
		Set<String> text = new TreeSet<>(Comparator.reverseOrder());

		text.add("123456789");
		text.add("zzzzzabc");
		text.add("abccccc");
		text.add(new String("b"));
		
		System.out.println("size: " + text.size());
		printf(text);
	}
	
	private static <E> void printf(Set<E> set) {
		for (E e: set) {
			System.out.println(e);
		}
	}
	
	
}
