package HourseSaddle;

import java.util.Scanner;

public class hourse {
	static int rows, columns;
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.print("nhap so dong cua mang rows= ");
		rows = ip.nextInt();
		System.out.print("nhap vao so cot cua mang columns= ");
		columns = ip.nextInt();
		
		int [][] A = new int [rows][columns];
		for ( int i = 0; i< rows; i ++) {
			for (int j = 0; j < columns ; j ++) {
				System.out.print("nhap phan tu A[" + i +"]" + "[" +j +"]= ");
				A[i][j] = ip.nextInt();
				
			}
			
		}
		System.out.println("mang vua nhap");
		for ( int i = 0; i< rows; i ++) {
			for (int j = 0; j < columns ; j ++) {
				System.out.print(A[i][j] +"\t");
			}
		
		
	}
		System.out.println("\n");
		System.out.print("phan tu yen ngua la = ");
		Saddle(A);

}
	public static int Saddle(int arr[][]) {
		int min;
		int max;
		int n=0;
		for(int i=0;i<rows;i++)
		{

		min=arr[i][0];
		for(int j=0;j<columns;j++)
		{
		if (min>arr[i][j]) {min=arr[i][j];n=j;} //kiem tra nho nhat hang
		}
		max=min;
		for(int j=0;j<rows;j++)
		{
		if(max<arr[j][n])max=arr[j][n]; //kiem tra lon nhat cot
		}
		if(max==min) {return max;}
		}
		return n;
		}
		
		
}

		
		
	

