package condition.loop;

import java.util.Scanner;

public class Ex06Loop {
public static void main(String[] args) {
	// 1st --> using for
	
	for(int i = 0;i<10;i++)
	{
		System.out.print(i + " ");
	}
	
	System.out.println("\n===================");
	// 2nd --> using while
	
	int i =0;
	while(i < 10)
	{
		System.out.print(i + " ");
		i++;
	}
	
	System.out.println("\n===================");
	// 3nd --> Viết chương trình nhập vào 1 số nguyên hợp lệ
	// Nếu nhập sai quá 3 lần thì thoát chương trình
	Scanner ip = new Scanner(System.in);
	String numberAsText =" ";
	
	// kiểm tra numbersAsText là số thì mới parse sang int
	// "\\d" số nguyên
	// "+"  1 hoặc nhiều

	int t = 1;
	do
	{
		
		System.out.print("Enter valid number: ");
		numberAsText = ip.nextLine();
		t++;
	
	}
	while(!numberAsText.matches("\\d+") && t <=3 );
	
	
	
}
}
