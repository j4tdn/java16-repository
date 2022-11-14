package generic.type;

public class genericTypeDemo {

	public static void main(String[] args) {
		IList<String> list = new JavaListImpl<>();
		IList<String> items = getItems(list);
		list.add("Item A1");
		list.add("Item B2");
		list.add("Item C3");
		list.add("Item D4");
		list.add("Item E5");
		
		System.out.println("size --> " + list.size());
	}
	private static IList<String> getItems(IList<String> list){
		IList<String> result = new JavaListImpl<>();
		list.forEach((element) -> {
			if (element.compareTo("Item C3") < 0) {
				result.add(element);
			}
		});
		return result;
	}
	
}
