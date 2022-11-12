package sorting.object.type;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex07SortingWithStringAndCollator {
	public static void main(String[] args) {
		// support -----> String
		// case senstive ==> phân biệt hoa thường
		// case insenstive ==> không phân biệt hoa thường

		String[] text = { "B", "a", "A", "C", "c", "a" };
		
		// default --> CS
		Arrays.sort(text, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// CI
				return s1.compareToIgnoreCase(s2);
			}
		});
		
		ArrayUtils.printf("text", text);
		
		// Java Collator
		Collator collator = Collator.getInstance();
		collator.setStrength(Collator.PRIMARY);
		Arrays.sort(text,collator);
		ArrayUtils.printf("1. PRIMARY", text);
		
		collator.setStrength(Collator.SECONDARY);
		Arrays.sort(text,collator);
		ArrayUtils.printf("1. SECONDARY", text);
		
		collator.setStrength(Collator.TERTIARY);
		Arrays.sort(text,collator);
		ArrayUtils.printf("1. TERTIARY", text);
		
		collator.setStrength(Collator.IDENTICAL);
		Arrays.sort(text,collator);
		ArrayUtils.printf("1. IDENTICAL", text);
		
	}
}
