package sorting.object.type;

import utils.ArrayUtils;

public class Ex01BubbleSort {
	
	private enum NullOption{
		NULL_FIRST,
		NULL_LAST
	}
	
	public static void main(String[] args) {
		String[] data = {"a", "c", "b", "f", "d"};
		bubbleSort(data, NullOption.NULL_FIRST);

		ArrayUtils.printf("didits", data);
		System.out.println("==============");
		data = new String[]{null, "a", "c", null, "b", "f", "d", null};
		bubbleSort(data, NullOption.NULL_LAST);
		ArrayUtils.printf("didits", data);
		
		
	}
	
	private static void bubbleSort(String[] element, NullOption no) {
		for (int i = 0; i < element.length; i++) {
			for (int j = 0; j < element.length - i - 1; j++) {
				if(NullOption.NULL_FIRST.equals(no)) {
					if(element[j] == null) continue;
					if(element[j+1] == null) {
						String tmp = element[j];
						element[j] = element[j+1];
						element[j+1] = tmp;
						continue;
					}
				}
				else if(NullOption.NULL_LAST.equals(no)) {
					if(element[j+1] == null) continue;
					if(element[j] == null) {
						String tmp = element[j+1];
						element[j+1] = element[j];
						element[j] = tmp;
						continue;
					}
				}
				
				if(element[j].compareTo(element[j+1]) > 0) {
					String tmp = element[j];
					element[j] = element[j+1];
					element[j+1] = tmp;
				}
			}
		}
	}
}
