package work;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 7, 8, 8, 8, 6, 2, 2, 2, 2, 5, 1 };
		System.out.println(Arrays.stream(numbers).boxed().filter(o -> count(numbers, o) == 1).toList());
		System.out.println("max la " + max(numbers));
		System.out.println(number3rdLargest(numbers));
	}

	private static int count(int[] numbers, int count) {
		return (int) Arrays.stream(numbers).boxed().filter(o -> o == count).count();

	}

	private static float max(int[] input) {
		float first = input[0] / 2;
		float last = input[input.length - 1] / 2;

		return first > last ? first : last;
	}

	private static int number3rdLargest(int[] input) {
		return Arrays.stream(input).boxed().filter(deleteSameNumber(o -> o)).sorted((o1, o2) -> o1 - o2).toList()
				.get(3);
	}

	private static Predicate<Integer> deleteSameNumber(Function<Integer, Integer> num) {
		Set<Integer> set = new HashSet<>();
		return p -> set.add(num.apply(p)) == true;
	}

}
