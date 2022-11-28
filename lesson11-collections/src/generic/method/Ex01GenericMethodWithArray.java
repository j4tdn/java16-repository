package generic.method;

/*
 *  Sau khi mình sử lý dữ liệu xong, kết quả có thể trả về
 *  Double[], String[], Item[];
 *  
 *  --> Người dùng muốn in ra dữ liệu từ các mảng đó
 */
public class Ex01GenericMethodWithArray {

	public static void main(String[] args) {

		Double[] dArray = { 1d, 2d, 3d, 4d };
		String[] sArray = { "hello", "halla", "hollo" };
		Integer[] Array = { 2, 4, 4, 2 };

		printArray("dArray" + dArray);
		printArray("sArray" + sArray);
		printArray("Array" + Array);

		printArrayGeneric("dArray" + dArray);
		printArrayGeneric("sArray" + sArray);
		printArrayGeneric("Array" + Array);
	}

	private static <Element> void printArrayGeneric(String prefix, Element[] elements) {
		System.out.println(prefix + " --> ");

		for (Element element : elements) {
			System.out.println(element + " ");
			System.out.println("\n");
		}
	}

	private static void printArray(String prefix, Object[] array) {
		System.out.println(prefix + " --> ");
		for (Object item : array) {
			System.out.println(item + " ");

		}
		System.out.println("\n");
	}
}
