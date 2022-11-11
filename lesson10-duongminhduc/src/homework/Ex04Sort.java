package homework;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04Sort {

	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "&&!#@^#@", "a", "c", "b", "xx" };

		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if ((s1 == null && s2 != null)) {
					return 1;// hoán đổi
				}
				if (s2 == null) {
					return -1;
				}
				if (s1.matches("-?\\d+") && s2.matches("-?\\d+")) {
					return Integer.compare(Integer.valueOf(s1), Integer.valueOf(s2));
				}
				return s1.compareTo(s2);
			}
		});
		System.out.println("Ascending: " + Arrays.toString(strings));//tăng dần
		System.out.println();
		  for (int i = 0, j = strings.length - 1; i < j; i++, j--){
	            /*Tạo biến temp và tiến hành hoán đổi phần tử*/
	            String temp = strings[i];
	            strings[i]  = strings[j];
	            strings[j] = temp;
	        }

		  System.out.println("Descending: " + Arrays.toString(strings));//giảm dần

	}
}
