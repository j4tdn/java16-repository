package view;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		int n;
		Scanner ip = new Scanner(System.in);
		n = ip.nextInt();
		switch (n) {
		case 2: { 
		    System.out.println("thu 2");
		}
		break;
		case 3: { 
		    System.out.println("thu 3");} break;
		case 4: { 
		    System.out.println("thu 4");} break;
		case 5: { 
		    System.out.println("thu 5");} break;
		case 6: { 
		    System.out.println("thu 6");} break;
		
		case 7: { 
		    System.out.println("thu 7");} break;
		case 8: { 
		    System.out.println("thu 8"); break;
		
		}
		default:
			System.out.println("nhap sai");
		}
	}

}
