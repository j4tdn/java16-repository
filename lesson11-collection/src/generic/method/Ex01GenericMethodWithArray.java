package generic.method;

/**
 * Sau khi minh xu ly du lieu xong , ket qua co the tra ve
 * Doulbe[], String[], Item[] , Integer[];
 * 
 * --> Nguoi dung muon in ra du lieu tu cac mang do
 */
public class Ex01GenericMethodWithArray {
	public static void main(String[] args) {
		Double[] dArray = { 1d, 2d , 3d , 4d};
		String[] sArray = {"hello", "hallo"};
		Integer[] iArray = {2,4,4,2};
		
		printArray("dArray", dArray);
		printArray("sArray", sArray);
		printArray("iArray", iArray);
		
		printArrayGeneric("g --> dArray", dArray);
		printArrayGeneric("g --> sArray", sArray);
		printArrayGeneric("g --> iArray", iArray);
		
		
		
	}
	private static <Element> void printArrayGeneric(String prefix ,Element[] elements) {
		System.out.print(prefix +" --> ");
		for (Element element: elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	private static void printArray(String prefix ,Object[] array) {
		for (Object item:array) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
}
