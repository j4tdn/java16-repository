package utils;

import bean.Digit;

public class DigitUtils {
	public static Digit[] cropArray(Digit[] digits, int length) {
		Digit[] croppedDigits = new Digit[length];
		
		for (int i = 0; i < length; i++) {
			croppedDigits[i] = digits[i];
		}

		return croppedDigits;
	}

	public static void printf(Digit[] digits) {
		for (int i = 0; i < digits.length; i++) {
			System.out.println(digits[i]);
		}
	}
}
