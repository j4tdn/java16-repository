package view;

import java.util.Scanner;

public class Cau2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] data = sc.nextLine().split(" ");
		int num = Integer.parseInt(data[0]);
		int pow = Integer.parseInt(data[1]);
		
		if(pow < num) {
			int tmp = num;
			num = pow;
			pow = tmp;
		}
		boolean check = false;
		for(int i=1;;i++) {
			double tmp = Math.pow(num, i);
			if(tmp>pow) break;
			if(tmp == pow) check = true;
		}
		System.out.println(check);
	}

}
