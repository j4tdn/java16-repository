package Bai2;

public class B2 {
	public static void main(String[] args) {
		int[] a = { 3, 2, 1, 6, 5 };
		System.out.println("a.Phần tử cần tìm có giá trị:");
		System.out.println(getMissingNumber(a));
		int[] b = { 3, 7, 9, 2, 1, 6, 5, 4, 10 };
		System.out.println("b.Phần tử cần tìm có giá trị:");
		System.out.println(getMissingNumber(b));
	}

	public static int getMissingNumber(int[] arr) {
	        int dem;
	        for (int i = 1; i <= arr.length; i++) {
	            dem = 0;
	            for (int j = 0; j < arr.length; j++) {
	                if (i == arr[j]) {
	                    dem++;
	                    break;
	                }
	            }
	            if (dem == 0) {
	                return i;
	            }
	        }
	        return 0;
}
}
