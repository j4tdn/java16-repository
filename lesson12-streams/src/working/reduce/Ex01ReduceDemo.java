package working.reduce;

import java.util.List;

public class Ex01ReduceDemo {
	public static void main(String[] args) {
		// Find sum, sub, max, min of all element in list, array
		// int[]
		// List<Integer>
		List<Integer> numberList = List.of(1, 5, 7, 2);

		System.out.println(numberList.stream().reduce(0, (result, number) -> result + number));
		System.out.println(numberList.stream().reduce(0, Integer::sum));
		System.out.println(
				numberList.stream().reduce(Integer.MIN_VALUE, (result, number) -> (result > number) ? result : number));
		System.out.println(numberList.stream().reduce(Integer.MIN_VALUE, Integer::max));
		// T reduce (T identity, BinaryOperator<T> accumulator){
		// T result = 0;
		// for(T element : this stream)
		// result = accumulator.apply(result, element);
		// return result;
		// }

		// BinaryOperator<T>
		// T apply (T t1, T t2);
	}

	private static Integer sum(Integer x1, Integer x2) {
		return x1 + x2;
	}
}
