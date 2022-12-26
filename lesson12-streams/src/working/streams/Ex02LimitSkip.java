package working.streams;

import java.util.Arrays;
import java.util.Comparator;

public class Ex02LimitSkip {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,9,6,7};
		//Primitive stream--> IntStream, Double, Longstream
		//additional: sum, sub, mub, div, avg
		
		//tìm 3 số lớn nhất
		
		Arrays.stream(numbers).distinct()
		      .boxed()
		      .sorted(Comparator.reverseOrder())
		      .limit(3)
		      .forEach(n->System.out.println(n));
	}

}
