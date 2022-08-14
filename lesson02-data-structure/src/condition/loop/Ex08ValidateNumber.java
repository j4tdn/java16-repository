package condition.loop;

import java.util.Scanner;

public class Ex08ValidateNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String numberAstext = "";
		int wrongtimes = 0;
		do {
			numberAstext = ip.nextLine();
			if(numberAstext.matches("\\d+")) {
				wrongtimes++;
				if(wrongtimes == 3) {
					return ;
				}
				continue;
			}
			break;
			
		}while (true);
	}
	
	

}
