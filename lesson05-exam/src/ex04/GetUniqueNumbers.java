package ex04;

public class GetUniqueNumbers {
	public static void main(String[] args) {
        int[] arr = {3, 15, 21, 0, 15, 17, 21};
        System.out.println("Unique Number is: " + getUniqueNumbers(arr, arr.length));
    }
    
    public static int[] getUniqueNumbers(int[] arr, int n) {
    	int z=0;
    	int b[]= {};
    	int c[]= {};
    	
        int temp = arr[0];
        for(int i = 0; i < n-1; i++) {
        	for(int j = 0; j < i; j++) {
        		if( arr[i] == arr[j] )
        			b[z]+=arr[i];
        	}
            
        }
        return c= arr-b;
    }

}
