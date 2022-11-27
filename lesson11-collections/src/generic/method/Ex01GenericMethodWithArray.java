package generic.method;

/**
 * Sau khi mình xử lý dữ liệu xong, kết quả có thể trả về Double[], String[],
 * Item[]
 * 
 * --> Người dùng muốn in ra dữ liệu từ các mảng đó
 * 
 * @author Tan Phat
 *
 */
public class Ex01GenericMethodWithArray {
	public static void main(String[] args) {
		Double[] dArray = { 1d, 2d, 3d, 4d };
		String[] sArray = { "hello", "halla", "hollo" };
		Integer[] iArray = { 2, 4, 4, 2 };

		printArray("dArray", dArray);
		printArray("sArray", sArray);
		printArray("iArray", iArray);
		System.out.println("=========================");
		printArrayGeneric("dArray", dArray);
		printArrayGeneric("sArray", sArray);
		printArrayGeneric("iArray", iArray);
	}

	// E --> generic type
	// Element --> generic type --> compile(object)
	private static <Element> void printArrayGeneric(String prefix, Element[] elements) {
		System.out.print(prefix + " ---> ");
		for (Element element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	private static void printArray(String prefix, Object[] array) {
		System.out.print(prefix + " ---> ");
		for (Object item : array) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
}
