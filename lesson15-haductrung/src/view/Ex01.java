package view;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> numbers1 = Arrays.asList(1 ,2 ,3 ,4 ,5 ,6 ,5 ,5 ,3 ,1);
		Map<Integer, Integer> convert1 = toMap(numbers1);
		List<Integer> number2 =Arrays.asList(5 ,7, 9, 10, 20, 9, 7, 7, 11);
		Map<Integer, Integer> convert2 = toMap(number2);
		
		convert1.entrySet().stream().forEach(t -> {
			if (t.getValue() == 1)
				System.out.print(t.getKey() + " ");
		});
		System.out.println();
		convert2.entrySet().stream().forEach(t->{
			if(t.getValue()>1)
				System.out.print(t.getKey() +" ");
		});
	}
	private static Map<Integer, Integer> toMap(List<Integer> number) {
		Map<Integer, Integer> result = new HashMap<>();
		for (Integer i : number) {
			if (result.containsKey(i)) {
				result.put(i, result.get(i) + 1);
			} else {
				result.put(i, 1);
			}
		}
		return result;
	}
}