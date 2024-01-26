package view;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex10LongestWord {
public static void main(String[] args) {
	String a ="fun&!! time";
	System.out.println(LongestWord(a));
}
public static String LongestWord(String sen) {
    
    String[] b = sen.split("\\s+|[^a-zA-Z\\s]");
    Map<String, Integer> map = new HashMap<String, Integer>();
    
    for(int i=0;i<b.length;i++) {
    	map.put(b[i], b[i].length());
    }
    int max =0;
    for(Map.Entry<String, Integer> element : map.entrySet()) {
    	if(element.getValue()>max) {
    		max = element.getValue();
    	}
    }
    for(Map.Entry<String, Integer> element : map.entrySet()) {
    	if(element.getValue()==max) {
    		return element.getKey();
    	}
    }
  return "0";
  }
}
