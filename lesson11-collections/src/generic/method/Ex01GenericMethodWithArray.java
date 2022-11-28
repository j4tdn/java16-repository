package generic.method;
/*
 * sau khi xử lý dữ liệu song, kết quả có thể trả về
 * Double[]; String[]; Item[]
 * 
 * người dùng muốn in ra dữ liệu từ các mảng đó
 */

public class Ex01GenericMethodWithArray {
	public static void main(String[] args) {
		Double[] dArray= {1d,2d,3d,4d};
		String[] sArray= {"hello", "hi", "olo"};
		Integer[] iArray= {2,4,4,2};
		printfArray("dArray",dArray);
		printfArray("sArray",sArray);
		printfArray("iArray",iArray);
		
		printfArrayGeneric("g-->dArray",dArray);
		printfArrayGeneric("g--->sArray",sArray);
		printfArrayGeneric("g-->iArray",iArray);
	}
	
	//E-->generic type
	//Element --> generic type
	private static <Element> void printfArrayGeneric(String prefix,Element[] elements) {
		System.out.println(prefix + "-->");
		for(Element element: elements) {
			System.out.print(element + " ");
		}
		System.out.println("\n");
	}
	private static void printfArray(String prefix,Object[] array) {
		System.out.println(prefix + "-->");
		for(Object item: array) {
			System.out.print(item + " ");
		}
		System.out.println("\n");
	}

}
