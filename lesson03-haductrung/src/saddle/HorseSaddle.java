package saddle;

import java.util.Scanner;
import java.util.Random;

public class HorseSaddle {
	public static void main(String[] args) {
		Scanner matrix= new Scanner(System.in);
		System.out.print("nhap so hang " );
		int sohang= matrix.nextInt();
		System.out.println("nhap so cot " );
		int socot= matrix.nextInt();
		int[][] n=new int[sohang][socot];
		Random rd = new Random();
		
		for(int i =0; i<=sohang;i++) {
			for(int j=0;j<=socot; j++) {
				System.out.println("nhap phan tu thu ["+ i + "," + j + "]: ");
				n [i][j]= 1+ rd.nextInt(99);
			}
		}
		for(int i =0; i<=sohang;i++) {
			for(int j=0;j<=socot; j++) {
				System.out.println(n[i][j]+"\t");
			}
		}System.out.println("\n");
		




	}
	

	

}
