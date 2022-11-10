package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01BasicRawTypeDemo {
	public static void main(String[] args) {
		// Before Jdk 1.5
		
		// raw type ====> KDl cần một generic type , mình ko khai baos generic type
		// -->raw type ===> tự hiểu nó là 1 Object
		List list = new ArrayList();
		list.add(16);
		list.add(10);
		list.add("abcd");
		// mình đem ra sài khi runner time dễ xảy ra lỗi
		for (Object object : list) {
			// System.out.println(Integer.parseInt(object.toString()));
		}
		
		//From JDK 1.5
		
		//List<E> ==>E ==> generc type
		List<Integer> number = new ArrayList<Integer>();
		number.add(210);
		

	}

}
