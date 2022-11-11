package sorting.object.type;

import java.lang.reflect.Array;
import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex07SortingWithStringAndCollator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// support ----> String
		// case sensitive ==> phân biệt hoa thường
		// case insensitive ==> không phân biệt hoa thường
		
		String[] text = { "B", "b", "A", "a", "c", "C"};
		
		// default --> CS
		Arrays.sort(text, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareToIgnoreCase(o2);
			}
		
		});
		
		ArrayUtils.printf("text: ", text);
		
		// Java Collator ==> PRIMARY, SECONDARY, TERTIARY, IDENTICAL
		Collator collator = Collator.getInstance();
		collator.setStrength(collator.PRIMARY);
		Arrays.sort(text, collator);
		ArrayUtils.printf("1. PRIMARY: ", text);
	}

}
