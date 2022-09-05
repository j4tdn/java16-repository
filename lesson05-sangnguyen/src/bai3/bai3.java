package bai3;

public class bai3 {
	public static int[] A = new int[20];
	public static void main(String args[]) {
		 int a = 12, b = 15, c = 19;
		 System.out.println(getLeastCommonMultiple(a, b, c));
	}
	static boolean isPrime(int n){
		if(n <=2) {
			return true;
		} else {
			for(int i = 2; i<=Math.sqrt(n);i++){
				if(n%i == 0){
					return false;
				}
			}
		}
		return true;
	}
	public static int[] primeAnalysis(int n){
		for (int i = 0; i< 20; i++)
			A[i] = 0;
		for(int i=2;i<=n;i++){
			while(isPrime(i) && (n%i ==0)) {
				A[i] +=1;
				n/=i;
			}
		}
		return A;
	}
	public static int getBiggestNumber(int a, int b, int c) {
		int temp = 0;
		if ((a >= b) && (a >= c)) {
			temp = a;
		}
		if ((b >= c) && (b >= a)) {
			temp = b;
		}
		if ((c >= b) && (c >= a)) {
			temp = c;
		}
		return temp;
	}
	public static int getLeastCommonMultiple(int a, int b, int c) {
		int temp = 1;
		for (int i=2; i< 20; i++)
		{
			if (isPrime(i)) {
				temp *= Math.pow(i, getBiggestNumber(primeAnalysis(a)[i],primeAnalysis(b)[i],primeAnalysis(c)[i]));
			}
		}
		return temp;
	}
 
}

