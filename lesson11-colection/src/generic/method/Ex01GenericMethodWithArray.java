package generic.method;
/*
 * sau khi mình xử lí dữ liệu xong, kết quả có thể trả về
 * Double[], String[], Integer[]
 * --> Người dùng muốn in ra dữ liệu từ các mảng đó
 */

public class Ex01GenericMethodWithArray {
	public static void main(String[] args) {
		Double[] dArray = {1d, 2d, 3d, 4d};
		String[] sArray = {"helli", "halla", "hollo"};
		Integer[] iArray = {2,4,4,2};
		
		printfArrayGeneric("g-->dArray", dArray);
		printfArrayGeneric("g-->sArray", sArray);
		printfArrayGeneric("g-->iArray", iArray);
	}
	//E-->generic type
	private static <E>void printfArrayGeneric(String prefix, E[] e) {
		System.out.print(prefix + "-->");
		for(E item:e) {
			System.out.println(item+" ");
		}
		System.out.println();
	}
	private static void printfArray(String prefix, Object[] o) {
		System.out.print(prefix + "-->");
		for(Object item:o) {
			System.out.println(item+" ");
		}
		System.out.println();
	}

}
