package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex01 {
	   
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,1,2,3,5,7};
		isNumber(arr);
	}
	public static void isNumber(int arr[]) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("chu so "+entry.getKey()+" xuat hien "+ entry.getValue()+ " lan");
		}
		
	}
	 
	 
}
