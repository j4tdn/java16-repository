package view;

import java.util.Scanner;

public class Ex07DeciamlTest {

	public static void main(String[] args) {
		// Tìm phân số tối giải được tạo ra từ số thập phân
		float a ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = sc.nextFloat();
		find(a);
	}
//	0.1
//	0.01
//	0.002
//	1.23
//	1.222
//	12323.2
	// B1 : Nhập số thập phân --> KDL double, float
	// B2 : Chuyển đổi sang String "0.125"
	// B3 : String[] sequences =  "0.125" . split("\\.")
	// B4 : sequences[1] + "/" + Math.pow(10, sequences[1].length)
	// B5 : Rút gọn về phân số tối giản
	public static void find(float a)
	{
		String chuoi = Float.toString(a);
		String[] sequences = chuoi.split("\\.");
		int num1 = Integer.valueOf(  sequences[0]+sequences[1]);
		int num2 = (int) Math.pow(10, sequences[1].length());

		int t = gcd(num1, num2);
		num1 = num1 / t;
		num2 = num2 / t;
		System.out.println(num1 + "/" + num2);
	}
	public static int gcd(int num1, int num2)
	{
		while (num1 != num2) {
            if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
		return num1;
	}
	
}
