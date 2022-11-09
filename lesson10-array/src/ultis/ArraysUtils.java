package ultis;

import java.util.Arrays;

public class ArraysUtils {
	private ArraysUtils() {
		
	}
	public static void printf(String prefix, int[] object) {
		System.out.println(prefix + "-->" + Arrays.toString(object));
	}

}
