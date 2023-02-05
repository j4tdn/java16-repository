package problem03;

import java.util.HashSet;
import java.util.Set;

public class Ex03HappyNumberTest {
	public static void main(String[] args) {
		int num = 28;
		System.out.println(num + " is HappyNumber? " + happyNumberTest(num));
	}

	private static boolean happyNumberTest(int n) {
		Set<Integer> appearedSet = new HashSet<>();
		while (true) {
			int size = appearedSet.size();
			appearedSet.add(n);
			int sumOfPow = 0;
			if (appearedSet.size() != size) {
				while (true) {
					if (n > 0)
						sumOfPow += processing(n % 10);
					else
						break;
					n /= 10;
				}
			} else {
				return false;
			}
			if (sumOfPow == 1)
				return true;
			n = sumOfPow;
		}
	}

	private static int processing(int n) {
		return n * n;
	}

}
