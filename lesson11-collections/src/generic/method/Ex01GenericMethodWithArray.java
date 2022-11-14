package generic.method;

/*
 * Sau khi mình xử lý dữ liệu xong, kết quả có thể trả về kiểu Integer[], Double[], String[]
 * --> Người dùng muốn in ra dữ liệu từ các mảng đó
 */
public class Ex01GenericMethodWithArray {
	public static void main(String[] args) {
		Double[] dArray = {1d, 2d, 3d, 4d};
		String[] sArray = {"hello", "halla", "hollo"};
		Integer[] iArray = {2,4,4,2};
		printArray("Integer", iArray);
		printArray("String", sArray);
		printArray("Double",dArray);
		
		printArrayGeneric("g --> sArray", sArray);
		printArrayGeneric("g --> iArray", iArray);
		printArrayGeneric("g --> dArray", dArray);
	}
	// E --> generic type
	// Element --> generic type --> compile(object)
	private static <Element> void printArrayGeneric(String prefix, Element[] elements) {
		System.out.print(prefix + " --> ");
		for (Element element: elements) {
			System.out.print(element + " ");
		}
		System.out.println("\n");
	}
	
	private static void printArray(String prefix, Object[] arrays) {
		System.out.print(prefix + " --> ");
		for (Object item: arrays) {
			System.out.print(item + " ");
		}
		System.out.println("\n");
	}
}
