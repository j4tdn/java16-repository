package generic.type;

public class GenericTypeDemo {
	public static void main(String[] args) {

		IList<String> list = new JavaListImpl<>();
		list.add("A1");
		list.add("B2");
		list.add("C3");
		list.add("D4");
		
		System.out.println("=============================");
		
		
		
		IList<String> items = getItems(list);
		items.printf();
		
		System.out.println("size --> " + list.size());
		System.out.println("items --> " + items.size());
		
		
	}
	private static IList<String> getItems(IList<String> list)
	{
		IList<String> result = new JavaListImpl<>();
		list.forEach((element) -> {
			if(element.compareTo("Item A3") < 0)
			{
				result.add(element);
			}
		});
		return result;
	}
}
