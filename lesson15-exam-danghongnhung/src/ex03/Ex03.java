package ex03;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex03 {
	public static void main(String[] args) {
		String string = "aaaababbbddc";
		
		Map<Character, Long> charactes = string.chars()
				.mapToObj(ch -> (char)ch) 
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		 long maxTimes = Collections.max(charactes.values());
		 
		 Map<Character, Long> highestMapTimes = new HashMap<>();
		 
		 charactes.forEach((key, value) -> {
	            if (value == maxTimes) {
	                highestMapTimes.put(key, value);
	            }
	      });
	      System.out.println(highestMapTimes);
	}

}
