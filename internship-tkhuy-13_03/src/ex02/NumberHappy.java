package ex02;
public class NumberHappy {
	
		public static int loopNum(int number) {
			int result = 0;
			while (number > 0) {
				result += Math.pow(number % 10, 2);
				number /= 10;
			}
			return result;
		}

		public static boolean isHappyNum(int number) {
			int tmp = number;
			for (int i = 0; i < number; i++) {
				if (loopNum(tmp) == 1) {
					return true;
				}
				tmp = loopNum(tmp);
			}
			return false;
		}

		public static void main(String[] args) {
			int num = 19;
			System.out.println(isHappyNum(num));
		}
	}