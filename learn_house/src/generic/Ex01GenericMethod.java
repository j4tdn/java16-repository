package generic;

public class Ex01GenericMethod {
	public static void main(String[] args) {
		Integer[] intergers= {1,2,3,4,5,6};
		Double[] doubles = {1.1d,2.2d,3.3d,4.4d,5.5d};
		String[] strings = {"con", "ca","phai", "ngu"};
		printf(intergers);
		printf(doubles);
		printf(strings);
		
		System.out.println("======================");
		
		printfwGeneric(intergers);
		printfwGeneric(doubles);
		printfwGeneric(strings);
	}
	private static <Element> void printfwGeneric(Element[] elemets) {
		for(Element elemet : elemets) {
			System.out.println(elemet + " ");
		}
		System.out.println();
	}
	private static void printf(Object[] objects) {
		for(Object object : objects) {
			System.out.println(object + " ");
		}
		System.out.println();
		
	}

}
