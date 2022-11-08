package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArraysUtils;

public class Ex04AvailableSortWithString {

	public static void main(String[] args) {
		String[] da = { "a1", "xx", "a2", "7", "e5", "b6" };

		// 1 sorting sequnces ascending
		Arrays.sort(da);
		ArraysUtils.printf(" 1 .sequences : ", da);

		// comparator --> sorting asc/desc - handle null/ non-null values
		Arrays.sort(da, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}

		});

		ArraysUtils.printf("2 . sequences : ", da);

		// sorting sequences ascending and NULL first
		da = new String[] { null, "a1", "c3", null, "b2", "e5", null };
		Arrays.sort(da, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1 == null && o2 != null) {
					return -1;
				}
				if (o2 == null) {
					return 1;
				}
				return o1.compareTo(o2);
			}

		});
		ArraysUtils.printf(" 3. sequences : ", da);

	}

}
