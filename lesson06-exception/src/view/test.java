package view;

import java.util.Arrays;
import java.util.Scanner;

public class test {
	private static int count = 0;
	
	public static void main(String[] args) {
//		int n = 0;
//		Scanner ip = new Scanner(System.in);
//		n = Integer.parseInt(ip.nextLine());
//		int[] arr = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = Integer.parseInt(ip.nextLine());;
//		}
//		
		
//		CalcularBill(new int[] {35, 40, 101, 59, 63});
		System.out.println(2 + " -- " + climbStairs(2));
		System.out.println(3 + " -- " + climbStairs(3));
		System.out.println(4 + " -- " + climbStairs(4));
		System.out.println(5 + " -- " + climbStairs(5));
		System.out.println(6 + " -- " + climbStairs(6));
		System.out.println(7 + " -- " + climbStairs(7));
		System.out.println(8 + " -- " + climbStairs(8));
		System.out.println();
		
/**		 
//		int sum = 16;
//		int []arr = { 2 ,3 ,5 ,7 ,9 ,12 };
//		
//		int i=0;
//		int j=arr.length-1;
//		
//		while(arr[i] + arr[j] != 16) {
//			if(arr[i] + arr[j] < sum) {
//				i++;
//			}
//			if(arr[i] + arr[j] > sum) {
//				j--;
//			}
//		}
//		
//		System.out.println(i+1 + " - " + (j+1));
 **/
 
	}
	
	public static int climbStairs(int n) {
		if (n == 1 || n == 2) return 1;
	    return climbStairs(n-1) + climbStairs(n-2);
    }
	
	public static void CalcularBill(int[] arr) {
		//System.out.println(Arrays.toString(arr));
		int index = -1;
		int sum = 0;
		int voucherCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=100) {
				index = i;
				break;
			}
		}
		
		for (int i = 0; i <= index; i++) {
			sum += arr[i];
		}
		voucherCount = 1;
		int arrTmp[] = Arrays.copyOfRange(arr, index+1, arr.length);
		//System.out.println(Arrays.toString(arrTmp));
		Arrays.sort(arrTmp);
		for (int i = arrTmp.length-1; i >=0 ; i--) {
			if(arrTmp[i] >= 100) {
				if(voucherCount > 0) {
					voucherCount--;
					continue;
				}else {
					sum+=arrTmp[i];
					voucherCount++;
				}
			}else {
				if(voucherCount > 0) {
					voucherCount--;
					continue;
				}else {
					sum+=arrTmp[i];
				}
			}
			
		}
		
		System.out.println(sum);
		
	}
}


