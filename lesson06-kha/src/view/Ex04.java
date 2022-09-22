package view;

import model.NumberManager;

public class Ex04 {
	private static NumberManager numberManager = NumberManager.GetInstance();
	
	public static void main(String[] args) {
		for (int i = 1001; i <= 1120; i++) {
			System.out.print(i+" "); 
			readNumber(i);
		}
	}
	
	private static void readNumber(int num) {
		String rs = "";
		if(num == 0) {
			rs += numberManager.getAllnumbers().get(num) + " ";
			System.out.println(rs);
			return;
		} 
		while(num>0) {
			int mod = (int) (num%Math.pow(10, String.valueOf(num).length()-1));
			////System.out.println(num + " / " + Math.pow(10, String.valueOf(num).length()-1));
			int val = (int) (num/Math.pow(10, String.valueOf(num).length()-1));
			if(String.valueOf(num).length()-1 >= 1) {
				val = (int) (val * Math.pow(10, String.valueOf(num).length()-1));
			}
			///System.out.println(val + " " + mod + " " + num);
			if(val / Math.pow(10, String.valueOf(num).length()-1) >= 2 && String.valueOf(num).length()-1 >= 1 && String.valueOf(num).length()-1 < 2) {
				///System.out.println("--+--");
				rs += numberManager.getAllnumbers().get((int)(val / Math.pow(10, String.valueOf(num).length()-1))) + " ";
				rs += numberManager.getAllNumbersPattern().get(10) + " ";
				num = (int) (num%Math.pow(10, String.valueOf(num).length()-1));
				continue;
			}
			if(String.valueOf(num).length()-1 > 1) {
				///System.out.println("--++--");
				rs += numberManager.getAllnumbers().get((int)(val/Math.pow(10, String.valueOf(num).length()-1))) + " ";
				rs += numberManager.getAllNumbersPattern().get((int)Math.pow(10, String.valueOf(val).length()-1)) + " ";
				if(mod > 0 && mod <=99 && (String.valueOf(mod).length()-1 <= 2 && String.valueOf(num).length()-1 == 3)) {
					rs += "Không Trăm" + " ";
				}
				if(mod > 0 && mod <=9) {
					rs += "Lẻ" + " ";
				}
				
				num = (int) (num%Math.pow(10, String.valueOf(num).length()-1));
				continue;
			}
			num = (int) (num%Math.pow(10, String.valueOf(num).length()-1));
			rs += numberManager.getAllnumbers().get(val) + " ";
		}
		System.out.println(rs);
	}
}
