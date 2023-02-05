package problem01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex01ListNumberApp {
	public static void main(String[] args) {
		List<Integer> input = getInput();

		getNumsAppear1Time(input).stream().forEach(item -> System.out.print(item + " "));
		System.out.println("\n================");
		getNumsAppearManyTimes(input).stream().forEach(item -> System.out.print(item + " "));
	}

	private static List<Integer> getInput() {
		List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);
//		List<Integer> input = Arrays.asList(5, 7, 9, 10, 20, 9, 7, 7, 11);
		return input;
	}

	private static List<Integer> getNumsAppear1Time(List<Integer> input) {
		List<Integer> result = new ArrayList<>();
		Map<Integer, Long> counterList = input.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		result = counterList.entrySet().stream().filter(item -> item.getValue() == 1).map(Entry::getKey)
				.collect(Collectors.toList());
		return result;
	}

	private static List<Integer> getNumsAppearManyTimes(List<Integer> input) {
		List<Integer> result = new ArrayList<>();
		Map<Integer, Long> counterList = input.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		result = counterList.entrySet().stream().filter(item -> item.getValue() > 1).map(Entry::getKey)
				.collect(Collectors.toList());
		return result;
	}
}
