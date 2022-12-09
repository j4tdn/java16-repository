package generic.type;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTypeDemo {
	public static void main(String[] args) {
		IList<String> list = new JavaListImpl<>();
		list.add("Item A");
		list.add("Item B");
		list.add("Item C");
		list.add("Item D");
		IList<String> items = getItems(list);
		items.add("Item C");
		items.add("Item D");
		items.printf();
		System.out.println("===========================");
		list.printf();
		System.out.println("===========================");
		list.removeIf(s -> s.compareTo("Item C") < 0);
		list.printf();

//		System.out.println("size -> " + list.size());
//		System.out.println("items -> " + items.size());
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);

		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next()); // next() -> return the current element
		}
		// iterator() is overrided in ArrayList type, but hasn't been overrided in
		// IList, so we can't call this method in items

	}

	private static IList<String> getItems(IList<String> list) {
		IList<String> result = new JavaListImpl<>();
		list.forEach((element) -> {
			if (element.compareTo("Item C") < 0) {
				result.add(element);
			}
		});
		return result;
	}

}
