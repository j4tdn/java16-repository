package view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class De1Cau2 {
	public static void main(String[] args) {
		String tmp = "aaaaccdcec";
		Set<Entry<String, Integer>> tmp1 = Arrays.stream(tmp.split("")).collect(Collectors.toMap(o -> o, o-> 1 , (o1,  o2) -> o1 + 1, HashMap::new)).entrySet();
		int maxValue = tmp1.stream().max((o1,o2) -> Integer.compare(o1.getValue(), o1.getValue())).get().getValue();
		tmp1.stream().filter(o->o.getValue() == maxValue).forEach(o-> System.out.print(o.getKey()+", "));
	}
}
