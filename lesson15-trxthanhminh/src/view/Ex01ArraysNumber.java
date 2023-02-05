package view;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Ex01ArraysNumber {
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 5, 5, 3, 1, 7, 9, 1, 5};
		
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            addNumber(map, numbers[i]);
        }
        System.out.println("Cac phan tu xuat hien 1 lan trong mang la: ");
        for(Integer key: map.keySet()) {
        	if(map.get(key)== 1) {
        		System.out.print(key + ", ");
    		
        	}
        }
        System.out.println();
        
        System.out.println("Cac phan tu xuat hien nhieu hon 1 lan trong mang la: ");
        for(Integer key: map.keySet()) {
        	if(map.get(key)> 1) {
        		System.out.print(key + ", ");
        	}
        }
	}
	
	public static void addNumber(Map<Integer, Integer> map, int number) {
        if (map.containsKey(number)) {
            int count = map.get(number) + 1;
            map.put(number, count);
        } else {
            map.put(number, 1);
        }
    }
}
