package exam;

public class Ex03 {
	public static void main(String[] args) {
		
		int[] arr = {2,3,4};
		int n = arr.length;
		int min, max, x, lcm = 0;
		
		for(int i = 0; i<n; i++) {
	         for(int j = i+1; j<n-1; j++) {
	            if(arr[i] > arr[j]) {
	               min = arr[j];
	               max = arr[i];
	            } else {
	               min = arr[i];
	               max = arr[j];
	            }
	            for(int k =0; k<n; k++) {
	               x = k * max;
	               if(x % min == 0) {
	                  lcm = x ;
	               }
	            }
	         }
		}	
		System.out.println("Least Common Multiple of array is: " + lcm);

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