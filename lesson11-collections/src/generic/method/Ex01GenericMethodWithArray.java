package generic.method;

/*
 * Sau khi mình xử lý dữ liệu xong, kết quả có thể trả về 
 * Double[], String[], Item[];
 * 
 * --> Người dùng muốn in ra dữ liệu từ các mảng đó
 */
public class Ex01GenericMethodWithArray {
	public static void main(String[] args) {
		Double[] dArray = {1d, 2d, 3d, 4d};
		String[] sArray = {"hello", "halla", "hollo"};
		Integer[] iArray = {2, 4, 4, 2};
		
		printfArrayGeneric("dArray" , dArray);
		printfArrayGeneric("sArray" , sArray);
		printfArrayGeneric("iArray" , iArray);
	}
	
	private static <Element> void printfArrayGeneric(String prefix, Element[] elements) {
		System.out.println(prefix + " ---> ");
		for(Object element: elements) {
			System.out.println(element + " ");
		}
		System.out.println("\n");
	}
	
	private static void printfArray(String prefix, Object[] elements) {
		System.out.println(prefix + " ---> ");
		for(Object item: elements) {
			System.out.println(item + " ");
		}
		System.out.println("\n");
	}
}
