package collections.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("unused")
public class Ex01BasicSetDemo {
	public static void main(String[] args) {
		Set<String> text = new TreeSet<>(Comparator.reverseOrder());
		text.add("a");
		text.add("b");
		text.add("c");
		text.add("1");
		System.out.println("size:" + text.size());
		printf(text);
	}
	private static <E> void printf(Set<E> set) {
		for(E e:set) {
			System.out.println(e);
		}
	}

}
