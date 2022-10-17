package ex01;
import java.util.Scanner;

public class CommonElement {
	
	public static void commonNumber(int A[], int B[]) {
		int C[]= new int[A.length];
		int D = 0;
		int k = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if(A[i] == B[j])
				{
					D = A[i];
					if(check(C, D) == true)
					{
						C[k++] = A[i];
					}
					
				}
			}
		}
	   for(int i = 0;i<k;i++)
	   {
		   System.out.print(C[i] + " ");
	   }
	}
	public static Boolean check(int C[], int B)
	{
		for(int i = 0;i<C.length;i++)
		{
			if(C[i] == B)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numBer of elements in the array: ");
		n = sc.nextInt();
		int A[] = new int[n];
		int B[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + i + "]= ");
			A[i] = sc.nextInt();
		}
		System.out.print(" Mang A [] = "+ "\t");
		for (int i = 0; i < n; i++) {
			System.out.print(A[i]+  "\t");
		}
		System.out.println("\n");
		
		for (int j = 0; j < n; j++) {
			System.out.print("B[" + j + "]= ");
			B[j] = sc.nextInt();
		}
		System.out.print(" Mang B [] = "+ "\t");
		for (int i = 0; i < n; i++) {
			System.out.print(B[i]+  "\t");
		}
		System.out.println("\n");
		System.out.println("The element overlaps :");
		commonNumber(A, B);

	}
}
