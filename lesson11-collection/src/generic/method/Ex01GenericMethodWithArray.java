package generic.method;

/**
 * Sau khi mình xử lý dữ liệu xong, kết quả có thể trả về
 * Double[], String[], Item[], Integer[];
 *
 * --> Người dùng muốn in ra dữ liệu từ các mảng đó
 */
public class Ex01GenericMethodWithArray {
	public static void main(String[] args) {
		Double[] dArray = {1d, 2d, 3d, 4d};
		String[] sArray = {"hello", "halla", "hollo"};
		Integer[] iArray = {2, 4, 4, 2};
		
		printArray("dArray", dArray);
		printArray("sArray", sArray);
		printArray("iArray", iArray);
		
		printArrayGeneric("g --> dArray", dArray);
		printArrayGeneric("g --> sArray", sArray);
		printArrayGeneric("g --> iArray", iArray);
	}
	
	private static void printArray(String prefix, Object[] array) {
		System.out.print(prefix + " ---> ");
		for (Object item: array) {
			System.out.print(item + " ");
		}
		System.out.println("\n");
	}
	
	// E --> generic type
	// Element --> generic type --> compile(object)
	private static <Element> void printArrayGeneric(String prefix, Element[] elements) {
		System.out.print(prefix + " ---> ");
		for (Element element: elements) {
			System.out.print(element + " ");
		}
		System.out.println("\n");
	}
	
}