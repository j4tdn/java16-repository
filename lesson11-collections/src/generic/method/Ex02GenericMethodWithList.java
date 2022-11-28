package generic.method;
/*
 * sau khi xử lý dữ liệu song, kết quả có thể trả về
 *List<Double>; List<String>; List<Item>
 * 
 * người dùng muốn in ra dữ liệu từ các mảng đó
 * chỉ được phép in ra các mảng có KDL là số
 * 
 * ==> tìm 1 cái Super type of(kiểu dữ liệu cha của) Integer/Long/Double
 * sau đó giới hạn E bởi cái (kiểu dữ liệu cha đó)super type đó --> Number
 *
 *comparable:dùng để sorting
 */

import java.util.Arrays;
import java.util.List;

public class Ex02GenericMethodWithList {
	public static void main(String[] args) {
		// new ArrayList<>() --> import từ java.util.ArrayList-> array with dynamic size
		List<Double> dList = Arrays.asList(1d,2d,3d);//array fixed size--> không thể add; remove ...
		//dList.add(123d);
		System.out.println(dList);
		List<String> sList = Arrays.asList("hello","hi", "lol");
		List<Integer> iList = Arrays.asList(1,2,3);
		printListGeneric("dList", dList);
		//printListGeneric("sList", sList);
		printListWildCard("iList", iList);
	}
	//chỉ được phép in ra các mảng có KDL là số
	private static void printListWildCard(String prefix,List<? extends Number> objects) {
		System.out.println(prefix + "-->");
		for(Number object: objects) {
			System.out.print(object + " ");
		}
		System.out.println("\n");
	}
	//E --> no limittation
	//E extends Number--> limit by Number(Number or sub types of Number)
	//E extends CharSequence--> limit by CharSequence(CharSequence or sub types of String)
	
	private static <E extends Number>void printListGeneric(String prefix,List<E> objects) {
		System.out.println(prefix + "-->");
		for(E object: objects) {
			System.out.print(object + " ");
		}
		System.out.println("\n");
	}

}
/*
 * List<Object>-->Object chỉ là tham số--> bắt buộc truyền vào đối tượng
 * phải truyền vào List<Object>
 * private static void printList(String prefix,List<Object> objects) {
 * System.out.println(prefix + "-->"); for(Object object: objects) {
 * System.out.print(object + " "); } System.out.println("\n"); }
 * 
 */
