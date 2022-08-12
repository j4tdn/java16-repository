package exercises;

import java.util.Random;

public class Ex07RandomNumber {
	public static void main(String[] args) {
		
		Random rd = new Random();
		int arr[] = new int [6];
		arr[0]= 20+ rd.nextInt(11);
		
		for ( int i = 0; i < 6;i++){
			
			if(arr[i]!=arr[i+1]) {
				arr[i+1]= 20+ rd.nextInt(11);
			System.out.println(arr[i]);
			}
			else {
				System.out.println("Finish");
			}
		
		}
		
		
	}
	

}
