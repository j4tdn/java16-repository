package ex03;

public class LeastCommonMultiple {
	public static int UCLN(int a, int b){
	    // Nếu a = 0 => ucln(a,b) = b
	    // Nếu b = 0 => ucln(a,b) = a
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
	    return a; // return a or b, bởi vì lúc này a và b bằng nhau
	}
	public static int BCNN(int a, int b){
	    return (a*b/UCLN(a,b) );
	}
	public static int BCNN_Mang(int a[],int n){
        int temp = BCNN(a[0], a[1] );
        for(int i=2;i<n;i++){
            temp = BCNN(temp, a[i]);    
        }
        return temp;
    }
	
	public static void main(String[] args) {
		int[] array = new int[3];
		array[0]=4;
		array[1]=2;	
		array[2]=3;
		
		System.out.println("Boi chung nho "
				+ "nhat cua mang " + BCNN_Mang(array,3));
		
	}
	

}
