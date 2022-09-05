package lesson05;

public class Ex02 {
	public static void main(String[] args) {
		int number[] = {3, 2, 1, 6, 5};
		
		getMissingNumber(number);
		System.out.println(getMissingNumber(number));
		
	}
	private static int getMissingNumber(int[] numbers) {
		int a = 0;
		int arr[] = null;
	
		for( int i = 6 ; i > 0; i --) {
			
			boolean check = true;
			for (int i1 : numbers) {
				if(i1 == i) {
					check = false;
		
				}	
				
			}
			if(check == true)
				return i;
			
		}
		return -1;	
	}

}

