package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Set;

public class Ex04 {
	public static void main(String[] args) {
		
		int[] arr = {3, 15, 21, 0, 15, 17, 21};
        System.out.println(Arrays.toString(getUniqueNumbers(arr)));
	
	}
	
	public static Object[] getUniqueNumbers(int[] arr) {
		Hashtable<Integer, Integer> my_dict = new Hashtable<Integer, Integer>();
		for (int i : arr) {
			if(my_dict.containsKey(i))
				my_dict.put(i, my_dict.get(i)+1);
			else
				my_dict.put(i, 1);
		}
		ArrayList<Integer> Rs = new ArrayList<Integer>();
		my_dict.forEach((k,v) -> {if(v == 1) Rs.add(k);});
		Rs.sort((o1, o2) -> o1 - o2);
		return Rs.toArray();
	}
}
