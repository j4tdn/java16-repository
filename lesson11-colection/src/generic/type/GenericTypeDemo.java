package generic.type;


public class GenericTypeDemo {
	public static void main(String[] args) {
		Ilist<String> list = new JavaListImpl<String>();
		list.add("Item A1");
		list.add("Item B2");
		list.add("Item C3");
		list.add("Item D4");
		list.add("Item E5");
		list.printf();
		
		
		Ilist<String> items = getItems(list);
		items.printf();
		System.out.println(list.size());
		System.out.println(items.size());
	}
	private static Ilist<String> getItems(Ilist<String> list){
		Ilist<String> result = new JavaListImpl<>();
		list.forEach((element) -> {
			if(element.compareTo("Item C3") <= 0) {
				result.add(element);
			}
		});
		return result;
	}

}
