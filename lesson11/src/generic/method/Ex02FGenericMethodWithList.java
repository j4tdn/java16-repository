package generic.method;

import java.util.Arrays;
import java.util.List;

/*
 * Sau khi xử lý dữ liệu xong, kết quả có thể trả về
 * List<Double>, List<String>, List<Item>
 * 
 *  -->người dùng muốn in ra dữ liệu từ các mảng đó 
 *  
 *  yêu cầu: chỉ được phép in ra các mảng là số
 *  Ideal --> tìm 1 super type of integer/long/double
 *  	sau đó gới hạn E bởi các super type()
 */
public class Ex02FGenericMethodWithList {
	public static void main(String[] args) {
		//new ArrayList<>()
		//--> Java.util.ArrayList --> array with dynamic size
		
		//Arrays.asList
		//--> Java.util.Arrays.ArrayList --> array with fix size
		List<Double> dList = Arrays.asList(1d, 2d, 3d, 4d);
		List<String> sList = Arrays.asList("hello", "haha", "hahaha", "hoho");
		List<Integer> iList = Arrays.asList(1, 2, 3, 4);
		
		printListGeneric("dlist",dList);
//		printListGeneric("slist",sList);
		printListGeneric("ilist",iList);
		
	}
	
	//<E> --> no limitation
	//<E extends Number> --> limit by number or sub type of number
	//<E extends CharSequences> --> limit by CharSequences or sub type of CharSequence   
	private static <E extends Number> void printListGeneric(String prefix,List<E> objects) {
		System.out.println(prefix+":"+"----->");
		for(E object : objects) {
			System.out.print(object+" ");
		}
		System.out.println();
	}
}