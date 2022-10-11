package problem04;

import java.util.Vector;

public class Ex04EquivalentPrimes {
	public static void main(String[] args) {
		long N = 75l;
		long M = 15l;
		System.out.println("N = " + N);
		System.out.println("M = " + M);
		System.out.println("Is Equivalent Primes? " + isEquivalentPrimes(N, M));
	}

	private static boolean isEquivalentPrimes(long N, long M) {
		long bigger = (N > M) ? N : M;
		long smaller = N + M - bigger;
		// Find divisors of smaller
		Vector<Long> divisors = new Vector<>();
		if (smaller % 2 == 0) {
			divisors.add(2l);
			while (smaller % 2 == 0)
				smaller /= 2;
		}
		for (long i = 3; i * i <= smaller; i += 2)
			if (smaller % i == 0) {
				divisors.add(i);
				while (smaller % i == 0)
					smaller /= i;
			}
		if (divisors.size() == 0)
			divisors.add(smaller);
		// Let bigger divides for divisors
		for (long divisor : divisors) {
			if (bigger % divisor != 0)
				return false;
		}
		return true;
	}
}
