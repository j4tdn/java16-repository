package bean;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class test5 {
	public static int getDotIndex(String x, int index) {
		int tmp = 0;
		for (int i = 0; i < x.length(); i++) {
			if(tmp == index) return i;
			
			if(x.charAt(i)== '.') {
				tmp++;
			}
			
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		String input = "WELCOME TO HMD GOOD LUCK TODAY";
		int w = 0;
		Scanner cs = new Scanner(System.in);
		w = cs.nextInt();
		List<String> sign = new ArrayList<>();
		String[] words = input.split(" ");
		int i = 0;
		String tmp = "";
		while(i < words.length) {
			tmp += words[i];
			if(i == words.length-1 && tmp.length() < w) {
				sign.add(tmp);
			}
			if(tmp.length() == w) {
				sign.add(tmp);
				tmp = "";
				i++;
			}else {
				if(tmp.length() < w) {
					tmp += ".";
					i++;
				}else {
					tmp = tmp.substring(0, tmp.length()-words[i].length()-1);
					sign.add(tmp);
					tmp = "";
				}
			}
		}
		
		for (String row : sign) {
			if(row.split("\\.").length == 1) {
				int lenght = w - row.length();
				for(int j=0 ; j < lenght ; j++) {	
					row = row + ".";
				}	
				System.out.println(row);
			}else if(row.split("\\.").length == 2) {
				row+=".";
				int numDot = row.split("\\.").length - 1;
				int contantW = w - row.length();
				while(contantW > 0) {
					for(int k = 1; k<=numDot; k++) {
						if(contantW==0) break;
						int tmm = getDotIndex(row, k);
						row = row.substring(0,tmm) + "*" + row.substring(tmm,row.length());
						contantW--;
					}
				}
				row = row.replace("*", ".");
				System.out.println(row);
			}else{
				int numDot = row.split("\\.").length - 1;
				int contantW = w - row.length();
				while(contantW > 0) {
					for(int k = 1; k<=numDot; k++) {
						if(contantW==0) break;
						int tmm = getDotIndex(row, k);
						row = row.substring(0,tmm) + "*" + row.substring(tmm,row.length());
						contantW--;
					}
				}
				row = row.replace("*", ".");
				System.out.println(row);
			}
			
		}
		
		
	}
}
