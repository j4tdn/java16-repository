package generic.method;

import java.util.Arrays;
import java.util.List;

/*
 * Sau khi xử lý dữ liệu xong, kết quả có thể trả về
 * Double[], String[], Item[]
 * 
 *  -->người dùng muốn in ra dữ liệu từ các mảng đó 
 */

public class Ex01GenericMethodWithArray {
	public static void main(String[] args) {
		Double[] dArray = {1d, 2d, 3d, 4d};
		String[] sArray = {"Hello", "haha", "hahaha", "hoho"};
		Integer[] iArray = {2, 4, 4, 2};
		
		printArray("dArray",dArray);
		printArray("sArray",sArray);
		printArray("iArray",iArray);
		System.out.println("===============");
		printGeneric("g  dArray",dArray);
		printGeneric("g  sArray",sArray);
		printGeneric("g  iArray",iArray);
		
		List<Double> dList = Arrays.asList(1d, 2d, 3d, 4d);
		List<String> sList = Arrays.asList("hello", "haha", "hahaha", "hoho");
		List<Integer> iList = Arrays.asList(1, 2, 3, 4);
		
		printListWildCard("dlist",dList);
//		printListGeneric("slist",sList);
		printListWildCard("ilist",iList);
	}
	
	//E-->Generic type --> complie(object)
	private static <E> void printGeneric(String prefix,E[] elements) {
		System.out.println(prefix+":"+"--->");
		for(E element : elements) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
	private static void printArray(String prefix,Object[] array) {
		System.out.println(prefix+":"+"--->");
		for(Object item : array) {
			System.out.print(item+" ");
		}
		System.out.println();
	}
	
	private static void printListWildCard(String prefix,List<? extends Number> objects) {
		System.out.println(prefix+":"+"----->");
		for(Number object : objects) {
			System.out.print(object+" ");
		}
		System.out.println();
	}
	
}
