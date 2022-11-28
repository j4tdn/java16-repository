package generic.method;

/**
 * Sau khi xử lý dữ liệu xong kết quả có thể trả về 
 * int[], Double[], Item[]
 * 
 * --> người dùng muốn in ra kq từ mảng đó
 */

public class Ex01GenericMethodWithArray {
	public static void main(String[] args) {
		Double[] dArray = {1d, 2d, 3d, 4d};
		String[] sArray = {"s1", "s2", "s3", "s4"};
		Integer[] iArray = {2, 4, 4, 2};
		
		printArray("dArray", dArray);
		printArray("sArray", sArray);
		printArray("iArray", iArray);
		
		System.out.println("=================");
		
		printArrayGeneric("g-dArray", dArray);
		printArrayGeneric("g-sArray", sArray);
		printArrayGeneric("g-iArray", iArray);
		
	}
	
	private static <E> void printArrayGeneric(String prefix, E[] Es) {
		System.out.print(prefix + "--> : ");
		for (Object item : Es) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
	
	
	private static void printArray(String prefix, Object[] arr) {
		System.out.print(prefix + "--> : ");
		for (Object item : arr) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
}
