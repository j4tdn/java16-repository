package view;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		int n = 7;
//		int arr[] = createArr(n);
//		printArr(arr);
//		arr = removeDulicateVal(arr);
//		printArr(arr);
//		compareArr(arr);
		int arr[] = {7,8,8,8,6,2,5,1,9};
		getThirdMaxVal(arr);
		
	}

	public static int[] createArr(int n) {
		Random rd = new Random();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = rd.nextInt(5);
		}
		return arr;
	}

	public static void printArr(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static int[] addArr(int[] arr, int val) {
			int[] tmp = new int[arr.length + 1];
			tmp[tmp.length - 1] = val;
			for (int i = 0; i < arr.length; i++) {
				tmp[i] = arr[i];
			}
			return tmp;
	}

	public static int[] removeDulicateVal(int[] arr) {
		int[] arrTmp = new int[0];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}	
		}
		for (Integer key : map.keySet()) {
		   if(map.get(key)==1) {
			   arrTmp = addArr(arrTmp, key);
		   }
		}
		return arrTmp;
	}
	
	public static double medium(int[] arr) {
		double sum = 0;
		for (int i : arr) {
			sum +=i;
		}
		return sum/arr.length;
	}
	
	public static void compareArr(int[] arr) {
		if(arr.length>1) {
			int a[] = Arrays.copyOfRange(arr,0, arr.length/2);
			int b[] = Arrays.copyOfRange(arr,(arr.length/2), arr.length);
			double sum1 = medium(a);
			double sum2 = medium(b);
			if(sum1 == sum2) {
				System.out.println("Bang nhau");
			}
			else if(sum1 < sum2) {
				System.out.println("Truoc be hon sau");
			}else {
				System.out.println("Truoc lon hon sau");
			}
		}
	}

	public static void getThirdMaxVal(int[] arr) {
		Set<Integer> mySet = new HashSet<Integer>();
		for (int val : arr) {
			mySet.add(val);
		}
		Object[] arrTmp = mySet.toArray();
		System.out.println(arrTmp[arrTmp.length-3]);
	}

}
