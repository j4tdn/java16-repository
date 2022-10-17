package view;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Ex01Topic2 {
	public static void main(String[] args) {
		int a[] = {2, 8, 9, 1, 6};
		int b[] = {2, 1, 1, 8, 9};
		HashSet<Integer> h1 = (HashSet<Integer>) Arrays.stream(a).boxed().collect(Collectors.toSet());
		HashSet<Integer> h2 = (HashSet<Integer>) Arrays.stream(b).boxed().collect(Collectors.toSet());
		h1.retainAll(h2);
		System.out.println(h1);
	}
}
