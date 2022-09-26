package view;



import java.util.Scanner;

public class Ex01DateOfBirthTryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int yob = 0;
		do {
			try {
				System.out.println("Enter year your birth");
				yob = Integer.parseInt(ip.nextLine());
				//khi nhap ddung thi se dung vong lap,con sai se tiep tuc lap lai try catch
				break;
				//Luu y nen dung chinh xác exception xảy ra trong catch
				
			} catch (NumberFormatException e) {
				System.out.println("Input --> erro");
				e.printStackTrace();
			}
			
		} while (true);
		
		
		
		System.out.println("year of birth : "+yob);
		ip.close();
		
		
	}

}

