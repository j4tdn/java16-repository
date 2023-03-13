package bean;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		int num = 0;
		int dem = 0;
		double recordednum = 0;
		int counter = 0;
		
		Scanner cs = new Scanner(System.in);
		num = cs.nextInt();
		dem = cs.nextInt();
		if (num % dem == 0) {
			System.out.println(num / dem);
		} else if (num % dem != 0) {
			for (int x = 0; x < num; x++) {
				num = num - dem;
				counter = counter + 1;

				if (num < 0) {
					num = num + dem;
					counter = counter - 1;
					recordednum = num;
				}

			}
			for (int x = 0; x < num; x++) {
				if ((num) % (num - x) == 0 && (dem) % (num - x) == 0) {
					num = (int) (num / (recordednum - x));
					dem = (int) (dem / (recordednum - x));

					if (counter == 0) {
						System.out.println(num + "/" + dem);

						break;
					}

					else {
						System.out.println(counter + " " + num + "/" + dem);

						break;
					}

				}

			}

		}
	}
}
