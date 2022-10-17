package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Ex04 {
	public static void main(String[] args) {
		int n1 = 75;
		int n2 = 15;
		isSamePrime(75, 14);
	}
	
	public static void isSamePrime(int n1, int n2) {
		Object[] sieve1 = sieveOfEratosthenes(n1);
		Object[] sieve2 = sieveOfEratosthenes(n2);
		
		if(sieve1.length != sieve2.length) {
			System.out.println("NO");
			return;
		}
		for (int i = 0; i < sieve1.length; i++) {
			if(sieve1[i] != sieve2[i]) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		return;
		
	}

	public static Object[] sieveOfEratosthenes(int n) {
		Integer[] tmp = new Integer[n + 1];
		boolean[] check = new boolean[n + 1];
		for (int i = 2; i <= n; i++) {
			check[i] = true;
		}
		for (int i = 0; i <= n; i++) {
			tmp[i] = i;
		}
		for (int i = 2; i <= n; i++) {
			if (check[i] == true) {
				for (int j = 2 * i; j <= n; j += i) {
					check[j] = false;
				}
			}
		}
		List<Integer> list = Arrays.asList(tmp);
		return Arrays.asList(tmp).stream().filter(o -> check[list.indexOf(o)] && n%o==0).toArray();
	}
}
