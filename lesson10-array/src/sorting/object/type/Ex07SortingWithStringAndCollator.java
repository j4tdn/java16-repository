package sorting.object.type;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex07SortingWithStringAndCollator {
	public static void main(String[] args) {
		String[] text = {"B","C","a","b","A","c"};
		
		Arrays.sort(text, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// CI
				return s1.compareToIgnoreCase(s2);
			}
		});
		
		ArrayUtils.printf("khong phan biet hoa thuong", text);
		
		// Java Collator ==> PRIMARY, SECONDARY, TERTIARY, IDENTICAL
		Collator collator = Collator.getInstance();
		collator.setStrength(Collator.PRIMARY);
		Arrays.sort(text, collator);
		ArrayUtils.printf("1. PRIMARY", text);
	}
}
