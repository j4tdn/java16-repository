package nalview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class GianDuyAnh_Ex02 {
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,4,3,2,1};
		int count = 0;
		int sum = 0;
		for(int i = 0 ; i < a.length; i ++) {
			for(int j = 0 ; j < a.length; j++) {
				if(a[i] == a[j] && i!=j) {
					count++;
				}
			}
		}
		sum = a.length - count;
		System.out.println(sum);
	

		
		
	}
	
	

}
