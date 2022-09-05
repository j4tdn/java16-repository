package exam;

public class Ex03 {
	public static void main(String[] args) {
		int[] n = { 2, 3 };
		int a =2;
		int b= 3;
		UCLN(a,b);
		BCNN(a, b);
	}
	private static int UCLN(int a, int b) {
		
		 if(a==b) return a;
		    if(a>b) 
		        UCLN(a-b,b);
		    else
		        UCLN(a,b-a);

		}
	private static int BCNN(int a, int b) {
		return (a*b/UCLN(a,b) );
	}



}/*
public static void main(String[] args) {
	int[] a = { 2, 3 };
	System.out.println("BCNN la: " + getLeastCommonMultiple(a));
}

private static int maxCommonMultiple(int a, int b) {
	if (a == b) {
	} else if (a > b) {
		maxCommonMultiple(a - b, b);
	} else
		maxCommonMultiple(a, b - a);
	return a;
}

private static int leastCommonMultiple(int a, int b) {
	return (a * b / maxCommonMultiple(a, b));
}

private static int getLeastCommonMultiple(int a[]) {
	int temp = leastCommonMultiple(a[0], a[1]);
	for (int i = 2; i < 20; i++) {
		temp = leastCommonMultiple(temp, a[i]);
	}
	return temp;
}*/