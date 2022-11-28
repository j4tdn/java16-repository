package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02AListStringType {
	public static void main(String[] args) {
		// interface: list-->
		// implementation(2 lớp thực thi chính) : ArrayList & LinkList

		List<String> sequences = new ArrayList<>();
		sequences.add("A1"); // index=0;
		sequences.add("B2");
		sequences.add("C3");
		sequences.add("D4");
		System.out.println("size: " + sequences.size());//size: lấy số các phần tử
		loop(sequences);

		sequences.set(1, "B99");

		System.out.println("element[1] --> " + sequences.get(1));

		sequences.remove(0);// remove bằng chỉ số index
		sequences.remove("D4");// bằng giá trị phần tử
		loop(sequences);// B99--C3

		sequences.add("E4");
		sequences.add("F5");
		sequences.add("G6");
		loop(sequences);

		removeIf(sequences, item -> item.compareTo("C") < 0);
		System.out.println("==========================");
		loop(sequences);

		sequences.removeIf(s -> s.compareTo("F") < 0);
		loop(sequences);

		sequences.add("A1");
		sequences.add("A2");
		sequences.add("A3");
		loop(sequences);
		
		// khi goi hàm remove thì Duyệt từng phần tử trong sequences
				// kiểm tra nếu có phần tử nào sequences[i].equals("A2") --> true
				// else --> false(kiểm tra giá trị sequences thứ i so cánh với A2)
		System.out.println("is A2 existed --> " + sequences.contains("A2"));
		
		sequences.remove("A2");//
		
		System.out.println("is A2 existed --> " + sequences.contains("A2"));

		// sequences.remove("D4")
		// sequences.contains("D4")
		
		// ĐANG DÙNG INTERFACE
		/*
		 * Condition c1 = new Condition() {--->lamda
			
			@Override
			public boolean test(String element) {

				return element.compareTo("G")<0;
			}
		};
		 */
		//Condition c1 = (String element) -> element.compareTo("C")<0;
		//item nhận each ở dưới truyền lên
		removeIf(sequences, item -> item.compareTo("C")>0);
	}

	//ConcurrentModificationException
	// khi 1 phần tử đang thao tác/ xử lý bởi 1 process
	// không thể được truy cập bởi process khác
	// strategy pattern
	private static boolean removeIf(List<String> elements, Condition c) {
		/*
		 * for(String element: elements){
         if(element.compareTo(“E”)>0){
         elements.remove(element);}

		 */
		Iterator<String> iterator = elements.iterator();
		//cho phép duyệt từng phần tử trong elements
		while (iterator.hasNext()) {//duyệt tới đâu->kiểm tra; có rồi mới xóa
			
			String each = iterator.next();//lấy ra/duyệt các phần tử
			//System.out.println(each);
			// if(each.compareTo("F")<0) { xóa F trở về trước
			// test(each)--> strategy method--> phải tìm công thức và do bên ngoài truyền vào
			
			if (c.test(each)) {
				iterator.remove();
			}

		}
		return true;
	}
	// test là 1 hàm trừu tượng-->không thể truyền hàm trực tiếp--> truyền qua 1 hàm trung gian
//truyền 1 biến chứa hàm trừu tượng bên trong--> interface
	private static void loop(List<String> elements) {
		System.out.println("--------------------------");
		for (String element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
// có thể dùng interface, abstract class
//interface có 1 hàm trừu tượng-->@FunctionalInterface--> dùng lamda
@FunctionalInterface
interface Condition {// 1 tham số String truyền vào, trả về true false
	boolean test(String element);
}
