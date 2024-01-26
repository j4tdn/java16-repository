package view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex05 {
public static void main(String[] args) {
	String s = "Hello";
	String s1 = reverseVowels(s);
	System.out.println(s1);
	
}
public static String reverseVowels(String s) {
	char[] s1 = s.toCharArray();
	Set<Character> vowels = new HashSet<>();
	vowels.add('a');
	vowels.add('e');
	vowels.add('i');
	vowels.add('u');
	vowels.add('o');
	vowels.add('A');
	vowels.add('E');
	vowels.add('I');
	vowels.add('U');
	vowels.add('O');
	
	List<Character> list = new ArrayList<>();
	
	for(char element : s.toCharArray()) {
		if(vowels.contains(element)) {
			list.add(element);
		}
	}
	
	int right = list.size()-1;
	
	for(int i =0; i<s1.length; i++) {
		if(vowels.contains(s1[i])) {
			s1[i] = list.get(right);
			right --;
		}
	}
    return new String(s1);
}
}
