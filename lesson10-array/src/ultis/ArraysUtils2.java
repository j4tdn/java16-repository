package ultis;

import java.util.Arrays;

public class ArraysUtils2 {
	private ArraysUtils2() {
		
	}
	public static void printf(String prefix, Object[] object) {
		System.out.println(prefix + "-->" + Arrays.toString(object));
	}

}
