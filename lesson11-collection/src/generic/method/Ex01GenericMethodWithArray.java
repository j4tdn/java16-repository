package generic.method;

public class Ex01GenericMethodWithArray {
	/*
	 * Sau khi minhf xu ly du lieeu xong,
	 * 
	 */
	public static void main(String[] args) {
		Double[] dArray = { 1d, 2d, 3d, 4d };
		String[] sArray = { "hello", "1", "2" };
		Integer[] iArray = { 2, 3, 5, 8 };
		printArray("double", dArray);
		printArrayGenerc("String", sArray);

	}

	private static void printArray(String prefix, Object[] arr) {
		System.out.println(prefix + " -->");
		for (Object item : arr) {
			System.out.print(item + "");
		}
		System.out.println("\n");
	}

	private static <Element> void printArrayGenerc(String prefix, Element[] arr) {
		System.out.println(prefix + " -->");
		for (Element item : arr) {
			System.out.print(item + " ");
		}
		System.out.println("\n");
	}
}
