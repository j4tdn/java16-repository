package working.streams;

import java.util.Arrays;
import java.util.Comparator;

public class Ex02LimitSkip {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,9,6,7};
		//Primitive stream--> IntStream, Double, Longstream
		//Primitive stream hỗ trợ: sum, sub, mub, div, avg
		
		//tìm 3 số lớn nhất
		
		Arrays.stream(numbers)//trả về instream
		.distinct()//tìm các phần tử không trùng nhau và đưa vào stream
		      .boxed()//Stream<Interge>//để sort được và không phải tạo set
		      .sorted(Comparator.reverseOrder())
		      .limit(3)
		      .forEach(n->System.out.println(n));
	}

}
