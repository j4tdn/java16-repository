package generic.method;

//Sau khi xử lý dữ liệu xong, kết quả có thể trả về
//Double[], String[], Item[], Integer[]

//Người dùng muốn in ra dữ liệu từ các mảng đó
public class Ex01GenericMethodWithArray {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Double[] dArray = { 1d, 2d, 3d, 4d };
		String[] sArray = { "Hello", "Halla", "Hollo" };
		Integer[] iArray = { 2, 4, 4, 2 };

		printArray("dArray", dArray);
		printArray("sArray", sArray);
		printArray("iArray", iArray);

		printArrayGeneric("g --> dArray", dArray);
		printArrayGeneric("g --> sArray", sArray);
		printArrayGeneric("g --> iArray", iArray);
	}

	// E --> generic type
	// Element --> generic type --> compile(object)
	private static <Element> void printArrayGeneric(String prefix, Element[] array) {
		System.out.print(prefix + " --> ");
		for (Element element : array)
			System.out.print(element + " ");
		System.out.println();
	}

	private static void printArray(String prefix, Object[] array) {
		System.out.print(prefix + " --> ");
		for (Object item : array)
			System.out.print(item + " ");
		System.out.println();
	}
}
