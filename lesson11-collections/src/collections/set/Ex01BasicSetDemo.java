package collections.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicSetDemo {
	//List: arrayList, LinkedList => get(i)
	// set(cấu trúc dữ liệu trng java define): add 1 phần tử => gọi đến map => thêm 1 key => k hỗ trợ get 
	public static void main(String[] args) {
		Set<String> text = new TreeSet<>(Comparator.reverseOrder());
		text.add("123456789");
		text.add("zzzzabc");
		text.add("abccc");
		text.add(new String("b")); //String có override hashcode & equal
		System.out.println("Size: " + text.size());
		prinf(text);
	}

	private static <E> void prinf(Set<E> set) {
		for(E e: set) {
			System.out.println(e);
		}
	}
}
