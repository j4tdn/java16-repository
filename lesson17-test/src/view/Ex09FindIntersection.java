package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex09FindIntersection {
public static void main(String[] args) {
	String[] strArr = new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
	/*
	 * String[] arr1 = strArr[0].split(","); String[] arr2 = strArr[1].split(",");
	 * 
	 * 
	 * 
	 * Set<String> set1 = new HashSet<String>(); for(int i=0;i<arr1.length;i++) {
	 * set1.add(arr1[i]); } ArrayList<String> list = new ArrayList<String>();
	 * for(int i=0;i<arr2.length;i++) { if(set1.contains(arr2[i])) {
	 * list.add(arr2[i]); } } System.out.println(list);
	 */
	System.out.println(FindIntersection(strArr));;
}
public static String FindIntersection(String[] strArr) {
    String[] arr1 = strArr[0].split(",");
    String[] arr2 = strArr[1].split(",");
    
    Set<String> set1 = new HashSet<String>();
    for(int i=0;i<arr1.length;i++) {
    	set1.add(arr1[i]);
    }
    ArrayList<String> list = new ArrayList<String>();
    for(int i=0;i<arr2.length;i++) {
    	if(set1.contains(arr2[i])) {
    		list.add(arr2[i]);
    	}
    }
    return list.toString();
  }
}
