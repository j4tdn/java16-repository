package nalview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Interview {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		String a[] = s.trim().split(" ");
		
		
		System.out.println(duplicate(a));duplicate(a);
		
	}
	private static int duplicate(String[] a ) {
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < a.length; i++) {
			list.add(Integer.parseInt(a[i]));
		}
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if(list.get(i) == list.get(j) && i != j) {
					
					list.remove(list.get(i));
					count++;
				}
				
			}
			
		}
		
		
		return count + 1;
	}
	
		
		
	

	
}
