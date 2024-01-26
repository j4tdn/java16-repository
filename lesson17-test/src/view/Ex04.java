package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex04 {
	public static void main(String[] args) {
		int[] nums = new int[] {0,1,2,2,4,4,1};
		//System.out.println(majorityElement(nums));
		System.out.println(mostFrequentEven(nums));
	}

	public static List<Integer> majorityElement(int[] nums) {
		List<Integer> result = new ArrayList<>();

		int count1 = 0;
		int boundary = nums.length / 3;

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			} else {
				map.put(nums[i], 1);
			}
		}
		// duyet tung phan tu trong map
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"  "+ entry.getValue());
			if(entry.getValue()>boundary) {
				result.add(entry.getKey());
			}
		}
		return result;
	}
	
public static int mostFrequentEven(int[] nums) {
	List<Integer> result = new ArrayList<>();
	
	Map<Integer, Integer> map = new HashMap<>();
	for(int i=0;i<nums.length;i++) {
		if(map.containsKey(nums[i])) {
			map.put(nums[i], map.get(nums[i]) +1);
		}
		else {
			map.put(nums[i], 1);
		}
	}
	int max =0;
	for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
		if(entry.getValue()>max) {
			max = entry.getValue();
		}
	}
	System.out.println(max);
	for(Map.Entry<Integer, Integer> entry : map.entrySet()){
		System.out.println(entry.getKey()+"  "+ entry.getValue());
		if(entry.getKey()%2 == 0 && entry.getValue() == max) {
			result.add(entry.getKey());
		}
	}
	
	if(result.isEmpty()) {
		return -1;
	}
	Collections.sort(result);
	return result.get(0);
	
    }
}
