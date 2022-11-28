package sorting.object.type;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex07SortingWithStringAndCollator {
	public static void main(String[] args) {
		// support ----> String
		// case sensitive ==> phân biệt hoa thường
		// case insensitive ==> không phân biệt hoa thường
		
		String[] text = {"B", "b", "A", "ấ", "a", "Ấ", "ร", "รก", "c", "Á", "C" };
		
		// default --> CS
		Arrays.sort(text, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// CI
				return s1.compareToIgnoreCase(s2);
			}
		});
		
		ArrayUtils.printf("text", text);
		
		// Java Collator ==> PRIMARY, SECONDARY, TERTIARY, IDENTICAL
		Collator collator = Collator.getInstance();
		collator.setStrength(Collator.PRIMARY);
		Arrays.sort(text, collator);
		ArrayUtils.printf("1. PRIMARY", text);
		// PRIMARY --> [A, a, Á, ấ, B, b, c, C, ร, รก]
		
		collator.setStrength(Collator.SECONDARY);
		Arrays.sort(text, collator);
		ArrayUtils.printf("2. SECONDARY", text);
		
		collator.setStrength(Collator.TERTIARY);
		Arrays.sort(text, collator);
		ArrayUtils.printf("3. TERTIARY", text);
		// a, A, Á, ấ, Ấ, b, B, c, C, ร, รก]
		
		collator.setStrength(Collator.IDENTICAL);
		Arrays.sort(text, collator);
		ArrayUtils.printf("4. IDENTICAL", text);
		
		
		
	}
}
