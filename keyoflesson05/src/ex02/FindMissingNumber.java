package ex02;

public class FindMissingNumber {

	public static void main(String[] args) {
		 
        int[] arr1={3,2,1,6,5};
        System.out.println("Missing number from array arr1: "+missingNumber(arr1));
        int[] arr2={3, 7, 9, 2, 1, 6, 5, 4, 10};
        System.out.println("Missing number from array arr2: "+missingNumber(arr2));
 
    }
 
    public static int missingNumber(int[] array)
    {
        int n=array.length+1;
        int sum=n*(n+1)/2;
        int temp=0;
        for (int i = 0; i < array.length; i++) {
        	temp+=array[i];
        }
        int missingNumber=sum-temp;
        return missingNumber;
    }
}
