package horse;
	import java.util.Random;
	import java.util.Scanner;

	public class HorseSaddle {
		static int r, l;
		static int[][] arr;

		public static void main(String[] args) {
			input();
			output();
		}

		public static void input() {
			Scanner ip = new Scanner(System.in);
			Random rd = new Random();
			System.out.print("Input row: ");
			r = ip.nextInt();
			System.out.print("Input column: ");
			l = ip.nextInt();
			arr = new int[r][l];
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < l; j++)
					arr[i][j] = 1 + rd.nextInt(99);
			}
		}

		public static void output() {
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < l; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}

	}
