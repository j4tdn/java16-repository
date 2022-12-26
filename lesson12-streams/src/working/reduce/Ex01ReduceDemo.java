package working.reduce;

import java.util.List;

public class Ex01ReduceDemo {
	public static void main(String[] args) {
		//dung reduce khi khùng 1 hàm ...
		List<Integer> numberList = List.of(1,5,7,2);
		Integer sum = numberList.stream()
		.reduce(0, Integer::sum);
		
		Integer sum1 = numberList.stream()
				.reduce(0, Ex01ReduceDemo::sum);
		System.out.println("sum: " + sum);
		
		numberList.stream()
		.reduce(Integer.MIN_VALUE, (result, element) -> result < element ? element : result);
		

		Integer max = numberList.stream()
		.reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println("Max: " + max);
		
	}
	
	private static Integer sum(Integer x1, Integer x2) {
		return x1 + x2;
		
	}

}
