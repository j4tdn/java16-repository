package view;

import java.util.HashMap;
import java.util.Map;

public class Ex11RomanToInt {
	public static void main(String[] args) {
		String s = "MCMXCIV";
		System.out.println(romanToInt2(s));
		
	}

	public static int romanToInt(String s){
		int sum=0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		
		
		for(int i=s.length()-1;i>=0;i--) {
			if(i>0 && map.get(String.valueOf(s.charAt(i))).intValue()> map.get(String.valueOf(s.charAt(i-1))).intValue()) {
				sum += map.get(String.valueOf(s.charAt(i))).intValue()- map.get(String.valueOf(s.charAt(i-1))).intValue();
				i--;
			}
			else {
				sum += map.get(String.valueOf(s.charAt(i))).intValue();
			}
		}
		return sum;
	}
	
	
	public static int romanToInt2(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
	
		int sum =0;
		for(int i =s.length()-1;i >= 0;i--) {
			if(i > 0 && map.get(s.charAt(i))> map.get(s.charAt(i-1))) {
				sum += map.get(s.charAt(i)) - map.get(s.charAt(i-1));
				i--;
			}
			else {
				sum += map.get(s.charAt(i));
			}
		}
		
		return sum;
	}
}
