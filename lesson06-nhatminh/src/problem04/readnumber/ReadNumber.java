package problem04.readnumber;

import problem04.exception.WrongIntegerFormatException;

public class ReadNumber {
	private static String[] UNITS = { "đơn vị", "nghìn", "triệu", "tỉ", "nghìn tỉ", "triệu tỉ", "tỉ tỉ", "nghìn tỉ tỉ",
			"triệu tỉ tỉ", "tỉ tỉ tỉ" };
	private static String[] NUMS = { "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };

	public static void main(String[] args) {
		// POSITIVE
		readNumber("1241200000");
		readNumber("124120000");
		readNumber("123124000");
		readNumber("1230128409184091809184");
		readNumber("0");
		readNumber("4");
		readNumber("14");
		readNumber("25");
		readNumber("000000123");
		// NEGATIVE
		readNumber("-12300");
		readNumber("-12304");
		readNumber("-1230135");
		readNumber("-000123041");
		// WRONG INPUT
		readNumber("--123");
		readNumber("420-023");
		readNumber("asdlfjh");
	}

	/**
	 * Read number.
	 *
	 * @param n chuỗi số được đưa vào để đọc
	 */
	private static void readNumber(String n) {
		try {
			// Validate đầu vào
			if (!n.matches("-{0,1}\\d{1,}"))
				throw new WrongIntegerFormatException();
			boolean negativeNum = n.matches("-\\d*");
			// Xét tính âm dương
			if (negativeNum) {
				n = n.substring(1);
				System.out.print("-");
			}
			// Loại bỏ các số 0 ở đầu, trừ trường hợp đọc số 0
			int count = 0;
			for (int i = 0; i < n.length(); i++) {
				if (n.charAt(i) == '0')
					count++;
				else
					break;
			}
			if (count != n.length())
				n = n.substring(count);
			// In ra số đó có phân chia các phần nghìn
			printNum(n);
			int end = getEndOfReading(n);
			// In ra các đọc
			if (negativeNum)
				System.out.print("âm ");
			for (int i = 0; i <= end; i++)
				numToString(n, i, n.length() - i, end);
			System.out.println();
		} catch (WrongIntegerFormatException e) {
			System.out.println(n);
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Prints the num for easy reading.
	 *
	 * @param n
	 */
	private static void printNum(String n) {

		for (int i = 0; i < n.length(); i++) {
			System.out.print(n.charAt(i));
			if ((n.length() - i - 1) % 3 == 0 && i != n.length() - 1)
				System.out.print(',');
		}
		System.out.println();
	}

	/**
	 * Gets the end of reading.
	 *
	 * @param n
	 * @return the stop point of reading (VD:12000 thì EndOfReading là số 2, vì ta
	 *         không cần quan tâm 3 số 0 còn lại) => Bỏ đi phần số 0 bị thừa phía
	 *         sau
	 */
	private static int getEndOfReading(String n) {
		for (int i = 1; i < n.length(); i++)
			if (n.charAt(n.length() - i) != '0')
				return n.length() - i;
		return 0;
	}

	/**
	 * Prints the number.
	 *
	 * @param n           the n
	 * @param i           the i
	 * @param curPosition vị trí hiện tại đang trỏ tới theo chiều ngược lại (VD:
	 *                    1024 mà đang xét số 1 thì curPosition là 4)
	 * @param end         xác định n đã đến end chưa để in ra chữ nghìn/triệu/tỉ/...
	 *                    lần cuối nếu chưa được in (VD: 123,100,000 thì phải in ra
	 *                    123 triêu 100 nghìn. Nếu không có "end" thì chỉ đọc được
	 *                    123 triệu 1 trăm)
	 */
	private static void numToString(String n, int i, int curPosition, int end) {
		// HÀNG TRĂM
		// Nếu số 0 ở hàng trăm (có chữ số hàng chục hoặc hàng đơn vị VD:1,012 -> một
		// nghìn "không trăm"..., nếu là 1,000,012 thì 3 số 0 ở phần nghìn sẽ bỏ qua
		// luôn)
		if (curPosition % 3 == 0) {
			if (n.charAt(i) == '0' && (n.charAt(i + 1) != '0' || n.charAt(i + 2) != '0'))
				System.out.print("không trăm ");
			else if (n.charAt(i) != '0') {
				System.out.print(NUMS[Character.getNumericValue(n.charAt(i))] + " ");
				System.out.print("trăm ");
			}
		}
		// HÀNG CHỤC
		else if (curPosition % 3 == 2) {
			if (n.charAt(i) == '1')
				System.out.print("mười ");
			else if (n.charAt(i) == '0' && n.charAt(i + 1) != '0')
				System.out.print("linh ");
			else if (n.charAt(i) != '0') {
				System.out.print(NUMS[Character.getNumericValue(n.charAt(i))] + " ");
				System.out.print("mươi ");
			}
		}
		// HÀNG DƠN VỊ
		else if (curPosition % 3 == 1) {
			if (n.charAt(i) == '1' && i != 0 && n.charAt(i - 1) != '1' && n.charAt(i - 1) != '0')
				System.out.print("mốt ");
			else if (n.charAt(i) == '4' && i != 0 && n.charAt(i - 1) != '1')
				System.out.print("tư ");
			else if (n.charAt(i) == '5' && i != 0 && n.charAt(i - 1) != '0')
				System.out.print("lăm ");
			else if (n.charAt(i) != '0')
				System.out.print(NUMS[Character.getNumericValue(n.charAt(i))] + " ");
			// Trường hợp đọc duy nhất số 0
			else if (n.charAt(i) == '0' && i == 0)
				System.out.print("không ");
			// HÀNG NGHÌN, TRIỆU, TỈ,....
			if ((curPosition - 1) / 3 > 0)
				System.out.print(UNITS[(curPosition - 1) / 3] + " ");
		}
		// Nếu đã đọc đến end thì kiểm tra xem là đọc nghìn/triệu/tỉ/... chưa
		if (i == end && curPosition % 3 != 1 && (curPosition - 1) / 3 > 0)
			System.out.print(UNITS[(curPosition - 1) / 3] + " ");
	}
}