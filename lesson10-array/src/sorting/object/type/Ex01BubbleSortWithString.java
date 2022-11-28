package sorting.object.type;

import common.NullOPtion;
import utils.ArrayUtils;

public class Ex01BubbleSortWithString {

	public static void main(String[] args) {
		String[] data = { "a1", "c3", "b2", "f4", "d5" };
		bubbleSort(data);
		ArrayUtils.printf("data", data);

		System.out.println("==================");

		data = new String[] { null, "a1", "c3", null, "b2", "f4", "d5", null };
		bubbleSort(data, NullOPtion.NULL_LAST);
		ArrayUtils.printf("data", data);
	}

	private static void bubbleSort(String[] elements) {

		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				// if (elements[i] > elements[i + 1]) trước lớn hơn sau nếu
				// ..>0; sau lớn hơn trước nếu ...<0
				if (elements[i].compareTo(elements[i + 1]) > 0) {

					String tmp = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = tmp;
				}
			}
		}
	}

	// null lasr, null first
    //handel Null value
	// NULL first
	// tăng dần-->NULL nằm đầu hặc cuối
	// giảm dần-->....................
	// làm NULL first, tăng dần
	//xử lý 2 việc: xếp NUll ở cuối hay đầu sau đó xếp phần tử theo tăng dần
	private static void bubbleSort(String[] elements, NullOPtion no) {

		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				String s1 =elements[i];
				String s2= elements[i+1];
				if(NullOPtion.NULL_FIRST.equals(no)) {
					//B1: tìm và đưa NULL về đầu
					//trái Null- phải khác--> để nguyên
					//trái khác-phải Null--> hoán vị
					if(s1==null) {
						continue;
					}//sure-->s1!= null
					if(s2==null) {

						String tmp = elements[i];
						elements[i] = elements[i + 1];
						elements[i + 1] = tmp;
						continue;
					}////sure-->s1!= null-s2!=null
				}else if(NullOPtion.NULL_LAST.equals(no)) {//null sau
					//nếu trái null phải khác null--> hoán vị
					//s1!=;s2=null--> không hoán vị
					if(s1==null&& s2!=null) {
						String tmp = elements[i];
						elements[i] = elements[i + 1];
						elements[i + 1] = tmp;
						continue;
					}//sure-->s1!= null
					if(s2==null) {
						continue;
					}
				}
				if (s1.compareTo(s2 ) > 0) {//tăng dần

					String tmp = elements[i];
					elements[i] = elements[i + 1];
					elements[i + 1] = tmp;
				}
			}
		}
	}
}
