package ex03;

public class LeastComMul {
	
	public static void main(String[] args) {
		int A[]= {2,3,4,5};
		
		int z =getLeastCommonMultiple(A, 4);
	   System.out.println(z);
		
	}
	public static int max(int A[], int n)
	{
	    int max=A[0];
	    for (int i=1; i<n; i++)
	    {
	        max = (max>A[i]) ? max : A[i];
	    }
	    return max;
	}
	public static int getLeastCommonMultiple(int A[], int n)
	{
	    int boiso = max(A,n);
	    for (int i=0; i<n; i++)
	    {
	        if (boiso % A[i] != 0)
	        {
	            boiso = boiso + max(A,n);
	            i=-1;
	        }
	    }
	    return boiso;
	}
	
    
}