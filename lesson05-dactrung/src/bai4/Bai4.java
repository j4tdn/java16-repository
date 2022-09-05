package bai4;

public class Bai4 {
	static int index = 0;
	public static void main(String[] args) {
		int A[] = {2,5,2,16,3,7,0,14,8,9,4,3};
		int indexOfA[] = new int[100];
		for (int i = 0; i<= index; i++) {
			System.out.println(getUniqueNumbers(A, indexOfA)[i]);
		}
	}
	public static int[] findIndex(int A[], int indexOfA[]) {
		for (int i = 0; i<=100; i++) {
			for (int j = 0; j< 20; j++) {
				if (i == A[j]) {
					indexOfA[i]+=1;
				}
			}
		}
		return indexOfA;
	}
	public static int[] getUniqueNumbers(int A[], int indexOfA[]) {
		indexOfA = findIndex(A,indexOfA);
		int[] temp = null;
		
		 for (int i = 0; i<= 100; i++) {
			 if (indexOfA[i] == 1) {
				 temp[index] = i;
				 index++;
			 }
		 }
		return indexOfA;
	}
}
