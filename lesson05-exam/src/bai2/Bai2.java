package bai2;

public class Bai2 {
	public static void main(String[] args) {
		int n = 6;
		int[] A = {1,5,2,4,6};
		getMissingNumber(A,n);
	}
	public static void getMissingNumber(int[] A,int n) {
		int kt;
		if (n == 1) {
			System.out.println("1");
		} else {
			for (int i = 1; i <= n; i++) {
				kt = 0;
				for (int j = 0; j < n-1; j++) {
					if (A[j] == i) {
						kt = 1;
					}
				}
				if (kt == 0) {
					System.out.println(i);
				}
			}
		}
	}
}

