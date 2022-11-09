package sorting.object.type;

import ultis.ArraysUtils2;

public class Ex01BubleSortWithString {
	private enum NullOption{
		NULL_FIRST,
		NULL_LAST
	}
	public static void main(String[] args) {
		String[] data = {"a1" , "c3", "b2", "f5", "d4"};
		
		ArraysUtils2.printf("data", data);
		data = new String[]{null, "a1" , "c3",null, "b2", "f5", "d4",null};
		
		bubbleSort(data, NullOption.NULL_LAST);
		ArraysUtils2.printf("", data);
	}
	private static void bubbleSort(String[] ele, NullOption no) {
		for(int round = 0; round < ele.length; round++) {
			for(int i = 0; i <ele.length - round - 1; i++) {
				String s1 = ele[i];
			    String s2 = ele[i+1];
				if(NullOption.NULL_FIRST.equals(no)) {
					if(s1 == null) {
						continue;
					}
					if(s2 == null) {
						String tmp = ele[i];
						ele[i] = ele[i+1];
						ele[i+1] = tmp;
						continue;
					}
				}else if(NullOption.NULL_LAST.equals(no)) {
					if(s2 == null) {
						continue;
					}
					if(s1 == null) {
						String tmp = ele[i];
						ele[i] = ele[i+1];
						ele[i+1] = tmp;
						continue;
					}
				}
				
				
				
				
				if(ele[i].compareTo(ele[i+1]) > 0) {
					String tmp = ele[i];
					ele[i] = ele[i+1];
					ele[i+1] = tmp;
				}
		}
	}

}
}
