package collection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicSetDemo {
	public static void main(String[] args) {
		Set<String> text = new TreeSet<>(Comparator.reverseOrder());
		
		text.add("123456789");
		text.add("zzzzzzabc");
		text.add("abcccc");
		
		text.add(new String ("b"));
		
		System.out.println("size: " + text.size());
		printf(text);
	}
	
	private static <E> void printf(Set<E> set) {
		for (E e:set) {
			System.out.println(e);
		}
	}
}
