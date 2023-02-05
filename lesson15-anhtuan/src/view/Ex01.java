package view;

import java.util.Map;
import java.util.TreeMap;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,5,5,3,1};
		 Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
	        for (int i = 0; i < arr.length; i++) {
	            addElement(map, arr[i]);
	        }
	        System.out.println("xuat hien 1 lan");
	    for(Integer key: map.keySet()) {
	    	if(map.get(key)== 1) {
	    		System.out.print(key + " ");
	    		
	    	}
	    }
	    System.out.println();
	    System.out.println("xuat hien hon 1 lan");
	    for(Integer key: map.keySet()) {
	    	if(map.get(key) > 1) {
	    		System.out.print( key + " ");
	    	}
	    }
	    
	    
		
	}
	 public static void addElement(Map<Integer, Integer> map, int element) {
	        if (map.containsKey(element)) {
	            int count = map.get(element) + 1;
	            map.put(element, count);
	        } else {
	            map.put(element, 1);
	        }
	    }

}
