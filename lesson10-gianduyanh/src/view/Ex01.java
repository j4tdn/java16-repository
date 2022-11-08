package view;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(numbers));
		System.out.println("max la " + max(numbers));
		System.out.println(Arrays.stream(numbers).boxed().filter(o -> count(numbers, o) == 1).toList());
		
		System.out.println(number3rdLargest(numbers));
	}

	private static int count(int[] numbers, int count) {
		return (int) Arrays.stream(numbers).boxed().filter(o -> o == count).count();

	}

	private static float max(int[] input) {
		float first = 0;
		float last = 0;
		int mid = (0 + input.length) / 2;
		System.out.println(mid);
		if (input.length % 2 == 0) {
			for (int i = 0; i < mid; i++) {
				first += input[i];
			}
			first = first / mid;
			for (int i = mid; i <= input.length - 1; i++) {
				last += input[i];
			}
			last = last / mid;
		} else {
			for (int i = 0; i <= mid - 1; i++) {
				first += input[i];
			}
			first = first / mid;
			for (int i = mid + 1; i <= input.length - 1; i++) {
				last += input[i];
			}
			last = last / mid;

		}
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

