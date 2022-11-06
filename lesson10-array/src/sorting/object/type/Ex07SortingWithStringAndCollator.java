package sorting.object.type;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex07SortingWithStringAndCollator {
	public static void main(String[] args) {
		// Support ---> String
		// CS : case sensitive -> distinguish between upper letters and lower letters
		// CI : case insensive -> ...
		String[] text= {"B", "b", "A", "a", "ม", "แ", "c", "C", "ย์"};
		Arrays.sort(text); // => text-->[A, B, C, a, b, c, ม, แ]
		
		Arrays.sort(text, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// CI
				return s1.compareToIgnoreCase(s2);
			}
			
		});
		// => [A, a, B, b, c, C, ม, แ]
		
		// Java Collator -> used for alphabet in specific nations
		Collator collator = Collator.getInstance();
		collator.setStrength(Collator.PRIMARY);
		Arrays.sort(text, collator);
		ArrayUtils.printf("text with primary", text);
		
		collator.setStrength(Collator.SECONDARY);
		Arrays.sort(text, collator);
		ArrayUtils.printf("text with secondary", text);
		
		collator.setStrength(Collator.TERTIARY);
		Arrays.sort(text, collator);
		ArrayUtils.printf("text with tertiary", text);
		
		collator.setStrength(Collator.IDENTICAL);
		Arrays.sort(text, collator);
		ArrayUtils.printf("text with identical", text);
	}
}
