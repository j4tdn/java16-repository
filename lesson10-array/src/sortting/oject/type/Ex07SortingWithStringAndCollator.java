package sortting.oject.type;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

import org.w3c.dom.Text;

import utils.ArrayUtils;

public class Ex07SortingWithStringAndCollator {
	public static void main(String[] args) {
		// support -->String
		// case sensitive ==> phân biệt hoa thường
		// case insensitive ==> không phân biệt hoa thường
		String[] text = { "B", "b", "A", "a", "C", "c" };
//defauls --> c5
		Arrays.sort(text, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				
				return s1.compareToIgnoreCase(s2);
			}
		});
		ArrayUtils.printf("text", text);
		//Java Collator ==> PRIMARY, SECONDARY, TETIARY, IDENTICAL
		Collator collator = Collator.getInstance();
		collator.setStrength(collator.PRIMARY);
		Arrays.sort(text, 0, 0, null);
	}
}
