package generic.method;

/*Sau khi mình xử lý dữ liệu xong thì kết quả trả về có thể là:
*Double[], String[], Item[], Integer[];
*
*--> người dùng muốn in ra dữ liệu từ các mảng đó
*/
public class Ex01GenericMethodWithArray {
	public static void main(String[] args) {

		Double[] dArray = { 1d, 2d, 3d, 4d };
		String[] sArray = { "hello", "halla", "hollo" };
		Integer[] iArray = { 2, 3, 2, 2, 2 };
		printArray("dArray", dArray);
		printArray("sArray", sArray);
		printArray("iArray", iArray);
		System.out.println("=================generic type==================\n");
		printArrayGeneric("dArray", dArray);
		printArrayGeneric("sArray", sArray);
		printArrayGeneric("iArray", iArray);
	}
	
	
	// Messi (Đặt tùy thích ) --> generic type --> compile(giống object)
	private static <Messi> void printArrayGeneric(String s, Messi[] array)
	{
		System.out.print(s + " ----> ");
		for(Messi item : array)
		{
			System.out.print(item + " ");
		}
		System.out.println("\n");
	}
	private static void printArray(String s, Object[] array)
	{
		System.out.print(s + " ----> ");
		for(Object item : array)
		{
			System.out.print(item + " ");
		}
		System.out.println("\n");
	}
}
