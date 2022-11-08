package sorting.object.type;

import java.text.Collator;
import java.util.Arrays;

import utils.ArrayUtils;

public class Ex07SortingWithStringAndCollator {

	public static void main(String[] args) {
		String[] text= {"B", "b", "A", "a", "Á", "á", "c", "C"};
		Collator collator = Collator.getInstance();
		collator.setStrength(Collator.PRIMARY);
		Arrays.sort(text, collator);
		ArrayUtils.printf("1. Collator : PRIMARY   ", text);
		
		collator.setStrength(Collator.SECONDARY);
		Arrays.sort(text, collator);
		ArrayUtils.printf("2. Collator : SECONDARY ", text);
		
		collator.setStrength(Collator.TERTIARY);
		Arrays.sort(text, collator);
		ArrayUtils.printf("3. Collator : TERTIARY  ", text);
		
		collator.setStrength(Collator.IDENTICAL);
		Arrays.sort(text, collator);
		ArrayUtils.printf("4. Collator : IDENTICAL ", text);
	}

}
