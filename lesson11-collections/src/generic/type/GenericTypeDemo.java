package generic.type;

import java.util.function.Consumer;

public class GenericTypeDemo {
	public static void main(String[] args) {
		IList<String> list = new JavaListImpl<>();
		list.add("Item A1");
		list.add("Item B2");
		list.add("Item C3");
		list.add("Item D4");
		list.add("Item E5");
		
		list.printf();
		
		System.out.println("===============");
		
		IList<String> items = getItems(list);
		items.printf();
		
		System.out.println("size ---> " + list.size());
		System.out.println("items ---> " + items.size());
	}
	
	private static IList<String> getItems(IList<String> list) {
		IList<String> result = new JavaListImpl<>();
		list.forEach((element) -> {
			if (element.compareTo("Item C3") < 0) {
				result.add(element);
			}
		});
		return result;
	}
}
