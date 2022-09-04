package ex02number;

public class Ex02NNumber {
	public static void main(String[] args) {
		int arr[] = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		
		
		int number = 0;
		
		for (int i = 0; i < arr.length; i++) {
		if (arr[i]%7==0 && arr[i]%5!=0) {
			int tmp = arr[i];
			arr[i] = arr[number];
			arr[number] = tmp;
			number++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if ((arr[i]%7==0 && arr[i]%5==0) || (arr[i]%7!=0 && arr[i]%5!=0)){
				int tmp = arr[i];
				arr[i] = arr[number];
				arr[number] = tmp;
				number++; 
			}
		}
		
		for (int a:arr) {
		System.out.print(a+ " ");
		}
	}
}
