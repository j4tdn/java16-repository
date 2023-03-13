package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class mgm2 {
     public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		findvalidNumber(s);
	}
     
     public static int findvalidNumber(String s) {
    	 
    	 String[] a = s.split(",");
    	 List<String> list  = new ArrayList<>();
    	 for(int i = 0; i < a.length ; i++) {
    		 list.add(a[i]);
    	 }
    	 System.out.println(list);
    	 
    	 return 1;
    	 
     }

}
