package ex02missingnumber;

public class Ex02MissingNumber {
	public static void main(String[] args) {
		
		int[] arr={6,3,7,1,5,2};
        System.out.println("Missing number int array: " + getMissingNumber(arr, 7));
 
    }
 
    private static int getMissingNumber(int[] arr, int length){
        int expSum = length * (length + 1)/2;
        int actSum = 0;
        for (int a:arr) {
        	actSum += a;
        }
		int missNumber = expSum - actSum;
		return missNumber;
	}
}
