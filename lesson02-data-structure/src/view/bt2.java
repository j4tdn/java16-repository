package view;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bt2 {
	public static void main(String[] args) {
		equivalent_Primes(12, 60);
	}

	public static void equivalent_Primes(int A, int B) {
		ArrayList<Integer> listA = phanTichSoNguyen(A);
		ArrayList<Integer> listB = phanTichSoNguyen(B);
		System.out.println(checkArray(listA, listB)?"YES":"NO");
	}
	
	public static ArrayList<Integer> phanTichSoNguyen(int n) {
        int i = 2;
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();
        while (n > 1) {
            if (n % i == 0) {
                n = n / i;
                if (!listNumbers.contains(i))
                	listNumbers.add(i);
            } else {
                i++;
            }
        }
        if (listNumbers.isEmpty()) {
            listNumbers.add(n);
        }
        return listNumbers;
    }
	
	public static boolean checkArray(ArrayList<Integer> listA, ArrayList<Integer> listB ) {
		if(listA.size() >= listB.size()) {
			for (int i = 0; i < listA.size(); i++) {
				if(!listB.contains(listA.get(i))) {
					return false;
				}
			}
		}else if(listA.size() <= listB.size()) {
			for (int i = 0; i < listB.size(); i++) {
				if(!listA.contains(listB.get(i))) {
					return false;
				}
			}
		}
		return true;
	}
}
