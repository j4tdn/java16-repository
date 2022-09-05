package exam;

public class Ex02 {
	public static void main(String[] args) {
		 
        int[] a={3, 7, 9, 2, 1, 6, 5, 4, 10};
        System.out.println(getMissingNumber(a));

    }
 
    public static int getMissingNumber(int[] a)
    {
        int n=a.length+1;
        int sum=n*(n+1)/2;
        int restSum=0;
        for (int i = 0; i < a.length; i++) {
            restSum=a[i]+restSum;
        }
        int missingNumber = sum-restSum;
        
        return missingNumber;
    }
}