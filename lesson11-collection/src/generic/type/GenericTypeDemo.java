package generic.type;

public class GenericTypeDemo {
	public static void main(String[] args) {
		IList<String> list = new JavaListImpl<>();
		list.add("Item A");
		list.add("Item B");
		list.add("Item C");
		list.add("Item D");
		
		list.add("Item E1");
		list.add("Item E2");
		list.printf();
		IList<String> items = getItem(list);
		items.printf();
		System.out.println("size --->" +items.size());
		System.out.println("size --->" +list.size());
		
	}
	private static IList<String> getItem(IList<String> list){
		IList<String> rs = new JavaListImpl<>();
		list.forEach((element)->{
			if(element.compareTo("Item C") > 0) {
				rs.add(element);
			}
		});
		return rs;
	}
}
