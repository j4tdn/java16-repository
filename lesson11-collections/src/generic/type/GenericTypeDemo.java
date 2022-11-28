package generic.type;

import java.util.function.Predicate;

public class GenericTypeDemo {
	public static void main(String[] args) {
		IList<String> list = new JavaListImpl<>();
		list.add("Item A1");
		list.add("Item B2");
		list.add("Item C3"); // size = 3
		list.add("Item D4"); // size = 4
		list.add("Item D5"); // size = 5
		
		IList<String> list1 = new JavaListImpl<>();
		list1.add("Item A1");
		list1.add("Item B2");
		list1.add("Item C3"); // size = 3
		list1.add("Item D4"); // size = 4
		list1.add("Item D5"); // size = 5
		
		IList<String> items = getItems(list);
		items.printf();
		
		list.printf();
		list.remove("Item A1");
		list.printf();
		System.out.println("size ---> " + list.size());
		System.out.println("items ---> " + items.size());
		
		
		
		int count = list.count(new Predicate<String>() {
			
			@Override
			public boolean test(String s) {
				return s.compareTo("Item B2") > 0;
			}
		});
		
		count = list.count(s -> s.compareTo("Item B2") > 0);
		count = list.count(s -> s.contains("B2"));
		System.out.println("count ---> Cac phan tu > Item B2: " + count);
		list.remove(2);
		list.printf();
		list.addAll(list1);
		list.printf();
		list.removeIf(s -> s.contains("Item"));
		list.printf();
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
