package bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex02 {
	
	public static void main(String[] args) {
		String s = "aaaababbbddc";
		String s1 = "aaaaccdcec";
		List list = new ArrayList<>();
		
		for (int i = 0; i < s.length() - 1; i++) {
			
			if(s.charAt(i) == s.charAt(i + 1) ) {
				
				list.add(s.charAt(i));
			}
			
		}
		maX(list);

	}
	
	public static void maX(List list) {
		int max = -99;
		int count = 0;
		for (int i = 0; i < list.size() -1 ; i++) {
			if(list.get(i).equals(list.get(i + 1))) {
				count++;
				
				if(count > max) {
					max = count;
					if(max == count) {
						System.out.println(list.get(i));
						break;
					}
				}
				
			}
		}
	}
	
	
	

}
