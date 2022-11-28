package collection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicSetDemo {
	public static void main(String[] args) {
		Set<String> text = new TreeSet<>(Comparator.reverseOrder());
		
		text.add("123456");
		text.add("zzzzzxcvb");
		text.add("abccccc");
		
		text.add("b");
		
		System.out.println("Size --> "+ text.size());
		printf(text);
	}
	
	private static<E> void printf(Set<E> set) {
		for(E e: set) {
			System.out.println(e);
		}
	}
}
