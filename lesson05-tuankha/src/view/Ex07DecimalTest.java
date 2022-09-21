package view;

import bean.Fraction;

public class Ex07DecimalTest {

	public static void main(String[] args) {
		//Tìm phân sô tối giản từ của số thập phân
		Fraction frac1 = new Fraction(1.0);
		Fraction frac2 = new Fraction(1.02);
		Fraction frac3 = new Fraction(0.0);
		Fraction frac4 = new Fraction(0.005);
		Fraction frac5 = new Fraction(2.1);
		Fraction frac6 = new Fraction(21.2);
	
		frac1.minimal();
		frac2.minimal();
		frac3.minimal();
		frac4.minimal();
		frac5.minimal();
		frac6.minimal();

		System.out.println(frac1);
		System.out.println(frac2);
		System.out.println(frac3);
		System.out.println(frac4);
		System.out.println(frac5);
		System.out.println(frac6);
		
	}

}
