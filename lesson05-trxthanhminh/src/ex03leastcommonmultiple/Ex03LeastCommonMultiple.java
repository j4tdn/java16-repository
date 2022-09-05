package ex03leastcommonmultiple;

public class Ex03LeastCommonMultiple {
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
}