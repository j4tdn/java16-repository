package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

import javax.naming.spi.DirStateFactory.Result;

public class Ex06 {
	public static String kangaroo(int x1, int v1, int x2, int v2) {
		if((x1 > x2 && v1 > v2)||(x1 < x2 && v1<v2) ) {
			return "NO";
		}
		if(v1 <v2 ) {
			int s1 = x1 + v1;
			int s2 = x2 + v2;
			while(s1 != s2) {
				s1 += v1;
				s2 += v2;
				if(s1 == s2) {
					return "YES";
				}
			}	  
		}
		else {
			return "NO";
		}
		return "NO";
	    }
	public static void main(String[] args) {
		System.out.println(kangaroo(21, 6, 47, 3));;
	}
}
