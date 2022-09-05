package ex03;

import java.util.Scanner;

public class leastCommonMultiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n: ");
		n = sc.nextInt();
		
		int a[]= new int[n];
		for(int i = 0; i< n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Least Common Multiple is : " + getLeastCommonMultipleint(a, n));
	
	}
	public static int UCLN(int a,int b)
	{
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
	public static int BCNN(int a, int b)
	{
		return (a * b)/(UCLN(a, b));
	}
	public static int getLeastCommonMultipleint (int a[], int n)
	{
		 int temp = BCNN(a[0], a[1] );
	        for(int i=2;i<n;i++){
	            temp = BCNN(temp, a[i]);    
	        }
	        return temp;
	}
}
