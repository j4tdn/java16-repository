package generic.type;

public class GenericTypeDemo {
	public static void main(String[] args) {
		IList<String> list = new JavaListImpl<>();
		list.add("Item A");
		list.add("Item B");
		list.add("Item C");
		list.add("Item D");
		IList<String> items = getItems(list);
		items.printf();
		
		System.out.println("size -> " + list.size());
		System.out.println("items -> " + items.size());
	}
	
	private static IList<String> getItems(IList<String> list){
		IList<String> result = new JavaListImpl<>();
		list.forEach((element) -> {
			if (element.compareTo("Item C") < 0) {
				result.add(element);
			}
		});
		return result;
	}
}
