package sorting.object.type;

import java.lang.reflect.Array;
import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex07SortingWithStringAndCollator {
	public static void main(String[] args) {
		// support --> String
		// case sensitive ==> phân biệt hoa thường
		// case insensitive ==> không phân biệt hoa thường
		
		String[] text= {"B", "b", "A","ấ", "a", "Á", "á", "c", "C"};
		
		// default --> CS
		Arrays.sort(text, new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				// default --> CI
				return s1.compareToIgnoreCase(s2);
			}
		});
		
		ArrayUtils.printf("text", text);
		
		// JAVA collator 
		
		Collator collator = Collator.getInstance();
		collator.setStrength(Collator.PRIMARY);
		Arrays.sort(text, collator);
		ArrayUtils.printf("1.Primary", text);
		
		collator.setStrength(Collator.SECONDARY);
		Arrays.sort(text, collator);
		ArrayUtils.printf("2.Secondary", text);
		
		collator.setStrength(Collator.TERTIARY);
		Arrays.sort(text, collator);
		ArrayUtils.printf("3.Tertiary", text);
		
		collator.setStrength(Collator.IDENTICAL);
		Arrays.sort(text, collator);
		ArrayUtils.printf("4.Identical", text);
	}
}
