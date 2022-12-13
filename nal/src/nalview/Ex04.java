package nalview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		sc.nextLine();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String[] tmp = sc.nextLine().split(" ");
			if(tmp.length == 1) {
				list.add(Integer.parseInt(tmp[0]));
				continue;
			}
			else {
				
			}
			
		}
	}
}
