package bean;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 5, 5, 3, 1, 1 };
		System.out.println(Arrays.stream(numbers).boxed().filter(o -> count(numbers, o) == 1).toList());
		System.out.println(Arrays.stream(numbers).boxed().filter(o -> count(numbers, o) > 1).toList());
		Set<Integer> set = new HashSet<>();
		List<Integer> list = Arrays.stream(numbers).boxed().filter(o -> count(numbers, o) > 1).toList();
		for (Integer list1 : list) {
			set.add(list1);
		}
		System.out.println(set);
	
	}

	private static int count(int[] numbers, int count) {
		return (int) Arrays.stream(numbers).boxed().filter(o -> o == count).count();

	}

	
	

	private static Predicate<Integer> deleteSameNumber(Function<Integer, Integer> num) {
		Set<Integer> set = new HashSet<>();
		return p -> set.add(num.apply(p)) == true;
	}

}
