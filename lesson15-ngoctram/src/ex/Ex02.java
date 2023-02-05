package ex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Ex02 {
	public static void main(String[] args) {
		String input = "aaaaccdcec";
		char[] inputAsCharArr = input.toCharArray();
		int[] intputAsIntArr = new int[input.length()];
		for(int i = 0 ; i < input.length(); i++){
			intputAsIntArr[i] = (int) inputAsCharArr[i];
		}
		
		Map<Long, List<Entry<Integer, Long>>> map = Arrays.stream(intputAsIntArr).boxed()
		.collect(Collectors.groupingBy(number -> number, Collectors.counting()))
		.entrySet().stream()
		.collect(Collectors.groupingBy((e) -> e.getValue()));
		
		map.forEach((count, listEntry) -> {
				System.out.print("Elements appearning " + count + " times : ");
				listEntry.forEach((e) -> {
					System.out.print(((char) e.getKey().intValue()) + ", ");
				});
				System.out.println();
			});

		Long maxCount = map.keySet().stream().reduce(0l, (count1, count2) -> {
			return (count1 < count2) ? count2 : count1;
		});
		
//		===============================================
		System.out.print("Therefore, elements appearing the most: ");
		map.entrySet().stream()
		.filter((e) -> {
			return e.getKey() == maxCount;
		})
		.map(Entry::getValue) //  Stream<List<Entry<Integer, Long>>> 
		.forEach((list) -> {
			for(Entry<Integer, Long> entry : list) {
				System.out.print(((char) entry.getKey().intValue()) + ", ");
			}
		});
	}
}
