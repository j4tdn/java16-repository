package view;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex03Topic2 {
	public static void main(String[] args) {
		System.out.println(getLevel(8));
		System.out.println(getLevel(5));
		System.out.println(getLevel(9));
		System.out.println(getLevel(20));
		int list[] = {8, 5, 9, 20};
		
		List<Integer> tmp = Arrays.stream(list).boxed().collect(Collectors.toList());
		tmp.sort((a, b) -> getLevel(a) - getLevel(b));
		System.out.println(tmp);
	}
	
	
	
	private static int getLevel(int n) {
		return (int) IntStream.range(1, n+1).filter(o -> n%o == 0).count();
	}
}
