package problem02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex02CharApp {
	public static void main(String[] args) {
		List<String> input = getInput();

		List<String> result = getTheMostAppearingChars(input);
		for (int i = 0; i < result.size() - 1; i++)
			System.out.print(result.get(i) + ", ");
		System.out.print(result.get(result.size() - 1));
	}

	private static List<String> getInput() {
//		String input = "aaaababbbddc";
		String input = "aaaaccdcec";
		List<String> inputProcessed = Arrays.asList(input.split(""));
		return inputProcessed;
	}

	private static List<String> getTheMostAppearingChars(List<String> input) {
		List<String> result = new ArrayList<>();
		Map<String, Long> counterList = input.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Long maxCount = counterList.entrySet().stream().map(Entry::getValue).sorted(Comparator.reverseOrder())
				.findFirst().orElse(null);
		result = counterList.entrySet().stream().filter(item -> item.getValue() == maxCount).map(Entry::getKey)
				.collect(Collectors.toList());
		return result;
	}
}
