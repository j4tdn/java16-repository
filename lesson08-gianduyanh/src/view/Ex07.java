package view;
//da
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex07 {
	public static void main(String[] args) {
		String da = "a";
		System.out.println(Arrays.toString(getLargestNumbers(da)));
	}

	private static String[] spitNumber(String s) {
		String[] da = s.split("[a-z]+");

		System.out.println("Spit number : " + Arrays.toString(da));

		return (String[]) da;
	}

	private static Object[] getLargestNumbers(String s) {
		Object[] da3 = Arrays.asList(spitNumber(s)).stream().filter(o -> !o.equals("")).toArray();

		BigInteger[] da4 = new BigInteger[da3.length];
		if (da3.length == 0) {
			return new BigInteger[] { BigInteger.ZERO };
		}
		for (int i = 0; i < da4.length; i++) {
			da4[i] = new BigInteger((String) da3[i]);
		}

		List<BigInteger> tmp = Arrays.asList(da4);
		tmp.sort(new Comparator<BigInteger>() {
			public int compare(BigInteger o1, BigInteger o2) {
				return o1.compareTo(o2);
			};
		});
		System.out.println("Sort Number : " + tmp);

		System.out.println("Bigest Number : " + tmp.get(tmp.size() - 1));

		return tmp.toArray();
	}

}
