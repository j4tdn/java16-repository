package exam02;

public class MissingNumber {
	private static int isUniqueNumber(int[] arr, int count) {
        for (int i = 0; i < arr.length; i++) {
            if (count != i && arr[count] == arr[i]) {
                return 0;
            }
        }
        return 1;
    }
	public static void main(String[] args) {
		  int[] arr = { 3, 2, 1, 6, 5 };
	        int[] arr2 = { 3, 7, 9, 2, 1, 6, 5, 4, 10 };
	        System.out.println(getMissingNumber(arr));
	        System.out.println(getMissingNumber(arr2));
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
