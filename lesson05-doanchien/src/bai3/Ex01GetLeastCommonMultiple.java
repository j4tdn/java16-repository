package bai3;

public class Ex01GetLeastCommonMultiple {
	public static void main(String[] args) {
		int a[];
		int n;
		BCNN_Mang(a,n);
		
		
	}
	public void NhapMang(int a[], int n) {
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);		
		}
	}
	
	int UCLN(int a, int b){
	    if(a==b) 
	    	return a;
	    if(a>b) 
	        UCLN(a-b,b);
	    else
	        UCLN(a,b-a);
	}

	public int BCNN(int a , int b) {
	    return ((a * b) / UCLN(a,b));
	}
	int BCNN_Mang(int a[], int n) {
		int temp = BCNN(a[0], a[1]);
		for (int i = 2; i < n; i++) {
			temp = BCNN(temp, a[i]);
		}
		return temp;
	}
}
