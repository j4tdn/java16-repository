package sorting.object.type;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex07SortingWithStringAndCollator {
	public static void main(String[] args) {
		// chỉ support cho String
		String[] text= {"B", "b", "A", "a", "Á", "á", "c", "C", "Âì"};
		
		Arrays.sort(text);
		//phân biệt viết hoa và thường: case sensitive
		ArrayUtils.printf("text", text);
		
		//không phân biệt: case insensitive
		Arrays.sort(text, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				return s1.compareTo(s2);
			}
		} );
		ArrayUtils.printf("text", text);
		//sắp xếp có dấu<=> Java collator
		Collator collator= Collator.getInstance();
		collator.setStrength(Collator.PRIMARY);
		Arrays.sort(text, collator);
		
		collator.setStrength(Collator.SECONDARY);
		Arrays.sort(text, collator);
		ArrayUtils.printf("text with secondary", text);
		//text with secondary-->[A, a, �, �, ��, B, b, C, c]
		
		collator.setStrength(Collator.TERTIARY);
		Arrays.sort(text, collator);
		ArrayUtils.printf("text with tertiary", text);
		//text with tertiary-->[a, A, �, �, ��, b, B, c, C]
		
		collator.setStrength(Collator.IDENTICAL);
		Arrays.sort(text, collator);
		ArrayUtils.printf("text with identical", text);
		//text with identical-->[a, A, �, �, ��, b, B, c, C]
	}
	

}
