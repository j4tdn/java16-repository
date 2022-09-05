package view;

public class LeastCommonMultiple {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 6 };
		System.out.println(findLeastCommonMultiple(arr));
		
	}
	
	public static void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static int gcd(int a, int b){
		  if (a == 0 || b == 0){
		        return a + b;
		    }
		    while (a != b){
		        if (a > b){
		            a -= b; // a = a - b
		        }else{
		            b -= a;
		        }
		    }
		    return a;
	    
	}
	public static int LeastCommonMultiple(int a, int b){
	    return (a*b/gcd(a,b) );
	}
	
	static int findLeastCommonMultiple(int arr[]) {
		int temp = LeastCommonMultiple(arr[0], arr[1] );
        for(int i=2;i <arr.length;i++){
            temp = LeastCommonMultiple(temp, arr[i]);    
        }
        return temp;
	}
}
