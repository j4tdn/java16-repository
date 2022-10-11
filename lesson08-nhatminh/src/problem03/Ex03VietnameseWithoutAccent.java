package problem03;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03VietnameseWithoutAccent {
	public static void main(String[] args) {
		String str = getString();
		System.out.println("After convert(no accent Func1): " + getStringWithoutAccentWithExtLib(str));
		System.out.println("After convert(no accent Func2): " + getStringWithoutAccentNoExtLib(str));
	}

	private static String getString() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input name(can be Vietnamese): ");
		return sc.nextLine().trim();
	}

	public static String getStringWithoutAccentWithExtLib(String str) {
		String result = "";
		result = Normalizer.normalize(str, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(result).replaceAll("").replaceAll("Đ", "D").replaceAll("đ", "d");
	}

	private static String getStringWithoutAccentNoExtLib(String str) {
		str = str.replaceAll("[áàảãạăắằẳẵặâấầẩẫậ]", "a");
		str = str.replaceAll("[ÁÀẢÃẠĂẮẰẲẴẶÂẤẦẨẪẬ]", "A");
		str = str.replaceAll("[éèẻẽẹêếềểễệ]", "e");
		str = str.replaceAll("[ÉÈẺẼẸÊẾỀỂỄỆ]", "E");
		str = str.replaceAll("[óòỏõọôốồổỗộơớờởỡợ]", "o");
		str = str.replaceAll("[ÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢ]", "O");
		str = str.replaceAll("[íìỉĩị]", "i");
		str = str.replaceAll("[ÍÌỈĨỊ]", "I");
		str = str.replaceAll("[úùủũụưứừửữự]", "u");
		str = str.replaceAll("[ÚÙỦŨỤƯỨỪỬỮỰ]", "U");
		str = str.replaceAll("[ýỳỷỹỵ]", "y");
		str = str.replaceAll("[ÝỲỶỸỴ]", "Y");
		str = str.replaceAll("đ", "d");
		str = str.replaceAll("Đ", "D");
		return str;
	}
}
