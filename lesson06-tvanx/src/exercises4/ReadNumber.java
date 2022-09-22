package exercises4;

import java.util.Scanner;

public class ReadNumber {
	
	public static Scanner ip = new Scanner(System.in);
	public static String[] units = {"Không","Một","Hai","Ba","Bốn","Năm","Sáu","Bảy","Tám","Chín","Mười"};
	public static String[] dozens = {"","mươi","lăm","mốt"};
	public static String[] hundreds = {"","trăm","lẻ"};
	
	
	
	public static void main(String[] args) {
		
		readNumber();
		
	}
	
	private static void readNumber() {
		int number=nextInt();
		String num=Integer.toString(number);
		if(number<=10) {
			System.out.println(readunit(num));
		}
		else if(number<100) {
			System.out.println(readdozens(num));
		}
		else if(number<=999) {
			System.out.println(readhundreds(num));
		}
	}
	
	private static String readunit(String num) {
		String readnum="";
		int number= Integer.parseInt(num);
		readnum = units[number];
		return readnum;
	}
	
	private static String readdozens(String num) {
		String readnum="";
		int number= Integer.parseInt(num);
		int dv,hc;
		dv=number%10;
		hc=number/10;
		if(hc==1) {
			if(dv==5) {
				readnum=dozens[1]+" "+dozens[2];
			}
			else {
				readnum=dozens[1]+" "+units[dv];
			}
		}
		else {
			if(dv==5) {
				readnum=units[hc]+" "+dozens[1]+" "+dozens[2];
			}
			else if(dv==1) {
				readnum=units[hc]+" "+dozens[1]+" "+dozens[3];
			}
			else if(dv==0) {
				readnum=units[hc]+" "+dozens[1]+" "+dozens[0];
			}
			else {
				readnum=units[hc]+" "+dozens[1]+" "+units[dv];
			}
		}
		return readnum; 
	}
	
	private static String readhundreds(String num) {
		String readnum="";
		int number= Integer.parseInt(num);
		int ht=number/100;
		if((number/10)%10==0) {
			readnum=units[number/100]+" "+hundreds[1]+" "+" "+hundreds[2]+" "+units[number%10];
		}
		else if(number%100==0) {
			readnum=units[number/100]+" "+hundreds[1];
		}
		else {
			String hc=Integer.toString(number%100);
			readnum=units[number/100]+" "+hundreds[1]+" "+readdozens(hc);
		}

		return readnum;
	}
	
	private static int nextInt() {
		String numberAsText="";
		do {
			System.out.print("Enter number: ");
			numberAsText=ip.nextLine();
			if(numberAsText.matches("\\d+")) {
				break;
			}
			else {
				System.out.println("Enter only number and greater than 0!!!");
			}
		}while(true);
		return Integer.parseInt(numberAsText);
	}
}
