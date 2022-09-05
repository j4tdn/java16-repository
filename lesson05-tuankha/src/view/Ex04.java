package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Set;

public class Ex04 {
	public static void main(String[] args) {
		
		int[] arr = {3, 15, 21, 0, 15, 17, 21};
        System.out.println(Arrays.toString(getUniqueNumbers(arr)));
	
	}
	
	public static int[] getUniqueNumbers(int[] arr) {
		Hashtable<Integer, Integer> my_dict = new Hashtable<Integer, Integer>();
		
		for (int i : arr) {
			if(my_dict.containsKey(i))
				my_dict.put(i, my_dict.get(i)+1);
			else
				my_dict.put(i, 0);
		}
		
		System.out.println(my_dict);
		
		Object[] keys = my_dict.keySet().toArray();
		ArrayList<Integer> arrTmp = new ArrayList<Integer>();
		for (Object object : keys) {
			if(my_dict.get(object) == 0) {
				arrTmp.add((int)object);
			}
		}
		int[] rs = new int[arrTmp.size()];
		for (int i = 0; i < rs.length; i++) {
			rs[i] = arrTmp.get(arrTmp.size()-1-i);
		}
		
		return rs;
	}
}
