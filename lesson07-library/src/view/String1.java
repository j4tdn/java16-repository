package view;

import java.util.HashMap;
import java.util.stream.IntStream;

public class String1 {
	static HashMap<Character, Integer> count = new HashMap<Character, Integer>();
	static int max = Integer.MIN_VALUE;
	static String rs = "";
	public static void main(String[] args) {
		String s1 = "sdjshfuitghjddjbfhdgdd";
		
		s1.chars().forEach(o -> { 
			if(count.containsKey((char)o)) {
				count.put((char)o, count.get((char)o) + 1);
			}else {
				count.put((char)o, 1);
			}
		});
		//System.out.println(count);
		count.forEach((k,v) -> {
			if(v > max) {
				max = v;
				rs = String.valueOf(k);
			}
		});
		System.out.println(rs);
	}
}
