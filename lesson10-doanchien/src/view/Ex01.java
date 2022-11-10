package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		Integer[] arr1 = {1,9,5,36,12,33,12,5};
		Integer[] arr2 = {1,2,2,33,4};
		removeDuplicateElements(arr1, arr1.length);
		removeDuplicateElements(arr2, arr2.length);
		findThirdMaxValue(arr2);
		
		
		
		
	}
	/*Tạo phương thức xoá phần tử trùng trong mảng Java*/
    public static void removeDuplicateElements(Integer arr[], int n){  
        // Chuyển mảng đã cho thành LinkedHashSet và xoá các phần tử trùng nhau
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(Arrays.asList(arr));
        
        // Chuyển LinkedHashSet lại trở về mảng 
        arr = hashSet.toArray(new Integer[0]);
        // In mảng kết quả
        System.out.println(Arrays.toString(arr));
    }
    public static void findThirdMaxValue(Integer arr[]) {
    	HashSet<Integer> mySet = new HashSet<Integer>();
		for (int val : arr) {
			mySet.add(val);
		};
		Object[] arrTmp = mySet.toArray();
		System.out.println(arrTmp[arrTmp.length-3]);
    }
	
}
