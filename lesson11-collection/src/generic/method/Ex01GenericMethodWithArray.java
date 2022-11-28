package generic.method;

/*
 * Sau khi mình xử lý dữ liệu xong, kết quả có thể trả về 
 * Double[],String[],Item[],Integer[]
 * 
 * -->Người dùng muốn in ra dữ liệu từ mảng đó 
 */
public class Ex01GenericMethodWithArray {
	public static void main(String[] args) {
		Double[] dArray = { 1d, 2d, 3d, 4d };
		String[] sArray = { "hello", "halla", "hollo" };
		Integer[] iArray = { 2, 4, 4, 2 };

		prinf("dArray", dArray);
		prinf("sArray", sArray);
		prinf("iArray", iArray);

		prinfArrayGeneric("g --> dArray ", dArray);
		prinfArrayGeneric("g --> sArray ", sArray);
		prinfArrayGeneric("g --> iArray ", iArray);

	}

	private static void prinf(String prefix, Object[] array) {
		System.out.println(prefix + " --> ");
		for (Object item : array) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

	// E -->generic type
	// Element --> generic type
	private static <Element> void prinfArrayGeneric(String prefix, Element[] elements) {
		System.out.println(prefix + " --> ");
		for (Element element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
