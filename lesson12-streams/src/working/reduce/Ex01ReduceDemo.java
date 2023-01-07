package working.reduce;

import java.util.List;

public class Ex01ReduceDemo {
	public static void main(String[] args) {
		List<Integer> numberList = List.of(1, 5, 7, 2);

		System.out.println("sum : " + numberList.stream().reduce(0, (n1, n2) -> n1 + n2));
		numberList.stream().reduce(0, (n1, n2) -> n1 + n2);
		numberList.stream().reduce(0, Integer::sum);
		/*
		 * Hàm reduce trong Java
		 * 
		 * T reduce (T identity , BinaryOperator{ t res = 0; for (T element : this
		 * stream) { res = accumulator.apply(res, element); } return res; }
		 * 
		 */

		System.out.println("min : " + numberList.stream()
		.reduce(Integer.MAX_VALUE, (n1, n2) -> {
			return n1 > n2 ? n2 : n1;
		}));
		numberList.stream().reduce(Integer.MAX_VALUE, Integer::min);
	}
}
