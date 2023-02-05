package working.reducing;

import java.util.List;

public class Ex01ReduceDemo {
	public static void main(String[] args) {
		//Find: sum; sub; max; min of all element in list, array
		//int[]
		//List<Integer>
		
		List<Integer> numberList = List.of(1,5,7,9);
		
		numberList.stream()//Stream<Integer>
		         // .reduce(0, (result,number)->result+number);

		.reduce(Integer.MIN_VALUE, (result,element)->result<element?element:result);
	    
		Integer max= numberList.stream()		//.reduce(0, Integer::sum);
				               .reduce(Integer.MIN_VALUE, Integer::min);
		System.out.println("max -->" +max);
	
	}

}
