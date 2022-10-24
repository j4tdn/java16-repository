package ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

import ex01.Student;

public class CommonElement {
	public static void main(String[] args) {
		Integer[] a = {2, 8 ,9, 1, 6};
		 Integer[] b = {2, 1, 1, 8, 9};
		Integer n[] = printUnion(a,b);
		printf(n);
		remove_Duplicate_Elements(n);
	}

	public static void remove_Duplicate_Elements(Integer arr[]){  
        // Chuyển mảng đã cho thành LinkedHashSet và xoá các phần tử trùng nhau
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(Arrays.asList(arr));
        
        // Chuyển LinkedHashSet lại trở về mảng 
        arr = hashSet.toArray(new Integer[0]);
        // In mảng kết quả
        System.out.println(Arrays.toString(arr));
    }
	public static Integer[] printUnion(Integer[] a, Integer[] b) {
		Integer[] rs  = new Integer[a.length];
		int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j])
                	rs[k++] = a[i];
            }
        }
        return Arrays.copyOfRange(rs, 0, k);
    }
	private static void printf(Integer[] a) {
		for (Integer arr : a) {
			System.out.println(arr);
			System.out.println("=======================");
		}
	}

}
