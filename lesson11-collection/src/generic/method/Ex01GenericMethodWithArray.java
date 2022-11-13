package generic.method;

/*
 * Sau khi xu ly du lieu xong, ket qua maybe tra ve 1 mang int[], double[], String[], Integer[]
 * -> ng dung muon in ra danh sach ket qua du lieu tu cac mang do
 * 
 * (*) Y/c: chi duoc phep in ra cac mang la so -> Integer, Double, Long, ... 
 * Idea : Tim 1 super type of Integer/Double/Long/...
 * 		  sau do gioi han E boi super type do
 */
public class Ex01GenericMethodWithArray {
	public static void main(String[] args) {
		Double[] dArray = { 1d, 2d, 3d, 4d };
		String[] sArray = { "Hello", "Hallo", "Hollo" };
		Integer[] iArray = { 2, 4, 4, 2 };
		printArray("dArray", dArray);
		printArray("sArray", sArray);
		printArray("iArray", iArray);
		
		printArray_Generic("g -> dArray", dArray);
//		printArray_Generic("g -> sArray", sArray); // compile error with E extends Number
		printArray_Generic("g -> iArray", iArray);
	}

	private static void printArray(String prefix, Object[] array) {
		System.out.print(prefix + ": ");
		for (Object item : array) {
			System.out.print(item + "   ");
		}
		System.out.println();
	}
	
	// we can use E or Element or sth u want
	// <E> -> no limitation
	// <E extends Number> --> limit by Number (Number or sub types of Number)
	private static <E extends Number> void printArray_Generic(String prefix, E[] array) {
		System.out.print(prefix + ": ");
		for (Object item : array) {
			System.out.print(item + "   ");
		}
		System.out.println();
	}
}
