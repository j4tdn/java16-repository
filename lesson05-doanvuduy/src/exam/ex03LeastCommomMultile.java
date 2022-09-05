package exam;

public class ex03LeastCommomMultile {

	public static int getLeastCommonMultiple(int[] elementArray) {
		int lcm = 1;
		int divisor = 2;

		while (true) {
			int counter = 0;
			boolean divisible = false;

			for (int i = 0; i < elementArray.length; i++) {

				if (elementArray[i] == 0) {
					return 0;
				} else if (elementArray[i] < 0) {
					elementArray[i] = elementArray[i] * (-1);
				}
				if (elementArray[i] == 1) {
					counter++;
				}

				if (elementArray[i] % divisor == 0) {
					divisible = true;
					elementArray[i] = elementArray[i] / divisor;
				}
			}

			if (divisible) {
				lcm = lcm * divisor;
			} else {
				divisor++;
			}

			if (counter == elementArray.length) {
				return lcm;
			}
		}
	}

	public static void main(String[] args) {
		int[] elementArray = { 2, 3, 4, 5, 6 };
		System.out.println(getLeastCommonMultiple(elementArray));
	}
}
