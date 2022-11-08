package sorting.object.type;

import java.text.Collator;
import java.util.Arrays;

import utils.ArraysUtils;

public class Ex07SortingWithStringAndCollater {
	// support String
	public static void main(String[] args) {
		String[] text= {"B", "b", "A", "a", "Á", "á", "c", "C"};

		Arrays.sort(text);
		ArraysUtils.printf("1.", text);
				
		Collator c = Collator.getInstance();
		c.setStrength(Collator.PRIMARY);
		Arrays.sort(text, c);
		ArraysUtils.printf("SECONDARY.", text);
				
		c.setStrength(Collator.SECONDARY);
		Arrays.sort(text, c);
		ArraysUtils.printf("SECONDARY", text);
				
		c.setStrength(Collator.TERTIARY);
		Arrays.sort(text, c);
		ArraysUtils.printf("TERTIARY.", text);
				
		c.setStrength(Collator.IDENTICAL);
		Arrays.sort(text, c);
		ArraysUtils.printf("IDENTICAL.", text);

	}

}
