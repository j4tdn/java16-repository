
	package view;

	import java.util.Scanner;

	public class Ex02RegisterAccount {
		public static void main(String[] args) {
			// Password requirements
			// 1. At least 8 characters
			// 2. At least 256 characters

			Scanner ip = new Scanner(System.in);
			System.out.println("Enter password: ");
			String password = ip.nextLine();

			boolean isPassed = false;
			try {
				isPassed = validate(password);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			if (isPassed) {
				System.out.println("create account successful");
			}
			System.out.println("finished");
			if (validate(password)) {
				System.out.println("Create account successful");
			}

			System.out.println("Create account successful");
			ip.close();
		}

		// throw new X;
		// X: compile excreption
		// --> vị trí khai báo hàm bắt buộc throws X
		// X: runtime excreption
		// --> vị trí khia báo hàm kh cần throws X
		private static boolean validate(String password) {
			int length = password.length();
			if (length < 8) {

				System.out.println("At least 8 characters");
				return false;

			}
			if (length > 256) {
				System.out.println("At most 256 characters");
				return false;
			}

			// at least one lower charactor
			boolean atLeastOneLowerLetter = false;
			for (int i = 0; i < length; i++) {
				if (Character.isLowerCase(password.charAt(i))) {
					atLeastOneLowerLetter = true;
					break;
				}
			}
			return atLeastOneLowerLetter;
		}
	}


