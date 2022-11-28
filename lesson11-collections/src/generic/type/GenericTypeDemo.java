package generic.type;

public class GenericTypeDemo {

	public static void main(String[] args) {
		CustomArrayList<String> list1 = new CustomArrayList<>();
        list1.add("11");
        list1.add("12");
        list1.add("14");
        list1.add("15");
        list1.add("16");
        list1.add("17");
        
        list1.forEach(p->{
			if(p.compareTo("16") < 0)
				System.out.print(p + " ");
		});
	}
	
	public static CustomArrayList<String> getItem(CustomArrayList<String> list){
		CustomArrayList<String> list1 = new CustomArrayList<>();
		list.forEach(p->{
			if(p.compareTo("16") < 0)
				list1.add(p);
		});
		return list1;
	}

}
