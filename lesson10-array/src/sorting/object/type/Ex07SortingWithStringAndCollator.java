package sorting.object.type;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex07SortingWithStringAndCollator {
	public static void main(String[] args) {
		//support----> String
		String[] text = {"B","b","a","A","d","C","â","á"};
		
		Arrays.sort(text,new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				
				return s1.compareToIgnoreCase(s2);
			}
		});
		
		ArrayUtils.printf("text", text);
		//java collator
		Collator collator = Collator.getInstance();
		collator.setStrength(Collator.PRIMARY);
		
		Arrays.sort(text, collator);
		ArrayUtils.printf("1.PRIMARY", text);
		
	}

}
