package ex04_trianglepascal;

import java.util.ArrayList;
import java.util.Scanner;

public class TrianglePascal {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		System.out.println("Input n: ");
		int n = ip.nextInt();
		numbers.add(1);
		numbers.add(1);
		
		for(int i =0; i <= n; i++) {
			for(int j = 0; j < numbers.size(); j++) {
				System.out.print(numbers.get(j) + " ");
			}
			System.out.println();
			numbers = reFresh(numbers);

		}
	}
	
	public static ArrayList<Integer> reFresh(ArrayList<Integer> numbers){
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		tmp.add(1);
		for(int i = 0; i < numbers.size() - 1; i++) {
			tmp.add(numbers.get(i) + numbers.get(i+1));
		}
		tmp.add(1);
		return tmp;
	}
}
