package generic.method;

/*
 * Sau khi mình xử lý dữ liệu xong thì kết quả có thế trả về 
 * int[], Double[], Item[];
 * 
 * 
 * --> người dùng muốn in ra dữ liệu từ các cái mảng đó 
 */

public class Ex01GenericMethodWithArray {
	public static void main(String[] args) {
		
		Double[] dArray = {1d, 2d, 3d, 4d};
		String[] sArray = {"hello", "hi", "bello", "moshi"};
		Integer[] iArray = {2, 4, 6, 8};
		
		printArray("dArray", dArray);
		printArray("SArray", sArray);
		printArray("iArray", iArray);
		
		System.out.println("====================");
		
		printArrayGeneric("g --> dArray", dArray);
		printArrayGeneric("g --> SArray", sArray);
		printArrayGeneric("g --> iArray", iArray);
	}
	
	// E --> Generic type
	// Element --> Generic type --> compile(object)
	private static <Element> void printArrayGeneric(String prefix, Element[] elements) {
		System.out.print(prefix + " ---> ");
		for (Object element : elements) {
			System.out.print(element + " ");
		}
		System.out.println("\n");
	}
	
	private static void printArray(String prefix, Object[] arrays) {
		System.out.print(prefix + " ---> ");
		for (Object array : arrays) {
			System.out.print(array + " ");
		}
		System.out.println("\n");
	}
}
