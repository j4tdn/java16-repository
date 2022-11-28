package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex04AvailableSortWithString {
	public static void main(String[] args) {
		String[] sequences = { "a1", "c3", "b2", "e5", "d4" };
        //1. sort mặc định tăng dần
		Arrays.sort(sequences);
		ArrayUtils.printf("1.sequenxes asc ", sequences);
		// 2.sort giảm dần(desc)

		// comparator--> xắp xếp tăng giảm - handle null/ non-null value
		Arrays.sort(sequences, new Comparator<String>() {

			// Comparator/compare(String s1, String s2)
			// --> mergeSort--> if(compate(s1, s2)>0) ==> swap==> tăng dần(asc)
			@Override
			public int compare(String s1, String s2) {
				// default: mặc định
				// return s1.compareTo(s2);//tăng dần
				return s2.compareTo(s1);// nếu s2 > s1 trả về dương==> giảm dần
				// sau lớn hơn trước thì hoán vị
				// case. (-1)*s1.compareTo(s2
			}
		});
		ArrayUtils.printf("2.sequenxes asc ", sequences);

		// handle null value
		sequences = new String[] { null, "a1", "c3", null, "b2", "e5", "d4", null };
		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if (s1 == null && s2 != null) {
					return -1;
				} // s1!= null
				if (s2 == null) {
					return 1;
				}
				return s1.compareTo(s2);
			}
		});
		ArrayUtils.printf("3.sequenxes asc and null first", sequences);
	}
}
