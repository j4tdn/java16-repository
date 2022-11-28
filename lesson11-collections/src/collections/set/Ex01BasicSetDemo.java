package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicSetDemo {
	
	public static void main(String[] args) {
		Set<String> text= new TreeSet<>();
		
		text.add("123");
		text.add("bdddff");
		text.add("c");
		
		text.add("b");
		
		System.out.println("size--> " + text.size());
		printf(text);

	}
	private static<E> void printf(Set<E> set) {
		for(E e: set) {
			System.out.println(e);
		}
	}

}
