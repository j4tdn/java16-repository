package condition.loop;

import java.util.Scanner;

public class Ex05loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for( int i=0;i<10;i+=2) {
//			if( i % 4 == 0) {
//				System.out.println(" Boi cua 4 " + i);
//			}
//		}
		
		
		int i=0;
		 while( i<10) {
			  if( i%4==0) {
				  System.out.println(" Boi cua 4 :" + i);
			  } i+=2;
		 }

		 
		 Scanner ip = new Scanner (System.in);
		 String numberAstext = "";
		 do { 
			 
					 System.out.print(" Enter vail number : ");
		      numberAstext = ip.nextLine();	 
			 
		 }while( !numberAstext.matches("\\d+"));
		 
		 int number = Integer.parseInt(numberAstext);
		 System.out.println(" SO VUA NHAP :"+ number);
		 
	}
 


}
