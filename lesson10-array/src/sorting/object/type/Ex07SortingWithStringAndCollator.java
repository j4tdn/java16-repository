package sorting.object.type;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex07SortingWithStringAndCollator {
	public static void main(String[] args) {
		//support string
		//case sensitive ==> phân biệt hoa thường
		// case insensitive => không phân biệt hoa thường
		String[] text = {"B", "b", "A", "ấ", "a", "c", "Á", "C"};
		
		//default --> CI
		Arrays.sort(text, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				//CI
				return s1.compareToIgnoreCase(s2); //k phân biêt hoa thường
			}
			
		});
		
		ArrayUtils.printf("Text", text);
		
		//3.Array collator
		Collator lollator = Collator.getInstance();
		lollator.setStrength(lollator.PRIMARY);
		Arrays.sort(text, lollator);
		ArrayUtils.printf("1. Primary", text);
		//1. Primary-->[A, a, Á, ấ, B, b, c, C]
		
		lollator.setStrength(lollator.SECONDARY);
		Arrays.sort(text, lollator);
		ArrayUtils.printf("2. SECONDARY", text);
		//2. SECONDARY-->[A, a, Á, ấ, B, b, c, C]
		
		lollator.setStrength(lollator.TERTIARY);
		Arrays.sort(text, lollator);
		ArrayUtils.printf("3. TERTIARY", text);
		//Text-->[A, B, C, a, b, c, Á, ấ]
		
		lollator.setStrength(lollator.IDENTICAL);
		Arrays.sort(text, lollator);
		ArrayUtils.printf("4. IDENTICAL", text);
		//4. IDENTICAL-->[a, A, Á, ấ, b, B, c, C]
		
		Arrays.sort(text);
		ArrayUtils.printf("Text", text);
		
		
	}
}
