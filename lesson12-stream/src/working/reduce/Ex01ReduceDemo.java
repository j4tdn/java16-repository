package working.reduce;

import java.util.List;

public class Ex01ReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numberList = List.of(1, 5, 7, 2);
		Integer num = numberList.stream()
								.reduce(Integer.MAX_VALUE, (a,b) -> a < b ? a : b);
		System.out.println(num);
	}

}
