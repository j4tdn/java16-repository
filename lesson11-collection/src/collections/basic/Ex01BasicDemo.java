package collections.basic;

import java.util.HashSet;
import java.util.Set;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		Set<String> text = new HashSet<>();
		text.add("a");
		text.add("b");
		text.add("c");
		text.add(new String("b"));
		System.out.println("size: " +text.size());
		printf(text);
	}
	private static <E> void printf(Set<E> set){
		for(E e:set) {
			
		}
	}
}
