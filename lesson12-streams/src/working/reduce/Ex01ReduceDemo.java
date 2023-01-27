package working.reduce;

import java.util.List;

public class Ex01ReduceDemo {
	public static void main(String[] args) {
		List<Integer> numberList = List.of(1, 5 , 7 , 2);
		
		Integer sum = numberList.stream()
				// .reduce(0,(result , number) -> result + number);
				// .reduce(0, Ex01ReduceDemo::sum);
					.reduce(0, Integer::sum);
		System.out.println("sum --> " + sum);
		// numberList.stream()
		//	.reduce(0,(n1 ,n2) -> n1 + n2);
		//	.reduce(Integer.MIN_VALUE,
		//			(result ,element) -> result < element ? element : result);
		
		/*
		 T reduce (T identity , BinaryOperator)
		 	T result = identity;
		 	for(T element : this stream)
		 		result = accumulator.apply(result, element);
		 	return result;
		 }
		 
		 BinaryOperator <T>
		 	T apply (T t1, T t2);
		 */
	}
}
